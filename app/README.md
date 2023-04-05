## static配下のファイル変更でホットリロードさせる方法

1. `gradle -t classes`を起動
2. 別プロセスで`gradle bootRun`を起動
3. `static/index.html`を修正すると再起動😊