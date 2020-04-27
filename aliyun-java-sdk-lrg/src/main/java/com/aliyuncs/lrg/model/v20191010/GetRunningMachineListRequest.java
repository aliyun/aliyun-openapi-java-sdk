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

package com.aliyuncs.lrg.model.v20191010;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetRunningMachineListRequest extends RoaAcsRequest<GetRunningMachineListResponse> {
	   

	private Integer pageSize;

	private String statusFilter;

	private Integer pageNumber;

	private Long taskId;
	public GetRunningMachineListRequest() {
		super("LRG", "2019-10-10", "GetRunningMachineList");
		setUriPattern("/api/v2/getrunningmachinelist");
		setMethod(MethodType.POST);
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putPathParameter("PageSize", pageSize.toString());
		}
	}

	public String getStatusFilter() {
		return this.statusFilter;
	}

	public void setStatusFilter(String statusFilter) {
		this.statusFilter = statusFilter;
		if(statusFilter != null){
			putPathParameter("StatusFilter", statusFilter);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putPathParameter("PageNumber", pageNumber.toString());
		}
	}

	public Long getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putPathParameter("TaskId", taskId.toString());
		}
	}

	@Override
	public Class<GetRunningMachineListResponse> getResponseClass() {
		return GetRunningMachineListResponse.class;
	}

}
