链路追踪器当时学习的时候有个坑，将接口暴露在启动类之后由于spring初始化TraceWebClientAutoConfigurationz中的trace拦截器的（TraceRestTemplateBPP）时候需要用到启动类及AlwaysSampler类导致restTemplate被提前初始化，
从而通过这个restTemplate调用的接口不能被trace拦截器拦截，导致链路追踪器找不到依赖
解决办法：把所有服务及restTemplate的bean定义放到新类中