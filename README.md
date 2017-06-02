
Node.js example for [shadow-cljs](https://github.com/thheller/shadow-cljs)
----

### Develop

With hot code swapping support:

```bash
yarn watch
# another tty
node compiled/main.js
```

### Build

```bash
yarn compile
```

Compiles to `compiled/`.

### Steps

* add `shadow-cljs` field in `package.json` to specify `source-paths`
* add `shadow-cljs.edn` to config compilation
* run `node compiled/main.js` to start app and connect reload server

### License

MIT
