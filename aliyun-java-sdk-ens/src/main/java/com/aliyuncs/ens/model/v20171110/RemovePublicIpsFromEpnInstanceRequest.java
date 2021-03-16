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
public class RemovePublicIpsFromEpnInstanceRequest extends RpcAcsRequest<RemovePublicIpsFromEpnInstanceResponse> {
	   

	private String ePNInstanceId;

	private String instanceInfos;
	public RemovePublicIpsFromEpnInstanceRequest() {
		super("Ens", "2017-11-10", "RemovePublicIpsFromEpnInstance");
		setMethod(MethodType.POST);
	}

	public String getEPNInstanceId() {
		return this.ePNInstanceId;
	}

	public void setEPNInstanceId(String ePNInstanceId) {
		this.ePNInstanceId = ePNInstanceId;
		if(ePNInstanceId != null){
			putQueryParameter("EPNInstanceId", ePNInstanceId);
		}
	}

	public String getInstanceInfos() {
		return this.instanceInfos;
	}

	public void setInstanceInfos(String instanceInfos) {
		this.instanceInfos = instanceInfos;
		if(instanceInfos != null){
			putQueryParameter("InstanceInfos", instanceInfos);
		}
	}

	@Override
	public Class<RemovePublicIpsFromEpnInstanceResponse> getResponseClass() {
		return RemovePublicIpsFromEpnInstanceResponse.class;
	}

}
