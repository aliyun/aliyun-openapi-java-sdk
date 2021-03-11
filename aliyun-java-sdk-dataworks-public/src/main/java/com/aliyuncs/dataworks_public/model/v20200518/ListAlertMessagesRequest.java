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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListAlertMessagesRequest extends RpcAcsRequest<ListAlertMessagesResponse> {
	   

	private String alertUser;

	private String endTime;

	private String beginTime;

	private String alertMethods;

	private Integer pageNumber;

	private Long remindId;

	private Integer pageSize;

	private String alertRuleTypes;
	public ListAlertMessagesRequest() {
		super("dataworks-public", "2020-05-18", "ListAlertMessages");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAlertUser() {
		return this.alertUser;
	}

	public void setAlertUser(String alertUser) {
		this.alertUser = alertUser;
		if(alertUser != null){
			putBodyParameter("AlertUser", alertUser);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime);
		}
	}

	public String getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
		if(beginTime != null){
			putBodyParameter("BeginTime", beginTime);
		}
	}

	public String getAlertMethods() {
		return this.alertMethods;
	}

	public void setAlertMethods(String alertMethods) {
		this.alertMethods = alertMethods;
		if(alertMethods != null){
			putBodyParameter("AlertMethods", alertMethods);
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

	public Long getRemindId() {
		return this.remindId;
	}

	public void setRemindId(Long remindId) {
		this.remindId = remindId;
		if(remindId != null){
			putBodyParameter("RemindId", remindId.toString());
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

	public String getAlertRuleTypes() {
		return this.alertRuleTypes;
	}

	public void setAlertRuleTypes(String alertRuleTypes) {
		this.alertRuleTypes = alertRuleTypes;
		if(alertRuleTypes != null){
			putBodyParameter("AlertRuleTypes", alertRuleTypes);
		}
	}

	@Override
	public Class<ListAlertMessagesResponse> getResponseClass() {
		return ListAlertMessagesResponse.class;
	}

}
