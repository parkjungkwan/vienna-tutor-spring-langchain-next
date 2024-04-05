import { NextPage } from "next";

const CompaniesPage: NextPage = () =>{
    const companies = [
        {id:0,company:'Alfreds Futterkiste',contact:'Maria Anders',country:'Germany'},
        {id:1,company:'Centro comercial Moctezuma',contact:'Francisco Chang',country:'Mexico'},
        {id:2,company:'Ernst Handel',contact:'Roland Mendel',country:'Austria'},
        {id:3,company:'Island Trading',contact:'Helen Bennett',country:'UK'},
        {id:4,company:'Laughing Bacchus Winecellars',contact:'Yoshi Tannamuri',country:'Canada'},
        {id:5,company:'Magazzini Alimentari Riuniti',contact:'Giovanni Rovelli',country:'Italy'},

    ]

    return (<>
        <h2>HTML Table</h2>

<table>
    <thead>
    <tr>
    <th>Company</th>
    <th>Contact</th>
    <th>Country</th>
  </tr>
    </thead>
    <tbody>
    {companies.map((props: ICompany) => {
    return (
			 <tr key={props.id}>
                <td>{props.company}</td>
                <td>{props.contact}</td>
                <td>{props.country}</td>
            </tr>
    );
})}
    </tbody>
</table>
        </>)
}

export default CompaniesPage