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
public class SetAllowIPRequest extends RpcAcsRequest<SetAllowIPResponse> {
	
	public SetAllowIPRequest() {
		super("openanalytics", "2018-03-01", "SetAllowIP", "openanalytics", "innerAPI");
	}

	private String networkType;

	private String allowIP;

	private Boolean append;

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putBodyParameter("NetworkType", networkType);
		}
	}

	public String getAllowIP() {
		return this.allowIP;
	}

	public void setAllowIP(String allowIP) {
		this.allowIP = allowIP;
		if(allowIP != null){
			putBodyParameter("AllowIP", allowIP);
		}
	}

	public Boolean getAppend() {
		return this.append;
	}

	public void setAppend(Boolean append) {
		this.append = append;
		if(append != null){
			putBodyParameter("Append", append.toString());
		}
	}

	@Override
	public Class<SetAllowIPResponse> getResponseClass() {
		return SetAllowIPResponse.class;
	}

}
