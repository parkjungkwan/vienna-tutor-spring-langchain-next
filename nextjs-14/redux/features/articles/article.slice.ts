import axios from 'axios';
import { createAsyncThunk } from '@reduxjs/toolkit';
import { createSlice } from "@reduxjs/toolkit";
import { IArticle } from './article.model';
import { initialState } from './article.init';
import { getAllArticles } from './article.service';

const articleThunks = [getAllArticles]

const status = {
    pending: 'pending',
    fulfilled: 'fulfilled',
    rejected: 'rejected'
}

const handleFulfilled =  (state: any, {payload}: any) => {
    console.log('------------------ conclusion ---------------')
    console.log(JSON.stringify(payload))

}


const handlePending = (state: any) => {
  
}

const handleRejected = (state: any) => {
  
}



export const articleSlice = createSlice({
    name: "article",
    initialState,
    reducers: {},
    extraReducers: builder => {
        const {pending, rejected} = status;

        builder
        .addCase(getAllArticles.fulfilled, handleFulfilled)

    }
})

export const {} = articleSlice.actions

export default articleSlice.reducer;