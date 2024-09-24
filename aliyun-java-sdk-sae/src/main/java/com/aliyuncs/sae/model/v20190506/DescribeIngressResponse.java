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

package com.aliyuncs.sae.model.v20190506;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sae.transform.v20190506.DescribeIngressResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeIngressResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String traceId;

	private String errorCode;

	private String code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String slbId;

		private String namespaceId;

		private String description;

		private Integer listenerPort;

		private String slbType;

		private String certId;

		private String name;

		private Long id;

		private String loadBalanceType;

		private String listenerProtocol;

		private String certIds;

		private String securityPolicyId;

		private Integer requestTimeout;

		private Integer idleTimeout;

		private List<Rule> rules;

		private List<Svc> svcs;

		private DefaultRule defaultRule;

		public String getSlbId() {
			return this.slbId;
		}

		public void setSlbId(String slbId) {
			this.slbId = slbId;
		}

		public String getNamespaceId() {
			return this.namespaceId;
		}

		public void setNamespaceId(String namespaceId) {
			this.namespaceId = namespaceId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getListenerPort() {
			return this.listenerPort;
		}

		public void setListenerPort(Integer listenerPort) {
			this.listenerPort = listenerPort;
		}

		public String getSlbType() {
			return this.slbType;
		}

		public void setSlbType(String slbType) {
			this.slbType = slbType;
		}

		public String getCertId() {
			return this.certId;
		}

		public void setCertId(String certId) {
			this.certId = certId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getLoadBalanceType() {
			return this.loadBalanceType;
		}

		public void setLoadBalanceType(String loadBalanceType) {
			this.loadBalanceType = loadBalanceType;
		}

		public String getListenerProtocol() {
			return this.listenerProtocol;
		}

		public void setListenerProtocol(String listenerProtocol) {
			this.listenerProtocol = listenerProtocol;
		}

		public String getCertIds() {
			return this.certIds;
		}

		public void setCertIds(String certIds) {
			this.certIds = certIds;
		}

		public String getSecurityPolicyId() {
			return this.securityPolicyId;
		}

		public void setSecurityPolicyId(String securityPolicyId) {
			this.securityPolicyId = securityPolicyId;
		}

		public Integer getRequestTimeout() {
			return this.requestTimeout;
		}

		public void setRequestTimeout(Integer requestTimeout) {
			this.requestTimeout = requestTimeout;
		}

		public Integer getIdleTimeout() {
			return this.idleTimeout;
		}

		public void setIdleTimeout(Integer idleTimeout) {
			this.idleTimeout = idleTimeout;
		}

		public List<Rule> getRules() {
			return this.rules;
		}

		public void setRules(List<Rule> rules) {
			this.rules = rules;
		}

		public List<Svc> getSvcs() {
			return this.svcs;
		}

		public void setSvcs(List<Svc> svcs) {
			this.svcs = svcs;
		}

		public DefaultRule getDefaultRule() {
			return this.defaultRule;
		}

		public void setDefaultRule(DefaultRule defaultRule) {
			this.defaultRule = defaultRule;
		}

		public static class Rule {

			private String appName;

			private Integer containerPort;

			private String domain;

			private String appId;

			private String path;

			private String backendProtocol;

			private String rewritePath;

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public Integer getContainerPort() {
				return this.containerPort;
			}

			public void setContainerPort(Integer containerPort) {
				this.containerPort = containerPort;
			}

			public String getDomain() {
				return this.domain;
			}

			public void setDomain(String domain) {
				this.domain = domain;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}

			public String getBackendProtocol() {
				return this.backendProtocol;
			}

			public void setBackendProtocol(String backendProtocol) {
				this.backendProtocol = backendProtocol;
			}

			public String getRewritePath() {
				return this.rewritePath;
			}

			public void setRewritePath(String rewritePath) {
				this.rewritePath = rewritePath;
			}
		}

		public static class Svc {

			private Long id;

			private String appId;

			private String backendProtocol;

			private Integer backendPort;

			private String name;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getBackendProtocol() {
				return this.backendProtocol;
			}

			public void setBackendProtocol(String backendProtocol) {
				this.backendProtocol = backendProtocol;
			}

			public Integer getBackendPort() {
				return this.backendPort;
			}

			public void setBackendPort(Integer backendPort) {
				this.backendPort = backendPort;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class DefaultRule {

			private Integer containerPort;

			private String appName;

			private String appId;

			private String backendProtocol;

			public Integer getContainerPort() {
				return this.containerPort;
			}

			public void setContainerPort(Integer containerPort) {
				this.containerPort = containerPort;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getBackendProtocol() {
				return this.backendProtocol;
			}

			public void setBackendProtocol(String backendProtocol) {
				this.backendProtocol = backendProtocol;
			}
		}
	}

	@Override
	public DescribeIngressResponse getInstance(UnmarshallerContext context) {
		return	DescribeIngressResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
