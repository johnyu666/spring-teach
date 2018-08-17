package cn.johnyu.mocker.collector;

public class NetCollector implements Collector{

	@Override
	public void collect() {
		System.out.println("NetCollector：从《网络》抓取数据,");
		
	}
	
}
