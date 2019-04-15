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
import com.aliyuncs.ecsinc.transform.v20160314.InnerEcsTransitionModifyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerEcsTransitionModifyResponse extends AcsResponse {

	private String requestId;

	private List<EcsTransitionModel> ecsTransitionModels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EcsTransitionModel> getEcsTransitionModels() {
		return this.ecsTransitionModels;
	}

	public void setEcsTransitionModels(List<EcsTransitionModel> ecsTransitionModels) {
		this.ecsTransitionModels = ecsTransitionModels;
	}

	public static class EcsTransitionModel {

		private String instanceId;

		private String resourceType;

		private String regionId;

		private String transitionTime;

		private String intranetIpAfterTransition;

		private String internetIpAfterTransition;

		private Boolean isSuccess;

		private String code;

		private String message;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
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

		public String getTransitionTime() {
			return this.transitionTime;
		}

		public void setTransitionTime(String transitionTime) {
			this.transitionTime = transitionTime;
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

		public Boolean getIsSuccess() {
			return this.isSuccess;
		}

		public void setIsSuccess(Boolean isSuccess) {
			this.isSuccess = isSuccess;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}

	@Override
	public InnerEcsTransitionModifyResponse getInstance(UnmarshallerContext context) {
		return	InnerEcsTransitionModifyResponseUnmarshaller.unmarshall(this, context);
	}
}
