package com.example.styledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
/*
对于常用的控件 比如按钮 他们都是长得一摸一样 功能也是一模一样
所以可以单独的创建一个xml文件 这个文件是可以被任一需要这个控件的位置来填写
单独创建的xml文件最好是一个wrap content包裹内容 这样子就不会破坏被引用出的布局
<include layout:.....xml名称></include>
主题  这个概念很重要 什么意思呢 就是说一个app如果不加修改的话 都会默认有一个颜色大小
<style name="myFont" parent="TextAppearance.AppCompat.Medium">
    这个是应用于文本字体大小和颜色设置的主题
style name="Theme.StyleDemo" parent="Theme.MaterialComponents.DayNight.DarkActionBar">
     这个是应用于整个app的状态框 文本框等等的颜色
  这两者的区别在于后面的父类不同 上面的适用于控件的主题编辑
     <include layout="@layout/layout_text"></include>
<TextView
        style="@style/myFont"
        android:text="Hello World!"
        />
        比如 这就是将文本的一些通用设置用一个字体主题替换 直接调用这一句 @style/myFont
        就实现了将所有的问题全部解决

   主题使用于一个app的整体构造 theme作用于全局
   一个style是适用于一个一个控件 style作品于局部控件 但是局部的优先级高于整体的优先级

 <supports-screens android:smallScreens="false"
            android:compatibleWidthLimitDp="320"
            android:largestWidthLimitDp="1080"
        >
    </supports-screens>
    这个标签的作用是指定app能在哪屏幕上适用
    如果分辨太小将有可能因为这里面的属性设置而导致无法显示
如何换app的图标呢？
    只需要将新图标的图片改成png之后 Manifest这个xml文件中
    修改这一属性的对应值就可以  android:icon="@mipmap/timg"
    当然前提要把宁外一个配置图标的
    属性去掉
    <!--android:roundIcon="@mipmap/ic_launcher_round" 首先不需要圆形的图标

android:label="小米游戏笔记本" 这个属性是修改App的名字 默认是项目的名字
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}