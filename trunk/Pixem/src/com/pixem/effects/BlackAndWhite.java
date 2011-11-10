/**
 *
 * Copyright (c) 2009-2011 Envision Mobile Ltd. All rights reserved.
 *
 * Other software and company names mentioned herein or used for developing
 * and/or running the Envision Mobile Ltd's software may be trademarks or trade
 * names of their respective owners.
 *
 * Everything in the source code herein is owned by Envision Mobile Ltd.
 * The recipient of this source code hereby acknowledges and agrees that such
 * information is proprietary to Envision Mobile Ltd. and shall not be used, 
 * disclosed, duplicated, and/or reversed engineered except in accordance
 * with the express written authorization of Envision Mobile Ltd.
 *
 * Module: BlackAndWhite.java
 * Project: Pixem
 *
 * Description:
 *
 *
 * Developer:   10107896
 * Date:        2011-11-08
 * Version:
 *
 *
 */
package com.pixem.effects;

import android.graphics.Bitmap;
import android.graphics.Color;


public class BlackAndWhite implements Effect {
	
	private Bitmap bm;

	public BlackAndWhite() { 
	}
	
	public Bitmap applyEffect(Bitmap bm) { 
		
		int clr, red = 0, blue = 0, green = 0;
		
		if (bm != null) { 
			
			setBitmap(bm);
			
			for (int i = 0; i < bm.getWidth(); i++) { 
				for (int j = 0; j < bm.getHeight(); j++) { 
					clr = bm.getPixel(i, j);
					
	                red = Color.red(clr);
	            	green = Color.green(clr);
	            	blue = Color.blue(clr);
	            	
	            	bm.setPixel(i, j, Color.argb(Color.alpha(clr), ((red + green + blue)/3), ((red + green + blue)/3), ((red + green + blue)/3)));
				}
			}
			
			return bm;
		}

		return null;
	}

	@Override
	public void setBitmap(Bitmap bm) { 
		this.bm = bm;
	}
	
	@Override
	public Bitmap getBitmap() { 
		return bm;
	}
}

