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

package com.aliyuncs.openanalytics.model.v20180301;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetAllowIPRequest extends RpcAcsRequest<GetAllowIPResponse> {
	
	public GetAllowIPRequest() {
		super("openanalytics", "2018-03-01", "GetAllowIP", "openanalytics");
	}

	private Long userID;

	private String networkType;

	public Long getUserID() {
		return this.userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
		if(userID != null){
			putBodyParameter("UserID", userID.toString());
		}
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putBodyParameter("NetworkType", networkType);
		}
	}

	@Override
	public Class<GetAllowIPResponse> getResponseClass() {
		return GetAllowIPResponse.class;
	}

}
