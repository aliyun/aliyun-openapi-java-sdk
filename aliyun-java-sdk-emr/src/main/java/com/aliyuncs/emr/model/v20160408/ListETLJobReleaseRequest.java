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
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListETLJobReleaseRequest extends RpcAcsRequest<ListETLJobReleaseResponse> {
	
	public ListETLJobReleaseRequest() {
		super("Emr", "2016-04-08", "ListETLJobRelease", "emr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private String etlJobId;

	private String releaseId;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer releaseVersion;

	private String status;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getEtlJobId() {
		return this.etlJobId;
	}

	public void setEtlJobId(String etlJobId) {
		this.etlJobId = etlJobId;
		if(etlJobId != null){
			putQueryParameter("EtlJobId", etlJobId);
		}
	}

	public String getReleaseId() {
		return this.releaseId;
	}

	public void setReleaseId(String releaseId) {
		this.releaseId = releaseId;
		if(releaseId != null){
			putQueryParameter("ReleaseId", releaseId);
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

	public Integer getReleaseVersion() {
		return this.releaseVersion;
	}

	public void setReleaseVersion(Integer releaseVersion) {
		this.releaseVersion = releaseVersion;
		if(releaseVersion != null){
			putQueryParameter("ReleaseVersion", releaseVersion.toString());
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<ListETLJobReleaseResponse> getResponseClass() {
		return ListETLJobReleaseResponse.class;
	}

}
