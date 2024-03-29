'use client'
import AddIcon from '@mui/icons-material/Add';
import RemoveIcon from '@mui/icons-material/Remove';
import { useSelector, useDispatch } from 'react-redux'
import { handlePlus, handleMinus, getCount } from '@/redux/features/counter/counter.slice'
import { NextPage } from 'next';

const CounterPage:NextPage = () => {
    const count = useSelector(getCount)
    const dispatch = useDispatch()
    return (<>
        <div className="text-center mt-500" style={{ marginTop: '100px' }}>
            <h1>Redux Counter : {count}</h1>
            <AddIcon onClick={() => dispatch(handlePlus())} /><br />
            <RemoveIcon onClick={() => dispatch(handleMinus())} /><br />
        </div>
    </>)
}

export default CounterPage;