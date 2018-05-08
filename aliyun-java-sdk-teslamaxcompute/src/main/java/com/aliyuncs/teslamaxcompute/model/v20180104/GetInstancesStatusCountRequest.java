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

package com.aliyuncs.teslamaxcompute.model.v20180104;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetInstancesStatusCountRequest extends RpcAcsRequest<GetInstancesStatusCountResponse> {
	
	public GetInstancesStatusCountRequest() {
		super("TeslaMaxCompute", "2018-01-04", "GetInstancesStatusCount");
	}

	private String cluster;

	private String quotaId;

	private String region;

	private String quotaName;

	public String getCluster() {
		return this.cluster;
	}

	public void setCluster(String cluster) {
		this.cluster = cluster;
		if(cluster != null){
			putQueryParameter("Cluster", cluster);
		}
	}

	public String getQuotaId() {
		return this.quotaId;
	}

	public void setQuotaId(String quotaId) {
		this.quotaId = quotaId;
		if(quotaId != null){
			putQueryParameter("QuotaId", quotaId);
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

	public String getQuotaName() {
		return this.quotaName;
	}

	public void setQuotaName(String quotaName) {
		this.quotaName = quotaName;
		if(quotaName != null){
			putQueryParameter("QuotaName", quotaName);
		}
	}

	@Override
	public Class<GetInstancesStatusCountResponse> getResponseClass() {
		return GetInstancesStatusCountResponse.class;
	}

}
