'use client'
import axios from "axios"
import { useState } from "react"
const SERVER = 'http://localhost:8080'
export default function Login() {
    const [username, setUsername] = useState('')
    const [password, setPassword] = useState('')
    const handleUsername = (e: any) => {
        setUsername(e.target.value)
    }

    const handlePassword = (e: any) => {
        setPassword(e.target.value)
    }

    const handleSubmit = () => {
        alert('리퀘스트가 가져가는 이름 : ' + username)
        const url = `${SERVER}/login`
        const data = { username, password }
        const config = {
            headers: {
                "Cache-Control": "no-cache",
                "Content-Type": "application/json",
                Authorization: `Bearer blah ~`,
                "Access-Control-Allow-Origin": "*",
            }
        }
        axios.post(url,data,config)
        .then(res => {
            alert(JSON.stringify(res.data))
        })
    }
    return (<>
        <h2>로그인 페이지</h2>
        <h5>아이디</h5>
        <input type="text" onChange={handleUsername} />
        <h5>비밀번호</h5>
        <input type="text" onChange={handlePassword} />
        <button onClick={handleSubmit}>확인</button>
    </>)
}