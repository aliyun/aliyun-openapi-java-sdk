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
public class ResetAutoRenewalRequest extends RpcAcsRequest<ResetAutoRenewalResponse> {
	
	public ResetAutoRenewalRequest() {
		super("Emr", "2016-04-08", "ResetAutoRenewal");
	}

	private Long resourceOwnerId;

	private String clusterId;

	private List<EcsResetAutoRenewDo> ecsResetAutoRenewDos;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public List<EcsResetAutoRenewDo> getEcsResetAutoRenewDos() {
		return this.ecsResetAutoRenewDos;
	}

	public void setEcsResetAutoRenewDos(List<EcsResetAutoRenewDo> ecsResetAutoRenewDos) {
		this.ecsResetAutoRenewDos = ecsResetAutoRenewDos;	
		if (ecsResetAutoRenewDos != null) {
			for (int depth1 = 0; depth1 < ecsResetAutoRenewDos.size(); depth1++) {
				putQueryParameter("EcsResetAutoRenewDo." + (depth1 + 1) + ".EcsId" , ecsResetAutoRenewDos.get(depth1).getEcsId());
				putQueryParameter("EcsResetAutoRenewDo." + (depth1 + 1) + ".EcsAutoRenew" , ecsResetAutoRenewDos.get(depth1).getEcsAutoRenew());
				putQueryParameter("EcsResetAutoRenewDo." + (depth1 + 1) + ".EcsAutoRenewDuration" , ecsResetAutoRenewDos.get(depth1).getEcsAutoRenewDuration());
				putQueryParameter("EcsResetAutoRenewDo." + (depth1 + 1) + ".EmrAutoRenew" , ecsResetAutoRenewDos.get(depth1).getEmrAutoRenew());
				putQueryParameter("EcsResetAutoRenewDo." + (depth1 + 1) + ".EmrAutoRenewDuration" , ecsResetAutoRenewDos.get(depth1).getEmrAutoRenewDuration());
			}
		}	
	}

	public static class EcsResetAutoRenewDo {

		private String ecsId;

		private Boolean ecsAutoRenew;

		private String ecsAutoRenewDuration;

		private Boolean emrAutoRenew;

		private String emrAutoRenewDuration;

		public String getEcsId() {
			return this.ecsId;
		}

		public void setEcsId(String ecsId) {
			this.ecsId = ecsId;
		}

		public Boolean getEcsAutoRenew() {
			return this.ecsAutoRenew;
		}

		public void setEcsAutoRenew(Boolean ecsAutoRenew) {
			this.ecsAutoRenew = ecsAutoRenew;
		}

		public String getEcsAutoRenewDuration() {
			return this.ecsAutoRenewDuration;
		}

		public void setEcsAutoRenewDuration(String ecsAutoRenewDuration) {
			this.ecsAutoRenewDuration = ecsAutoRenewDuration;
		}

		public Boolean getEmrAutoRenew() {
			return this.emrAutoRenew;
		}

		public void setEmrAutoRenew(Boolean emrAutoRenew) {
			this.emrAutoRenew = emrAutoRenew;
		}

		public String getEmrAutoRenewDuration() {
			return this.emrAutoRenewDuration;
		}

		public void setEmrAutoRenewDuration(String emrAutoRenewDuration) {
			this.emrAutoRenewDuration = emrAutoRenewDuration;
		}
	}

	@Override
	public Class<ResetAutoRenewalResponse> getResponseClass() {
		return ResetAutoRenewalResponse.class;
	}

}
