import java.applet.*;
import javax.imageio.ImageIO;
import java.awt.image.*;
import javafx.embed.swing.*;
import java.io.*;  
import javafx.animation.*;
import javafx.event.*; 
import javafx.application.*;  
import javafx.scene.media.*;
import javafx.scene.media.MediaPlayer.Status;    
import javafx.scene.*;
import javafx.scene.paint.*;   
import javafx.scene.input.*;
import javafx.scene.control.*; 
import javafx.scene.effect.*;   
import javafx.scene.layout.*;  
import javafx.stage.*;     
import javafx.geometry.*; 
import javafx.scene.text.*; 
import javafx.geometry.*;  
import javafx.scene.shape.*;
import java.util.*; 
import javafx.scene.web.*; 
import javafx.scene.image.*; 
import javafx.scene.canvas.*; 
import javafx.beans.value.*;
import java.util.concurrent.*;
import java.lang.Thread.State.*;
import javafx.scene.transform.*;
import javafx.util.*;
public class jfx extends Application
{
	TranslateTransition tranime=new TranslateTransition();
Sphere translsphere=new Sphere(200);
	MediaPlayer mp;
	Media mf;
	int var=0;
	File file1;
	FadeTransition ftanime=new FadeTransition();
Rectangle faderect=new Rectangle(450,450,400,300);
	FileChooser file;
	RotateTransition rt;
	ScaleTransition scanime;
	FillTransition filltanime=new FillTransition();
Rectangle filltsphere=new Rectangle(200,200,200,200);
Color fillperm=Color.color(Math.random(),Math.random(),Math.random());
Box scalebox=new Box(100,100,100);
	Rectangle rectShape=new Rectangle(600,300,600,300);
	Circle circleShape =new Circle(600,300,200);
	Rectangle squareShape=new Rectangle(600,300,500,500);
	Ellipse ovalShape=new Ellipse(600,400,600,400);
	Polygon triangleShape=new Polygon(new double[]{200.0,200.0,300.0,700.0,700.0,400.0});
	QuadCurve quadcurveShape=new QuadCurve(200.0,200.0,600.0,600.0,400.0,800.0);
	int circleshape=0;
	int rectshape=0;
	int squareshape=0;
	int ovalshape=0;
	int quadcurveshape=0;
	int triangleshape=0;
	 RotateTransition rotate = new RotateTransition(); 
     TranslateTransition translate = new TranslateTransition();  
      Box box1 = new Box(); 
      int xc=0;
      int yc=0;
      int zc=0; 
	TimeUnit second=TimeUnit.SECONDS;
	TimeUnit millisecond=TimeUnit.MILLISECONDS;
	BackgroundFill bgcolor=new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY);
	Background bg=new Background(bgcolor);
	 volatile Pane temp=new Pane();
	  MediaView mv;
	  ColorAdjust coloradjust=new ColorAdjust();
	Image img;
	ImageView imgvw;
	Label hue=new Label("Hue");
	Label saturation =new Label("Saturation");
	Label input=new Label("Input");
	Label brightness=new Label("Brightness");
	Label contrast=new Label("Contrast");
	MenuBar mb=new MenuBar();
	volatile Scene scn1;
	volatile Stage stage;
	Rectangle rect1=new Rectangle();
		Rectangle rect2=new Rectangle();
		Rectangle rect3=new Rectangle();
		Rectangle rect4=new Rectangle();
		Rectangle rect5=new Rectangle();
		Rectangle rect6=new Rectangle();
		Rectangle rect7=new Rectangle();
		Rectangle rect8=new Rectangle();
		Rectangle rect9=new Rectangle();
		int result[]=new int[9];
		int reslt=1;
		Label x1;
		int check=0;
		Line line11=new Line();
		Line line12=new Line();
		Line line21=new Line();
		Line line22=new Line();
		Menu m1=new Menu("Play Audio");
		Menu m2=new Menu("Play video");
		Menu m3=new Menu("Games");
		Menu m5=new Menu("Shapes");
		Menu m6=new Menu("Tools");
		Menu m7=new Menu("Animations");
		MenuItem m11=new MenuItem("Play Local");
		MenuItem m21=new MenuItem("Play Local");
		MenuItem m31=new MenuItem("Tic Tac Toe");
		MenuItem m32=new MenuItem("MagicCube");
		MenuItem m33=new MenuItem("PacMan");
		MenuItem m51=new MenuItem("Triangle");
		MenuItem m52=new MenuItem("Rectangle");
		MenuItem m53=new MenuItem("Square");
		MenuItem m54=new MenuItem("Oval");
		MenuItem m55=new MenuItem("Circle");
		MenuItem m56=new MenuItem("Quadcurve");
		MenuItem m61=new MenuItem("Pic Editor");
		MenuItem m71=new MenuItem("Rotate Transition");
		MenuItem m72=new MenuItem("Scale Transition");
		MenuItem m73=new MenuItem("Translate Transition");
		MenuItem m74=new MenuItem("Fade Transition");
		MenuItem m75=new MenuItem("Fill Transition");
		MenuItem m76=new MenuItem("Stroke Transition");
		MenuItem m77=new MenuItem("Sequential Transition");
		MenuItem m78=new MenuItem("Parallel Transition");
		MenuItem m79=new MenuItem("Pause Transition");
		MenuItem m711=new MenuItem("Path Transition");
		RotateTransition rtanime;
		StrokeTransition stroketanime=new StrokeTransition();
     Rectangle stroketrect=new Rectangle(500,200,500,300);
	PhongMaterial pm=new PhongMaterial();
	Cylinder rotatecyl=new Cylinder(100.0,700.0);
	public void showscale()
	{
		pm.setDiffuseColor(Color.color(Math.random(),Math.random(),Math.random()));
		pm.setSpecularColor(Color.color(Math.random(),Math.random(),Math.random()));
		pm.setSpecularPower(100);
		scalebox.setMaterial(pm);
		scanime.pause();
		scanime.play();
	}
	 public void showfade()
   {
    filltanime.stop();
    filltanime.setFromValue(fillperm);
    filltanime.setToValue(Color.color(Math.random(),Math.random(),Math.random()));
    filltanime.play();
   }
	public void showrotate()
	{
		pm.setDiffuseColor(Color.color(Math.random(),Math.random(),Math.random()));
		pm.setSpecularColor(Color.color(Math.random(),Math.random(),Math.random()));
		pm.setSpecularPower(100);
		rotatecyl.setMaterial(pm);
rtanime.pause();
int temp=(int)(Math.random()*6);
if(temp>=0 && temp<2)
	rtanime.setAxis(Rotate.X_AXIS);
if(temp>=2 && temp<=6)
	rtanime.setAxis(Rotate.Z_AXIS);
rtanime.play();
	}

		public void showshapes()
	{
		
		if(rectshape==1)
rectShape.setFill(Color.color(Math.random(),Math.random(),Math.random()));
else if(triangleshape==1)
{
	triangleShape.setFill(Color.color(Math.random(),Math.random(),Math.random()));
}
else if(circleshape==1)
{
	circleShape.setFill(Color.color(Math.random(),Math.random(),Math.random()));
}
else if(ovalshape==1)
{
	ovalShape.setFill(Color.color(Math.random(),Math.random(),Math.random()));
}
else if(squareshape==1)
{
	squareShape.setFill(Color.color(Math.random(),Math.random(),Math.random()));
}
else if(quadcurveshape==1)
{
	quadcurveShape.setFill(Color.color(Math.random(),Math.random(),Math.random()));
}
//box1.setMaterial(pm);
rt.pause();
int temp=(int)(Math.random()*6);
if(temp>=0 && temp<2)
	rt.setAxis(Rotate.X_AXIS);
if(temp>=2 && temp<4)
	rt.setAxis(Rotate.Y_AXIS);
if(temp>=4 && temp<=6)
	rt.setAxis(Rotate.Z_AXIS);
rt.play();
	}

		public void paint()
		{
		
			Stop[] stops = new Stop[] { new Stop(0, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())),new Stop(0.1, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())),new Stop(0.2, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())),new Stop(0.3, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())),new Stop(0.4, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())),new Stop(0.5, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())),new Stop(0.6, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())),new Stop(0.7, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())),new Stop(0.8, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())), new Stop(0.9, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())),new Stop(1, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random()))};  
        RadialGradient linear = new RadialGradient(360,8, 0, 1,8,true, CycleMethod.REPEAT, stops);
		rect1.setFill(linear);
		rect2.setFill(linear);
		rect3.setFill(linear);
		rect4.setFill(linear);
		rect5.setFill(linear);
		rect6.setFill(linear);
		rect7.setFill(linear);
		rect8.setFill(linear);
		rect9.setFill(linear);
		
		}
		 public void magiccube()
     {
        rotate.pause();
        translate.pause();
        int x=(int)(Math.random()*6);
        if(x>=0 && x<2 )
        rotate.setAxis(Rotate.Z_AXIS);  
          if(x>=2 && x<4)
        rotate.setAxis(Rotate.X_AXIS);  
    if(x>=4 && x<=6)
        rotate.setAxis(Rotate.Y_AXIS);  
        rotate.setByAngle(360);    
        rotate.setCycleCount(1);    
        rotate.setDuration(Duration.millis(1000));    
        rotate.setAutoReverse(true);  
        rotate.setNode(box1);
        translate.setToX((int)(Math.random()*1800));      
        translate.setToY((int)(Math.random()*1200));
        translate.setDuration(Duration.millis(1000));   
        translate.setCycleCount(1);  
        translate.setAutoReverse(true);   
        translate.setNode(box1);    
        translate.play();      
        rotate.play();  
     }
     public void showfill()
   {
        faderect.setFill(Color.color(Math.random(),Math.random(),Math.random()));
   }
    public void showstroke()
   {
    stroketanime.stop();
    stroketanime.setFromValue(fillperm);
    stroketanime.setToValue(Color.color(Math.random(),Math.random(),Math.random()));
    stroketanime.play();
   }
		public void checktictactoe()
	{
		double sx=0;
		double sy=0;
		double ex=0;
		double ey=0;

			if(check==0 && result[0]==result[4] && result[0]==result[8] && result[0]!=0 )
			{
				sx=100;
				sy=100;
				ex=550;
				ey=550;
				check=1;

			}
			if(check==0 && result[2]==result[4] && result[2]==result[6] && result[2]!=0)
		{
				sx=550;
				sy=100;
				ex=100;
				ey=550;
				check=1;
		}
		if(check==0 && result[0]==result[1] && result[0]==result[2] && result[0]!=0)
		{
				sx=100;
				sy=172;
				ex=550;
				ey=172;
				check=1;
		}

		if(check==0 && result[3]==result[4] && result[3]==result[5] && result[3]!=0)
		{
				sx=100;
				sy=312;
				ex=550;
				ey=312;
				check=1;
		}
		if(check==0 && result[6]==result[7] && result[6]==result[8] && result[6]!=0)
		{
				sx=100;
				sy=472;
				ex=550;
				ey=472;
				check=1;
		}
		
		if(check==0 && result[0]==result[3] && result[0]==result[6] && result[0]!=0)
		{
				sx=172;
				sy=100;
				ex=172;
				ey=550;
				check=1;
		}
		if(check==0 && result[1]==result[4] && result[1]==result[7] && result[1]!=0)
		{
				sx=312;
				sy=100;
				ex=312;
				ey=550;
				check=1;
		}
		if(check==0 && result[2]==result[5] && result[2]==result[8] && result[2]!=0)
		{
				sx=472;
				sy=100;
				ex=472;
				ey=550;
				check=1;
		}
		if(check==1)
		{
			Line l1=new Line();
			l1.setStartX(sx);
			l1.setStartY(sy);
			l1.setEndX(ex);
			l1.setEndY(ey);
			l1.setStrokeWidth(6);
			temp.getChildren().addAll(l1);
			check=2;
		}

	}
		public void picedi(Stage pstage) throws Exception
	{
		Button picedsave=new Button("Save");
		picedsave.setStyle("-fx-background-color:black;-fx-text-fill:white;-fx-height:100;-fx-width:100;-fx-border-style:solid;-fx-border-width:2;-fx-border-color:white");
		picedsave.setLayoutX(450);
		picedsave.setLayoutY(700);
		picedsave.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent s)
			{
				file=new FileChooser();
file.setTitle("Choose your file here");
file1 = file.showSaveDialog(pstage);
System.out.println(file1);
if(file1!=null)
{
	try
	{
		ImageIO.write(SwingFXUtils.fromFXImage(imgvw.snapshot(null,null),null),"png",file1);
	}
	catch(Exception e)
	{

	}
}
			}
		});
		Slider picedslider1=new Slider(0,100,20);
	Slider picedslider2=new Slider(0,100,20);
	Slider picedslider3=new Slider(0,100,20);
	Slider picedslider4=new Slider(0,100,20);
	Slider picedslider5=new Slider(0,100,20);
	picedslider1.setValueChanging(true);
	picedslider2.setValueChanging(true);
	picedslider3.setValueChanging(true);
	picedslider4.setValueChanging(true);
	picedslider5.setValueChanging(true);
		picedslider1.setLayoutX(900);
		picedslider1.setLayoutY(200);
		picedslider2.setLayoutX(900);
		picedslider2.setLayoutY(300);
		picedslider3.setLayoutX(900);
		picedslider3.setLayoutY(400);
		picedslider4.setLayoutX(900);
		picedslider4.setLayoutY(500);
		picedslider5.setLayoutX(900);
		picedslider5.setLayoutY(600);
		picedslider1.setShowTickLabels(true);
	picedslider1.setSnapToTicks(true);
	picedslider2.setShowTickLabels(true);
	picedslider2.setSnapToTicks(true);
	picedslider3.setShowTickLabels(true);
	picedslider3.setSnapToTicks(true);
	picedslider4.setShowTickLabels(true);
	picedslider4.setSnapToTicks(true);
	picedslider5.setShowTickLabels(true);
	picedslider5.setSnapToTicks(true);
		hue.setLayoutX(800);
		hue.setLayoutY(200);
		saturation.setLayoutX(800);
		saturation.setLayoutY(300);
		input.setLayoutX(800);
		input.setLayoutY(400);
		brightness.setLayoutX(800);
		brightness.setLayoutY(500);
		contrast.setLayoutX(800);
		contrast.setLayoutY(600);

