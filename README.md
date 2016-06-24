# android_mock
android webview

webView確認用の簡易アプリ

## 事前準備
JDK 1.8 DL → インストール
Android Studio をDL → インストール → 起動

- JDKのパスを聞かれるので /Library/Java/JavaVirtualMachines/以下からインストールしたJDKのcontent/homeを指定
- next
- Android Studio のタイプを聞かれる → Standard
- DLがはじまる
- intel@HAXMのインストールを求められる
- Finish

Configure → SDK Manager で必要なSDKをDL
→ 4.0以降を全部選択した

## JDKのパスを変えたい時
Android studio
[File] > [Other Settings] > [Default Project Structure]
[SDK Location]
JDK 1.8 のlocationを選択

## エミュレータ実行
※ VirtualBoxが起動していると実行時にエラーとなり、エミュレータが起動できません。
- 上部ツールメニューから `Run 'app'` ボタン(再生ボタンみたいなもの)をクリック → モーダルが開く
- 最初はエミュレータがないので モーダル内左下の `Create New Emulator` をクリックして、必要なエミュレータを作成する
- 作成したエミュレータを選択し、 `OK` をクリック
