# CS61B 2014 Spring Review by LC

## Emacs Notes
| Command | Description |
| --- | --- |
| `C-<chr>` | means hold the CONTROL key while typing the character <chr>. Thus, C-f would be: hold the CONTROL key and type f. |
| `M-<chr>` | means hold the META or EDIT or ALT key down while typing <chr>. If there is no META, EDIT or ALT key, instead press and release the ESC key and then type <chr>.  We write <ESC> for the ESC key. On mac, we use OPTION as META.|
| `C-x C-c` | end the Emacs session |
| `C-g` | quit a partially entered command. If Emacs stops responding to your commands, you can stop it safely by typing C-g.  You can use C-g to stop a command which is taking too long to execute. You can also use C-g to discard a numeric argument or the beginning of a command that you do not want to finish. If you have typed an <ESC> by mistake, you can get rid of it with a C-g. |
| `C-v` | Move forward one screenful |
| `M-v` | Move backward one screenful |
| `C-l` | Clear screen and redisplay all the text, moving the text around the cursor to the center of the screen. (That's CONTROL-L, not CONTROL-1.) |
| `C-f` | Move forward a character |
| `C-b` | backward a character |
| `M-f` | Move forward a word |
| `M-b` | Move backward a word |
| `C-n` | Move to next line |
| `C-p` | Move to previous line |
| `C-a` | Move to beginning of line |
| `C-e` | Move to end of line |
| `M-a` | Move back to beginning of sentence |
| `M-e` | Move forward to end of sentence |
| `C-u 8 C-f` | moves forward eight characters; Try using C-n or C-p with a numeric argument, to move the cursor to a line near this one with just one command. |
| `C-u 8 C-v` | scroll the text up by 8 lines; If you would like to scroll it down again, you can give an argument to M-v. |
| `C-x 1` | One window (i.e., kill all other windows). |
| `C-u 8 *` | to insert ******** |
| `<DEL>` | Delete the character just before the cursor |
| `C-d` | Delete the next character after the cursor |
| `M-<DEL>` | Kill the word immediately before the cursor |
| `M-d` | Kill the next word after the cursor |
| `C-k` | Kill from the cursor position to end of line |
| `M-k` | Kill to the end of the current sentence |
| `C-<SPC>` move the cursor `C-w` | This kills all the text between the two positions. |
| `C-y` | It reinserts the last killed text, at the current cursor position. |
| `M-y` | After you have done C-y to get the most recent kill, typing `M-y` replaces that yanked text with the previous kill |
| `C-/` or `C-_` or `C-x u` | undo the change |
| `C-x C-f` (file name) | Find a file. Emacs asks you to type the file name. While you are entering the file name (or any minibuffer input), you can cancel the command with `C-g`. You can also find a file which does not already exist. This is the way to create a file with Emacs: find the file, which starts out empty, and then begin inserting the text for the file. |
| `C-x C-s` | Save the file. |
| `C-x C-b` List buffers| To see a list of the buffers that current exist. Type `C-x 1` to get rid of the buffer list.|
| `C-x b` (buffer's name) | Switch to a buffer with name. |
| `C-x C-b` | show you both the buffer name and the file name of every buffer. Some buffers do not correspond to files. |
| `C-x s` | Save some buffers. |
| `C-x C-c` | Quit Emacs and save each changed file before it kills Emacs. |
| `M-x` repl s<Return>changed<Return>altered<Return> | Replace the word "changed" with "altered" wherever it occurred, after the initial position of the cursor. |
| `M-x` recover-file <Return> | If the computer crashes, you can recover your auto-saved editing by finding the file normally (the file you were editing, not the auto save file) and then typing `M-x` recover-file <Return>. Each switch to that mode.  For example, `M-x` fundamental-mode is a command to switch to Fundamental mode. |
| `C-h m` | To view documentation on your current major mode. Type `C-x 1` to remove the documentation from the screen. |
| `M-x` auto-fill-mode <Return> | If the mode is off, this command turns it on, and if the mode is on, this command turns it off.  We say that the command "toggles the mode". |
| `C-s` | forward search. Type `C-s` again, to search for the next occurrence of "cursor". |
| `C-r` | reverse search |
| Recursive editing level | Type `M-x` to get into a minibuffer; then type `<ESC> <ESC> <ESC>` to get out. |
| `C-h` | To use the Help feature. The most basic HELP feature is C-h c. To get more information about a command, use `C-h k` instead of `C-h c`. |
| `M-x compile` | open compile command line in Emacs|
| `M-! cmd RET` | Run the shell command line cmd and display the output (shell-command). |
| `M-| cmd RET` | Run the shell command line cmd with region contents as input; optionally replace the region with the output (shell-command-on-region). |
| `M-x shell` | Run a subshell with input and output through an Emacs buffer. You can then give commands interactively. |
| `M-x term` | Run a subshell with input and output through an Emacs buffer. You can then give commands interactively. Full terminal emulation is available. |
| `M-x eshell` | Start the Emacs shell. |
