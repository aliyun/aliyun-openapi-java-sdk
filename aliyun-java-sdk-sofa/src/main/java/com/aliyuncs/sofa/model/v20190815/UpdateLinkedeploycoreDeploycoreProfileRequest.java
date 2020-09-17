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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateLinkedeploycoreDeploycoreProfileRequest extends RpcAcsRequest<UpdateLinkedeploycoreDeploycoreProfileResponse> {
	   

	private String scene;

	private Long profileId;

	private String detail;
	public UpdateLinkedeploycoreDeploycoreProfileRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkedeploycoreDeploycoreProfile", "sofacafedeps");
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
			putBodyParameter("Scene", scene);
		}
	}

	public Long getProfileId() {
		return this.profileId;
	}

	public void setProfileId(Long profileId) {
		this.profileId = profileId;
		if(profileId != null){
			putBodyParameter("ProfileId", profileId.toString());
		}
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
		if(detail != null){
			putBodyParameter("Detail", detail);
		}
	}

	@Override
	public Class<UpdateLinkedeploycoreDeploycoreProfileResponse> getResponseClass() {
		return UpdateLinkedeploycoreDeploycoreProfileResponse.class;
	}

}
