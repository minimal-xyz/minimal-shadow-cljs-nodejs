
Node.js example for [shadow-cljs](https://github.com/thheller/shadow-cljs)
----

### Develop

```bash
npm i -g shadow-cljs
```

With hot code swapping support:

```bash
shadow-cljs watch app
# another tty
node target/main.js
```

### Build

```bash
shadow-cljs release app
```

Compiles to `target/main.js`.

### Steps

* add `shadow-cljs.edn` to config compilation
* compile ClojureScript
* run `node target/main.js` to start app and connect reload server

### License

MIT
