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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateContainerRequest extends RoaAcsRequest<UpdateContainerResponse> {
	
	public UpdateContainerRequest() {
		super("Edas", "2017-08-01", "UpdateContainer");
		setUriPattern("/pop/v5/changeorder/co_update_container");
		setMethod(MethodType.POST);
	}

	private Integer buildPackId;

	private String appId;

	public Integer getBuildPackId() {
		return this.buildPackId;
	}

	public void setBuildPackId(Integer buildPackId) {
		this.buildPackId = buildPackId;
		if(buildPackId != null){
			putQueryParameter("BuildPackId", buildPackId.toString());
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	@Override
	public Class<UpdateContainerResponse> getResponseClass() {
		return UpdateContainerResponse.class;
	}

}
