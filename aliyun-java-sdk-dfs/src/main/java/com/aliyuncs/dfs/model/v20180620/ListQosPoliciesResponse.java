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

package com.aliyuncs.dfs.model.v20180620;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dfs.transform.v20180620.ListQosPoliciesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListQosPoliciesResponse extends AcsResponse {

	private String requestId;

	private List<QosPolicy> qosPolicies;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<QosPolicy> getQosPolicies() {
		return this.qosPolicies;
	}

	public void setQosPolicies(List<QosPolicy> qosPolicies) {
		this.qosPolicies = qosPolicies;
	}

	public static class QosPolicy {

		private String qosPolicyId;

		private String fileSystemId;

		private String federationId;

		private String description;

		private String flowIds;

		private String zoneIds;

		private Long maxMetaQps;

		private Long maxIOps;

		private Long maxIOBandWidth;

		public String getQosPolicyId() {
			return this.qosPolicyId;
		}

		public void setQosPolicyId(String qosPolicyId) {
			this.qosPolicyId = qosPolicyId;
		}

		public String getFileSystemId() {
			return this.fileSystemId;
		}

		public void setFileSystemId(String fileSystemId) {
			this.fileSystemId = fileSystemId;
		}

		public String getFederationId() {
			return this.federationId;
		}

		public void setFederationId(String federationId) {
			this.federationId = federationId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getFlowIds() {
			return this.flowIds;
		}

		public void setFlowIds(String flowIds) {
			this.flowIds = flowIds;
		}

		public String getZoneIds() {
			return this.zoneIds;
		}

		public void setZoneIds(String zoneIds) {
			this.zoneIds = zoneIds;
		}

		public Long getMaxMetaQps() {
			return this.maxMetaQps;
		}

		public void setMaxMetaQps(Long maxMetaQps) {
			this.maxMetaQps = maxMetaQps;
		}

		public Long getMaxIOps() {
			return this.maxIOps;
		}

		public void setMaxIOps(Long maxIOps) {
			this.maxIOps = maxIOps;
		}

		public Long getMaxIOBandWidth() {
			return this.maxIOBandWidth;
		}

		public void setMaxIOBandWidth(Long maxIOBandWidth) {
			this.maxIOBandWidth = maxIOBandWidth;
		}
	}

	@Override
	public ListQosPoliciesResponse getInstance(UnmarshallerContext context) {
		return	ListQosPoliciesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
