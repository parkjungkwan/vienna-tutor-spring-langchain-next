import { createAsyncThunk } from "@reduxjs/toolkit";
import { IArticle } from "./article.model";
import { getAllArticlesAPI } from "./article.api";

export const getArticles: any = createAsyncThunk(
    'articles/getAllArticles',
     (page: number, {rejectWithValue})=>{
        console.log('getArticles page : '+ page)
        try{
            const {allArticles}: any =  getAllArticlesAPI(page) 
            return allArticles
        } catch(error){
            console.log('getArticles error : '+error)
            return rejectWithValue(error)
        }
    }
)