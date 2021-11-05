// "udovolstvie" - id эмоции
function addNote(note, context) {
    addAction({
        type: "add_note",
        note: note,
    }, context, "udovolstvie");
}

function doneNote(id, context){
    addAction({
        type: "done_note",
        id: id
    }, context, "udovolstvie");
}

function deleteNote(id, context){
    addAction({
        type: "delete_note",
        id: id 
    }, context, "udovolstvie");
}

function returnToGame(context){
    addAction({
        type: "return_to_game",
        id: 0
    }, context, "udovolstvie");
}
