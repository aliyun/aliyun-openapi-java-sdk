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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsCreateEventListRequest extends RpcAcsRequest<OpsCreateEventListResponse> {
	   

	private String events;

	private String auditParamStr;
	public OpsCreateEventListRequest() {
		super("Ecsops", "2016-04-01", "OpsCreateEventList", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getEvents() {
		return this.events;
	}

	public void setEvents(String events) {
		this.events = events;
		if(events != null){
			putQueryParameter("Events", events);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsCreateEventListResponse> getResponseClass() {
		return OpsCreateEventListResponse.class;
	}

}
