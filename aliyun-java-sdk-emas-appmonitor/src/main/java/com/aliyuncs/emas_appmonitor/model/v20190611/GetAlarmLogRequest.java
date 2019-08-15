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

package com.aliyuncs.emas_appmonitor.model.v20190611;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.emas_appmonitor.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetAlarmLogRequest extends RpcAcsRequest<GetAlarmLogResponse> {
	
	public GetAlarmLogRequest() {
		super("emas-appmonitor", "2019-06-11", "GetAlarmLog");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String alarmItemId;

	private String uniqueAppId;

	private Long untilDate;

	private Integer pageSize;

	private String alarmItemType;

	private Integer pageNumber;

	private Long fromDate;

	public String getAlarmItemId() {
		return this.alarmItemId;
	}

	public void setAlarmItemId(String alarmItemId) {
		this.alarmItemId = alarmItemId;
		if(alarmItemId != null){
			putBodyParameter("AlarmItemId", alarmItemId);
		}
	}

	public String getUniqueAppId() {
		return this.uniqueAppId;
	}

	public void setUniqueAppId(String uniqueAppId) {
		this.uniqueAppId = uniqueAppId;
		if(uniqueAppId != null){
			putBodyParameter("UniqueAppId", uniqueAppId);
		}
	}

	public Long getUntilDate() {
		return this.untilDate;
	}

	public void setUntilDate(Long untilDate) {
		this.untilDate = untilDate;
		if(untilDate != null){
			putBodyParameter("UntilDate", untilDate.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getAlarmItemType() {
		return this.alarmItemType;
	}

	public void setAlarmItemType(String alarmItemType) {
		this.alarmItemType = alarmItemType;
		if(alarmItemType != null){
			putBodyParameter("AlarmItemType", alarmItemType);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public Long getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Long fromDate) {
		this.fromDate = fromDate;
		if(fromDate != null){
			putBodyParameter("FromDate", fromDate.toString());
		}
	}

	@Override
	public Class<GetAlarmLogResponse> getResponseClass() {
		return GetAlarmLogResponse.class;
	}

}
