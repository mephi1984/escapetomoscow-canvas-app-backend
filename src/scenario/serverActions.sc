# Когда приходит ServerAction, сообщение прилетает в состояние, 
# с условием на вход action_id.
# пример:
#     event!: action_id

theme: /
    
    state: ЗаданиеВыполнено
        event!: done
        event!: DONE

        script:
            $temp.gender = $request.rawRequest.payload.character.gender;
            
        if: $request && $request.data && $request.data.eventData && $request.data.eventData.note
            if: $temp.gender == "male"
                a: Закрыл {{ $request.data.eventData.note }}! Молодец!
            elseif: $temp.gender == "female"
                a: Закрыла {{ $request.data.eventData.note }}! Молодец!
            else:
                a: Закрыто
        else:
            random: 
                a: Молодец!
                a: Красавчик!
                a: Супер!
                
        buttons:
            "Запиши купить молоко"
            "Добавь запись помыть машину"
            "Выйди"

           
    state: ДобавленаНоваяЗапись
        event!: note_added
        event!: NOTE_ADDED

        random: 
            a: Добавлено!
            a: Сохранено!
            a: Записано!
        
        buttons:
            "Запиши купить молоко"
            "Добавь запись помыть машину"
            "Выйди"
            
    state: ВозвратКИгреЗавершен
        event!: return_to_game_completed
        event!: RETURN_TO_GAME_COMPLETED

        random: 
            a: Готово!
            a: Сделано!
            a: Выполнено!
    
    state: ПомощьЗавершено
        event!: tell_help_completed
        event!: TELL_HELP_COMPLETED

        a: Для того чтобы начать игру, скажите Начать. Для того чтобы сохранить игру, скажите Сохранить. Для того чтобы загрузить сохраненную игру, скажите Загрузить. Если вы хотите открыть настройки, скажите - Настройки.
            