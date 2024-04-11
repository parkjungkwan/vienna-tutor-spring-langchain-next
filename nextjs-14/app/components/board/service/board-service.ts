import { createAsyncThunk } from "@reduxjs/toolkit";
import { IBoard } from "../model/board";
import { findAllBoardsAPI, findBoardByIdAPI } from "./board-api";
import axios from "axios";
import { API } from "@/app/components/common/enums/API";
import AxiosConfig, { instance } from "@/app/components/common/configs/axios-config";

export const findAllBoards: any = createAsyncThunk(
    'boards/findAllBoards',
    async (page: number)=> await  findAllBoardsAPI(page)
)
export const findBoardById: any = createAsyncThunk(
    'boards/findBoardById',
    async (id: number)=> await  findBoardByIdAPI(id)
)