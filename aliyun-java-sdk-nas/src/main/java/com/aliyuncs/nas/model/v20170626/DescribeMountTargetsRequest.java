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
import com.aliyuncs.nas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeMountTargetsRequest extends RpcAcsRequest<DescribeMountTargetsResponse> {
	
	public DescribeMountTargetsRequest() {
		super("NAS", "2017-06-26", "DescribeMountTargets", "nas");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String mountTargetDomain;

	private Integer pageSize;

	private Integer pageNumber;

	private String fileSystemId;

	public String getMountTargetDomain() {
		return this.mountTargetDomain;
	}

	public void setMountTargetDomain(String mountTargetDomain) {
		this.mountTargetDomain = mountTargetDomain;
		if(mountTargetDomain != null){
			putQueryParameter("MountTargetDomain", mountTargetDomain);
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getFileSystemId() {
		return this.fileSystemId;
	}

	public void setFileSystemId(String fileSystemId) {
		this.fileSystemId = fileSystemId;
		if(fileSystemId != null){
			putQueryParameter("FileSystemId", fileSystemId);
		}
	}

	@Override
	public Class<DescribeMountTargetsResponse> getResponseClass() {
		return DescribeMountTargetsResponse.class;
	}

}
