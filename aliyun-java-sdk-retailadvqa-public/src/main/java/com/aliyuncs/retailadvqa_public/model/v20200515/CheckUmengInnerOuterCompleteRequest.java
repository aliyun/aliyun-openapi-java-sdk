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

package com.aliyuncs.retailadvqa_public.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CheckUmengInnerOuterCompleteRequest extends RpcAcsRequest<CheckUmengInnerOuterCompleteResponse> {
	   

	private String accessId;

	private String tenantId;

	private String audienceId;

	private String message;

	private String taskId;

	private Long status;
	public CheckUmengInnerOuterCompleteRequest() {
		super("retailadvqa-public", "2020-05-15", "CheckUmengInnerOuterComplete");
		setMethod(MethodType.POST);
	}

	public String getAccessId() {
		return this.accessId;
	}

	public void setAccessId(String accessId) {
		this.accessId = accessId;
		if(accessId != null){
			putQueryParameter("AccessId", accessId);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putQueryParameter("TenantId", tenantId);
		}
	}

	public String getAudienceId() {
		return this.audienceId;
	}

	public void setAudienceId(String audienceId) {
		this.audienceId = audienceId;
		if(audienceId != null){
			putQueryParameter("AudienceId", audienceId);
		}
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
		if(message != null){
			putQueryParameter("Message", message);
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId);
		}
	}

	public Long getStatus() {
		return this.status;
	}

	public void setStatus(Long status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	@Override
	public Class<CheckUmengInnerOuterCompleteResponse> getResponseClass() {
		return CheckUmengInnerOuterCompleteResponse.class;
	}

}
