// packages installed list
const express = require('express')
const mysql = require('mysql2')
const cors = require('cors')
const dotenv = require('dotenv').config()

const app = express()
// cors is the one that allows if this app/website can request the server
app.use(cors())

const PORT = 3000

const db = mysql.createPool({
  host: process.env.DB_HOST,
  user: process.env.DB_USER,
  password: process.env.DB_PASSWORD,
  database: process.env.DB_NAME,
  port: process.env.DB_PORT,
  // config for no ssl errors
  ssl: {
    rejectUnauthorized: false
  }
});

db.getConnection((err, connection) => {
  if(err) {
    console.error("Error connecting to database: ", err)
  } else {
    console.log("Successful connection to database")
    connection.release()
  }
})

app.listen(PORT, () => console.log(`Listening at port:${PORT}`))

// test
app.get("/", (req, res) => {
  res.status(200).send("It works!")
})

app.get("/food_item/:id", (req, res) => {
  const query = 'SELECT * FROM food_items WHERE id = ?'
  db.query(query, [req.params.id], (err, results) => {
    if(err) return res.status(500).json({ error: err.message });
    res.json(results[0] || {});
  })
})