1、默认情况下，SpringMVC会根据请求头的Accept-Language参数判断客户端的本地化类型。<br>

2、当接受到请求时，SpringMVC会在上下文中查找一个本地化解析器（LocalResolver），
找到后使用它获取请求所对应的本地化类型信息。<br>

3、SpringMVC还允许装配一个动态更改本地化类型的拦截器（LocaleChangeInterceptor），
通过在请求中指定locale参数（locale=zh_CN）就可以控制单个请求的本地化类型。<br>

4、SpringMVC提供了常用的三种LocaleResolver：AcceptHeaderLocaleResolver、CookieLocaleResolver、SessionLocalResolver。<br>
**AcceptHeaderLocalResolver**（默认）：根据HTTP请求头Accept-Language参数确定本地化类型；<br>
**CookieLocaleResolver**：根据指定的cookie值确定本地化类型，cookie的默认key为org.springframework.web.servlet.i18n.CookieLocaleResolver.LOCALE；<br>
**SessionLocalResolver**：根据指定的session值确定本地化类型，session的默认key为org.springframework.web.servlet.i18n.SessionLocaleResolver.LOCALE。<br>

5、SessionLocaleResolver和LocaleChangeInterceptor工作原理：<br>
**LocaleChangeInterceptor**：获取name=locale的请求参数--->把第一步的locale请求参数解析为Locale对象--->获取LocaleResolver<br>
**SessionLocalResolver**：把Locale对象设置为session的属性，从session中获取Locale对象<br>
**渲染界面**：使用该Locale对象