picedslider1.valueProperty().addListener(new ChangeListener<Number>(){
    	public void changed(ObservableValue<? extends Number> tmp2,Number oldvalue,Number newvalue)
    	{
    		coloradjust.setHue(newvalue.doubleValue()/100);
    		picedslider1.setValue(newvalue.doubleValue());
    		imgvw.setEffect(coloradjust);imgvw.setCache(true);imgvw.setCacheHint(CacheHint.SPEED);

    	}
    });



picedslider2.valueProperty().addListener(new ChangeListener<Number>(){
    	public void changed(ObservableValue<? extends Number> tmp2,Number oldvalue,Number newvalue)
    	{
    		coloradjust.setSaturation(newvalue.doubleValue()/100);
    		picedslider2.setValue(newvalue.doubleValue());
    		imgvw.setEffect(coloradjust);imgvw.setCache(true);imgvw.setCacheHint(CacheHint.SPEED);
    	}
    });


		picedslider3.valueProperty().addListener(new ChangeListener<Number>(){
    	public void changed(ObservableValue<? extends Number> tmp2,Number oldvalue,Number newvalue)
    	{
    		// coloradjust.setInput(newvalue.doubleValue());
    		// imgvw.setEffect(coloradjust);imgvw.setCache(true);imgvw.setCacheHint(CacheHint.SPEED);
    	}
    });

		picedslider4.valueProperty().addListener(new ChangeListener<Number>(){
    	public void changed(ObservableValue<? extends Number> tmp2,Number oldvalue,Number newvalue)
    	{
    		coloradjust.setBrightness(newvalue.doubleValue()/100);
    		picedslider4.setValue(newvalue.doubleValue());
    		imgvw.setEffect(coloradjust);imgvw.setCache(true);imgvw.setCacheHint(CacheHint.SPEED);
    	}
    });

		picedslider5.valueProperty().addListener(new ChangeListener<Number>(){
    	public void changed(ObservableValue<? extends Number> tmp2,Number oldvalue,Number newvalue)
    	{
    		coloradjust.setContrast(newvalue.doubleValue()/100);
    		picedslider5.setValue(newvalue.doubleValue());
    		imgvw.setEffect(coloradjust);imgvw.setCache(true);imgvw.setCacheHint(CacheHint.SPEED);
    	}
    });
		file=new FileChooser();
