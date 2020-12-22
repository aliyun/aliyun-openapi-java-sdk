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

package com.aliyuncs.imageseg.model.v20191230;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imageseg.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SegmentAnimalRequest extends RpcAcsRequest<SegmentAnimalResponse> {
	   

	private String returnForm;

	private String imageURL;
	public SegmentAnimalRequest() {
		super("imageseg", "2019-12-30", "SegmentAnimal", "imageseg");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getReturnForm() {
		return this.returnForm;
	}

	public void setReturnForm(String returnForm) {
		this.returnForm = returnForm;
		if(returnForm != null){
			putQueryParameter("ReturnForm", returnForm);
		}
	}

	public String getImageURL() {
		return this.imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
		if(imageURL != null){
			putQueryParameter("ImageURL", imageURL);
		}
	}

	@Override
	public Class<SegmentAnimalResponse> getResponseClass() {
		return SegmentAnimalResponse.class;
	}

}
