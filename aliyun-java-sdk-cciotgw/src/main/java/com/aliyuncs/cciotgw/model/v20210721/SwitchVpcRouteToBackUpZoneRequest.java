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

package com.aliyuncs.cciotgw.model.v20210721;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SwitchVpcRouteToBackUpZoneRequest extends RpcAcsRequest<SwitchVpcRouteToBackUpZoneResponse> {
	   

	private Boolean dryRun;

	private String clientToken;

	private String greGwId;

	private String cciotGwId;
	public SwitchVpcRouteToBackUpZoneRequest() {
		super("CCIoTGW", "2021-07-21", "SwitchVpcRouteToBackUpZone");
		setMethod(MethodType.POST);
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getGreGwId() {
		return this.greGwId;
	}

	public void setGreGwId(String greGwId) {
		this.greGwId = greGwId;
		if(greGwId != null){
			putQueryParameter("GreGwId", greGwId);
		}
	}

	public String getCciotGwId() {
		return this.cciotGwId;
	}

	public void setCciotGwId(String cciotGwId) {
		this.cciotGwId = cciotGwId;
		if(cciotGwId != null){
			putQueryParameter("CciotGwId", cciotGwId);
		}
	}

	@Override
	public Class<SwitchVpcRouteToBackUpZoneResponse> getResponseClass() {
		return SwitchVpcRouteToBackUpZoneResponse.class;
	}

}