file.setTitle("Choose your file here");
file1 = file.showOpenDialog(pstage); 
FileInputStream fi=new FileInputStream(file1.getAbsolutePath());
//System.out.println(file1.getAbsolutePath());
		
		img=new Image(fi);
		imgvw=new ImageView(img);
		imgvw.setFitWidth(500);
		imgvw.setFitHeight(500);
		imgvw.setX(200);
		imgvw.setY(200);
		imgvw.setPreserveRatio(true);

		temp.getChildren().addAll(imgvw,picedslider3,picedslider1,picedslider2,picedslider4,picedslider5,hue,saturation,brightness,contrast,input,picedsave);
	}
		public void step1()
		{
			System.out.println(mv);
			m11.setOnAction(event);
		m21.setOnAction(event);
		m31.setOnAction(event);
		m32.setOnAction(event);
		m33.setOnAction(event);
		m51.setOnAction(event);
		m52.setOnAction(event);
		m53.setOnAction(event);
		m54.setOnAction(event);
		m55.setOnAction(event);
		m56.setOnAction(event);
		m61.setOnAction(event);
		m71.setOnAction(event);
		m72.setOnAction(event);
		m73.setOnAction(event);
		m74.setOnAction(event);
		m75.setOnAction(event);
		m76.setOnAction(event);
		m77.setOnAction(event);
		m78.setOnAction(event);
		m79.setOnAction(event);
		m711.setOnAction(event);
m1.getItems().addAll(m11);
m2.getItems().addAll(m21);
m3.getItems().addAll(m31,m32,m33);
m5.getItems().addAll(m51,m52,m53,m54,m55,m56);
m6.getItems().addAll(m61);
m7.getItems().addAll(m71,m72,m73,m74,m75,m76,m77,m78,m79,m711);
mb.getMenus().addAll(m1,m2,m3,m5,m6,m7);

		}
		public void check(MediaPlayer mp)
{
	double total=mp.getTotalDuration().toSeconds();
	double sp=mp.getCurrentTime().toSeconds();

	try{
		second.sleep(1);
	}
	catch(Exception e)
	{}
	Arc arc = new Arc();
	
	arc.setCenterX(500); 
	   arc.setCenterY(300);   
    arc.setRadiusX(70);  
       arc.setRadiusY(70);  
       arc.setStartAngle(90-(sp/total)*360);
       arc.setLength((sp/total)*360); 
        arc.setType(ArcType.ROUND);  
        arc.setFill(Color.RED);  
       Stop[] stops = new Stop[] { new Stop(0, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())),new Stop(0.1, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())),new Stop(0.2, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())),new Stop(0.3, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())),new Stop(0.4, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())),new Stop(0.5, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())),new Stop(0.6, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())),new Stop(0.7, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())),new Stop(0.8, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())), new Stop(0.9, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())),new Stop(1, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random()))};  
        RadialGradient linear = new RadialGradient(360,8, 0, 1,8,true, CycleMethod.REPEAT, stops);  
        arc.setFill(linear);  
     temp.getChildren().addAll(arc);
	}
		public void start(Stage pstage) throws Exception
	{

		stage=pstage;
		step1();
		Pane x=new Pane();	
mb.prefWidthProperty().bind(stage.widthProperty());
	x.getChildren().addAll(mb);
		Scene scn=new Scene(x,1000,1000);
		x.getStylesheets().add("Style.css"); 
		stage.setScene(scn);
		stage.show();
	}
	public void makesleep()
	{
		try{
		millisecond.sleep(500);
	}
	catch(Exception e)
	{}
	}
	public void AudioPlayer(Stage pstage)
	{
file=new FileChooser();
file.setTitle("Choose your file here");
file1 = file.showOpenDialog(pstage); 
mf=new Media(file1.toURI().toString());
 mp=new MediaPlayer(mf);
 mp.play();
 mv=new MediaView(mp);
 mv.setX(100);
 mv.setY(100);
 mv.setFitHeight(400);
 mv.setFitWidth(3000);
 System.out.println(mv);
temp.getChildren().addAll(mv);
	}
	
		EventHandler <ActionEvent> event=new EventHandler<ActionEvent>(){

public void handle(ActionEvent e)
{
	System.out.println(((MenuItem)e.getSource()).getText());
	temp=new Pane();
	temp.getChildren().addAll(mb);
	temp.setBackground(bg);
	temp.getStylesheets().add("Style.css");
	rt=new RotateTransition();
		rt.setAxis(Rotate.X_AXIS);
		rt.setByAngle(360);
		rt.setCycleCount(500);
		rt.setDuration(Duration.millis(2500));
		rt.setAutoReverse(true); 
	//Audio player code starts
	if(((MenuItem)e.getSource()).getText().equals("Play Local"))
	{	
	Button btn1=new Button("Choose the song to play");
	Slider slider1=new Slider(1,16000,1000);
	Slider slider2=new Slider(1,10000,1000);
	Slider slider3=new Slider(1,10000,1000);
	slider1.setLayoutX(400);
	slider1.setLayoutY(600);
	slider2.setLayoutX(400);
	slider2.setLayoutY(670);
	slider3.setLayoutX(400);
	slider3.setLayoutY(740);
	slider1.setShowTickLabels(true);
	slider1.setSnapToTicks(true);
	slider2.setShowTickLabels(true);
	slider2.setSnapToTicks(true);
	slider3.setShowTickLabels(true);
	slider3.setSnapToTicks(true);
	Label lbl1=new Label("CenterFrequency");
	Label lbl2=new Label("Bandwidth");
	Label lbl3=new Label("Gain");
	lbl1.setLayoutX(270);
	lbl1.setLayoutY(600);
	lbl2.setLayoutX(300);
	lbl2.setLayoutY(670);
	lbl3.setLayoutX(300);
	lbl3.setLayoutY(740);
	btn1.setStyle("-fx-background-color: black;-fx-text-fill:white;-fx-height:100;-fx-width:100");
	btn1.setLayoutX(350);
    btn1.setLayoutY(500);
    Button btn2=new Button("Pause");
    btn2.setStyle("-fx-background-color: black;-fx-text-fill:white");
    btn2.setLayoutX(550);
    btn2.setLayoutY(500);
    slider1.valueProperty().addListener(new ChangeListener<Number>(){
    	public void changed(ObservableValue<? extends Number> tmp2,Number oldvalue,Number newvalue)
    	{
    		if(mp!=null)
    		{
    		AudioEqualizer ae=mp.getAudioEqualizer();
    		ae.setEnabled(true);
List <EqualizerBand>xi=ae.getBands();
System.out.println(xi.size());
for(int i=0;i<xi.size();i++)
{
		xi.get(i).setCenterFrequency(newvalue.doubleValue());
}	
System.out.println("changed");
    		}
    	}
    });
    slider2.valueProperty().addListener(new ChangeListener<Number>(){
    	public void changed(ObservableValue<? extends Number> tmp2,Number oldvalue,Number newvalue)
    	{
    		if(mp!=null)
    		{
    		AudioEqualizer ae=mp.getAudioEqualizer();
    		ae.setEnabled(true);
List <EqualizerBand>xi=ae.getBands();
System.out.println(xi.size());
for(int i=0;i<xi.size();i++)
{
		 xi.get(i).setBandwidth(newvalue.doubleValue());
}	
System.out.println("changed");
    		}
    	}
    });
    slider3.valueProperty().addListener(new ChangeListener<Number>(){
    	public void changed(ObservableValue<? extends Number> tmp2,Number oldvalue,Number newvalue)
    	{
    		if(mp!=null)
    		{
    		AudioEqualizer ae=mp.getAudioEqualizer();
    		ae.setEnabled(true);
List <EqualizerBand>xi=ae.getBands();
System.out.println(xi.size());
for(int i=0;i<xi.size();i++)
{
		 xi.get(i).setGain(newvalue.doubleValue());
}	
System.out.println("changed");
    		}
    	}
    });
    btn2.setOnAction(new EventHandler<ActionEvent>(){
public void handle(ActionEvent e)
{
	Status status=mp.getStatus();
	if(status==Status.PLAYING)
	{
	mp.pause();
btn2.setText("Play");}
else
{
mp.play();
btn2.setText("Pause");	
}
}
    });
	temp.getChildren().addAll(btn1,btn2,slider1,slider2,slider3,lbl1,lbl2,lbl3);
Scene scn1=new Scene(temp,1200,1200);
stage.setScene(scn1);
	btn1.setOnAction(new EventHandler<ActionEvent>(){
public void handle(ActionEvent e)
{
	AudioPlayer(stage);
	Thread trd=new Thread(new Runnable(){ 
			public void run() 
			{ 
				Runnable run=new Runnable(){
					public void run(){
				check(mp);
				  

			}
				};
				while(mp.getVolume()<mp.getTotalDuration().toSeconds() || Double.isNaN(mp.getTotalDuration().toSeconds()))
				{
				Platform.runLater(run);
				try {

					//System.out.println((long)((mp.getTotalDuration().toSeconds()/100.00)*1000));
					if((long)((mp.getTotalDuration().toSeconds()/100.00)*1000)==0)
            Thread.sleep(3000);
        else
        	 Thread.sleep((long)((mp.getTotalDuration().toSeconds()/100.00)*1000));
         } catch (Exception e) {}
			}

			}
		}); 
	makesleep();
	trd.setDaemon(true);
        trd.start();
}
	});
	}
//AudioPlayer code ends





//Tictactoe code Starts
	else if(((MenuItem)e.getSource()).getText().equals("Tic Tac Toe"))
	{
		System.out.println("Tic Tac Toe");
		EventHandler <MouseEvent> me=new EventHandler <MouseEvent>(){
			public void handle(MouseEvent e)
			{
				if(check==0)
				{
				if(reslt==1)
				{
					x1=new Label("0");
					reslt=2;
				}
				else
				{
					x1=new Label("X");
					reslt=1;
				}
				double xa=((Rectangle)e.getSource()).getX();
				double ya=((Rectangle)e.getSource()).getY();
				x1.setLayoutX(xa);
				x1.setLayoutY(ya);
				x1.setMinHeight(144);
				x1.setMinWidth(144);
				x1.setFont(new Font("Arial", 140));
				x1.setAlignment(Pos.TOP_CENTER);
				temp.getChildren().addAll(x1);
				int index=-1;
				if(xa==100)
					index+=1;
				else if(xa==250)
					index+=2;
				else
					index+=3;
				if(ya==250)
					index+=3;
				else if(ya==400)
					index+=6;
				result[index]=reslt;
				// System.out.println(result[index]);
				// System.out.println(index);
				// System.out.println();
				checktictactoe();
			}
			}
		};
		
		rect1.setX(100);
		rect1.setY(100);
		rect1.setHeight(144);
		rect1.setWidth(144);
		rect2.setX(100);
		rect2.setY(250);
		rect2.setHeight(144);
		rect2.setWidth(144);
		rect3.setX(100);
		rect3.setY(400);
		rect3.setHeight(144);
		rect3.setWidth(144);
		rect4.setX(250);
		rect4.setY(100);
		rect4.setHeight(144);
		rect4.setWidth(144);
		rect5.setX(250);
		rect5.setY(250);
		rect5.setHeight(144);
		rect5.setWidth(144);
		rect6.setX(250);
		rect6.setY(400);
		rect6.setHeight(144);
		rect6.setWidth(144);
		rect7.setX(400);
		rect7.setY(100);
		rect7.setHeight(144);
		rect7.setWidth(144);
		rect8.setX(400);
		rect8.setY(250);
		rect8.setHeight(144);
		rect8.setWidth(144);
		rect9.setX(400);
		rect9.setY(400);
		rect9.setHeight(144);
		rect9.setWidth(144);
		line11.setStartX(245);
		line11.setStartY(100);
		line11.setEndX(245);
		line11.setEndY(550);
		line12.setStartX(395);
		line12.setStartY(100);
		line12.setEndX(395);
		line12.setEndY(550);
		line21.setStartX(100);
		line21.setStartY(245);
		line21.setEndX(550);
		line21.setEndY(245);
		line22.setStartX(100);
		line22.setStartY(395);
		line22.setEndX(550);
		line22.setEndY(395);
		line11.setStrokeWidth(6);
		line12.setStrokeWidth(6);
		line21.setStrokeWidth(6);
		line22.setStrokeWidth(6);
rect1.setOnMousePressed(me);
rect2.setOnMousePressed(me);
rect3.setOnMousePressed(me);
rect4.setOnMousePressed(me);
rect5.setOnMousePressed(me);
rect6.setOnMousePressed(me);
rect7.setOnMousePressed(me);
rect8.setOnMousePressed(me);
rect9.setOnMousePressed(me);
		Stop[] stops = new Stop[] { new Stop(0, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())),new Stop(0.1, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())),new Stop(0.2, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())),new Stop(0.3, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())),new Stop(0.4, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())),new Stop(0.5, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())),new Stop(0.6, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())),new Stop(0.7, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())),new Stop(0.8, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())), new Stop(0.9, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random())),new Stop(1, Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255),Math.random()))};  
        RadialGradient linear = new RadialGradient(360,8, 0, 1,8,true, CycleMethod.REPEAT, stops);
		rect1.setFill(linear);
		rect2.setFill(linear);
		rect3.setFill(linear);
		rect4.setFill(linear);
		rect5.setFill(linear);
		rect6.setFill(linear);
		rect7.setFill(linear);
		rect8.setFill(linear);
		rect9.setFill(linear);
		temp.getChildren().addAll(rect1,rect2,rect3,rect4,rect5,rect6,rect7,rect8,rect9,line22,line21,line12,line11);
		Scene scn=new Scene(temp,1000,1000);
		stage.setScene(scn);
		stage.show();
		paint();
		Thread trd=new Thread(new Runnable(){ 
			public void run() 
			{ 
				Runnable run=new Runnable(){
					public void run(){
				paint();
				  

			}
				};
				while(var<100)
				{
				Platform.runLater(run);
				try {

					//System.out.println((long)((mp.getTotalDuration().toSeconds()/100.00)*1000));
					 Thread.sleep(700);
					} 
					 catch (Exception e) {}
			}
			}
		}); 
	makesleep();
	trd.setDaemon(true);
        trd.start();
	}
	//Tictactoe code ends






