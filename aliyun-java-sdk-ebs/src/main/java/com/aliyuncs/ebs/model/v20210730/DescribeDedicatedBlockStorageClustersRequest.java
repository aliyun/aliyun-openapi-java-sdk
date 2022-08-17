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

package com.aliyuncs.ebs.model.v20210730;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeDedicatedBlockStorageClustersRequest extends RpcAcsRequest<DescribeDedicatedBlockStorageClustersResponse> {
	   

	private List<String> dedicatedBlockStorageClusterIds;

	private String clientToken;

	private String azoneId;

	private String nextToken;

	private Integer maxResults;

	private String category;

	private List<String> statuss;
	public DescribeDedicatedBlockStorageClustersRequest() {
		super("ebs", "2021-07-30", "DescribeDedicatedBlockStorageClusters", "ebs");
		setMethod(MethodType.POST);
	}

	public List<String> getDedicatedBlockStorageClusterIds() {
		return this.dedicatedBlockStorageClusterIds;
	}

	public void setDedicatedBlockStorageClusterIds(List<String> dedicatedBlockStorageClusterIds) {
		this.dedicatedBlockStorageClusterIds = dedicatedBlockStorageClusterIds;	
		if (dedicatedBlockStorageClusterIds != null) {
			for (int i = 0; i < dedicatedBlockStorageClusterIds.size(); i++) {
				putBodyParameter("DedicatedBlockStorageClusterId." + (i + 1) , dedicatedBlockStorageClusterIds.get(i));
			}
		}	
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public String getAzoneId() {
		return this.azoneId;
	}

	public void setAzoneId(String azoneId) {
		this.azoneId = azoneId;
		if(azoneId != null){
			putBodyParameter("AzoneId", azoneId);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putBodyParameter("NextToken", nextToken);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putBodyParameter("MaxResults", maxResults.toString());
		}
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putBodyParameter("Category", category);
		}
	}

	public List<String> getStatuss() {
		return this.statuss;
	}

	public void setStatuss(List<String> statuss) {
		this.statuss = statuss;	
		if (statuss != null) {
			for (int i = 0; i < statuss.size(); i++) {
				putBodyParameter("Status." + (i + 1) , statuss.get(i));
			}
		}	
	}

	@Override
	public Class<DescribeDedicatedBlockStorageClustersResponse> getResponseClass() {
		return DescribeDedicatedBlockStorageClustersResponse.class;
	}

}
