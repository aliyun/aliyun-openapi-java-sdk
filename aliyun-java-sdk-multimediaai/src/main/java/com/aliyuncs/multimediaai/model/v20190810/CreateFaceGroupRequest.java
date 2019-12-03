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

package com.aliyuncs.multimediaai.model.v20190810;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.multimediaai.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateFaceGroupRequest extends RpcAcsRequest<CreateFaceGroupResponse> {
	   

	private String description;

	private String faceGroupName;
	public CreateFaceGroupRequest() {
		super("multimediaai", "2019-08-10", "CreateFaceGroup", "multimediaai");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getFaceGroupName() {
		return this.faceGroupName;
	}

	public void setFaceGroupName(String faceGroupName) {
		this.faceGroupName = faceGroupName;
		if(faceGroupName != null){
			putQueryParameter("FaceGroupName", faceGroupName);
		}
	}

	@Override
	public Class<CreateFaceGroupResponse> getResponseClass() {
		return CreateFaceGroupResponse.class;
	}

}
