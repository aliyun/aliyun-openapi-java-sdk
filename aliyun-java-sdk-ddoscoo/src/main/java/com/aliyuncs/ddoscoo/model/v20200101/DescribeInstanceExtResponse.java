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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeInstanceExtResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceExtResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private List<InstanceExtSpecsItem> instanceExtSpecs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<InstanceExtSpecsItem> getInstanceExtSpecs() {
		return this.instanceExtSpecs;
	}

	public void setInstanceExtSpecs(List<InstanceExtSpecsItem> instanceExtSpecs) {
		this.instanceExtSpecs = instanceExtSpecs;
	}

	public static class InstanceExtSpecsItem {

		private String instanceId;

		private Long normalBandwidth;

		private Long functionVersion;

		private String servicePartner;

		private Long productPlan;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getNormalBandwidth() {
			return this.normalBandwidth;
		}

		public void setNormalBandwidth(Long normalBandwidth) {
			this.normalBandwidth = normalBandwidth;
		}

		public Long getFunctionVersion() {
			return this.functionVersion;
		}

		public void setFunctionVersion(Long functionVersion) {
			this.functionVersion = functionVersion;
		}

		public String getServicePartner() {
			return this.servicePartner;
		}

		public void setServicePartner(String servicePartner) {
			this.servicePartner = servicePartner;
		}

		public Long getProductPlan() {
			return this.productPlan;
		}

		public void setProductPlan(Long productPlan) {
			this.productPlan = productPlan;
		}
	}

	@Override
	public DescribeInstanceExtResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceExtResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
