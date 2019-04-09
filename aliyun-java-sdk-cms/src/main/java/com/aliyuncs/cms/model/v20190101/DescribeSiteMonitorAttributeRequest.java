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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeSiteMonitorAttributeRequest extends RpcAcsRequest<DescribeSiteMonitorAttributeResponse> {
	
	public DescribeSiteMonitorAttributeRequest() {
		super("Cms", "2019-01-01", "DescribeSiteMonitorAttribute", "cms");
	}

	private Boolean includeAlert;

	private String taskId;

	public Boolean getIncludeAlert() {
		return this.includeAlert;
	}

	public void setIncludeAlert(Boolean includeAlert) {
		this.includeAlert = includeAlert;
		if(includeAlert != null){
			putQueryParameter("IncludeAlert", includeAlert.toString());
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

	@Override
	public Class<DescribeSiteMonitorAttributeResponse> getResponseClass() {
		return DescribeSiteMonitorAttributeResponse.class;
	}

}
