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

package com.aliyuncs.openitag.model.v20220616;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetSubtaskItemRequest extends RoaAcsRequest<GetSubtaskItemResponse> {
	   

	private String itemId;

	private String tenantId;

	private String subtaskId;

	private String taskId;
	public GetSubtaskItemRequest() {
		super("OpenITag", "2022-06-16", "GetSubtaskItem");
		setUriPattern("/openapi/api/v1/tenants/[TenantId]/tasks/[TaskId]/subtasks/[SubtaskId]/items/[ItemId]");
		setMethod(MethodType.GET);
	}

	public String getItemId() {
		return this.itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
		if(itemId != null){
			putPathParameter("ItemId", itemId);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putPathParameter("TenantId", tenantId);
		}
	}

	public String getSubtaskId() {
		return this.subtaskId;
	}

	public void setSubtaskId(String subtaskId) {
		this.subtaskId = subtaskId;
		if(subtaskId != null){
			putPathParameter("SubtaskId", subtaskId);
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putPathParameter("TaskId", taskId);
		}
	}

	@Override
	public Class<GetSubtaskItemResponse> getResponseClass() {
		return GetSubtaskItemResponse.class;
	}

}
