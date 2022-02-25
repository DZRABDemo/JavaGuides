## ***1.Java***

**java** [*options*] *classname* [*args*]

**java** [*options*] **-jar** *filename* [*args*]

**javaw** [*options*] *classname* [*args*]

**javaw** [*options*] **-jar** *filename* [*args*]



***这是对Java源程序进行运行的命令***

```
用法: java [-options] class [args...]
           (执行类)
   或  java [-options] -jar jarfile [args...]
           (执行 jar 文件)
其中选项包括:
    -d32          使用 32 位数据模型 (如果可用)
    -d64          使用 64 位数据模型 (如果可用)
    -server       选择 "server" VM
                  默认 VM 是 server.

    -cp <目录和 zip/jar 文件的类搜索路径>
    -classpath <目录和 zip/jar 文件的类搜索路径>
                  用 ; 分隔的目录, JAR 档案
                  和 ZIP 档案列表, 用于搜索类文件。
    -D<名称>=<值>
                  设置系统属性
    -verbose:[class|gc|jni]
                  启用详细输出
    -version      输出产品版本并退出
    -version:<值>
                  警告: 此功能已过时, 将在
                  未来发行版中删除。
                  需要指定的版本才能运行
    -showversion  输出产品版本并继续
    -jre-restrict-search | -no-jre-restrict-search
                  警告: 此功能已过时, 将在
                  未来发行版中删除。
                  在版本搜索中包括/排除用户专用 JRE
    -? -help      输出此帮助消息
    -X            输出非标准选项的帮助
    -ea[:<packagename>...|:<classname>]
    -enableassertions[:<packagename>...|:<classname>]
                  按指定的粒度启用断言
    -da[:<packagename>...|:<classname>]
    -disableassertions[:<packagename>...|:<classname>]
                  禁用具有指定粒度的断言
    -esa | -enablesystemassertions
                  启用系统断言
    -dsa | -disablesystemassertions
                  禁用系统断言
    -agentlib:<libname>[=<选项>]
                  加载本机代理库 <libname>, 例如 -agentlib:hprof
                  另请参阅 -agentlib:jdwp=help 和 -agentlib:hprof=help
    -agentpath:<pathname>[=<选项>]
                  按完整路径名加载本机代理库
    -javaagent:<jarpath>[=<选项>]
                  加载 Java 编程语言代理, 请参阅 java.lang.instrument
    -splash:<imagepath>
                  使用指定的图像显示启动屏幕
这里可以加上虚拟机参数                 
```

### ***1.常见的参数***

```
[Opened C:\Program Files\Java\jdk1.8.0_131\jre\lib\rt.jar]
[Loaded java.lang.Object from C:\Program Files\Java\jdk1.8.0_131\jre\lib\rt.jar]
[Loaded java.io.Serializable from C:\Program Files\Java\jdk1.8.0_131\jre\lib\rt.jar]
[Loaded java.lang.Comparable from C:\Program Files\Java\jdk1.8.0_131\jre\lib\rt.jar]
[Loaded java.lang.CharSequence from C:\Program Files\Java\jdk1.8.0_131\jre\lib\rt.jar]
[Loaded java.lang.String from C:\Program Files\Java\jdk1.8.0_131\jre\lib\rt.jar]
[Loaded java.lang.reflect.AnnotatedElement from C:\Program Files\Java\jdk1.8.0_131\jre\lib\rt.jar]
[Loaded java.lang.reflect.GenericDeclaration from C:\Program Files\Java\jdk1.8.0_131\jre\lib\rt.jar]
[Loaded java.lang.reflect.Type from C:\Program Files\Java\jdk1.8.0_131\jre\lib\rt.jar]
[Loaded java.lang.Class from C:\Program Files\Java\jdk1.8.0_131\jre\lib\rt.jar]
[Loaded java.lang.Cloneable from C:\Program Files\Java\jdk1.8.0_131\jre\lib\rt.jar]
[Loaded java.lang.ClassLoader from C:\Program Files\Java\jdk1.8.0_131\jre\lib\rt.jar]
[Loaded java.lang.System from C:\Program Files\Java\jdk1.8.0_131\jre\lib\rt.jar]
[Loaded java.lang.Throwable from C:\Program 
............
```



