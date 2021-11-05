require: slotfilling/slotFilling.sc
  module = sys.zb-common
  
# Подключение javascript обработчиков
require: js/getters.js
require: js/reply.js
require: js/actions.js
require: js/findItem.js

# Подключение сценарных файлов
#require: scenario/addNote.sc
#require: scenario/doNote.sc
#require: scenario/deleteNote.sc
require: scenario/returnToGame.sc
require: scenario/goToMenu.sc
require: scenario/quickSave.sc
require: scenario/quickLoad.sc
require: scenario/continueGame.sc
require: scenario/serverActions.sc


patterns:
    $AnyText = $nonEmptyGarbage
    
    # Паттерны для запуска сценария
    $OpenSkipWords = (хочу|мне|мое|моё|пожалуйста|в|прошу|тебя|может|с)
    $OpenKeyWords = (включи|включить|включай|запусти|запустить|запускай|играть|
        поиграть|поиграем|навык|игра|игру|скил|скилл|приложение|апп|сыграем|
        открой|поиграй со мной|сыграть|давай играть|активируй|давай|поиграем)
    $projectName = (Побег в Москву)


theme: /
    state: Запуск
        # При запуске приложения с кнопки прилетит сообщение /start.
        q!: $regex</start>
        
        # При запуске приложения с голоса прилетит сказанная фраза.
        q!: [$repeat<$OpenSkipWords>] 
            $repeat<$OpenKeyWords>
            [$repeat<$OpenSkipWords>] 
            $projectName
        script:
            log($jsapi.cailaService.getCurrentClassifierToken());
            $temp.appeal = $request.rawRequest.payload.character.appeal;
            
        if: $temp.appeal == "official"
            a: Добро пожаловать в Побег в Москву!
        elseif: $temp.appeal == "no_official"
            a: Добро пожаловать в Побег в Москву!
        else:
            a: Добро пожаловать в Побег в Москву!


    state: Fallback
        event!: noMatch
        a: Я не понимаю.
