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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpgradeAndroidInstanceGroupRequest extends RpcAcsRequest<UpgradeAndroidInstanceGroupResponse> {
	   

	private String instanceGroupId;

	private Boolean autoPay;

	private Integer increaseNumberOfInstance;
	public UpgradeAndroidInstanceGroupRequest() {
		super("eds-aic", "2023-09-30", "UpgradeAndroidInstanceGroup");
		setMethod(MethodType.POST);
	}

	public String getInstanceGroupId() {
		return this.instanceGroupId;
	}

	public void setInstanceGroupId(String instanceGroupId) {
		this.instanceGroupId = instanceGroupId;
		if(instanceGroupId != null){
			putQueryParameter("InstanceGroupId", instanceGroupId);
		}
	}

	public Boolean getAutoPay() {
		return this.autoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		this.autoPay = autoPay;
		if(autoPay != null){
			putQueryParameter("AutoPay", autoPay.toString());
		}
	}

	public Integer getIncreaseNumberOfInstance() {
		return this.increaseNumberOfInstance;
	}

	public void setIncreaseNumberOfInstance(Integer increaseNumberOfInstance) {
		this.increaseNumberOfInstance = increaseNumberOfInstance;
		if(increaseNumberOfInstance != null){
			putQueryParameter("IncreaseNumberOfInstance", increaseNumberOfInstance.toString());
		}
	}

	@Override
	public Class<UpgradeAndroidInstanceGroupResponse> getResponseClass() {
		return UpgradeAndroidInstanceGroupResponse.class;
	}

}
