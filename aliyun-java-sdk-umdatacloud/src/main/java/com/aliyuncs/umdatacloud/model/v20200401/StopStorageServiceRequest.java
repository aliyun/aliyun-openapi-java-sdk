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

package com.aliyuncs.umdatacloud.model.v20200401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class StopStorageServiceRequest extends RpcAcsRequest<StopStorageServiceResponse> {
	   

	private String dataSourceType;

	private Long userUid;

	private Boolean freedService;
	public StopStorageServiceRequest() {
		super("UMDataCloud", "2020-04-01", "StopStorageService");
		setMethod(MethodType.POST);
	}

	public String getDataSourceType() {
		return this.dataSourceType;
	}

	public void setDataSourceType(String dataSourceType) {
		this.dataSourceType = dataSourceType;
		if(dataSourceType != null){
			putQueryParameter("DataSourceType", dataSourceType);
		}
	}

	public Long getUserUid() {
		return this.userUid;
	}

	public void setUserUid(Long userUid) {
		this.userUid = userUid;
		if(userUid != null){
			putQueryParameter("UserUid", userUid.toString());
		}
	}

	public Boolean getFreedService() {
		return this.freedService;
	}

	public void setFreedService(Boolean freedService) {
		this.freedService = freedService;
		if(freedService != null){
			putQueryParameter("FreedService", freedService.toString());
		}
	}

	@Override
	public Class<StopStorageServiceResponse> getResponseClass() {
		return StopStorageServiceResponse.class;
	}

}
