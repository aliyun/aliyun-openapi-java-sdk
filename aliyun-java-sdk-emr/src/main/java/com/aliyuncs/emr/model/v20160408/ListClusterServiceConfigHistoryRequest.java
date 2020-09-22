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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListClusterServiceConfigHistoryRequest extends RpcAcsRequest<ListClusterServiceConfigHistoryResponse> {
	   

	private Long resourceOwnerId;

	private String hostInstanceId;

	private Integer pageNumber;

	private String configVersion;

	private Integer pageSize;

	private String serviceName;

	private String author;

	private String clusterId;

	private String configFileName;

	private String configItemKey;

	private String hostGroupId;

	private String comment;
	public ListClusterServiceConfigHistoryRequest() {
		super("Emr", "2016-04-08", "ListClusterServiceConfigHistory");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getHostInstanceId() {
		return this.hostInstanceId;
	}

	public void setHostInstanceId(String hostInstanceId) {
		this.hostInstanceId = hostInstanceId;
		if(hostInstanceId != null){
			putQueryParameter("HostInstanceId", hostInstanceId);
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

	public String getConfigVersion() {
		return this.configVersion;
	}

	public void setConfigVersion(String configVersion) {
		this.configVersion = configVersion;
		if(configVersion != null){
			putQueryParameter("ConfigVersion", configVersion);
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

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putQueryParameter("ServiceName", serviceName);
		}
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
		if(author != null){
			putQueryParameter("Author", author);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getConfigFileName() {
		return this.configFileName;
	}

	public void setConfigFileName(String configFileName) {
		this.configFileName = configFileName;
		if(configFileName != null){
			putQueryParameter("ConfigFileName", configFileName);
		}
	}

	public String getConfigItemKey() {
		return this.configItemKey;
	}

	public void setConfigItemKey(String configItemKey) {
		this.configItemKey = configItemKey;
		if(configItemKey != null){
			putQueryParameter("ConfigItemKey", configItemKey);
		}
	}

	public String getHostGroupId() {
		return this.hostGroupId;
	}

	public void setHostGroupId(String hostGroupId) {
		this.hostGroupId = hostGroupId;
		if(hostGroupId != null){
			putQueryParameter("HostGroupId", hostGroupId);
		}
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
		if(comment != null){
			putQueryParameter("Comment", comment);
		}
	}

	@Override
	public Class<ListClusterServiceConfigHistoryResponse> getResponseClass() {
		return ListClusterServiceConfigHistoryResponse.class;
	}

}
