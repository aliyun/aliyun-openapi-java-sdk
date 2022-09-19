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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateTaskFlowNotificationRequest extends RpcAcsRequest<UpdateTaskFlowNotificationResponse> {
	   

	private Long dagId;

	private Long tid;

	private Boolean dagNotificationFail;

	private Boolean dagNotificationSuccess;

	private Boolean dagNotificationSla;
	public UpdateTaskFlowNotificationRequest() {
		super("dms-enterprise", "2018-11-01", "UpdateTaskFlowNotification", "dms-enterprise");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getDagId() {
		return this.dagId;
	}

	public void setDagId(Long dagId) {
		this.dagId = dagId;
		if(dagId != null){
			putQueryParameter("DagId", dagId.toString());
		}
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
		}
	}

	public Boolean getDagNotificationFail() {
		return this.dagNotificationFail;
	}

	public void setDagNotificationFail(Boolean dagNotificationFail) {
		this.dagNotificationFail = dagNotificationFail;
		if(dagNotificationFail != null){
			putQueryParameter("DagNotificationFail", dagNotificationFail.toString());
		}
	}

	public Boolean getDagNotificationSuccess() {
		return this.dagNotificationSuccess;
	}

	public void setDagNotificationSuccess(Boolean dagNotificationSuccess) {
		this.dagNotificationSuccess = dagNotificationSuccess;
		if(dagNotificationSuccess != null){
			putQueryParameter("DagNotificationSuccess", dagNotificationSuccess.toString());
		}
	}

	public Boolean getDagNotificationSla() {
		return this.dagNotificationSla;
	}

	public void setDagNotificationSla(Boolean dagNotificationSla) {
		this.dagNotificationSla = dagNotificationSla;
		if(dagNotificationSla != null){
			putQueryParameter("DagNotificationSla", dagNotificationSla.toString());
		}
	}

	@Override
	public Class<UpdateTaskFlowNotificationResponse> getResponseClass() {
		return UpdateTaskFlowNotificationResponse.class;
	}

}