## *2.Javac*

​	***这里把Java语言编写的源文件 编译成字节码文件***

​	***编译器接受由Java语言规范定义的类文件***

```
用法: javac <options> <source files>
其中, 可能的选项包括:
  -g                         生成所有调试信息
  -g:none                    不生成任何调试信息
  -g:{lines,vars,source}     只生成某些调试信息
  -nowarn                    不生成任何警告
  -verbose                   输出有关编译器正在执行的操作的消息
  -deprecation               输出使用已过时的 API 的源位置
  -classpath <路径>            指定查找用户类文件和注释处理程序的位置
  -cp <路径>                   指定查找用户类文件和注释处理程序的位置
  -sourcepath <路径>           指定查找输入源文件的位置
  -bootclasspath <路径>        覆盖引导类文件的位置
  -extdirs <目录>              覆盖所安装扩展的位置
  -endorseddirs <目录>         覆盖签名的标准路径的位置
  -proc:{none,only}          控制是否执行注释处理和/或编译。
  -processor <class1>[,<class2>,<class3>...] 要运行的注释处理程序的名称; 绕过默认的搜索进程
  -processorpath <路径>        指定查找注释处理程序的位置
  -parameters                生成元数据以用于方法参数的反射
  -d <目录>                    指定放置生成的类文件的位置
  -s <目录>                    指定放置生成的源文件的位置
  -h <目录>                    指定放置生成的本机标头文件的位置
  -implicit:{none,class}     指定是否为隐式引用文件生成类文件
  -encoding <编码>             指定源文件使用的字符编码
  -source <发行版>              提供与指定发行版的源兼容性
  -target <发行版>              生成特定 VM 版本的类文件
  -profile <配置文件>            请确保使用的 API 在指定的配置文件中可用
  -version                   版本信息
  -help                      输出标准选项的提要
  -A关键字[=值]                  传递给注释处理程序的选项
  -X                         输出非标准选项的提要
  -J<标记>                     直接将 <标记> 传递给运行时系统
  -Werror                    出现警告时终止编译
  @<文件名>                     从文件读取选项和文件名
```



### ***1.批处理编译***

***可以通过批处理的方式来对源文件进行编译***

```
1.Person.java
public class TestDemo{
	public static void main(String[] args){
		Person person = new Person();

		person.show();
	}
}

2.Person.java
public class Person{
	public void show(){
		System.out.println("this is show method");
	}
}

3.sourceFile
TestDemo.java
Person.java

执行命令 javac @sourceFile
 D:\Project\JavaGuides\src\com\xufeifan\study\multiple 的目录

2022/02/25  09:51    <DIR>          .
2022/02/25  09:51    <DIR>          ..
2022/02/25  09:51               400 Person.class
2022/02/25  09:47                95 Person.java
2022/02/25  09:49                27 sourceFile
2022/02/25  09:51               315 TestDemo.class
2022/02/25  09:48               124 TestDemo.java
               5 个文件            961 字节
               2 个目录 325,570,494,464 可用字节
               
               
执行命令 java TestDemo 可以成功运行
```

### *2.package关键字*

```
1.TestDemo.java
package com.xufeifan.study.basic;

public class TestDemo {
    public static void main(String[] args) {
        System.out.println("this is main method");
    }
}

执行命令
javac TestDemo.java -d D:\Project\JavaGuides\classes
在目录下面会生成package包所指代的文件夹

需要在D:\Project\JavaGuides\classes文件夹下
执行命令
java com.xufeifan.study.basic.TestDemo
得到结果
```



### *3.import关键字*

