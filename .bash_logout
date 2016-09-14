if [ "$SHLVL" = 1 ]; then
    #clear screen
    [ -x /usr/bin/clear_console ] && /usr/bin/clear_console -q
 
    # delete bash history
    [ -f $HOME/.bash_history ] && /bin/rm $HOME/.bash_history
    
    unset HISTFILE

    # delete viminfo history
    [ -f $HOME/.viminfo ] && /bin/rm $HOME/.viminfo
 
    # delete vim settings
    [ -f $HOME/.vim ] && /bin/rm -rf $HOME/.vim
 
fi
