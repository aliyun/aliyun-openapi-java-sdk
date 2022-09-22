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
import com.aliyuncs.ga.transform.v20191120.DescribeListenerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeListenerResponse extends AcsResponse {

	private String description;

	private String requestId;

	private String state;

	private String createTime;

	private String protocol;

	private String listenerId;

	private String clientAffinity;

	private String name;

	private String aclType;

	private String acceleratorId;

	private Boolean proxyProtocol;

	private String securityPolicyId;

	private String type;

	private List<PortRangesItem> portRanges;

	private List<BackendPort> backendPorts;

	private List<Certificate> certificates;

	private List<RelatedAclsItem> relatedAcls;

	private XForwardedForConfig xForwardedForConfig;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getBizProtocol() {
		return this.protocol;
	}

	public void setBizProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getListenerId() {
		return this.listenerId;
	}

	public void setListenerId(String listenerId) {
		this.listenerId = listenerId;
	}

	public String getClientAffinity() {
		return this.clientAffinity;
	}

	public void setClientAffinity(String clientAffinity) {
		this.clientAffinity = clientAffinity;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAclType() {
		return this.aclType;
	}

	public void setAclType(String aclType) {
		this.aclType = aclType;
	}

	public String getAcceleratorId() {
		return this.acceleratorId;
	}

	public void setAcceleratorId(String acceleratorId) {
		this.acceleratorId = acceleratorId;
	}

	public Boolean getProxyProtocol() {
		return this.proxyProtocol;
	}

	public void setProxyProtocol(Boolean proxyProtocol) {
		this.proxyProtocol = proxyProtocol;
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

	public List<PortRangesItem> getPortRanges() {
		return this.portRanges;
	}

	public void setPortRanges(List<PortRangesItem> portRanges) {
		this.portRanges = portRanges;
	}

	public List<BackendPort> getBackendPorts() {
		return this.backendPorts;
	}

	public void setBackendPorts(List<BackendPort> backendPorts) {
		this.backendPorts = backendPorts;
	}

	public List<Certificate> getCertificates() {
		return this.certificates;
	}

	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}

	public List<RelatedAclsItem> getRelatedAcls() {
		return this.relatedAcls;
	}

	public void setRelatedAcls(List<RelatedAclsItem> relatedAcls) {
		this.relatedAcls = relatedAcls;
	}

	public XForwardedForConfig getXForwardedForConfig() {
		return this.xForwardedForConfig;
	}

	public void setXForwardedForConfig(XForwardedForConfig xForwardedForConfig) {
		this.xForwardedForConfig = xForwardedForConfig;
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

	public static class RelatedAclsItem {

		private String aclId;

		private String status;

		public String getAclId() {
			return this.aclId;
		}

		public void setAclId(String aclId) {
			this.aclId = aclId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	public static class XForwardedForConfig {

		private Boolean xForwardedForGaIdEnabled;

		private Boolean xForwardedForGaApEnabled;

		private Boolean xForwardedForProtoEnabled;

		private Boolean xForwardedForPortEnabled;

		private Boolean xRealIpEnabled;

		public Boolean getXForwardedForGaIdEnabled() {
			return this.xForwardedForGaIdEnabled;
		}

		public void setXForwardedForGaIdEnabled(Boolean xForwardedForGaIdEnabled) {
			this.xForwardedForGaIdEnabled = xForwardedForGaIdEnabled;
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

		public Boolean getXRealIpEnabled() {
			return this.xRealIpEnabled;
		}

		public void setXRealIpEnabled(Boolean xRealIpEnabled) {
			this.xRealIpEnabled = xRealIpEnabled;
		}
	}

	@Override
	public DescribeListenerResponse getInstance(UnmarshallerContext context) {
		return	DescribeListenerResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
