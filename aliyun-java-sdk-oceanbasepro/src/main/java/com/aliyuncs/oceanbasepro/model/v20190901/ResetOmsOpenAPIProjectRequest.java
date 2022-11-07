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

package com.aliyuncs.oceanbasepro.model.v20190901;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ResetOmsOpenAPIProjectRequest extends RpcAcsRequest<ResetOmsOpenAPIProjectResponse> {
	   

	private Integer pageNumber;

	private Integer pageSize;

	private String workerGradeId;

	private String projectId;
	public ResetOmsOpenAPIProjectRequest() {
		super("OceanBasePro", "2019-09-01", "ResetOmsOpenAPIProject");
		setMethod(MethodType.POST);
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getWorkerGradeId() {
		return this.workerGradeId;
	}

	public void setWorkerGradeId(String workerGradeId) {
		this.workerGradeId = workerGradeId;
		if(workerGradeId != null){
			putBodyParameter("WorkerGradeId", workerGradeId);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	@Override
	public Class<ResetOmsOpenAPIProjectResponse> getResponseClass() {
		return ResetOmsOpenAPIProjectResponse.class;
	}

}
