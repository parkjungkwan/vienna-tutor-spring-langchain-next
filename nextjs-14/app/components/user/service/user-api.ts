import { instance } from '@/app/components/common/configs/axios-config'

export const fetchAllUsersAPI = async (page: number) =>{
    try{
        const response = await instance.get('/all-users',{
            params: {page, limit: 10}
        })
        return response.data
    }catch(error){
        console.log(error)
        return error
    }
    
}