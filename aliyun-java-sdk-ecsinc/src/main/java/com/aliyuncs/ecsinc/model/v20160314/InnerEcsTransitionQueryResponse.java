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

package com.aliyuncs.ecsinc.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsinc.transform.v20160314.InnerEcsTransitionQueryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerEcsTransitionQueryResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private Integer pageNo;

	private Integer pageSize;

	private List<EcsTransitionModel> ecsTransitionModels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<EcsTransitionModel> getEcsTransitionModels() {
		return this.ecsTransitionModels;
	}

	public void setEcsTransitionModels(List<EcsTransitionModel> ecsTransitionModels) {
		this.ecsTransitionModels = ecsTransitionModels;
	}

	public static class EcsTransitionModel {

		private String instanceId;

		private String intranetIp;

		private String internetIp;

		private String status;

		private String expireTime;

		private String resourceType;

		private String transitionTime;

		private String regionId;

		private String transitionType;

		private String vmStatus;

		private String name;

		private String businessStatus;

		private String targetIz;

		private String intranetIpAfterTransition;

		private String internetIpAfterTransition;

		private String mergeProgress;

		private String loadProgress;

		private Boolean isSendVoucher;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getTransitionTime() {
			return this.transitionTime;
		}

		public void setTransitionTime(String transitionTime) {
			this.transitionTime = transitionTime;
		}

		public String getBizRegionId() {
			return this.regionId;
		}

		public void setBizRegionId(String regionId) {
			this.regionId = regionId;
		}

		/**
		 * @deprecated use getBizRegionId instead of this.
		 */
		@Deprecated
		public String getRegionId() {
			return this.regionId;
		}

		/**
		 * @deprecated use setBizRegionId instead of this.
		 */
		@Deprecated
		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getTransitionType() {
			return this.transitionType;
		}

		public void setTransitionType(String transitionType) {
			this.transitionType = transitionType;
		}

		public String getVmStatus() {
			return this.vmStatus;
		}

		public void setVmStatus(String vmStatus) {
			this.vmStatus = vmStatus;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBusinessStatus() {
			return this.businessStatus;
		}

		public void setBusinessStatus(String businessStatus) {
			this.businessStatus = businessStatus;
		}

		public String getTargetIz() {
			return this.targetIz;
		}

		public void setTargetIz(String targetIz) {
			this.targetIz = targetIz;
		}

		public String getIntranetIpAfterTransition() {
			return this.intranetIpAfterTransition;
		}

		public void setIntranetIpAfterTransition(String intranetIpAfterTransition) {
			this.intranetIpAfterTransition = intranetIpAfterTransition;
		}

		public String getInternetIpAfterTransition() {
			return this.internetIpAfterTransition;
		}

		public void setInternetIpAfterTransition(String internetIpAfterTransition) {
			this.internetIpAfterTransition = internetIpAfterTransition;
		}

		public String getMergeProgress() {
			return this.mergeProgress;
		}

		public void setMergeProgress(String mergeProgress) {
			this.mergeProgress = mergeProgress;
		}

		public String getLoadProgress() {
			return this.loadProgress;
		}

		public void setLoadProgress(String loadProgress) {
			this.loadProgress = loadProgress;
		}

		public Boolean getIsSendVoucher() {
			return this.isSendVoucher;
		}

		public void setIsSendVoucher(Boolean isSendVoucher) {
			this.isSendVoucher = isSendVoucher;
		}
	}

	@Override
	public InnerEcsTransitionQueryResponse getInstance(UnmarshallerContext context) {
		return	InnerEcsTransitionQueryResponseUnmarshaller.unmarshall(this, context);
	}
}
