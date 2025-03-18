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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeElbAvailableResourceInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeElbAvailableResourceInfoResponse extends AcsResponse {

	private String requestId;

	private List<ElbAvailableResourceInfoItem> elbAvailableResourceInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ElbAvailableResourceInfoItem> getElbAvailableResourceInfo() {
		return this.elbAvailableResourceInfo;
	}

	public void setElbAvailableResourceInfo(List<ElbAvailableResourceInfoItem> elbAvailableResourceInfo) {
		this.elbAvailableResourceInfo = elbAvailableResourceInfo;
	}

	public static class ElbAvailableResourceInfoItem {

		private String ensRegionId;

		private String enName;

		private String area;

		private String province;

		private String name;

		private String canBuyCount;

		private List<String> loadBalancerSpec;

		private List<String> ability;

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}

		public String getEnName() {
			return this.enName;
		}

		public void setEnName(String enName) {
			this.enName = enName;
		}

		public String getArea() {
			return this.area;
		}

		public void setArea(String area) {
			this.area = area;
		}

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCanBuyCount() {
			return this.canBuyCount;
		}

		public void setCanBuyCount(String canBuyCount) {
			this.canBuyCount = canBuyCount;
		}

		public List<String> getLoadBalancerSpec() {
			return this.loadBalancerSpec;
		}

		public void setLoadBalancerSpec(List<String> loadBalancerSpec) {
			this.loadBalancerSpec = loadBalancerSpec;
		}

		public List<String> getAbility() {
			return this.ability;
		}

		public void setAbility(List<String> ability) {
			this.ability = ability;
		}
	}

	@Override
	public DescribeElbAvailableResourceInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeElbAvailableResourceInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
