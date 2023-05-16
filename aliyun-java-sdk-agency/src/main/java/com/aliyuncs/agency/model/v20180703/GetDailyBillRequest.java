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

package com.aliyuncs.agency.model.v20180703;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.agency.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetDailyBillRequest extends RpcAcsRequest<GetDailyBillResponse> {
	   

	private String date;

	private String billOwner;

	private String billType;
	public GetDailyBillRequest() {
		super("Agency", "2018-07-03", "GetDailyBill", "openApi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
		if(date != null){
			putQueryParameter("Date", date);
		}
	}

	public String getBillOwner() {
		return this.billOwner;
	}

	public void setBillOwner(String billOwner) {
		this.billOwner = billOwner;
		if(billOwner != null){
			putQueryParameter("BillOwner", billOwner);
		}
	}

	public String getBillType() {
		return this.billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
		if(billType != null){
			putQueryParameter("BillType", billType);
		}
	}

	@Override
	public Class<GetDailyBillResponse> getResponseClass() {
		return GetDailyBillResponse.class;
	}

}
