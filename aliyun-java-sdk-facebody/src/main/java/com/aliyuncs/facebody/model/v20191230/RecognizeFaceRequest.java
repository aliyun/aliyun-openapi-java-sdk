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

package com.aliyuncs.facebody.model.v20191230;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.facebody.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RecognizeFaceRequest extends RpcAcsRequest<RecognizeFaceResponse> {
	   

	private Boolean gender;

	private Boolean beauty;

	private Long maxFaceNumber;

	private Boolean hat;

	private Boolean mask;

	private Boolean glass;

	private Boolean expression;

	private Boolean quality;

	private String imageURL;

	private Boolean age;
	public RecognizeFaceRequest() {
		super("facebody", "2019-12-30", "RecognizeFace", "facebody");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getGender() {
		return this.gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
		if(gender != null){
			putBodyParameter("Gender", gender.toString());
		}
	}

	public Boolean getBeauty() {
		return this.beauty;
	}

	public void setBeauty(Boolean beauty) {
		this.beauty = beauty;
		if(beauty != null){
			putBodyParameter("Beauty", beauty.toString());
		}
	}

	public Long getMaxFaceNumber() {
		return this.maxFaceNumber;
	}

	public void setMaxFaceNumber(Long maxFaceNumber) {
		this.maxFaceNumber = maxFaceNumber;
		if(maxFaceNumber != null){
			putBodyParameter("MaxFaceNumber", maxFaceNumber.toString());
		}
	}

	public Boolean getHat() {
		return this.hat;
	}

	public void setHat(Boolean hat) {
		this.hat = hat;
		if(hat != null){
			putBodyParameter("Hat", hat.toString());
		}
	}

	public Boolean getMask() {
		return this.mask;
	}

	public void setMask(Boolean mask) {
		this.mask = mask;
		if(mask != null){
			putBodyParameter("Mask", mask.toString());
		}
	}

	public Boolean getGlass() {
		return this.glass;
	}

	public void setGlass(Boolean glass) {
		this.glass = glass;
		if(glass != null){
			putBodyParameter("Glass", glass.toString());
		}
	}

	public Boolean getExpression() {
		return this.expression;
	}

	public void setExpression(Boolean expression) {
		this.expression = expression;
		if(expression != null){
			putBodyParameter("Expression", expression.toString());
		}
	}

	public Boolean getQuality() {
		return this.quality;
	}

	public void setQuality(Boolean quality) {
		this.quality = quality;
		if(quality != null){
			putBodyParameter("Quality", quality.toString());
		}
	}

	public String getImageURL() {
		return this.imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
		if(imageURL != null){
			putBodyParameter("ImageURL", imageURL);
		}
	}

	public Boolean getAge() {
		return this.age;
	}

	public void setAge(Boolean age) {
		this.age = age;
		if(age != null){
			putBodyParameter("Age", age.toString());
		}
	}

	@Override
	public Class<RecognizeFaceResponse> getResponseClass() {
		return RecognizeFaceResponse.class;
	}

}
