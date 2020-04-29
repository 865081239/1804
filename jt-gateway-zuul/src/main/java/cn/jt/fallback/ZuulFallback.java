//package cn.jt.fallback;
//
//import java.io.ByteArrayInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//
//import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.client.ClientHttpResponse;
//import org.springframework.stereotype.Component;
//
////@Component
//public class ZuulFallback implements ZuulFallbackProvider{
//
//	@Override
//	public String getRoute() {
//		// TODO Auto-generated method stub
//		return "provider-user";
//	}
//
//	@Override
//	public ClientHttpResponse fallbackResponse() {
//		return new ClientHttpResponse() {
//			
//			//出现异常时，返回的默认值
//			@Override
//			public InputStream getBody() throws IOException {
//				InputStream stream = new ByteArrayInputStream(new String("tony").getBytes());
//				return stream;
//			}
//
//			@Override
//			public HttpHeaders getHeaders() {
//				// TODO Auto-generated method stub
//				HttpHeaders headers = new HttpHeaders();
//				headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
//				return headers;
//			}
//
//			@Override
//			public HttpStatus getStatusCode() throws IOException {
//				return HttpStatus.BAD_REQUEST;
//			}
//
//			@Override
//			public int getRawStatusCode() throws IOException {
//				return HttpStatus.BAD_REQUEST.value();
//			}
//
//			@Override
//			public String getStatusText() throws IOException {
//				return HttpStatus.BAD_REQUEST.getReasonPhrase();
//			}
//
//			@Override
//			public void close() {
//				
//			}
//			
//		};
//	}
//
//}
