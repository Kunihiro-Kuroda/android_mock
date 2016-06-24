package aratana.jp.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView _webView = (WebView)findViewById(R.id.webView1);

        _webView.setWebViewClient(new WebViewClient());

        _webView.loadUrl("http://aratana.jp");

        _webView.getSettings().setJavaScriptEnabled(true);
    }
}
