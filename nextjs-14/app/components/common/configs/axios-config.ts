import axios from 'axios'

export default function AxiosConfig(){
    return {
        headers: {
            "Cache-Control": "no-cache",
            "Content-Type": "application/json",
            Authorization: `Bearer blah ~`,
            "Access-Control-Allow-Origin": "*",
        }
    }
}


export const instance = axios.create({ baseURL: process.env.NEXT_PUBLIC_API_URL})
