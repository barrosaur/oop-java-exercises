Develop an election system that should manage up to five candidates and track the votes they receive. The solution must be designed using classes and objects, with a clear separation of concerns between the election process and the candidate information.

Create a class named <strong>Candidate</strong> with the following fields:
<ul>
	<li>A name to store the surname of the candidate and votes to store the number of votes the candidate has received</li>
	<li>Includes two overloaded constructors. The <strong>default constructor</strong> that initializes name to null and votes to 0. The <strong>non-default constructor</strong> that accepts and sets values for name and votes.</li>
	<li>Includes getter and setter methods for both fields</li>
</ul>

Create a class named <strong>Election</strong> that manages the election of up to five candidates. This class should contain five <strong>Candidate</strong> objects.
<ul>
	<li>Includes two overloaded constructors. The <strong>default constructor</strong> that initializes five Candidate objects using the default constructor of the Candidate class. The <strong>non-default constructor</strong> that accepts 5 candidate objects as parameters.</li>
	<li>Includes methods that will:
		<ol>
			<li><strong>Calculate total votes:</strong> A method that sums up the total votes received by all five candidates</li>
			<li><strong>Calculate percentage of total votes:</strong> A method that computes the percentage of total votes received by each candidate. The result should be accurate to two decimal places.</li>
			<li><strong>Determine the winner:</strong> A method that determines the candidate with the highest number of votes and returns their name.</li>
			<li><strong>Display results:</strong> A method that prints a tabulated list of each candidate's name, votes, and percentage of total votes. Also, display the total votes and the name of the winning candidate</li>
		</ol>
	</li>
</ul>

### Sample Table

<table>
	<thead>
		<th>Candidate</th>
		<th>Votes Received</th>
		<th>% of total votes</th>
	</thead>
	<tbody>
		<tr>
			<td>Johnson</td>
			<td>5000</td>
			<td>25.91%</td>
		</tr>
	</tbody>
</table>