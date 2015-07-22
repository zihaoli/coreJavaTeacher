package corelesson8;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * ����ע���ʱ��һ��˵��ע��������˭�ģ�
 * ���Բ鿴ElementType��Դ��
 */
@Target(ElementType.TYPE)//����Targetע���ʵ����
//@Target(value={ElementType.TYPE,ElementType.FIELD})
/*
 * ����ע���ʱ��һ��Ҫָ��ע��ʲôʱ����Ч
 * ���Բ鿴RetentionPolicy��Դ��
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Entity {
	String value() default "hello";
	int[] testArray() default {1,2,3,4,5,6};
	WeekDay2 testEnum() default WeekDay2.FRI;
	Id testAnno() default @Id("bye-bye");
}

