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

package com.aliyuncs.cas.model.v20180813;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cas.transform.v20180813.DescribeDeploymentDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDeploymentDetailResponse extends AcsResponse {

	private String requestId;

	private List<Deployment> deploymentDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Deployment> getDeploymentDetail() {
		return this.deploymentDetail;
	}

	public void setDeploymentDetail(List<Deployment> deploymentDetail) {
		this.deploymentDetail = deploymentDetail;
	}

	public static class Deployment {

		private String cloudProduct;

		private String domain;

		private String region;

		private Long deployTime;

		private Long id;

		public String getCloudProduct() {
			return this.cloudProduct;
		}

		public void setCloudProduct(String cloudProduct) {
			this.cloudProduct = cloudProduct;
		}

		public String getBizDomain() {
			return this.domain;
		}

		public void setBizDomain(String domain) {
			this.domain = domain;
		}

		/**
		 * @deprecated use getBizDomain instead of this.
		 */
		@Deprecated
		public String getDomain() {
			return this.domain;
		}

		/**
		 * @deprecated use setBizDomain instead of this.
		 */
		@Deprecated
		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public Long getDeployTime() {
			return this.deployTime;
		}

		public void setDeployTime(Long deployTime) {
			this.deployTime = deployTime;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	}

	@Override
	public DescribeDeploymentDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeDeploymentDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