```
1.TestDemo.java

package com.xufeifan.study.NoPage.One;

import com.xufeifan.study.NoPage.Two.Person;

public class TestDemo{
	public static void main(){
		Person person = new Person();
		person.show();
	}
}

2.Person.java

package com.xufeifan.study.NoPage.Two;

public class Person{
	public void show(){
		System.out.println("this is person method");
	}
}

这里执行命令如下
javac 
-sourcepath D:\Project\JavaGuides\src 
这是说明import的类文件的项目位置 这里会添加全路径名
-d D:\Project\JavaGuides\classes\  
说明编译文件的路径
D:\Project\JavaGuides\src\com\xufeifan\study\NoPage\One\TestDemo.java
说明源文件的路径
```



### ***4.不同版本的编译***

***这里需要用到-source -target参数***

```
javac -encoding utf-8  
-verbose 
-source 1.7 
-target 1.7 
-bootclasspath .;D:\Java\jdk1.7\lib\dt.jar;D:\Java\jdk1.7\lib\tools.jar -classpath D:\Java\jdk1.7\jre\lib\rt.jar 
TestDemo.java

这里需要注意两个参数
```



## *3.Javap*

***这是进行反编译的命令***

```
1.TestDemo.java

public class TestDemo{
	public static void main(String[] args){
		System.out.println("this is main method");
	}
}

执行命令javap -v TestDemo.class
Classfile /D:/Project/JavaGuides/src/com/xufeifan/study/Java_basic/TestDemo.class
  Last modified 2022-2-25; size 429 bytes
  MD5 checksum 8672420291f489d8b840a9812089d72c
  Compiled from "TestDemo.java"
public class TestDemo
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #6.#15         // java/lang/Object."<init>":()V
   #2 = Fieldref           #16.#17        // java/lang/System.out:Ljava/io/PrintStream;
   #3 = String             #18            // this is main method
   #4 = Methodref          #19.#20        // java/io/PrintStream.println:(Ljava/lang/String;)V
   #5 = Class              #21            // TestDemo
   #6 = Class              #22            // java/lang/Object
   #7 = Utf8               <init>
   #8 = Utf8               ()V
   #9 = Utf8               Code
  #10 = Utf8               LineNumberTable
  #11 = Utf8               main
  #12 = Utf8               ([Ljava/lang/String;)V
  #13 = Utf8               SourceFile
  #14 = Utf8               TestDemo.java
  #15 = NameAndType        #7:#8          // "<init>":()V
  #16 = Class              #23            // java/lang/System
  #17 = NameAndType        #24:#25        // out:Ljava/io/PrintStream;
  #18 = Utf8               this is main method
  #19 = Class              #26            // java/io/PrintStream
  #20 = NameAndType        #27:#28        // println:(Ljava/lang/String;)V
  #21 = Utf8               TestDemo
  #22 = Utf8               java/lang/Object
  #23 = Utf8               java/lang/System
  #24 = Utf8               out
  #25 = Utf8               Ljava/io/PrintStream;
  #26 = Utf8               java/io/PrintStream
  #27 = Utf8               println
  #28 = Utf8               (Ljava/lang/String;)V
{
  public TestDemo();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 1: 0

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: ldc           #3                  // String this is main method
         5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         8: return
      LineNumberTable:
        line 3: 0
        line 4: 8
}
SourceFile: "TestDemo.java"
```

## *4.Jconsole*

![](D:\Project\JavaGuides\resources\IMG\console.PNG)

## ***5.Javadoc***

***这个命令用于生成注释文档***

```
/**
* <pre>
* public class TestDoc
* </pre>
* @author xufeifan
* @version 1.0.0
* @since 1.5
*/
public class TestDoc{

	/**
	* @param fieldStatic
	*/
	public static int fieldStatic = 10;
	
	/**
	* @param num
	* @return 10
	*/
	public static int methodStatic(int num){
		System.out.println("this is methodStatic method");
		return fieldStatic;
	}

}
```



## *6.Jar*

***生成压缩文件的命令***

