テストサンプル実行方法

#ファイル変更した場合
javac Calculator.java
javac -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar CalculatorTest.java
#そうでない時
java -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore CalculatorTest
