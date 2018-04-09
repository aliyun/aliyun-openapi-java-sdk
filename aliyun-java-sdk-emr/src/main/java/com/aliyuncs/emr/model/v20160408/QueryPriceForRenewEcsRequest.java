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
public class QueryPriceForRenewEcsRequest extends RpcAcsRequest<QueryPriceForRenewEcsResponse> {
	
	public QueryPriceForRenewEcsRequest() {
		super("Emr", "2016-04-08", "QueryPriceForRenewEcs");
	}

	private Long resourceOwnerId;

	private Integer ecsPeriod;

	private Integer emrPeriod;

	private String clusterId;

	private String ecsId;

	private String ecsIdList;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Integer getEcsPeriod() {
		return this.ecsPeriod;
	}

	public void setEcsPeriod(Integer ecsPeriod) {
		this.ecsPeriod = ecsPeriod;
		if(ecsPeriod != null){
			putQueryParameter("EcsPeriod", ecsPeriod.toString());
		}
	}

	public Integer getEmrPeriod() {
		return this.emrPeriod;
	}

	public void setEmrPeriod(Integer emrPeriod) {
		this.emrPeriod = emrPeriod;
		if(emrPeriod != null){
			putQueryParameter("EmrPeriod", emrPeriod.toString());
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

	public String getEcsId() {
		return this.ecsId;
	}

	public void setEcsId(String ecsId) {
		this.ecsId = ecsId;
		if(ecsId != null){
			putQueryParameter("EcsId", ecsId);
		}
	}

	public String getEcsIdList() {
		return this.ecsIdList;
	}

	public void setEcsIdList(String ecsIdList) {
		this.ecsIdList = ecsIdList;
		if(ecsIdList != null){
			putQueryParameter("EcsIdList", ecsIdList);
		}
	}

	@Override
	public Class<QueryPriceForRenewEcsResponse> getResponseClass() {
		return QueryPriceForRenewEcsResponse.class;
	}

}
