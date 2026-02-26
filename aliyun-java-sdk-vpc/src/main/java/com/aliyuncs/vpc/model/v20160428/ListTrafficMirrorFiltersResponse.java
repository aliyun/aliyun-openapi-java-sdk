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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.ListTrafficMirrorFiltersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTrafficMirrorFiltersResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private String totalCount;

	private Integer maxResults;

	private Integer count;

	private List<TrafficMirrorFilter> trafficMirrorFilters;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<TrafficMirrorFilter> getTrafficMirrorFilters() {
		return this.trafficMirrorFilters;
	}

	public void setTrafficMirrorFilters(List<TrafficMirrorFilter> trafficMirrorFilters) {
		this.trafficMirrorFilters = trafficMirrorFilters;
	}

	public static class TrafficMirrorFilter {

		private String trafficMirrorFilterStatus;

		private String trafficMirrorFilterDescription;

		private String trafficMirrorFilterId;

		private String trafficMirrorFilterName;

		private String resourceGroupId;

		private String creationTime;

		private List<TrafficMirrorRule> ingressRules;

		private List<TrafficMirrorRule> egressRules;

		private List<Tag> tags;

		public String getTrafficMirrorFilterStatus() {
			return this.trafficMirrorFilterStatus;
		}

		public void setTrafficMirrorFilterStatus(String trafficMirrorFilterStatus) {
			this.trafficMirrorFilterStatus = trafficMirrorFilterStatus;
		}

		public String getTrafficMirrorFilterDescription() {
			return this.trafficMirrorFilterDescription;
		}

		public void setTrafficMirrorFilterDescription(String trafficMirrorFilterDescription) {
			this.trafficMirrorFilterDescription = trafficMirrorFilterDescription;
		}

		public String getTrafficMirrorFilterId() {
			return this.trafficMirrorFilterId;
		}

		public void setTrafficMirrorFilterId(String trafficMirrorFilterId) {
			this.trafficMirrorFilterId = trafficMirrorFilterId;
		}

		public String getTrafficMirrorFilterName() {
			return this.trafficMirrorFilterName;
		}

		public void setTrafficMirrorFilterName(String trafficMirrorFilterName) {
			this.trafficMirrorFilterName = trafficMirrorFilterName;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public List<TrafficMirrorRule> getIngressRules() {
			return this.ingressRules;
		}

		public void setIngressRules(List<TrafficMirrorRule> ingressRules) {
			this.ingressRules = ingressRules;
		}

		public List<TrafficMirrorRule> getEgressRules() {
			return this.egressRules;
		}

		public void setEgressRules(List<TrafficMirrorRule> egressRules) {
			this.egressRules = egressRules;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class TrafficMirrorRule {

			private String trafficMirrorFilterRuleStatus;

			private String action;

			private String sourceCidrBlock;

			private String trafficDirection;

			private String protocol;

			private String ipVersion;

			private String destinationPortRange;

			private String trafficMirrorFilterRuleId;

			private String destinationCidrBlock;

			private Integer priority;

			private String trafficMirrorFilterId;

			private String sourcePortRange;

			public String getTrafficMirrorFilterRuleStatus() {
				return this.trafficMirrorFilterRuleStatus;
			}

			public void setTrafficMirrorFilterRuleStatus(String trafficMirrorFilterRuleStatus) {
				this.trafficMirrorFilterRuleStatus = trafficMirrorFilterRuleStatus;
			}

			public String getAction() {
				return this.action;
			}

			public void setAction(String action) {
				this.action = action;
			}

			public String getSourceCidrBlock() {
				return this.sourceCidrBlock;
			}

			public void setSourceCidrBlock(String sourceCidrBlock) {
				this.sourceCidrBlock = sourceCidrBlock;
			}

			public String getTrafficDirection() {
				return this.trafficDirection;
			}

			public void setTrafficDirection(String trafficDirection) {
				this.trafficDirection = trafficDirection;
			}

			public String getBizProtocol() {
				return this.protocol;
			}

			public void setBizProtocol(String protocol) {
				this.protocol = protocol;
			}

			public String getIpVersion() {
				return this.ipVersion;
			}

			public void setIpVersion(String ipVersion) {
				this.ipVersion = ipVersion;
			}

			public String getDestinationPortRange() {
				return this.destinationPortRange;
			}

			public void setDestinationPortRange(String destinationPortRange) {
				this.destinationPortRange = destinationPortRange;
			}

			public String getTrafficMirrorFilterRuleId() {
				return this.trafficMirrorFilterRuleId;
			}

			public void setTrafficMirrorFilterRuleId(String trafficMirrorFilterRuleId) {
				this.trafficMirrorFilterRuleId = trafficMirrorFilterRuleId;
			}

			public String getDestinationCidrBlock() {
				return this.destinationCidrBlock;
			}

			public void setDestinationCidrBlock(String destinationCidrBlock) {
				this.destinationCidrBlock = destinationCidrBlock;
			}

			public Integer getPriority() {
				return this.priority;
			}

			public void setPriority(Integer priority) {
				this.priority = priority;
			}

			public String getTrafficMirrorFilterId() {
				return this.trafficMirrorFilterId;
			}

			public void setTrafficMirrorFilterId(String trafficMirrorFilterId) {
				this.trafficMirrorFilterId = trafficMirrorFilterId;
			}

			public String getSourcePortRange() {
				return this.sourcePortRange;
			}

			public void setSourcePortRange(String sourcePortRange) {
				this.sourcePortRange = sourcePortRange;
			}
		}

		public static class Tag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public ListTrafficMirrorFiltersResponse getInstance(UnmarshallerContext context) {
		return	ListTrafficMirrorFiltersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
