export interface IArticle{
    id? : number
    title? : string
    content? : string
    writerId? : number
    boardId? : number
    regDate? : string
    modDate? : string
    json?: {}
    array?: IArticle[]
}
