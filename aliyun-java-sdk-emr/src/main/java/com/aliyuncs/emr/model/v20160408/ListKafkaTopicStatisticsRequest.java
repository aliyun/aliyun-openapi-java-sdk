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
public class ListKafkaTopicStatisticsRequest extends RpcAcsRequest<ListKafkaTopicStatisticsResponse> {
	
	public ListKafkaTopicStatisticsRequest() {
		super("Emr", "2016-04-08", "ListKafkaTopicStatistics", "emr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private Boolean activeOnly;

	private Integer pageSize;

	private String dataSourceId;

	private String topicName;

	private String clusterId;

	private Integer pageNumber;

	private String fuzzyTopicName;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Boolean getActiveOnly() {
		return this.activeOnly;
	}

	public void setActiveOnly(Boolean activeOnly) {
		this.activeOnly = activeOnly;
		if(activeOnly != null){
			putQueryParameter("ActiveOnly", activeOnly.toString());
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

	public String getDataSourceId() {
		return this.dataSourceId;
	}

	public void setDataSourceId(String dataSourceId) {
		this.dataSourceId = dataSourceId;
		if(dataSourceId != null){
			putQueryParameter("DataSourceId", dataSourceId);
		}
	}

	public String getTopicName() {
		return this.topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
		if(topicName != null){
			putQueryParameter("TopicName", topicName);
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getFuzzyTopicName() {
		return this.fuzzyTopicName;
	}

	public void setFuzzyTopicName(String fuzzyTopicName) {
		this.fuzzyTopicName = fuzzyTopicName;
		if(fuzzyTopicName != null){
			putQueryParameter("FuzzyTopicName", fuzzyTopicName);
		}
	}

	@Override
	public Class<ListKafkaTopicStatisticsResponse> getResponseClass() {
		return ListKafkaTopicStatisticsResponse.class;
	}

}
