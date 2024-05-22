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

package com.aliyuncs.polardbx.model.v20200202;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardbx.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeActiveOperationTasksRequest extends RpcAcsRequest<DescribeActiveOperationTasksResponse> {
	   

	private String productId;

	private String changeLevel;

	private Long pageNumber;

	private String insName;

	private Long pageSize;

	private String taskType;

	private Long allowCancel;

	private String dbType;

	private Long allowChange;

	private String region;

	private Long status;
	public DescribeActiveOperationTasksRequest() {
		super("polardbx", "2020-02-02", "DescribeActiveOperationTasks", "polardbx");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
		if(productId != null){
			putQueryParameter("ProductId", productId);
		}
	}

	public String getChangeLevel() {
		return this.changeLevel;
	}

	public void setChangeLevel(String changeLevel) {
		this.changeLevel = changeLevel;
		if(changeLevel != null){
			putQueryParameter("ChangeLevel", changeLevel);
		}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getInsName() {
		return this.insName;
	}

	public void setInsName(String insName) {
		this.insName = insName;
		if(insName != null){
			putQueryParameter("InsName", insName);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getTaskType() {
		return this.taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
		if(taskType != null){
			putQueryParameter("TaskType", taskType);
		}
	}

	public Long getAllowCancel() {
		return this.allowCancel;
	}

	public void setAllowCancel(Long allowCancel) {
		this.allowCancel = allowCancel;
		if(allowCancel != null){
			putQueryParameter("AllowCancel", allowCancel.toString());
		}
	}

	public String getDbType() {
		return this.dbType;
	}

	public void setDbType(String dbType) {
		this.dbType = dbType;
		if(dbType != null){
			putQueryParameter("DbType", dbType);
		}
	}

	public Long getAllowChange() {
		return this.allowChange;
	}

	public void setAllowChange(Long allowChange) {
		this.allowChange = allowChange;
		if(allowChange != null){
			putQueryParameter("AllowChange", allowChange.toString());
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
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
	public Class<DescribeActiveOperationTasksResponse> getResponseClass() {
		return DescribeActiveOperationTasksResponse.class;
	}

}
