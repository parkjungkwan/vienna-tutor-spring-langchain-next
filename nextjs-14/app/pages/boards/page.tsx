'use client'

import axios from "axios"
import { useRouter } from "next/navigation"
import { DataGrid } from '@mui/x-data-grid';
import { useState, useEffect } from "react"
import {Box, Button, Input} from '@mui/material';
import AxiosConfig from "@/redux/common/configs/axios-config";
import { API } from "@/redux/common/enums/API";
import { NextPage } from "next";
// import React from "react";

interface IArticle {
    id: number,
    title: string,
    content: string,
    writer: string,
    registerDate: string
}

const ArtilcesPage: NextPage = () => {

    const [articles, setArticles] = useState([])

    useEffect(() => {
        axios.get(`${API.SERVER}/articles`, AxiosConfig())
            .then(res => {
                const messege = res.data.messege
                if (messege === 'SUCCESS') {
                    console.log("게시글이 있습니다.")
                    const arr = res.data.result
                    for (let i of arr) {
                        console.log(i)
                        setArticles(res.data.result)
                    }

                } else if (messege === 'FAIL') {
                    console.log("게시글이 없습니다.")
                } else {
                    console.log("지정되지 않은 값")
                }
            })
    }, [])
    
    return (<>
        <h2>개인페이지 Article</h2>
        <table border={1}>
            <thead>
                <tr>
                    <th>title</th>
                    <th>content</th>
                    <th>writer</th>
                    <th>registerDate</th>
                </tr>
            </thead>
            <tbody>
                {articles.map((props: IArticle) => (
                    <tr key={props.id}>
                        <td>{props.title}</td>
                        <td>{props.content}</td>
                        <td>{props.writer}</td>
                        <td>{props.registerDate}</td>
                    </tr>
                ))}
            </tbody>
        </table>
    </>)
}

export default ArtilcesPage