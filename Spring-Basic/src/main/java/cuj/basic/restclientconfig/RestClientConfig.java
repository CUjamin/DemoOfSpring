//package springboot.project.restclientconfig;
//
//import org.apache.tomcat.jni.SSLContext;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.http.client.ClientHttpRequestFactory;
//import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
//import org.springframework.web.client.RestOperations;
//import org.springframework.web.client.RestTemplate;
//import sun.net.www.http.HttpClient;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.security.KeyStore;
//
//
///**
// * Created by cujamin on 2017/11/30.
// */
//@Configuration
//@PropertySource("classpath:config.properties")
//public class RestClientConfig {
//    @Bean
//    public RestOperations restOperations(ClientHttpRequestFactory clientHttpRequestFactory) throws Exception {
//        return new RestTemplate(clientHttpRequestFactory);
//    }
//
//    @Bean
//    public ClientHttpRequestFactory clientHttpRequestFactory(HttpClient httpClient) {
//        return new HttpComponentsClientHttpRequestFactory(httpClient);
//    }
//
//    @Bean
//    public HttpClient httpClient(@Value("${keystore.file}") String file,
//                                 @Value("${keystore.pass}") String password) throws Exception {
//        KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
//        FileInputStream instream = new FileInputStream(new File(file));
//        try {
//            trustStore.load(instream, password.toCharArray());
//        } finally {
//            instream.close();
//        }
//
//        SSLContext sslcontext =
//                SSLContexts.custom().loadTrustMaterial(trustStore, new TrustSelfSignedStrategy()).build();
//        SSLConnectionSocketFactory sslsf =
//                new SSLConnectionSocketFactory(sslcontext, new String[]{"TLSv1.2"}, null,
//                        BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
//        return HttpClients.custom().setSSLSocketFactory(sslsf).build();
//    }
//
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }
//}