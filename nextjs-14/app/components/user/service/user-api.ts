import { instance } from '@/app/components/common/configs/axios-config'
import { IUser } from '../model/user'

export const findAllUsersAPI = async (page: number) =>{
    try{
        const response = await instance.get('/users/list',{
            params: {page, limit: 10}
        })
        return response.data
    }catch(error){
        console.log(error)
        return error
    }
    
}
export const findUserByIdAPI = async (id: number) =>{
    try{
        const response = await instance.get(`/users/detail`,{params: {id}})
        return response.data
    }catch(error){
        console.log(error)
        return error
    }
    
}

export const loginAPI = async (user: IUser) =>{
    try{
        const response = await instance.post(`/users/login`,user)
        // Java 에서 Messenger.message 에 값을 담음
        return response.data
    }catch(error){
        console.log(error)
        return error
    }
}