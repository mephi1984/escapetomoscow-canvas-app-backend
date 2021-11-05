theme: /

    state: ИдиВМеню
        q!: (меню|открой меню|главное меню)
        
        script:
            goToMenu($context);
            
        go!: /ВозвратКИгреЗавершен