```
用法: jar {ctxui}[vfmn0PMe] [jar-file] [manifest-file] [entry-point] [-C dir] files ...
选项:
    -c  创建新档案
    -t  列出档案目录
    -x  从档案中提取指定的 (或所有) 文件
    -u  更新现有档案
    -v  在标准输出中生成详细输出
    -f  指定档案文件名
    -m  包含指定清单文件中的清单信息
    -n  创建新档案后执行 Pack200 规范化
    -e  为捆绑到可执行 jar 文件的独立应用程序
        指定应用程序入口点
    -0  仅存储; 不使用任何 ZIP 压缩
    -P  保留文件名中的前导 '/' (绝对路径) 和 ".." (父目录) 组件
    -M  不创建条目的清单文件
    -i  为指定的 jar 文件生成索引信息
    -C  更改为指定的目录并包含以下文件
如果任何文件为目录, 则对其进行递归处理。
清单文件名, 档案文件名和入口点名称的指定顺序
与 'm', 'f' 和 'e' 标记的指定顺序相同。

示例 1: 将两个类文件归档到一个名为 classes.jar 的档案中:
       jar cvf classes.jar Foo.class Bar.class
示例 2: 使用现有的清单文件 'mymanifest' 并
           将 foo/ 目录中的所有文件归档到 'classes.jar' 中:
       jar cvfm classes.jar mymanifest -C foo/ .
       
       这里分为可执行的jar包和作为引用的jar包
```



### ***1.代码测试***

```
1.TestDemo.java

public class TestDemo{
	public static void main(String[] args){
		System.out.println("this is main method");
	}
}

2.META-INF/MANIFEST.MF

Manifest-Version: 1.0
Created-By: 1.8.0_131 (Oracle Corporation)
Main-Class: TestDemo

执行命令 jar -cvfm TestDemo.jar META-INF/MANIFEST.MF TestDemo.class
执行命令 java -jar TestDemo.jar
得到结果
```



### *2.META-INF/MANIFEST.MF*

```
这里的属性分为下面几个部分
1.一般属性
Manifest-Version
用来定义manifest文件的版本
Created-By
声明文件的生成者
Signature-Version
定义jar文件的签名版本
Class-Path
内部的类搜索路径

2.应用程序的相关属性

Main-Class
定义jar文件的入口类

3.扩展属性

1. Extendsion-List
 该属性指定了小程序需要的扩展信息列表，列表中的每个名字对应以下的属性
2. <extension>-Extension-Name
3. <extension>-Specification-Version
4. <extension>-Implementation-Version
5. <extension>-Implementation-Vendor-Id
5. <extension>-Implementation-URL

4. 扩展标识属性

1. Extension-Name
 该属性定义了jar文件的标识，例如Extension-Name: Struts Framework
 
5. 包扩展属性
 
1. Implementation-Title   定义了扩展实现的标题
2. Implementation-Version   定义扩展实现的版本
3. Implementation-Vendor   定义扩展实现的组织  
4. Implementation-Vendor-Id   定义扩展实现的组织的标识
5. Implementation-URL :   定义该扩展包的下载地址(URL)
6. Specification-Title   定义扩展规范的标题
7. Specification-Version   定义扩展规范的版本
8. Specification-Vendor   声明了维护该规范的组织
9. Sealed   定义jar文件是否封存，值可以是true或者false (这点我还不是很理解)

6. 签名相关属性

签名方面的属性我们可以来参照JavaMail所提供的mail.jar中的一段

Name: javax/mail/Address.class
Digest-Algorithms: SHA MD5 
SHA-Digest: AjR7RqnN//cdYGouxbd06mSVfI4=
MD5-Digest: ZnTIQ2aQAtSNIOWXI1pQpw==

这段内容定义类签名的类名、计算摘要的算法名以及对应的摘要内容(使用BASE方法进行编码)

7.自定义属性

除了前面提到的一些属性外，你也可以在MANIFEST.MF中增加自己的属性以及响应的值，例如J2ME程序jar包中就可能包含着如下信息

MicroEdition-Configuration: CLDC-1.0
MIDlet-Name: J2ME_MOBBER Midlet Suite
MIDlet-Info-URL: http://www.javayou.com
MIDlet-Icon: /icon.png
MIDlet-Vendor: Midlet Suite Vendor
MIDlet-1: mobber,/icon.png,mobber
MIDlet-Version: 1.0.0
MicroEdition-Profile: MIDP-1.0
MIDlet-Description: Communicator

```