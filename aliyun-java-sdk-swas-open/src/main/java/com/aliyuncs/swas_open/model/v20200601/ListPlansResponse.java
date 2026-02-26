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

package com.aliyuncs.swas_open.model.v20200601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.swas_open.transform.v20200601.ListPlansResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPlansResponse extends AcsResponse {

	private String requestId;

	private List<Plan> plans;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Plan> getPlans() {
		return this.plans;
	}

	public void setPlans(List<Plan> plans) {
		this.plans = plans;
	}

	public static class Plan {

		private Integer core;

		private Integer bandwidth;

		private Integer diskSize;

		private Integer flow;

		private String planId;

		private String diskType;

		private String currency;

		private String supportPlatform;

		private String planType;

		private String publicIpNum;

		private String ispType;

		private Float memory;

		private String originPrice;

		private List<Tag> tags;

		public Integer getCore() {
			return this.core;
		}

		public void setCore(Integer core) {
			this.core = core;
		}

		public Integer getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Integer bandwidth) {
			this.bandwidth = bandwidth;
		}

		public Integer getDiskSize() {
			return this.diskSize;
		}

		public void setDiskSize(Integer diskSize) {
			this.diskSize = diskSize;
		}

		public Integer getFlow() {
			return this.flow;
		}

		public void setFlow(Integer flow) {
			this.flow = flow;
		}

		public String getPlanId() {
			return this.planId;
		}

		public void setPlanId(String planId) {
			this.planId = planId;
		}

		public String getDiskType() {
			return this.diskType;
		}

		public void setDiskType(String diskType) {
			this.diskType = diskType;
		}

		public String getCurrency() {
			return this.currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public String getSupportPlatform() {
			return this.supportPlatform;
		}

		public void setSupportPlatform(String supportPlatform) {
			this.supportPlatform = supportPlatform;
		}

		public String getPlanType() {
			return this.planType;
		}

		public void setPlanType(String planType) {
			this.planType = planType;
		}

		public String getPublicIpNum() {
			return this.publicIpNum;
		}

		public void setPublicIpNum(String publicIpNum) {
			this.publicIpNum = publicIpNum;
		}

		public String getIspType() {
			return this.ispType;
		}

		public void setIspType(String ispType) {
			this.ispType = ispType;
		}

		public Float getMemory() {
			return this.memory;
		}

		public void setMemory(Float memory) {
			this.memory = memory;
		}

		public String getOriginPrice() {
			return this.originPrice;
		}

		public void setOriginPrice(String originPrice) {
			this.originPrice = originPrice;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class Tag {

			private String cnTitle;

			private String enTitle;

			private String color;

			public String getCnTitle() {
				return this.cnTitle;
			}

			public void setCnTitle(String cnTitle) {
				this.cnTitle = cnTitle;
			}

			public String getEnTitle() {
				return this.enTitle;
			}

			public void setEnTitle(String enTitle) {
				this.enTitle = enTitle;
			}

			public String getColor() {
				return this.color;
			}

			public void setColor(String color) {
				this.color = color;
			}
		}
	}

	@Override
	public ListPlansResponse getInstance(UnmarshallerContext context) {
		return	ListPlansResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
