
interface ICompany{
    company: string,
    contact: string,
    country: string
}

const Company = (props: ICompany) => {
    return (
			 <tr>
                <td>{props.company}</td>
                <td>{props.contact}</td>
                <td>{props.country}</td>
            </tr>
    );
};

export default function Companies(){

    const companies = [
        {company:'Alfreds Futterkiste',contact:'Maria Anders',country:'Germany'},
        {company:'Centro comercial Moctezuma',contact:'Francisco Chang',country:'Mexico'},
        {company:'Ernst Handel',contact:'Roland Mendel',country:'Austria'},
        {company:'Island Trading',contact:'Helen Bennett',country:'UK'},
        {company:'Laughing Bacchus Winecellars',contact:'Yoshi Tannamuri',country:'Canada'},
        {company:'Magazzini Alimentari Riuniti',contact:'Giovanni Rovelli',country:'Italy'},

    ]

    const companyMap = companies.map((v, i)=>(<Company key={i} {...v} />))

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
    {companyMap}
    </tbody>
</table>
        </>)
}