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
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class RenewClusterRequest extends RpcAcsRequest<RenewClusterResponse> {
	
	public RenewClusterRequest() {
		super("Emr", "2016-04-08", "RenewCluster");
	}

	private Long resourceOwnerId;

	private List<RenewEcsDo> renewEcsDos;

	private String clusterId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public List<RenewEcsDo> getRenewEcsDos() {
		return this.renewEcsDos;
	}

	public void setRenewEcsDos(List<RenewEcsDo> renewEcsDos) {
		this.renewEcsDos = renewEcsDos;	
		if (renewEcsDos != null) {
			for (int depth1 = 0; depth1 < renewEcsDos.size(); depth1++) {
				putQueryParameter("RenewEcsDo." + (depth1 + 1) + ".EcsId" , renewEcsDos.get(depth1).getEcsId());
				putQueryParameter("RenewEcsDo." + (depth1 + 1) + ".EcsPeriod" , renewEcsDos.get(depth1).getEcsPeriod());
				putQueryParameter("RenewEcsDo." + (depth1 + 1) + ".EmrPeriod" , renewEcsDos.get(depth1).getEmrPeriod());
			}
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

	public static class RenewEcsDo {

		private String ecsId;

		private String ecsPeriod;

		private String emrPeriod;

		public String getEcsId() {
			return this.ecsId;
		}

		public void setEcsId(String ecsId) {
			this.ecsId = ecsId;
		}

		public String getEcsPeriod() {
			return this.ecsPeriod;
		}

		public void setEcsPeriod(String ecsPeriod) {
			this.ecsPeriod = ecsPeriod;
		}

		public String getEmrPeriod() {
			return this.emrPeriod;
		}

		public void setEmrPeriod(String emrPeriod) {
			this.emrPeriod = emrPeriod;
		}
	}

	@Override
	public Class<RenewClusterResponse> getResponseClass() {
		return RenewClusterResponse.class;
	}

}
