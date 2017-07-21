
Node.js example for [shadow-cljs](https://github.com/thheller/shadow-cljs)
----

### Develop

With hot code swapping support:

```bash
yarn watch
# another tty
node target/main.js
```

### Build

```bash
yarn build
```

Compiles to `target/main.js`.

### Steps

* add `shadow-cljs.edn` to config compilation
* run `node target/main.js` to start app and connect reload server

### Scripts:

Related npm scripts:

```js
  "scripts": {
    "watch": "shadow-cljs watch app",
    "compile": "shadow-cljs compile app",
    "build": "shadow-cljs release app"
  },
```

### License

MIT
