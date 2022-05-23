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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetAlertRulesRequest extends RpcAcsRequest<GetAlertRulesResponse> {
	   

	private String alertStatus;

	private String alertNames;

	private String alertType;

	private Long size;

	private String alertIds;

	private Long page;
	public GetAlertRulesRequest() {
		super("ARMS", "2019-08-08", "GetAlertRules", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAlertStatus() {
		return this.alertStatus;
	}

	public void setAlertStatus(String alertStatus) {
		this.alertStatus = alertStatus;
		if(alertStatus != null){
			putQueryParameter("AlertStatus", alertStatus);
		}
	}

	public String getAlertNames() {
		return this.alertNames;
	}

	public void setAlertNames(String alertNames) {
		this.alertNames = alertNames;
		if(alertNames != null){
			putQueryParameter("AlertNames", alertNames);
		}
	}

	public String getAlertType() {
		return this.alertType;
	}

	public void setAlertType(String alertType) {
		this.alertType = alertType;
		if(alertType != null){
			putQueryParameter("AlertType", alertType);
		}
	}

	public Long getSize() {
		return this.size;
	}

	public void setSize(Long size) {
		this.size = size;
		if(size != null){
			putQueryParameter("Size", size.toString());
		}
	}

	public String getAlertIds() {
		return this.alertIds;
	}

	public void setAlertIds(String alertIds) {
		this.alertIds = alertIds;
		if(alertIds != null){
			putQueryParameter("AlertIds", alertIds);
		}
	}

	public Long getPage() {
		return this.page;
	}

	public void setPage(Long page) {
		this.page = page;
		if(page != null){
			putQueryParameter("Page", page.toString());
		}
	}

	@Override
	public Class<GetAlertRulesResponse> getResponseClass() {
		return GetAlertRulesResponse.class;
	}

}
