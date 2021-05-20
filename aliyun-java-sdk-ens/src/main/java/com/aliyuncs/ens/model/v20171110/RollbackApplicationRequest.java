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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RollbackApplicationRequest extends RpcAcsRequest<RollbackApplicationResponse> {
	   

	private Integer timeout;

	private String fromAppVersion;

	private String appId;

	private String toAppVersion;
	public RollbackApplicationRequest() {
		super("Ens", "2017-11-10", "RollbackApplication", "ens");
		setMethod(MethodType.POST);
	}

	public Integer getTimeout() {
		return this.timeout;
	}

	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
		if(timeout != null){
			putQueryParameter("Timeout", timeout.toString());
		}
	}

	public String getFromAppVersion() {
		return this.fromAppVersion;
	}

	public void setFromAppVersion(String fromAppVersion) {
		this.fromAppVersion = fromAppVersion;
		if(fromAppVersion != null){
			putQueryParameter("FromAppVersion", fromAppVersion);
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

	public String getToAppVersion() {
		return this.toAppVersion;
	}

	public void setToAppVersion(String toAppVersion) {
		this.toAppVersion = toAppVersion;
		if(toAppVersion != null){
			putQueryParameter("ToAppVersion", toAppVersion);
		}
	}

	@Override
	public Class<RollbackApplicationResponse> getResponseClass() {
		return RollbackApplicationResponse.class;
	}

}
