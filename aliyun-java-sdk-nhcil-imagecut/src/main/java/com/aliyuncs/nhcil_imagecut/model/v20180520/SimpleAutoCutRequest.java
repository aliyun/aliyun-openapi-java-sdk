/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.nhcil_imagecut.model.v20180520;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SimpleAutoCutRequest extends RoaAcsRequest<SimpleAutoCutResponse> {
	
	public SimpleAutoCutRequest() {
		super("Nhcil-imagecut", "2018-05-20", "SimpleAutoCut");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/simpleautocut");
		setMethod(MethodType.GET);
	}

	private String imageUrl;

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
		if(imageUrl != null){
			putQueryParameter("ImageUrl", imageUrl);
		}
	}

	@Override
	public Class<SimpleAutoCutResponse> getResponseClass() {
		return SimpleAutoCutResponse.class;
	}

}
