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

package com.aliyuncs.scsp.model.v20200702;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.scsp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetCallsPerDayRequest extends RpcAcsRequest<GetCallsPerDayResponse> {
	   

	private String instanceId;

	private String dataIdStart;

	private String dataIdEnd;

	private String dataId;

	private String hourId;

	private String minuteId;

	private String phoneNumbers;

	private String havePhoneNumbers;

	private Long pageNo;

	private Long pageSize;
	public GetCallsPerDayRequest() {
		super("scsp", "2020-07-02", "GetCallsPerDay");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getDataIdStart() {
		return this.dataIdStart;
	}

	public void setDataIdStart(String dataIdStart) {
		this.dataIdStart = dataIdStart;
		if(dataIdStart != null){
			putQueryParameter("DataIdStart", dataIdStart);
		}
	}

	public String getDataIdEnd() {
		return this.dataIdEnd;
	}

	public void setDataIdEnd(String dataIdEnd) {
		this.dataIdEnd = dataIdEnd;
		if(dataIdEnd != null){
			putQueryParameter("DataIdEnd", dataIdEnd);
		}
	}

	public String getDataId() {
		return this.dataId;
	}

	public void setDataId(String dataId) {
		this.dataId = dataId;
		if(dataId != null){
			putQueryParameter("DataId", dataId);
		}
	}

	public String getHourId() {
		return this.hourId;
	}

	public void setHourId(String hourId) {
		this.hourId = hourId;
		if(hourId != null){
			putQueryParameter("HourId", hourId);
		}
	}

	public String getMinuteId() {
		return this.minuteId;
	}

	public void setMinuteId(String minuteId) {
		this.minuteId = minuteId;
		if(minuteId != null){
			putQueryParameter("MinuteId", minuteId);
		}
	}

	public String getPhoneNumbers() {
		return this.phoneNumbers;
	}

	public void setPhoneNumbers(String phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
		if(phoneNumbers != null){
			putQueryParameter("PhoneNumbers", phoneNumbers);
		}
	}

	public String getHavePhoneNumbers() {
		return this.havePhoneNumbers;
	}

	public void setHavePhoneNumbers(String havePhoneNumbers) {
		this.havePhoneNumbers = havePhoneNumbers;
		if(havePhoneNumbers != null){
			putQueryParameter("HavePhoneNumbers", havePhoneNumbers);
		}
	}

	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo.toString());
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	@Override
	public Class<GetCallsPerDayResponse> getResponseClass() {
		return GetCallsPerDayResponse.class;
	}

}
