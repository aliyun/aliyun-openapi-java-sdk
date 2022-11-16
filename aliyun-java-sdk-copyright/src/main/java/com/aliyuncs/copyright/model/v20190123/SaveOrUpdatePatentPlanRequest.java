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

package com.aliyuncs.copyright.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SaveOrUpdatePatentPlanRequest extends RpcAcsRequest<SaveOrUpdatePatentPlanResponse> {
	   

	private String owner;

	private Integer warnDays;

	private String applyNumbers;

	private String contact;

	private String name;

	private Long planId;
	public SaveOrUpdatePatentPlanRequest() {
		super("Copyright", "2019-01-23", "SaveOrUpdatePatentPlan", "swcopyright");
		setMethod(MethodType.POST);
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
		if(owner != null){
			putQueryParameter("Owner", owner);
		}
	}

	public Integer getWarnDays() {
		return this.warnDays;
	}

	public void setWarnDays(Integer warnDays) {
		this.warnDays = warnDays;
		if(warnDays != null){
			putQueryParameter("WarnDays", warnDays.toString());
		}
	}

	public String getApplyNumbers() {
		return this.applyNumbers;
	}

	public void setApplyNumbers(String applyNumbers) {
		this.applyNumbers = applyNumbers;
		if(applyNumbers != null){
			putQueryParameter("ApplyNumbers", applyNumbers);
		}
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
		if(contact != null){
			putQueryParameter("Contact", contact);
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

	public Long getPlanId() {
		return this.planId;
	}

	public void setPlanId(Long planId) {
		this.planId = planId;
		if(planId != null){
			putQueryParameter("PlanId", planId.toString());
		}
	}

	@Override
	public Class<SaveOrUpdatePatentPlanResponse> getResponseClass() {
		return SaveOrUpdatePatentPlanResponse.class;
	}

}
