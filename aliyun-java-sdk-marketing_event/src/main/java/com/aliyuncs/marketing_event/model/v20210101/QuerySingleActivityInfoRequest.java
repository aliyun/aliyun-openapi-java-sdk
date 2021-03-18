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

package com.aliyuncs.marketing_event.model.v20210101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QuerySingleActivityInfoRequest extends RpcAcsRequest<QuerySingleActivityInfoResponse> {
	   

	private String activityId;

	private String customerName;

	private String mobile;

	private String qRCode;

	private String companyName;
	public QuerySingleActivityInfoRequest() {
		super("marketing_event", "2021-01-01", "QuerySingleActivityInfo");
		setMethod(MethodType.GET);
	}

	public String getActivityId() {
		return this.activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
		if(activityId != null){
			putQueryParameter("ActivityId", activityId);
		}
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
		if(customerName != null){
			putQueryParameter("CustomerName", customerName);
		}
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
		if(mobile != null){
			putQueryParameter("Mobile", mobile);
		}
	}

	public String getQRCode() {
		return this.qRCode;
	}

	public void setQRCode(String qRCode) {
		this.qRCode = qRCode;
		if(qRCode != null){
			putQueryParameter("QRCode", qRCode);
		}
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
		if(companyName != null){
			putQueryParameter("CompanyName", companyName);
		}
	}

	@Override
	public Class<QuerySingleActivityInfoResponse> getResponseClass() {
		return QuerySingleActivityInfoResponse.class;
	}

}
