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

package com.aliyuncs.welfare_inner.model.v20180524;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetWelfareGeekInfoRequest extends RpcAcsRequest<GetWelfareGeekInfoResponse> {
	
	public GetWelfareGeekInfoRequest() {
		super("welfare-inner", "2018-05-24", "GetWelfareGeekInfo");
	}

	private String appName;

	private Long pk;

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public Long getPk() {
		return this.pk;
	}

	public void setPk(Long pk) {
		this.pk = pk;
		if(pk != null){
			putQueryParameter("Pk", pk.toString());
		}
	}

	@Override
	public Class<GetWelfareGeekInfoResponse> getResponseClass() {
		return GetWelfareGeekInfoResponse.class;
	}

}
