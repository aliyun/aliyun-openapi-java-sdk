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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListEmrMainVersionRequest extends RpcAcsRequest<ListEmrMainVersionResponse> {
	
	public ListEmrMainVersionRequest() {
		super("Emr", "2016-04-08", "ListEmrMainVersion");
	}

	private Long resourceOwnerId;

	private Integer pageSize;

	private String emrVersion;

	private String stackName;

	private String stackVersion;

	private Integer pageNumber;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public String getEmrVersion() {
		return this.emrVersion;
	}

	public void setEmrVersion(String emrVersion) {
		this.emrVersion = emrVersion;
		if(emrVersion != null){
			putQueryParameter("EmrVersion", emrVersion);
		}
	}

	public String getStackName() {
		return this.stackName;
	}

	public void setStackName(String stackName) {
		this.stackName = stackName;
		if(stackName != null){
			putQueryParameter("StackName", stackName);
		}
	}

	public String getStackVersion() {
		return this.stackVersion;
	}

	public void setStackVersion(String stackVersion) {
		this.stackVersion = stackVersion;
		if(stackVersion != null){
			putQueryParameter("StackVersion", stackVersion);
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

	@Override
	public Class<ListEmrMainVersionResponse> getResponseClass() {
		return ListEmrMainVersionResponse.class;
	}

}