//Magic cube code starts
	else if(((MenuItem)e.getSource()).getText().equals("MagicCube"))
	{

	box1.setHeight(200);  
    box1.setWidth(200);  
    box1.setDepth(200);  
    box1.setTranslateX(400);  
    box1.setTranslateY(400);      
        rotate.setAxis(Rotate.Z_AXIS);    
        rotate.setByAngle(360);   
        rotate.setCycleCount(1);     
        rotate.setDuration(Duration.millis(1000));   
        rotate.setAutoReverse(true);  
        rotate.setNode(box1);  
        translate.setByX((int)(Math.random()*500-100));   
        translate.setByY((int)(Math.random()*500-100));   
        translate.setByZ(0);    
        translate.setDuration(Duration.millis(1000));     
        translate.setCycleCount(1);    
        translate.setAutoReverse(true);  
        translate.setNode(box1);    
        translate.play();    
        rotate.play();       
        temp.getChildren().addAll(box1);  
        Scene scene = new Scene(temp,1800,1800,Color.BLACK);
        Camera camera=new PerspectiveCamera();
       //  camera.setTranslateX(-20);
       //  camera.setTranslateY(100);
       //  camera.setTranslateZ(50);
       // camera.setFarClip(100);
       //  scene.setCamera(camera);
        stage.setScene(scene);   
        stage.show();
        Thread trd=new Thread(new Runnable()
        {
            public void run()
            {
                Runnable run=new Runnable()
                {
                    public void run()
                    {
                       magiccube();
                    }
                };
                while(true)
                {
                    Platform.runLater(run);
                    try
                    {
                    Thread.sleep(400);//800
                    
                    }
                    catch(Exception e)
                    {}
                }

            }
        });
       
    makesleep();
    trd.setDaemon(true);
        trd.start();  
	}
	//Magic cube ends


	//PicEditor starts
	else if(((MenuItem)e.getSource()).getText().equals("Pic Editor"))
	{
		System.out.println("picEditor");
		temp.getStylesheets().add("Style.css");
		Button picedbtn=new Button("click me");
		picedbtn.setStyle("-fx-background-color:black;-fx-text-fill:white;-fx-height:100;-fx-width:100;-fx-border-style:solid;-fx-border-width:2;-fx-border-color:white");
		picedbtn.setLayoutX(350);
    picedbtn.setLayoutY(700);
		picedbtn.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e) 
			{
				try
				{
				picedi(stage);
			}
			catch(Exception e1)
			{}
			}
		});
		temp.getChildren().addAll(picedbtn);
		Scene scn=new Scene(temp,1500,1500,Color.BLACK);
		stage.setScene(scn);
		stage.show();
	}
	//picEditor ends


	 //TriangleShape starts
	else if(((MenuItem)e.getSource()).getText().equals("Triangle"))
	{
		circleshape=0;
	rectshape=0;
	squareshape=0;
	ovalshape=0;
	quadcurveshape=0;
	triangleshape=1;
		triangleShape.setFill(Color.color(Math.random(),Math.random(),Math.random()));
		rt.setNode(triangleShape);
		rt.play();
		temp.getChildren().addAll(triangleShape);
		Scene scn=new Scene(temp,1000,1000,Color.BLACK);
		stage.setScene(scn);
		stage.show();
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e1)
		{

		}
		Thread trd=new Thread(new Runnable(){
			public void run()
			{
				Runnable run=new Runnable(){
					public void run()
					{
						showshapes();
					}
				};
				while(true)
				{
					Platform.runLater(run);
					try
					{
						Thread.sleep(4000);
					}
					catch(Exception e)
					{

					}
				}
			}
		});
		trd.setDaemon(true);
		trd.start();

	}
	//Triangle Shape ends


	//Circle Shape starts
	else if(((MenuItem)e.getSource()).getText().equals("Circle"))
	{
		circleshape=1;
	rectshape=0;
	squareshape=0;
	ovalshape=0;
	quadcurveshape=0;
	triangleshape=0;
		circleShape.setFill(Color.color(Math.random(),Math.random(),Math.random()));
		rt.setNode(circleShape);
		rt.play();
		temp.getChildren().addAll(circleShape);
		Scene scn=new Scene(temp,1000,1000,Color.BLACK);
		stage.setScene(scn);
		stage.show();
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e1)
		{

		}
		Thread trd=new Thread(new Runnable(){
			public void run()
			{
				Runnable run=new Runnable(){
					public void run()
					{
						showshapes();
					}
				};
				while(true)
				{
					Platform.runLater(run);
					try
					{
						Thread.sleep(4000);
					}
					catch(Exception e)
					{

					}
				}
			}
		});
		trd.setDaemon(true);
		trd.start();

	}
	//circleShape ends

	//SquareShape starts
	else if(((MenuItem)e.getSource()).getText().equals("Square"))
	{
		circleshape=0;
	rectshape=0;
	squareshape=1;
	ovalshape=0;
	quadcurveshape=0;
	triangleshape=0;
		squareShape.setFill(Color.color(Math.random(),Math.random(),Math.random()));
		rt.setNode(squareShape);
		rt.play();
		temp.getChildren().addAll(squareShape);
		Scene scn=new Scene(temp,1000,1000,Color.BLACK);
		stage.setScene(scn);
		stage.show();
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e1)
		{

		}
		Thread trd=new Thread(new Runnable(){
			public void run()
			{
				Runnable run=new Runnable(){
					public void run()
					{
						showshapes();
					}
				};
				while(true)
				{
					Platform.runLater(run);
					try
					{
						Thread.sleep(4000);
					}
					catch(Exception e)
					{

					}
				}
			}
		});
		trd.setDaemon(true);
		trd.start();

	}
	//squareshape ends

	//rectangle shapestarts
	else if(((MenuItem)e.getSource()).getText().equals("Rectangle"))
	{
		circleshape=0;
	rectshape=1;
	squareshape=0;
	ovalshape=0;
	quadcurveshape=0;
	triangleshape=0;
		rectShape.setFill(Color.color(Math.random(),Math.random(),Math.random()));
		rt.setNode(rectShape);
		rt.play();
		temp.getChildren().addAll(rectShape);
		Scene scn=new Scene(temp,1000,1000,Color.BLACK);
		stage.setScene(scn);
		stage.show();
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e1)
		{

		}
		Thread trd=new Thread(new Runnable(){
			public void run()
			{
				Runnable run=new Runnable(){
					public void run()
					{
						showshapes();
					}
				};
				while(true)
				{
					Platform.runLater(run);
					try
					{
						Thread.sleep(4000);
					}
					catch(Exception e)
					{

					}
				}
			}
		});
		trd.setDaemon(true);
		trd.start();

	}
	//squareshape ends

	//ovalshape starts
	else if(((MenuItem)e.getSource()).getText().equals("Oval"))
	{
		circleshape=0;
	rectshape=0;
	squareshape=0;
	ovalshape=1;
	quadcurveshape=0;
	triangleshape=0;
		ovalShape.setFill(Color.color(Math.random(),Math.random(),Math.random()));
		rt.setNode(ovalShape);
		rt.play();
		temp.getChildren().addAll(ovalShape);
		Scene scn=new Scene(temp,1000,1000,Color.BLACK);
		stage.setScene(scn);
		stage.show();
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e1)
		{

		}
		Thread trd=new Thread(new Runnable(){
			public void run()
			{
				Runnable run=new Runnable(){
					public void run()
					{
						showshapes();
					}
				};
				while(true)
				{
					Platform.runLater(run);
					try
					{
						Thread.sleep(4000);
					}
					catch(Exception e)
					{

					}
				}
			}
		});
		trd.setDaemon(true);
		trd.start();

	}
	//ovalshape ends


	//Quadcurveshape starts
	else if(((MenuItem)e.getSource()).getText().equals("Quadcurve"))
	{
		circleshape=0;
	rectshape=0;
	squareshape=0;
	ovalshape=0;
	quadcurveshape=1;
	triangleshape=0;
		quadcurveShape.setFill(Color.color(Math.random(),Math.random(),Math.random()));
		rt.setNode(quadcurveShape);
		rt.play();
		temp.getChildren().addAll(quadcurveShape);
		Scene scn=new Scene(temp,1000,1000,Color.BLACK);
		stage.setScene(scn);
		stage.show();
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e1)
		{

		}
		Thread trd=new Thread(new Runnable(){
			public void run()
			{
				Runnable run=new Runnable(){
					public void run()
					{
						showshapes();
					}
				};
				while(true)
				{
					Platform.runLater(run);
					try
					{
						Thread.sleep(4000);
					}
					catch(Exception e)
					{

					}
				}
			}
		});
		trd.setDaemon(true);
		trd.start();

	}
	//Quadcurveshape ends



