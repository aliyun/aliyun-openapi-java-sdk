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

package com.aliyuncs.copyright.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SavePatentMonitorTaskRequest extends RpcAcsRequest<SavePatentMonitorTaskResponse> {
	   

	private String contactId;

	private String taskSource;

	private String taskName;

	private String applyNumber;

	private String beforeDay;

	private Long id;

	private String notifyType;
	public SavePatentMonitorTaskRequest() {
		super("Copyright", "2019-01-23", "SavePatentMonitorTask", "swcopyright");
		setMethod(MethodType.POST);
	}

	public String getContactId() {
		return this.contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
		if(contactId != null){
			putBodyParameter("ContactId", contactId);
		}
	}

	public String getTaskSource() {
		return this.taskSource;
	}

	public void setTaskSource(String taskSource) {
		this.taskSource = taskSource;
		if(taskSource != null){
			putBodyParameter("TaskSource", taskSource);
		}
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
		if(taskName != null){
			putBodyParameter("TaskName", taskName);
		}
	}

	public String getApplyNumber() {
		return this.applyNumber;
	}

	public void setApplyNumber(String applyNumber) {
		this.applyNumber = applyNumber;
		if(applyNumber != null){
			putBodyParameter("ApplyNumber", applyNumber);
		}
	}

	public String getBeforeDay() {
		return this.beforeDay;
	}

	public void setBeforeDay(String beforeDay) {
		this.beforeDay = beforeDay;
		if(beforeDay != null){
			putBodyParameter("BeforeDay", beforeDay);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	public String getNotifyType() {
		return this.notifyType;
	}

	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
		if(notifyType != null){
			putBodyParameter("NotifyType", notifyType);
		}
	}

	@Override
	public Class<SavePatentMonitorTaskResponse> getResponseClass() {
		return SavePatentMonitorTaskResponse.class;
	}

}
