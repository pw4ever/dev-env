dev-env
=======

Set up development environment fast.

configuration coverage
-----

* SBCL/Quicklisp/ASDF

* Vim

* tmux

usage
-----

* Copy relevant config files to the home directory. Adapt if you already have environment setup.

* `.emacs` by default enable minimal extensions. Edit it afterwards. 

* To set up Common Lisp fast, use the provided helper `00helpers/setup-common-lisp.sh` as follows.

```bash
curl -L https://raw.github.com/pw4ever/dev-env/master/00helpers/setup-common-lisp.sh | sh
```
