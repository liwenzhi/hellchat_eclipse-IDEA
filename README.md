# hellochart，不使用依赖来绘制图形
#hellochart的使用
这里给大家介绍HelloChart图形绘制框架的使用。
因为我开发用的是IDEA（Eclipse一样），不能远程依赖，需要导入一个lib工程，就跟依赖后一样，就能使用HelloChart框架里面的类和方法了。
helloChart框架功能和效果都是比较多的：
介绍下里面存中的图形和相关的Activity

#1.LineChartActivity   			折线图形
#2.ColumnChartActivity 			柱状图形
#3.PieChartActivity    			饼状图形
#4.BubbleChartActivity 			泡泡图形
#5.PreviewLineChartActivity		局部缩放的折线图形
#6.PreviewColumnChartActivity	局部缩放的柱状图形
#7.ComboLineColumnChartActivity 柱状图和折线图结合的图形
#8.LineColumnDependencyActivity 点击柱状图某个柱子显示对应的折线的图形
#9.SpeedChartActivity 			速度图形
#10.TempoChartActivity			节奏图形
#11.GoodBadChartActivity 		好和坏情况显示图形
#12.ViewPagerChartsActivity		多种图形结合ViewPager显示



效果：
折线图：

![1](http://i.imgur.com/LQhLrV7.gif)

柱状图：

![2](http://i.imgur.com/J8Q7J3h.gif)

饼状图：

![3](http://i.imgur.com/3gpJ1gW.gif)


其他效果图1：

![4](http://i.imgur.com/gWETDvP.gif)

其他效果图2：

![5](http://i.imgur.com/uXmNufZ.gif)

ViewPager和其他图形：

![6](http://i.imgur.com/X0rqQo8.gif)

你也可以下载我打包的apk文件，看看哪种效果是你需要的：

apk下载地址：

https://github.com/liwenzhi/hellchat_eclipse-IDEA/blob/master/apk/chartView.apk


这里讲解一下折线图类的使用，其他的图形大家自己探索下，哈！
值得说明的是，原作者的开发是在Studio下的，它是用的Activity是V7包下的，而我用的是V4包下的Activity。
原作者的设计思想也是比较奇怪一点的，一般人应该不会那样去搞，
他是每个Activity的onCreate方法里面创建Fragment。
而我设计了一个折线图的示例，用的是普通逻辑方法，大家修改其他图行也是可以参考我的设计的逻辑。

#简单的折线图的设计示例：
##1.布局文件：
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
              android:orientation="vertical"
              android:layout_width="fill_parent"
              android:layout_height="fill_parent"
        >
    <TextView
            android:layout_width="fill_parent"
            android:layout_height="50dp"
            android:text="普通线条"
            android:onClick="simpleLine"
            android:gravity="center"
            />

    <lecho.lib.hellocharts.view.LineChartView
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:id="@+id/chart"
            />
</LinearLayout>




```


##2.java部分代码

```
    private LineChartView chart;        //显示线条的自定义View
    private LineChartData data;          // 折线图封装的数据类

  chart = (LineChartView) findViewById(R.id.chart);
 chart.setZoomType(ZoomType.HORIZONTAL);//设置线条可以水平方向收缩

//设置数据
。。。中间省略很多步骤，数据--》lines，详细请看代码

//把点换成线，添加到data中
    data = new LineChartData(lines);
//给自定义设置封装类的数据
    chart.setLineChartData(data);

```
详细代码资源：
https://github.com/liwenzhi/hellchat_eclipse-IDEA

其他的图形就不一一介绍了，大家自己看，自己研究！





