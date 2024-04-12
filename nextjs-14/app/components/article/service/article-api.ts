import { instance } from '@/app/components/common/configs/axios-config'

export const findAllArticlesAPI = async (page: number) =>{
    try{
        const response = await instance.get('/articles/list',{
            params: {page, limit: 10}
        })
        return response.data
    }catch(error){
        console.log(error)
        return error
    }
    
}

export const findArticleByIdAPI = async (id: number) =>{
    try{
        const response = await await instance.get(`/boards/detail`,{params: {id}})
        return response.data
    }catch(error){
        console.log(error)
        return error
    }
    
}