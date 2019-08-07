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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryConfigRequest extends RpcAcsRequest<QueryConfigResponse> {
	
	public QueryConfigRequest() {
		super("mse", "2019-05-31", "QueryConfig", "mse");
	}

	private String configType;

	private String requestPars;

	private String clusterId;

	public String getConfigType() {
		return this.configType;
	}

	public void setConfigType(String configType) {
		this.configType = configType;
		if(configType != null){
			putBodyParameter("ConfigType", configType);
		}
	}

	public String getRequestPars() {
		return this.requestPars;
	}

	public void setRequestPars(String requestPars) {
		this.requestPars = requestPars;
		if(requestPars != null){
			putQueryParameter("RequestPars", requestPars);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putBodyParameter("ClusterId", clusterId);
		}
	}

	@Override
	public Class<QueryConfigResponse> getResponseClass() {
		return QueryConfigResponse.class;
	}

}
