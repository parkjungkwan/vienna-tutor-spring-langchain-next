'use client'

import { Button } from "@mui/material"
import { useState } from "react"




export default function ReduxCounter(){

const [count,setCount] = useState(Number)

const handlePlus = () =>{
setCount(count+1)
}

const handleMinus =() =>{
setCount(count-1)
}
    return(<div className="text-center">
    <h1>Redux Counter : {count}</h1>
    <Button onClick = {handlePlus}>+</Button><br />
    <Button onClick = {handleMinus}>-</Button>
    
    </div>)
}