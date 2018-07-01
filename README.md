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


## jdb **command list**
| `connectors` | list available connectors and transports in this VM |
| `run [class [args]]` | start execution of application's main class |
| `threads [threadgroup]` | list threads |
| `thread <thread id>` | set default thread |
| `suspend [thread id(s)]` | suspend threads (default: all) |
| `resume [thread id(s)]` | resume threads (default: all) |
| `where [<thread id> | all]` | dump a thread's stack |
| `wherei [<thread id> | all]` | dump a thread's stack, with pc info |
| `up [n frames]` | move up a thread's stack |
| `down [n frames]` | move down a thread's stack |
| `kill <thread id> <expr>` | kill a thread with the given exception object |
| `interrupt <thread id>` | interrupt a thread |
| `print <expr>` | print value of expression |
| `dump <expr>` | print all object information |
| `eval <expr>` | evaluate expression (same as print) |
| `set <lvalue> = <expr>` | assign new value to field/variable/array element |
| `locals` | print all local variables in current stack frame |
| `classes` | list currently known classes |
| `class <class id>` | show details of named class |
| `methods <class id>` | list a class's methods |
| `fields <class id>` | list a class's fields |
| `threadgroups` | list threadgroups |
| `threadgroup <name>` | set current threadgroup |
| `stop in <class id>.<method>[(argument_type,...)]` | set a breakpoint in a method |
| `stop at <class id>:<line>` | set a breakpoint at a line |
| `clear <class id>.<method>[(argument_type,...)]` | clear a breakpoint in a method |
| `clear <class id>:<line>` | clear a breakpoint at a line |
| `clear` | list breakpoints |
| `catch [uncaught|caught|all] <class id>|<class pattern>` | break when specified exception occurs |
| `ignore [uncaught|caught|all] <class id>|<class pattern>` | cancel 'catch' for the specified exception |
| `watch [access|all] <class id>.<field name>` | watch access/modifications to a field |
| `unwatch [access|all] <class id>.<field name>` | discontinue watching access/modifications to a field |
| `trace [go] methods [thread]` | trace method entries and exits. (All threads are suspended unless 'go' is specified) |
| `trace [go] method exit | exits [thread]` | trace the current method's exit, or all methods' exits (All threads are suspended unless 'go' is specified) |
| `untrace [methods]` | stop tracing method entrys and/or exits |
| `step` | execute current line |
| `step up` | execute until the current method returns to its caller |
| `stepi` | execute current instruction |
| `next` | step one line (step OVER calls) |
| `cont` | continue execution from breakpoint |
| `list [line number|method]` | print source code |
| `use (or sourcepath) [source file path]` | display or change the source path |
| `exclude [<class pattern>, ... | "none"]` | do not report step or method events for specified classes |
| `classpath` | print classpath info from target VM |
| `monitor <command>` | execute command each time the program stops |
| `monitor` | list monitors |
| `unmonitor <monitor#>` | delete a monitor |
| `read <filename>` | read and execute a command file |
| `lock <expr>` | print lock info for an object |
| `threadlocks [thread id]` | print lock info for a thread |
| `pop` | pop the stack through and including the current frame |
| `reenter` | same as pop, but current frame is reentered |
| `redefine <class id> <class file name>` |  |
| `redefine the code for a class` |  |
| `disablegc <expr>` | prevent garbage collection of an object |
| `enablegc <expr>` | permit garbage collection of an object |
| `!!` | repeat last command |
| `<n> <command>` | repeat command n times |
| `# <command>` | discard (no-op) |
| `help (or ?)` | list commands |
| `version` | print version information |
| `exit (or quit)` | exit debugger |
<br />
[//]: # (<class id>: a full class name with package qualifiers)
[//]: # (<class pattern>: a class name with a leading or trailing wildcard '\*')
[//]: # (<thread id>: thread number as reported in the 'threads' command)
[//]: # (<expr>: a Java(TM) Programming Language expression.)
[//]: # (Most common syntax is supported.)
<br />
[//]: # (Startup commands can be placed in either "jdb.ini" or ".jdbrc")
[//]: # (in user.home or user.dir)
