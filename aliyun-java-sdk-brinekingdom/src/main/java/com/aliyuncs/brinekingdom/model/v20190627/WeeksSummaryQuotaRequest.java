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

package com.aliyuncs.brinekingdom.model.v20190627;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class WeeksSummaryQuotaRequest extends RpcAcsRequest<WeeksSummaryQuotaResponse> {
	   

	private String org;

	private String supplyArea;

	private String nic;

	private String model;

	private String expectDateStr;
	public WeeksSummaryQuotaRequest() {
		super("brinekingdom", "2019-06-27", "WeeksSummaryQuota");
		setMethod(MethodType.POST);
	}

	public String getOrg() {
		return this.org;
	}

	public void setOrg(String org) {
		this.org = org;
		if(org != null){
			putQueryParameter("Org", org);
		}
	}

	public String getSupplyArea() {
		return this.supplyArea;
	}

	public void setSupplyArea(String supplyArea) {
		this.supplyArea = supplyArea;
		if(supplyArea != null){
			putQueryParameter("SupplyArea", supplyArea);
		}
	}

	public String getNic() {
		return this.nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
		if(nic != null){
			putQueryParameter("Nic", nic);
		}
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
		if(model != null){
			putQueryParameter("Model", model);
		}
	}

	public String getExpectDateStr() {
		return this.expectDateStr;
	}

	public void setExpectDateStr(String expectDateStr) {
		this.expectDateStr = expectDateStr;
		if(expectDateStr != null){
			putQueryParameter("ExpectDateStr", expectDateStr);
		}
	}

	@Override
	public Class<WeeksSummaryQuotaResponse> getResponseClass() {
		return WeeksSummaryQuotaResponse.class;
	}

}
