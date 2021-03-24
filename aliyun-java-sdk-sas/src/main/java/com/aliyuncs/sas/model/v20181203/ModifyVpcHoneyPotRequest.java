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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyVpcHoneyPotRequest extends RpcAcsRequest<ModifyVpcHoneyPotResponse> {
	   

	private String honeyPotAction;

	private String vpcId;
	public ModifyVpcHoneyPotRequest() {
		super("Sas", "2018-12-03", "ModifyVpcHoneyPot", "sas");
		setMethod(MethodType.POST);
	}

	public String getHoneyPotAction() {
		return this.honeyPotAction;
	}

	public void setHoneyPotAction(String honeyPotAction) {
		this.honeyPotAction = honeyPotAction;
		if(honeyPotAction != null){
			putQueryParameter("HoneyPotAction", honeyPotAction);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	@Override
	public Class<ModifyVpcHoneyPotResponse> getResponseClass() {
		return ModifyVpcHoneyPotResponse.class;
	}

}
