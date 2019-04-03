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

/**
 * @author auto create
 * @version 
 */
public class ModifyOperateVulRequest extends RpcAcsRequest<ModifyOperateVulResponse> {
	
	public ModifyOperateVulRequest() {
		super("Sas", "2018-12-03", "ModifyOperateVul", "sas");
	}

	private String reason;

	private String operateType;

	private String type;

	private String info;

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
		if(reason != null){
			putQueryParameter("Reason", reason);
		}
	}

	public String getOperateType() {
		return this.operateType;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
		if(operateType != null){
			putQueryParameter("OperateType", operateType);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
		if(info != null){
			putQueryParameter("Info", info);
		}
	}

	@Override
	public Class<ModifyOperateVulResponse> getResponseClass() {
		return ModifyOperateVulResponse.class;
	}

}
