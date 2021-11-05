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

function goToMenu(context){
    addAction({
        type: "go_to_menu",
        id: 0
    }, context, "udovolstvie");
}

function quickSave(context){
    addAction({
        type: "quick_save",
        id: 0
    }, context, "udovolstvie");
}


function quickLoad(context){
    addAction({
        type: "quick_load",
        id: 0
    }, context, "udovolstvie");
}

function continueGame(context){
    addAction({
        type: "continue_game",
        id: 0
    }, context, "udovolstvie");
}

function startNewGame(context){
    addAction({
        type: "start_new_game",
        id: 0
    }, context, "udovolstvie");
}
