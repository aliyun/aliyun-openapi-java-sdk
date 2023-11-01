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

package com.aliyuncs.cloud_siem.model.v20220616;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PostEventDisposeAndWhiteruleListRequest extends RpcAcsRequest<PostEventDisposeAndWhiteruleListResponse> {
	   

	private String remark;

	private String eventDispose;

	private String receiverInfo;

	private String incidentUuid;

	private Integer status;
	public PostEventDisposeAndWhiteruleListRequest() {
		super("cloud-siem", "2022-06-16", "PostEventDisposeAndWhiteruleList", "cloud-siem");
		setMethod(MethodType.POST);
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putBodyParameter("Remark", remark);
		}
	}

	public String getEventDispose() {
		return this.eventDispose;
	}

	public void setEventDispose(String eventDispose) {
		this.eventDispose = eventDispose;
		if(eventDispose != null){
			putBodyParameter("EventDispose", eventDispose);
		}
	}

	public String getReceiverInfo() {
		return this.receiverInfo;
	}

	public void setReceiverInfo(String receiverInfo) {
		this.receiverInfo = receiverInfo;
		if(receiverInfo != null){
			putBodyParameter("ReceiverInfo", receiverInfo);
		}
	}

	public String getIncidentUuid() {
		return this.incidentUuid;
	}

	public void setIncidentUuid(String incidentUuid) {
		this.incidentUuid = incidentUuid;
		if(incidentUuid != null){
			putBodyParameter("IncidentUuid", incidentUuid);
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status.toString());
		}
	}

	@Override
	public Class<PostEventDisposeAndWhiteruleListResponse> getResponseClass() {
		return PostEventDisposeAndWhiteruleListResponse.class;
	}

}
