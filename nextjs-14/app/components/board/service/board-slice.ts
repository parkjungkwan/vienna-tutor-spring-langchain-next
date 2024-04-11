import axios from 'axios';
import { createAsyncThunk } from '@reduxjs/toolkit';
import { createSlice } from "@reduxjs/toolkit";
import { IBoard } from '../model/board';
import { initialState } from './board-init';
import { findAllBoards, findBoardById } from './board-service';
import { stat } from 'fs';

const boardThunks = [findAllBoards,findBoardById]

const status = {
    pending: 'pending',
    fulfilled: 'fulfilled',
    rejected: 'rejected'
}

const handlePending = (state: any) => {
  
}
const handleRejected = (state: any) => {
  
}

export const boardSlice = createSlice({
    name: "boards",
    initialState,
    reducers: {},
    extraReducers: builder => {
        const {pending, rejected} = status;

        builder
        .addCase(findAllBoards.fulfilled, (state: any, {payload}: any) =>{state.array=payload})
        .addCase(findBoardById.fulfilled, (state: any, {payload}: any) =>{state.json=payload})

  
    }
})
export const getAllBoards = (state: any) =>(state.board.array);
export const getBoardById = (state: any) =>(state.board.json);

export const {} = boardSlice.actions

export default boardSlice.reducer;