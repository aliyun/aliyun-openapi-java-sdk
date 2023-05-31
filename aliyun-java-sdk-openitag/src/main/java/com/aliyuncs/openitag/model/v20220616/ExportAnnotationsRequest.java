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
public class ExportAnnotationsRequest extends RoaAcsRequest<ExportAnnotationsResponse> {
	   

	private String tenantId;

	private String registerDataset;

	private String ossPath;

	private String taskId;

	private String target;
	public ExportAnnotationsRequest() {
		super("OpenITag", "2022-06-16", "ExportAnnotations");
		setUriPattern("/openapi/api/v1/tenants/[TenantId]/tasks/[TaskId]/annotations/export");
		setMethod(MethodType.GET);
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

	public String getRegisterDataset() {
		return this.registerDataset;
	}

	public void setRegisterDataset(String registerDataset) {
		this.registerDataset = registerDataset;
		if(registerDataset != null){
			putQueryParameter("RegisterDataset", registerDataset);
		}
	}

	public String getOssPath() {
		return this.ossPath;
	}

	public void setOssPath(String ossPath) {
		this.ossPath = ossPath;
		if(ossPath != null){
			putQueryParameter("OssPath", ossPath);
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

	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
		if(target != null){
			putQueryParameter("Target", target);
		}
	}

	@Override
	public Class<ExportAnnotationsResponse> getResponseClass() {
		return ExportAnnotationsResponse.class;
	}

}
