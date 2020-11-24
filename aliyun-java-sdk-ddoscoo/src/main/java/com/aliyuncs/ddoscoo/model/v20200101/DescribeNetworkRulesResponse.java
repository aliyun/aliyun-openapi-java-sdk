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
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeNetworkRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNetworkRulesResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private List<NetworkRule> networkRules;

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

	public List<NetworkRule> getNetworkRules() {
		return this.networkRules;
	}

	public void setNetworkRules(List<NetworkRule> networkRules) {
		this.networkRules = networkRules;
	}

	public static class NetworkRule {

		private String instanceId;

		private String protocol;

		private Integer frontendPort;

		private Integer backendPort;

		private Boolean isAutoCreate;

		private List<String> realServers;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public Integer getFrontendPort() {
			return this.frontendPort;
		}

		public void setFrontendPort(Integer frontendPort) {
			this.frontendPort = frontendPort;
		}

		public Integer getBackendPort() {
			return this.backendPort;
		}

		public void setBackendPort(Integer backendPort) {
			this.backendPort = backendPort;
		}

		public Boolean getIsAutoCreate() {
			return this.isAutoCreate;
		}

		public void setIsAutoCreate(Boolean isAutoCreate) {
			this.isAutoCreate = isAutoCreate;
		}

		public List<String> getRealServers() {
			return this.realServers;
		}

		public void setRealServers(List<String> realServers) {
			this.realServers = realServers;
		}
	}

	@Override
	public DescribeNetworkRulesResponse getInstance(UnmarshallerContext context) {
		return	DescribeNetworkRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