//Rotate Transition starts
	else if(((MenuItem)e.getSource()).getText().equals("Rotate Transition"))
	{
		System.out.println("Rotate");
		rotatecyl.setTranslateX(500);
		rotatecyl.setTranslateY(500);
		pm.setDiffuseColor(Color.color(Math.random(),Math.random(),Math.random()));
		pm.setSpecularColor(Color.color(Math.random(),Math.random(),Math.random()));
		pm.setSpecularPower(100);
		rotatecyl.setMaterial(pm);
		rtanime=new RotateTransition();
		rtanime.setAxis(Rotate.X_AXIS);
		rtanime.setByAngle(360);
		rtanime.setCycleCount(500);
		rtanime.setDuration(Duration.millis(2500));
		rtanime.setAutoReverse(true);
		rtanime.setNode(rotatecyl);
		rtanime.play();
		temp.getChildren().addAll(rotatecyl);
		Scene scn=new Scene(temp,1000,1000,Color.BLACK);
		stage.setScene(scn);
		stage.show();
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e1)
		{

		}
		Thread trd=new Thread(new Runnable(){
			public void run()
			{
				Runnable run=new Runnable(){
					public void run()
					{
						showrotate();
					}
				};
				while(true)
				{
					Platform.runLater(run);
					try
					{
						Thread.sleep(2000);
					}
					catch(Exception e)
					{

					}
				}
			}
		});
		trd.setDaemon(true);
		trd.start();
	}
	//Rotate Transition ends


	//ScaleTransition starts
	else if(((MenuItem)e.getSource()).getText().equals("Scale Transition"))
	{
		scalebox.setTranslateX(500);
		scalebox.setTranslateY(500);
		scalebox.setTranslateZ(500);
		pm.setDiffuseColor(Color.color(Math.random(),Math.random(),Math.random()));
		pm.setSpecularColor(Color.color(Math.random(),Math.random(),Math.random()));
		pm.setSpecularPower(100);
		scalebox.setMaterial(pm);
		scanime=new ScaleTransition();
		scanime.setByX(2);
		scanime.setByY(2);
		scanime.setCycleCount(500);
		scanime.setDuration(Duration.millis(2500));
		scanime.setAutoReverse(true);
		scanime.setNode(scalebox);
		scanime.play();
		temp.getChildren().addAll(scalebox);
		Scene scn=new Scene(temp,1000,1000,Color.BLACK);
		stage.setScene(scn);
		stage.show();
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e1)
		{

		}
		Thread trd=new Thread(new Runnable(){
			public void run()
			{
				Runnable run=new Runnable(){
					public void run()
					{
						showscale();
					}
				};
				while(true)
				{
					Platform.runLater(run);
					try
					{
						Thread.sleep(2000);
					}
					catch(Exception e)
					{

					}
				}
			}
		});
		trd.setDaemon(true);
		trd.start();

	}
	//Scale Transition ends



	//Translate Transition starts
	else if(((MenuItem)e.getSource()).getText().equals("Translate Transition"))
	{
		 translsphere.setTranslateX(500);
      translsphere.setTranslateY(500);
      translsphere.setTranslateZ(500);
      tranime.setDuration(Duration.millis(1000));
      tranime.setCycleCount(1);
      pm.setDiffuseColor(Color.color(Math.random(),Math.random(),Math.random()));
        pm.setSpecularColor(Color.color(Math.random(),Math.random(),Math.random()));
        pm.setSpecularPower(100);
        translsphere.setMaterial(pm); 
       tranime.setNode(translsphere); 
  tranime.play();
      EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() { 
         public void handle(MouseEvent e) { 
            tranime.stop();
            tranime.setToX(e.getSceneX()-140);
            tranime.setToY(e.getSceneY()-100);
            pm.setDiffuseColor(Color.color(Math.random(),Math.random(),Math.random()));
        pm.setSpecularColor(Color.color(Math.random(),Math.random(),Math.random()));
        pm.setSpecularPower(100);
        translsphere.setMaterial(pm);
            tranime.play();
         } 
      };  
      temp.getChildren().addAll(translsphere); 
      Scene scene = new Scene(temp, 1000, 1000);   
      scene.setOnMousePressed(eventHandler);
      stage.setScene(scene); 
	stage.show(); 
	}
	//Translation transition ends



