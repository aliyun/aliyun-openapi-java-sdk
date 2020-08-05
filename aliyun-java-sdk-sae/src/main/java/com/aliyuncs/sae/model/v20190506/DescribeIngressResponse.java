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

	private String code;

	private String message;

	private Boolean success;

	private String errorCode;

	private String traceId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long id;

		private String name;

		private String namespaceId;

		private String description;

		private String slbId;

		private Integer listenerPort;

		private String certId;

		private String slbType;

		private List<Rule> rules;

		private DefaultRule defaultRule;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
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

		public String getSlbId() {
			return this.slbId;
		}

		public void setSlbId(String slbId) {
			this.slbId = slbId;
		}

		public Integer getListenerPort() {
			return this.listenerPort;
		}

		public void setListenerPort(Integer listenerPort) {
			this.listenerPort = listenerPort;
		}

		public String getCertId() {
			return this.certId;
		}

		public void setCertId(String certId) {
			this.certId = certId;
		}

		public String getSlbType() {
			return this.slbType;
		}

		public void setSlbType(String slbType) {
			this.slbType = slbType;
		}

		public List<Rule> getRules() {
			return this.rules;
		}

		public void setRules(List<Rule> rules) {
			this.rules = rules;
		}

		public DefaultRule getDefaultRule() {
			return this.defaultRule;
		}

		public void setDefaultRule(DefaultRule defaultRule) {
			this.defaultRule = defaultRule;
		}

		public static class Rule {

			private String appId;

			private Integer containerPort;

			private String domain;

			private String path;

			private String appName;

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
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

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}
		}

		public static class DefaultRule {

			private String appId;

			private Integer containerPort;

			private String appName;

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

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
