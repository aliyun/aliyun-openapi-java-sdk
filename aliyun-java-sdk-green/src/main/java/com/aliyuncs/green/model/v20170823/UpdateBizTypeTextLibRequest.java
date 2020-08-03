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

package com.aliyuncs.green.model.v20170823;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.green.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateBizTypeTextLibRequest extends RpcAcsRequest<UpdateBizTypeTextLibResponse> {
	   

	private String scene;

	private String white;

	private String review;

	private String ignore;

	private String bizTypeName;

	private String black;

	private String resourceType;
	public UpdateBizTypeTextLibRequest() {
		super("Green", "2017-08-23", "UpdateBizTypeTextLib", "green");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getScene() {
		return this.scene;
	}

	public void setScene(String scene) {
		this.scene = scene;
		if(scene != null){
			putQueryParameter("Scene", scene);
		}
	}

	public String getWhite() {
		return this.white;
	}

	public void setWhite(String white) {
		this.white = white;
		if(white != null){
			putQueryParameter("White", white);
		}
	}

	public String getReview() {
		return this.review;
	}

	public void setReview(String review) {
		this.review = review;
		if(review != null){
			putQueryParameter("Review", review);
		}
	}

	public String getIgnore() {
		return this.ignore;
	}

	public void setIgnore(String ignore) {
		this.ignore = ignore;
		if(ignore != null){
			putQueryParameter("Ignore", ignore);
		}
	}

	public String getBizTypeName() {
		return this.bizTypeName;
	}

	public void setBizTypeName(String bizTypeName) {
		this.bizTypeName = bizTypeName;
		if(bizTypeName != null){
			putQueryParameter("BizTypeName", bizTypeName);
		}
	}

	public String getBlack() {
		return this.black;
	}

	public void setBlack(String black) {
		this.black = black;
		if(black != null){
			putQueryParameter("Black", black);
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	@Override
	public Class<UpdateBizTypeTextLibResponse> getResponseClass() {
		return UpdateBizTypeTextLibResponse.class;
	}

}
