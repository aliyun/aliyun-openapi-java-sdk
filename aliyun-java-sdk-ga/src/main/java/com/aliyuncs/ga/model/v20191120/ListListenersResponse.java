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

package com.aliyuncs.ga.model.v20191120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ga.transform.v20191120.ListListenersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListListenersResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<ListenersItem> listeners;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<ListenersItem> getListeners() {
		return this.listeners;
	}

	public void setListeners(List<ListenersItem> listeners) {
		this.listeners = listeners;
	}

	public static class ListenersItem {

		private String listenerId;

		private String description;

		private String state;

		private String clientAffinity;

		private String protocol;

		private Long createTime;

		private String name;

		private Boolean proxyProtocol;

		private String acceleratorId;

		private String securityPolicyId;

		private String type;

		private List<Certificate> certificates;

		private List<BackendPort> backendPorts;

		private List<PortRangesItem> portRanges;

		private XForwardedForConfig xForwardedForConfig;

		public String getListenerId() {
			return this.listenerId;
		}

		public void setListenerId(String listenerId) {
			this.listenerId = listenerId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getClientAffinity() {
			return this.clientAffinity;
		}

		public void setClientAffinity(String clientAffinity) {
			this.clientAffinity = clientAffinity;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getProxyProtocol() {
			return this.proxyProtocol;
		}

		public void setProxyProtocol(Boolean proxyProtocol) {
			this.proxyProtocol = proxyProtocol;
		}

		public String getAcceleratorId() {
			return this.acceleratorId;
		}

		public void setAcceleratorId(String acceleratorId) {
			this.acceleratorId = acceleratorId;
		}

		public String getSecurityPolicyId() {
			return this.securityPolicyId;
		}

		public void setSecurityPolicyId(String securityPolicyId) {
			this.securityPolicyId = securityPolicyId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<Certificate> getCertificates() {
			return this.certificates;
		}

		public void setCertificates(List<Certificate> certificates) {
			this.certificates = certificates;
		}

		public List<BackendPort> getBackendPorts() {
			return this.backendPorts;
		}

		public void setBackendPorts(List<BackendPort> backendPorts) {
			this.backendPorts = backendPorts;
		}

		public List<PortRangesItem> getPortRanges() {
			return this.portRanges;
		}

		public void setPortRanges(List<PortRangesItem> portRanges) {
			this.portRanges = portRanges;
		}

		public XForwardedForConfig getXForwardedForConfig() {
			return this.xForwardedForConfig;
		}

		public void setXForwardedForConfig(XForwardedForConfig xForwardedForConfig) {
			this.xForwardedForConfig = xForwardedForConfig;
		}

		public static class Certificate {

			private String type;

			private String id;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}

		public static class BackendPort {

			private String fromPort;

			private String toPort;

			public String getFromPort() {
				return this.fromPort;
			}

			public void setFromPort(String fromPort) {
				this.fromPort = fromPort;
			}

			public String getToPort() {
				return this.toPort;
			}

			public void setToPort(String toPort) {
				this.toPort = toPort;
			}
		}

		public static class PortRangesItem {

			private Integer fromPort;

			private Integer toPort;

			public Integer getFromPort() {
				return this.fromPort;
			}

			public void setFromPort(Integer fromPort) {
				this.fromPort = fromPort;
			}

			public Integer getToPort() {
				return this.toPort;
			}

			public void setToPort(Integer toPort) {
				this.toPort = toPort;
			}
		}

		public static class XForwardedForConfig {

			private Boolean xForwardedForGaIdEnabled;

			private Boolean xRealIpEnabled;

			private Boolean xForwardedForGaApEnabled;

			private Boolean xForwardedForProtoEnabled;

			private Boolean xForwardedForPortEnabled;

			public Boolean getXForwardedForGaIdEnabled() {
				return this.xForwardedForGaIdEnabled;
			}

			public void setXForwardedForGaIdEnabled(Boolean xForwardedForGaIdEnabled) {
				this.xForwardedForGaIdEnabled = xForwardedForGaIdEnabled;
			}

			public Boolean getXRealIpEnabled() {
				return this.xRealIpEnabled;
			}

			public void setXRealIpEnabled(Boolean xRealIpEnabled) {
				this.xRealIpEnabled = xRealIpEnabled;
			}

			public Boolean getXForwardedForGaApEnabled() {
				return this.xForwardedForGaApEnabled;
			}

			public void setXForwardedForGaApEnabled(Boolean xForwardedForGaApEnabled) {
				this.xForwardedForGaApEnabled = xForwardedForGaApEnabled;
			}

			public Boolean getXForwardedForProtoEnabled() {
				return this.xForwardedForProtoEnabled;
			}

			public void setXForwardedForProtoEnabled(Boolean xForwardedForProtoEnabled) {
				this.xForwardedForProtoEnabled = xForwardedForProtoEnabled;
			}

			public Boolean getXForwardedForPortEnabled() {
				return this.xForwardedForPortEnabled;
			}

			public void setXForwardedForPortEnabled(Boolean xForwardedForPortEnabled) {
				this.xForwardedForPortEnabled = xForwardedForPortEnabled;
			}
		}
	}

	@Override
	public ListListenersResponse getInstance(UnmarshallerContext context) {
		return	ListListenersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
