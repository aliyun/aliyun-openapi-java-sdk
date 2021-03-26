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

package com.aliyuncs.foas.model.v20181111;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.foas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateProjectConfigRequest extends RoaAcsRequest<UpdateProjectConfigResponse> {
	   

	private String projectName;

	private Boolean isOpenBatchSQL;
	public UpdateProjectConfigRequest() {
		super("foas", "2018-11-11", "UpdateProjectConfig", "foas");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/api/v2/project/config");
		setMethod(MethodType.PUT);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public Boolean getIsOpenBatchSQL() {
		return this.isOpenBatchSQL;
	}

	public void setIsOpenBatchSQL(Boolean isOpenBatchSQL) {
		this.isOpenBatchSQL = isOpenBatchSQL;
		if(isOpenBatchSQL != null){
			putQueryParameter("IsOpenBatchSQL", isOpenBatchSQL.toString());
		}
	}

	@Override
	public Class<UpdateProjectConfigResponse> getResponseClass() {
		return UpdateProjectConfigResponse.class;
	}

}
