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

package com.aliyuncs.nas.model.v20170626;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeAutoSnapshotTasksRequest extends RpcAcsRequest<DescribeAutoSnapshotTasksResponse> {
	   

	private String fileSystemType;

	private Integer pageNumber;

	private Integer pageSize;

	private String fileSystemIds;

	private String autoSnapshotPolicyIds;
	public DescribeAutoSnapshotTasksRequest() {
		super("NAS", "2017-06-26", "DescribeAutoSnapshotTasks", "nas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFileSystemType() {
		return this.fileSystemType;
	}

	public void setFileSystemType(String fileSystemType) {
		this.fileSystemType = fileSystemType;
		if(fileSystemType != null){
			putQueryParameter("FileSystemType", fileSystemType);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getFileSystemIds() {
		return this.fileSystemIds;
	}

	public void setFileSystemIds(String fileSystemIds) {
		this.fileSystemIds = fileSystemIds;
		if(fileSystemIds != null){
			putQueryParameter("FileSystemIds", fileSystemIds);
		}
	}

	public String getAutoSnapshotPolicyIds() {
		return this.autoSnapshotPolicyIds;
	}

	public void setAutoSnapshotPolicyIds(String autoSnapshotPolicyIds) {
		this.autoSnapshotPolicyIds = autoSnapshotPolicyIds;
		if(autoSnapshotPolicyIds != null){
			putQueryParameter("AutoSnapshotPolicyIds", autoSnapshotPolicyIds);
		}
	}

	@Override
	public Class<DescribeAutoSnapshotTasksResponse> getResponseClass() {
		return DescribeAutoSnapshotTasksResponse.class;
	}

}
