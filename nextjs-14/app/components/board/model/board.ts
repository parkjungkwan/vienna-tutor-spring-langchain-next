export interface IBoard{
    id? : number
    boardName? : string
    boardType? : string
    regDate? : string
    modDate? : string
    array?: IBoard[],
    json?:IBoard
}
