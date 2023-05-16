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
public class GetMonthBillListRequest extends RpcAcsRequest<GetMonthBillListResponse> {
	   

	private Long uid;

	private String monthUserType;

	private String monthBillTime;

	private String monthBillType;
	public GetMonthBillListRequest() {
		super("Agency", "2018-07-03", "GetMonthBillList", "openApi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("Uid", uid.toString());
		}
	}

	public String getMonthUserType() {
		return this.monthUserType;
	}

	public void setMonthUserType(String monthUserType) {
		this.monthUserType = monthUserType;
		if(monthUserType != null){
			putQueryParameter("MonthUserType", monthUserType);
		}
	}

	public String getMonthBillTime() {
		return this.monthBillTime;
	}

	public void setMonthBillTime(String monthBillTime) {
		this.monthBillTime = monthBillTime;
		if(monthBillTime != null){
			putQueryParameter("MonthBillTime", monthBillTime);
		}
	}

	public String getMonthBillType() {
		return this.monthBillType;
	}

	public void setMonthBillType(String monthBillType) {
		this.monthBillType = monthBillType;
		if(monthBillType != null){
			putQueryParameter("MonthBillType", monthBillType);
		}
	}

	@Override
	public Class<GetMonthBillListResponse> getResponseClass() {
		return GetMonthBillListResponse.class;
	}

}
