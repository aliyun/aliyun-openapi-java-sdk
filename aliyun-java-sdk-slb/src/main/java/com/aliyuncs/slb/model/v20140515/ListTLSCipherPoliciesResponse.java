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

package com.aliyuncs.slb.model.v20140515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.ListTLSCipherPoliciesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTLSCipherPoliciesResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Boolean isTruncated;

	private Integer totalCount;

	private List<TLSCipherPolicy> tLSCipherPolicies;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Boolean getIsTruncated() {
		return this.isTruncated;
	}

	public void setIsTruncated(Boolean isTruncated) {
		this.isTruncated = isTruncated;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<TLSCipherPolicy> getTLSCipherPolicies() {
		return this.tLSCipherPolicies;
	}

	public void setTLSCipherPolicies(List<TLSCipherPolicy> tLSCipherPolicies) {
		this.tLSCipherPolicies = tLSCipherPolicies;
	}

	public static class TLSCipherPolicy {

		private Long createTime;

		private String instanceId;

		private String name;

		private String status;

		private List<RelateListener> relateListeners;

		private List<String> tLSVersions;

		private List<String> ciphers;

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<RelateListener> getRelateListeners() {
			return this.relateListeners;
		}

		public void setRelateListeners(List<RelateListener> relateListeners) {
			this.relateListeners = relateListeners;
		}

		public List<String> getTLSVersions() {
			return this.tLSVersions;
		}

		public void setTLSVersions(List<String> tLSVersions) {
			this.tLSVersions = tLSVersions;
		}

		public List<String> getCiphers() {
			return this.ciphers;
		}

		public void setCiphers(List<String> ciphers) {
			this.ciphers = ciphers;
		}

		public static class RelateListener {

			private String loadBalancerId;

			private Integer port;

			private String protocol;

			public String getLoadBalancerId() {
				return this.loadBalancerId;
			}

			public void setLoadBalancerId(String loadBalancerId) {
				this.loadBalancerId = loadBalancerId;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public String getBizProtocol() {
				return this.protocol;
			}

			public void setBizProtocol(String protocol) {
				this.protocol = protocol;
			}
		}
	}

	@Override
	public ListTLSCipherPoliciesResponse getInstance(UnmarshallerContext context) {
		return	ListTLSCipherPoliciesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
