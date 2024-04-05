'use client'
import axios from "axios"
import { useState } from "react"
import { useRouter } from "next/navigation";
import { API } from '@/app/components/common/enums/API';
import AxiosConfig from "@/app/components/common/configs/axios-config";
const LoginPage = () => {
    const router = useRouter();

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
        axios.post( `${API.SERVER}/login`,{ username, password },AxiosConfig())
        .then(res => {
            const message = res.data.message
            alert((message))
            if(message === 'SUCCESS'){
                router.push('/articles')
            }else if(message === 'FAIL'){
                alert("FAIL");
            }else if(message === 'WRONG_PASSWORD'){
                alert("WRONG_PASSWORD");
            }else{
                alert("지정되지 않은 값");
            }
            
 
            
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

export default LoginPage;