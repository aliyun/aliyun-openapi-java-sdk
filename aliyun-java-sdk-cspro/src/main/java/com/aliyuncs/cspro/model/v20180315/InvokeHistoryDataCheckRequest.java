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

package com.aliyuncs.cspro.model.v20180315;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cspro.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class InvokeHistoryDataCheckRequest extends RpcAcsRequest<InvokeHistoryDataCheckResponse> {
	   

	private Long historyStartTime;

	private String checkType;

	private Long historyEndTime;

	private String checkTarget;

	private String confType;
	public InvokeHistoryDataCheckRequest() {
		super("cspro", "2018-03-15", "InvokeHistoryDataCheck", "cspro");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getHistoryStartTime() {
		return this.historyStartTime;
	}

	public void setHistoryStartTime(Long historyStartTime) {
		this.historyStartTime = historyStartTime;
		if(historyStartTime != null){
			putBodyParameter("HistoryStartTime", historyStartTime.toString());
		}
	}

	public String getCheckType() {
		return this.checkType;
	}

	public void setCheckType(String checkType) {
		this.checkType = checkType;
		if(checkType != null){
			putBodyParameter("CheckType", checkType);
		}
	}

	public Long getHistoryEndTime() {
		return this.historyEndTime;
	}

	public void setHistoryEndTime(Long historyEndTime) {
		this.historyEndTime = historyEndTime;
		if(historyEndTime != null){
			putBodyParameter("HistoryEndTime", historyEndTime.toString());
		}
	}

	public String getCheckTarget() {
		return this.checkTarget;
	}

	public void setCheckTarget(String checkTarget) {
		this.checkTarget = checkTarget;
		if(checkTarget != null){
			putBodyParameter("CheckTarget", checkTarget);
		}
	}

	public String getConfType() {
		return this.confType;
	}

	public void setConfType(String confType) {
		this.confType = confType;
		if(confType != null){
			putBodyParameter("ConfType", confType);
		}
	}

	@Override
	public Class<InvokeHistoryDataCheckResponse> getResponseClass() {
		return InvokeHistoryDataCheckResponse.class;
	}

}
