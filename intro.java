/* This File Contains the Code which displays the common traits. 
 * The traits displayed are the most common one and may or may not be true.
 * TextArea has been used to display the results.
 */



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class intro implements ActionListener{
   JLabel name,age,gender,sign;
   JTextField name_response, age_response, gender_response, sign_response;
   JButton yes, close;
   JFrame frame;
   Image icon =new ImageIcon("Image.jpg").getImage();
   JTextArea text;
   JScrollPane scrollPane;
   
   intro(){
	   frame = new JFrame("ASTRO PREDICTION ");
	   frame.setIconImage(icon);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setSize(500, 500);
	   frame.getContentPane().setBackground(new Color(140,82,169));
	   frame.setLayout(null);
	   frame.setLocationRelativeTo(null);
	   frame.setVisible(true);

	   
	   name = new JLabel("NAME : ");
	   name.setFont(new Font("Monospaced",Font.BOLD,20));
	   name.setBounds(30, 30,210,25);
	   frame.add(name);
	   
	   name_response = new JTextField("");
       name_response.setFont(new Font("Monospaced",Font.BOLD,20));
       name_response.setBounds(120,30, 210, 25);
       frame.add(name_response);
       
       age = new JLabel("AGE : ");
       age.setBounds(30, 90, 210, 25);
	   age.setFont(new Font("Monospaced",Font.BOLD,20));
	   frame.add(age);
	   
	   age_response = new JTextField("");
	   age_response.setFont(new Font("Monospaced",Font.BOLD,20));
       age_response.setBounds(120, 90, 210, 25);
       frame.add(age_response);
       
       gender = new JLabel(" GENDER : ");
       gender.setBounds(10, 150, 210, 25);
	   gender.setFont(new Font("Monospaced",Font.BOLD,20));
	   frame.add(gender);
	   
	   gender_response = new JTextField("");
	   gender_response.setFont(new Font("Monospaced",Font.BOLD,20));
       gender_response.setBounds(120, 150, 210, 25);
       frame.add(gender_response);
       
       sign = new JLabel(" SUNGSIGN : ");
       sign.setBounds(5, 210, 210, 25);
	   sign.setFont(new Font("Monospaced",Font.BOLD,20));
	   frame.add(sign);
	   
	   sign_response = new JTextField("");
	   sign_response.setFont(new Font("Monospaced",Font.BOLD,20));
       sign_response.setBounds(150, 210, 210, 25);
      frame.add(sign_response);
     
      
      yes= new JButton(" GO AHEAD !");
      yes.setBounds(250,250,210,30);
	  yes.setBackground(new Color(82,90,171));
	  yes.setFocusable(false);
	  yes.addActionListener(this);
	 frame.add(yes);
	  
	 close = new JButton(" CLOSE ");
	 close.setBounds(250,300,210,30);
	 close.setBackground(new Color(82,90,171));
	 close.setFocusable(false);
	 close.addActionListener(this);
     frame.add(close);
    
  }

   @Override
 public  void actionPerformed(ActionEvent e) {
	 if( e.getSource() == yes) {
		 frame.dispose();
		 JFrame frame1 = new JFrame("ASTRO PREDICTION ");
		 Image icon =new ImageIcon("Image.jpg").getImage();
		 frame1.setIconImage(icon);
		  frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   frame1.setSize(600, 600);
		   frame1.setLayout(new FlowLayout());
		   frame1.setLocationRelativeTo(null);
		   frame1.setResizable(false);

		   //Text Area to display text.
		   text = new JTextArea();
		   text.setFont(new Font("Arial",Font.BOLD,15));
		   text.setLineWrap(true);
		   text.setWrapStyleWord(true);
        scrollPane = new JScrollPane(text);
		scrollPane.setPreferredSize(new Dimension(450,450));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
			 frame1.add(scrollPane);
			 frame1.setVisible(true);  
      String sign= sign_response.getText();
      
      switch(sign.toUpperCase()) {
      
      case "ARIES": 
    	  text.setText(" Hi! "+ name_response.getText()+" Your traits are \n "+" You love to be number one.Your are Bold and ambitious \n, "
  	      		+ "dives headfirst into even the most challenging situations (which is appropriate, since the body part \n"
  	      		+ "associated with Aries is the head).\n"
  	      		+ " Like their fellow fire signs, Leo and Sagittarius, Your are  a passionate, motivated, \n"
  	      		+ "and confident leader who builds community with their cheerful disposition .\n"
  	  +" Your Lucky Number is 2." ); 
      break;
      
      case "TAURUS":
    	  text.setText(" Hi! "+ name_response.getText()+" Your traits are \n "+" Taurus is an earth sign represented by the bull. Like your celestial spirit animal,\n"
      	  		+ " you enjoy relaxing in serene, bucolic environments, surrounded by soft sounds, soothing aromas, and \n"
      	  		+ "succulent flavors. \n"
      	  		+ "Taurus is ruled by Venus, the enchanting planet that governs love, beauty, and money.\n"
      	  		+ " Taurus’s Venusian influence make this earth sign the most sensual of the zodiac: These cosmic oxen are enchanted by any physical manifestation of comfort and luxury. Pleasure is a necessity for epicurean you and you feel most content when pampered. (Taurus governs the neck, so neck caresses are especially irresistible to these bulls.)\r\n"
   + "It's true that in your perfect world,you would spend all day bathing in a tub overflowing \n"
   + "with essential oils. At the same time, these earth signs know the value of a dollar. \n"
   + "You aren’t afraid to roll up their sleeves and work hard to earn big rewards.\n"
   + " You are ambitious, focused, and resilient ."
      	      		+ " Your Lucky Number is 6 .");
     break;
     
      case "GEMINI":
         text.setText(" Hi! "+ name_response.getText()+" Your traits are \n "+"Have you ever been so busy that you wished you could clone yourself just \n"
    	  		+ "to get everything done? \n"
    	  		+ "That’s the Gemini experience in a nutshell. Appropriately symbolized by\n"
    	  		+ " the celestial twins, this air sign was interested in so many \n"
    	  		+ "pursuits that it had to double itself. Because of Geminis' intrinsic duality, \n"
    	  		+ "you are often falsely misrepresented as two-faced. In reality, however,\n"
    	  		+ " Gemini rarely has a hidden agenda. Playful and intellectually curious,\n"
    	  		+ " Gemini is constantly juggling a variety of passions, hobbies, careers, and friend \n"
    	  		+ "groups. They are the social butterflies of the zodiac: These quick-witted twins can talk to anyone\n"
    	  		+ " about anything. Find them buzzing between happy hours, dinner parties, and dance floors.\r\n"
    	      		+" Your Lucky Number is 4."); 
     break;
     
      case "CANCER":
    	  text.setText(" Hi! "+ name_response.getText()+" Your traits are \n "+"Cancer is a cardinal water sign. Represented by the crab, this \n"
    	  		+ "oceanic crustacean seamlessly weaves between \n"
      	  		+ "the sea and shore, representing Cancer’s ability \n"
     	  		+ "to exist in both emotional and material realms.\n"
      	  		+ " Cancers are highly intuitive and their psychic abilities \n"
      	  		+ "manifest in tangible spaces: For instance, Cancers can effortlessly pick up the energies in a room. \n"
      	  		+ "These crabs are highly sensitive to their environments, as well as extremely self-protective. \n"
      	  		+ "Much like their celestial spirit animal, Cancers are shielded by hard, external shells. At first, \n"
      	  		+ "these crabs may be perceived as cold or distant. With time, though, Cancers reveal their gentle nature,\n"
      	  		+ " genuine compassion, and mystical capabilities. Just don't be surprised if it takes a while to get to know them.\r\n"
      	      	+ "Cancer is ruled by the moon, the celestial body that represents comfort, self-care, and maternal energies.\n"
      	      	+ " Accordingly, Cancers tend to be domestically oriented. They love to create cozy, safe spaces that serve as their personal \n"
      	      	+ " sanctuaries, then spend lots of time in them. Cancers care deeply about their \n"
      	      	+ "families and are quick to adopt caregiver roles. But these crabs must be careful: When Cancers invest in someone emotionally, they risk blurring the line \n"
      	      	+ "between attentive nurturing and controlling behavior.\r\n"
      	      		+ " \n Your Lucky Number is 3."); 
     break;
     
      case "LEO":
    	  text.setText(" Hi! "+ name_response.getText()+" Your traits are \n "+"Roll out the red carpet, because Leo has arrived. \n"
    	  		+ "Leo is represented by the lion, and these spirited \n"
  		  		+ " fire signs are the kings and queens of the celestial jungle.\n"
  		  		+ " They’re delighted to embrace their royal status: Vivacious, theatrical, and passionate, \n"
  		  		+ "Leos love to bask in the spotlight and \n"
  		  		+ " celebrate themselves. These lions are natural leaders and they enjoy cultivating friendships and \n"
  		  		+ "romances that are artistically and creatively inspired. Playful Leos have no problem leaning into \n"
  		  		+ "drama-fueled romances that are perfectly suited for the tabloids. (In fact, they may even prefer them.) After all, every Leo perceives him or herself as a celebrity. These astrological divas never get tired of lavish dinners, exclusive parties, or decadent designer wear.\r\n"
  	      		+ "Leo is ruled by the sun, the dazzling celestial body that governs life and vitality. \n"
  	      		+ " The sun never goes retrograde, and likewise, Leos are renowned for their stability, loyalty, and consistency. \n"
  	      		+ "They are dedicated friends and lovers who put their hearts into every relationship. (Fittingly, the Leo sign governs the heart.) Lions love to watch their mates succeed — until they feel threatened. They can become impaired by their ego, pride, and jealousy when they start to fear their star power will be eclipsed. It’s important for celestial lions to remember that their light is never obscured by others, and the bright shine of others' success does \n"
  	      		+ "nothing to their own. Ultimately, Leos' own hubris is the greatest threat to their happiness.\r\n"		      		+ "\n Your Lucky Number is 3."); 
     break;
      case "VIRGO":
		  text.setText(" Hi! "+ name_response.getText()+" Your traits are \n "+"Virgo is an earth sign historically represented by the goddess of wheat and agriculture, \n"
		  		+ "an association that speaks to \n "
  		  		+ " Virgo’s deep-rooted presence in the material world. Virgos are logical, practical, and \n"
  		  		+ "systematic in their approach to life. This earth sign is a perfectionist at heart and isn’t afraid to improve skills through diligent and consistent practice. \n"
  		  		+ " Virgo rules the digestive system, which makes these earth signs \n"
  		  		+ "especially attuned to the ingredients that make up a whole — in food and in everything else.\n"
  		  		+ " They're hyper-aware of every detail.\r\n"
  		  		+ "Virgo is governed by Mercury, the messenger planet of communication. \n"
  		     	+ "Though Mercury also rules Gemini, these two signs are radically \n"
  		       + "different: Gemini is about output and expression, whereas Virgo is about input and processing. A Virgo deals with information like a computer, transforming even the most jumbled set of information into organized, clear concepts. Though Virgos long to be meticulous in all pursuits, they must remember that constantly chasing after the ideal can be destructive when applied to self or others. Beauty exists within our imperfections and it’s important for Virgos to learn that flaws are not defects.\r\n"
  		     	+ "\n Your Lucky Number is 2."); 
     break;
     
      case "LIBRA":
    	  text.setText(" Hi! "+ name_response.getText()+" Your traits are \n "+" Libra is an air sign represented by the scales (interestingly, the only \n"
  		  		+ "inanimate object of the zodiac), an association that reflects Libra's fixation on balance and harmony. \n"
  		  		+ "Libra is obsessed with symmetry and strives to create equilibrium in all areas of life.\n"
  		  		+ " These air signs are the aesthetes of the zodiac: Ruled by Venus, the planet that governs love, \n"
  		  		+ "beauty, and money, Libras adore high art, intellectualism, and connoisseurship. \n"
  		  		+ "Suave Libras need to surround themselves with stunning objects and create environments that reflect \n"
  		  		+ "their exquisite tastes. Accordingly, these air signs make excellent designers, decorators, art critics, and stylists.\r\n"		      		+ "While Libra's opposite sign, Aries, represents \"me,\" Libra symbolizes \"we.\" Relationships are paramount for \n"
  		      		+ "Libras, who find balance in companionship.\n"
  		      		+ " They love harmonious partnerships with fashionable mates, especially those who make attractive arm candy. (Libra governs the skin, and these air signs are highly motivated by physical appearance. There's no better way for a Libra to relax than with a luxurious face mask.)\r\n"
  		      		+ " \n Your Lucky Number is 9."); 
     break;
     
      case "SCORPIO":
    	  text.setText(" Hi! "+ name_response.getText()+" Your traits are \n "+" Scorpio is one of the most misunderstood signs of the zodiac. \n"
    	  		+ "Because of its incredible passion and power, \n"
  		  		+ "Scorpio is often mistaken for a fire sign. \n"
  		  		+ "In fact, Scorpio is a water sign that derives its strength from the psychic, emotional realm. \n"
  		  		+ "Like fellow water signs, \n"
  		  		+ "Cancer and Pisces, Scorpio is extremely clairvoyant and intuitive.\r\n"
  		      	+ "What makes this water sign unique is its distinctive venomous sting. Like their celestial spirit animal,\n"
  		      	+ " the scorpion, Scorpios lie in wait and strike when least expected. Life is a game of chess for these \n"
  		      	+ "calculating water signs, who are constantly plotting several steps ahead in order to orchestrate an eventual \n"
  		      	+ "checkmate. This doesn't mean their intentions are necessarily nefarious. Scorpios simply know what they want and aren't \n"
  		      	+ "afraid to work hard and play the long game to get it.\r\n"
  		      	+ "\n Your Lucky Number is 4.");  
     break;
     
      case "SAGITTARIUS":
    	  text.setText(" Hi! "+ name_response.getText()+" Your traits are \n "+" What makes Sagittarius so unique is its dynamic blend of passion,\n"
    	  		+ " curiosity, intensity, and adaptability. Represented by the archer (a half-man, half-horse centaur), \n"
		  		+ "Sagittarius isn't afraid to use its bow and arrow to explore expansive terrain,\n"
		  		+ " seeking answers in places and spaces others wouldn’t dare venture. Whether they're white water rafting down a river in \n"			  		+ "some undisclosed \n"
			  	+ "location or taking a pilgrimage to a sacred site to uncover secrets about an ancient civilization, \n"			  	
		  		+ "Sagittarius’ quest for knowledge knows no bounds.\r\n"
	    		+ "Sagittarius is a mutable sign, meaning it is associated with adaptability and flexibility. \n"
			+ "This perfectly reflects the archers' deep-rooted desire for change. Sagittarians are born to explore and it is critical that these archers have the freedom to roam. (Sagittarius rules the thighs, so these archers are always on the move.) Fueled by wanderlust, these archers can be found traversing all corners of the world on thrill-seeking expeditions, chasing after geographical, intellectual, and spiritual adventures. Sagittarians are on a perpetual quest for knowledge, which makes them incredible storytellers, entertainers, and creatives.\r\n"
			      		+ "\n Your Lucky Number is 2.");
    break;
    
      case "CAPRICORN":
    	 text.setText(" Hi! "+ name_response.getText()+" Your traits are \n "+" Capricorn is a mischievous troublemaker (in tarot, Capricorn is symbolized by the \"devil\" card).\n"
    	 		+ " Though this earth sign may seem a bit conservative and restrained at first, Capricorn's closest friends and lovers know that these sea goats love to party.\r\n"
		      		+ "Interestingly, Capricorns are said to age backwards: they become increasingly youthful, optimistic, and playful as they mature.\n"
		      		+ " Indeed, inside every earnest Capricorn is a mischievous troublemaker Though this earth sign may seem a bit conservative and restrained at first, Capricorn's closest friends and lovers know that these sea goats love to party.\r\n"
		      		+ "Capricorn is symbolized by the sea goat, a mythological creature with the body of a goat and tail of a fish. This imagery speaks to Capricorn's \n"
		      		+ "bifurcated abilities: Capricorns are skilled at navigating both the material and emotional realms. They scale the steepest mountains — Capricorn rules the knees, making it easier for this sign to climb — while \n"
		      		+ " simultaneously building up their psychic fortitude. Capricorns are relentless: They are determined to overcome whatever stands in their way.\r\n"
		      		+ "\n Your Lucky Number is 11.");
    break;
    
      case "AQUARIUS":
    		 
		 text.setText(" Hi! "+ name_response.getText()+" Your traits are \n "+" Aquarius is an air sign. As the eleventh and penultimate sign of the zodiac,\n"
		 		+ " Aquarius is actually the final air sign, which means it deals with air-related concepts (we'll get more into that momentarily) from a macro-perspective. Of all the zodiac signs, Aquarius is undoubtedly the most innovative, progressive, rebellious, and humanitarian. And while Aquarius can often be \n"
		  		+ "found planning a revolution or proudly flaunting their funky fashion sensibility,\n"
		  		+ " they also have an often overlooked sensitive side that requires appreciation, support, and love.\r\n"
		      		+ "Air energy is all about the mind. Intellectual, curious, and deeply social, \n"
		      		+ "the air signs (Gemini, Libra, and Aquarius) are passionate about interpersonal dynamics. As the last air sign in the zodiac, however, Aquarius takes these concepts to a whole other level. Aquarius is represented by the water bearer (hence the \"aqua\"), the mystical healer who bestows water, or life, upon the land. \n"
		      		+ "Represented by the Star card in tarot, Aquarius can be visualized as a larger-than-life,\n"
		      		+ " mythical being with one foot firmly planted on the soil (representing a sense of being grounded) and one positioned in the water. Aquarius is holding a vase, which pours new streams of inspiration to cultivate longevity, healing, and hope. Here, it's important to remember that Aquarius is removed from this process — from this vantage, we can see that Aquarius is positioned as an independent entity separate from the life-giving hydration it offers the cracked soil.\r\n"
		      		+ "\n Your Lucky Number is 6."); 
    break;
    
      case "PISCES":
    	  text.setText(" Hi! "+ name_response.getText()+" Your traits are \n "+" Pisces, a water sign, is the last constellation \n"
    	  		+ "of the zodiac. It's symbolized by two fish swimming in opposite directions, representing the constant \n"
    	  		+ "division of Pisces's attention between fantasy and reality. As the final sign, Pisces has absorbed every \n"
    	  		+ "lesson — the joys and the pains, the hopes and the fears — learned by all of the other signs. \n"
			  		+ "This makes these fish the most psychic, empathetic, and compassionate creatures of the astrological wheel.\n"
			  		+ " With such immense sensitivity, Pisces can easily become swallowed by emotions and must remember to stay grounded in the \n"
			  		+ "material realm (appropriately, Pisces rules the feet).\r\n"
			      		+ "Pisces is ruled by Neptune, the celestial body that governs creativity and dreams, and these ethereal fish adore \n"
			      		+ "exploring their boundless imaginations. In its more nefarious form, however, Neptune also oversees illusion and escapism. Neptunian energy is like the energy of the ocean: magical, mysterious, and often scary. When the fog is thick on the water, \n"
			      		+ "the horizon is obstructed and there is no differentiation between the sea and the sky.\r\n"
			      		+ "\n Your Lucky Number is 2.");
    break;
    
    default:
      text.setText("You Have Not Entered A Correct SunSign.");
      
      }
  

	}
	 
	 else
		 if( e.getSource() == close) {
			 System.exit(0);
		 }
	  
 }
			
                                             }
