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

package com.aliyuncs.alidns.model.v20150109;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddGtmRecoveryPlanRequest extends RpcAcsRequest<AddGtmRecoveryPlanResponse> {
	   

	private String faultAddrPool;

	private String remark;

	private String name;

	private String lang;
	public AddGtmRecoveryPlanRequest() {
		super("Alidns", "2015-01-09", "AddGtmRecoveryPlan", "alidns");
		setMethod(MethodType.POST);
	}

	public String getFaultAddrPool() {
		return this.faultAddrPool;
	}

	public void setFaultAddrPool(String faultAddrPool) {
		this.faultAddrPool = faultAddrPool;
		if(faultAddrPool != null){
			putQueryParameter("FaultAddrPool", faultAddrPool);
		}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	@Override
	public Class<AddGtmRecoveryPlanResponse> getResponseClass() {
		return AddGtmRecoveryPlanResponse.class;
	}

}
