package Problem2;
//单例模式实现，注意两次判断，一次加锁
public class SingletonClass {
	private static volatile SingletonClass instance;
	private SingletonClass(){
		
	}
	public static SingletonClass getInstance(){
		if(instance == null){
			synchronized (SingletonClass.class) {
				if(instance == null){
					instance = new SingletonClass();
				}
			}
		}
		return instance;
	}
}