//FadeTransition starts
	else if(((MenuItem)e.getSource()).getText().equals("Fade Transition"))
	{
		ftanime.setFromValue(1);
      ftanime.setToValue(0.1);
      ftanime.setCycleCount(1000);
      ftanime.setDuration(Duration.millis(2500));
      ftanime.setAutoReverse(true);
        faderect.setFill(Color.color(Math.random(),Math.random(),Math.random())); 
       ftanime.setNode(faderect); 
  ftanime.play();
      temp.getChildren().addAll(faderect); 
      Scene scene = new Scene(temp, 1000, 1000); 
      scene.setFill(Color.LAVENDER);  
      stage.setTitle("Event Filters Example");               
      stage.setScene(scene); 
      stage.show(); 
      try
      {
        Thread.sleep(2000);
      }
      catch(Exception e1){}
      Thread trd=new Thread(new Runnable(){
        public void run()
        {
          Runnable run=new Runnable(){
            public void run()
            {
              showfade();
            }
          };
          while(true)
          {
            Platform.runLater(run);
            try
            {
              Thread.sleep(3000);

            }
            catch(Exception e){}
          }
        }
      });
      trd.setDaemon(true);
      trd.start();
	}
	//FadeTransition ends
   

   //Fill Transition starts
	else if(((MenuItem)e.getSource()).getText().equals("Fill Transition"))
	{  
      filltanime.setFromValue(fillperm);
      filltanime.setToValue(Color.color(Math.random(),Math.random(),Math.random()));
      filltanime.setCycleCount(1000);
      filltanime.setDuration(Duration.millis(2500));
      filltanime.setAutoReverse(true);
       filltanime.setShape(filltsphere);
  filltanime.play();
      temp.getChildren().addAll(filltsphere); 
      Scene scene = new Scene(temp, 1000, 1000);  
      scene.setFill(Color.BLACK);  
      stage.setTitle("Event Filters Example");       
      stage.setScene(scene); 
      stage.show(); 
      try
      {
        Thread.sleep(2000);
      }
      catch(Exception e1){}
      Thread trd=new Thread(new Runnable(){
        public void run()
        {
          Runnable run=new Runnable(){
            public void run()
            {
              showfill();
            }
          };
          while(true)
          {
            Platform.runLater(run);
            try
            {
               Thread.sleep(2500);

            }
            catch(Exception e){}
          }
        }
      });
      trd.setDaemon(true);
      trd.start();
   } 
