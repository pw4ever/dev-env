source /etc/profile 

#export TERM=xterm
export EDITOR=gvim

# aliases
alias ls="ls --color=auto"
alias grep="grep --color"
alias open="xdg-open"
alias prime='DRI_PRIME=1'

# local bin
export PATH="$HOME/bin:$PATH"

# ccache
export PATH="/usr/lib/ccache/bin/:$PATH"
export CCACHE_PATH="/usr/bin"
export CCACHE_DIR="$HOME/.ccache"

# programs installed in (possibly shared) $HOME
export PATH="$HOME/usr/$(uname -m)/bin:$PATH"
export PATH="$HOME/usr/bin:$PATH"

# local Perl5
export PERL5LIB="$HOME/perl:$HOME/perl/lib/perl5:$PERL5LIB"
export PATH="$HOME/perl/bin:$PATH"

# local Ruby
#dirs=($HOME/.gem/ruby/*/bin)
#export PATH=${dirs[@]}:$PATH

# default browser
export BROWSER="firefox"

# setting search path for binaries, libraries, and headers 
export PATH="$HOME/usr/bin:$PATH"
export LD_LIBRARY_PATH="$HOME/usr/lib:$LD_LIBRARY_PATH"
export CPATH="$HOME/usr/include:$CPATH"

# android SDK
android_sdk_root=$HOME/android-sdk
export PATH=${android_sdk_root}/tools:${PATH}
export PATH=${android_sdk_root}/platform-tools:${PATH}
# MANUAL: create a symlink from "latest" to concrete path
export PATH=${android_sdk_root}/build-tools/latest:${PATH}
unset android_sdk_root

# linux kernel hacking helper
export PATH="$HOME/hacking/linux-kernel/helper:$PATH"
export ARENA="$HOME/arena/linux/"

# Haskell cabal
export PATH="$HOME/.cabal/bin:$PATH"

# Clojure
# https://github.com/technomancy/leiningen/wiki/Faster
export LEIN_FAST_TRAMPOLINE=1
#export LEIN_JVM_OPTS=  # disable tiered compilation, do full optimization; good for long running processes
