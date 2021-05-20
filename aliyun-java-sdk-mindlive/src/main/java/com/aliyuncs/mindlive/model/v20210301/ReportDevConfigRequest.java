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

package com.aliyuncs.mindlive.model.v20210301;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ReportDevConfigRequest extends RpcAcsRequest<ReportDevConfigResponse> {
	   

	private String configs;
	public ReportDevConfigRequest() {
		super("MindLive", "2021-03-01", "ReportDevConfig");
		setMethod(MethodType.POST);
	}

	public String getConfigs() {
		return this.configs;
	}

	public void setConfigs(String configs) {
		this.configs = configs;
		if(configs != null){
			putQueryParameter("Configs", configs);
		}
	}

	@Override
	public Class<ReportDevConfigResponse> getResponseClass() {
		return ReportDevConfigResponse.class;
	}

}
