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

package com.aliyuncs.nlb.model.v20220430;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nlb.transform.v20220430.ListSecurityPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSecurityPolicyResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private String dynamicCode;

	private String dynamicMessage;

	private Integer totalCount;

	private String nextToken;

	private Integer maxResults;

	private List<SecurityPolicie> securityPolicies;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<SecurityPolicie> getSecurityPolicies() {
		return this.securityPolicies;
	}

	public void setSecurityPolicies(List<SecurityPolicie> securityPolicies) {
		this.securityPolicies = securityPolicies;
	}

	public static class SecurityPolicie {

		private String securityPolicyId;

		private String securityPolicyName;

		private String tlsVersion;

		private String ciphers;

		private String regionId;

		private String resourceGroupId;

		private String securityPolicyStatus;

		private List<Tag> tags;

		private List<RelatedListener> relatedListeners;

		public String getSecurityPolicyId() {
			return this.securityPolicyId;
		}

		public void setSecurityPolicyId(String securityPolicyId) {
			this.securityPolicyId = securityPolicyId;
		}

		public String getSecurityPolicyName() {
			return this.securityPolicyName;
		}

		public void setSecurityPolicyName(String securityPolicyName) {
			this.securityPolicyName = securityPolicyName;
		}

		public String getTlsVersion() {
			return this.tlsVersion;
		}

		public void setTlsVersion(String tlsVersion) {
			this.tlsVersion = tlsVersion;
		}

		public String getCiphers() {
			return this.ciphers;
		}

		public void setCiphers(String ciphers) {
			this.ciphers = ciphers;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getSecurityPolicyStatus() {
			return this.securityPolicyStatus;
		}

		public void setSecurityPolicyStatus(String securityPolicyStatus) {
			this.securityPolicyStatus = securityPolicyStatus;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<RelatedListener> getRelatedListeners() {
			return this.relatedListeners;
		}

		public void setRelatedListeners(List<RelatedListener> relatedListeners) {
			this.relatedListeners = relatedListeners;
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

		public static class RelatedListener {

			private String listenerId;

			private Long listenerPort;

			private String listenerProtocol;

			private String loadBalancerId;

			public String getListenerId() {
				return this.listenerId;
			}

			public void setListenerId(String listenerId) {
				this.listenerId = listenerId;
			}

			public Long getListenerPort() {
				return this.listenerPort;
			}

			public void setListenerPort(Long listenerPort) {
				this.listenerPort = listenerPort;
			}

			public String getListenerProtocol() {
				return this.listenerProtocol;
			}

			public void setListenerProtocol(String listenerProtocol) {
				this.listenerProtocol = listenerProtocol;
			}

			public String getLoadBalancerId() {
				return this.loadBalancerId;
			}

			public void setLoadBalancerId(String loadBalancerId) {
				this.loadBalancerId = loadBalancerId;
			}
		}
	}

	@Override
	public ListSecurityPolicyResponse getInstance(UnmarshallerContext context) {
		return	ListSecurityPolicyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
