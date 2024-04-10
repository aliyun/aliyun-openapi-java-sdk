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

package com.aliyuncs.nis.model.v20211216;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetNetworkReachableAnalysisRequest extends RpcAcsRequest<GetNetworkReachableAnalysisResponse> {
	   

	private String networkReachableAnalysisId;
	public GetNetworkReachableAnalysisRequest() {
		super("nis", "2021-12-16", "GetNetworkReachableAnalysis", "networkana");
		setMethod(MethodType.POST);
	}

	public String getNetworkReachableAnalysisId() {
		return this.networkReachableAnalysisId;
	}

	public void setNetworkReachableAnalysisId(String networkReachableAnalysisId) {
		this.networkReachableAnalysisId = networkReachableAnalysisId;
		if(networkReachableAnalysisId != null){
			putQueryParameter("NetworkReachableAnalysisId", networkReachableAnalysisId);
		}
	}

	@Override
	public Class<GetNetworkReachableAnalysisResponse> getResponseClass() {
		return GetNetworkReachableAnalysisResponse.class;
	}

}
