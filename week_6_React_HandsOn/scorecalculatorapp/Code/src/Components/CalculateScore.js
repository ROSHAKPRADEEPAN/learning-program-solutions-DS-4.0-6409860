import '../StyleSheets/mystyle.css'

const percentToDecimal = (decimal) => {
    return (decimal).toFixed(2) + '%';
}

const calcScore = (total, goal) => {
    const score = total / goal;
    return percentToDecimal(score);
}

export const CalculateScore = ({ Name, School, total, goal }) => {
    return (
        <div className='formatstyle'> 
            <h1 style={{ color: 'brown' }}>Student Details:</h1>
            <div className="Name">
                <b><span>Name: </span></b>
                <span>{Name}</span>
            </div>
            <div className="School">
                <b><span>School: </span></b>
                <span>{School}</span>
            </div>
            <div className="Total">
                <b><span>Total: </span></b>
                <span>{total}</span>
                <span> Marks</span>
            </div>        
            <div className="Score">
                <b><span>Score: </span></b>
                <span>{calcScore(total, goal)}</span>   
            </div>
        </div>
    );
}
