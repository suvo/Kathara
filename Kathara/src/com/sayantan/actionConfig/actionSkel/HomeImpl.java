package com.sayantan.actionConfig.actionSkel;

/**
 * @author zayantan
 * Home page. Page 2 in flow -- after the person clicks on Agree.
 */
public interface HomeImpl extends HistoryImpl, ToDoImpl, NewsImpl, LogoutImpl {
	/**
	 * The timestamp generated by LoginImpl.login(uid,pwd) to be used as stateful session bean id. 
	 */
	void maintainSession();
}