//Fill Transition ends



   //Stroketransition starts
   else if(((MenuItem)e.getSource()).getText().equals("Stroke Transition"))
   {
   	stroketrect.setStrokeWidth(8.5);
      stroketanime.setFromValue(fillperm);
      stroketanime.setToValue(Color.color(Math.random(),Math.random(),Math.random()));
      stroketanime.setCycleCount(1000);
      stroketanime.setDuration(Duration.millis(2500));
      stroketanime.setAutoReverse(true);   
       stroketanime.setShape(stroketrect); 
  stroketanime.play();
      temp.getChildren().addAll(stroketrect); 
      Scene scene = new Scene(temp, 1000, 1000); 
      scene.setFill(Color.BLACK);  
      stage.setTitle("Event Filters Example");       
      stage.setScene(scene); 
      stage.show(); 
      try
      {
        Thread.sleep(2000);
      }
      catch(Exception e1){}
      Thread trd=new Thread(new Runnable(){
        public void run()
        {
          Runnable run=new Runnable(){
            public void run()
            {
              showstroke();
            }
          };
          while(true)
          {
            Platform.runLater(run);
            try
            {
              Thread.sleep(2500);

            }
            catch(Exception e){}
          }
        }
      });
      trd.setDaemon(true);
      trd.start();
   }
   //stroketransition ends

}
};
		
		

	public static void main(String args[])
	{
				launch(args);
	}
}
