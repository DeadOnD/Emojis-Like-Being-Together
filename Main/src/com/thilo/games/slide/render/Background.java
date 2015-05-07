/*
 * Copyright (C) 2010 Florian Sundermann
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.thilo.games.slide.render;

import org.cocos2d.nodes.CCDirector;
import org.cocos2d.types.CGSize;

import com.thilo.games.slide.MyResources;
import com.thilo.games.slide.R;


public class Background extends CCGradientLayer {

	public static Background node() {
		CGSize s = CCDirector.sharedDirector().winSize();
		return new Background(s);
	}
	
	
	private Background(CGSize size) {
		super(
				MyResources.color(R.array.bgFrom),
				MyResources.color(R.array.bgTo), 
				GradientDirection.TopToBottom, size.width, size.height);		
	}
}
