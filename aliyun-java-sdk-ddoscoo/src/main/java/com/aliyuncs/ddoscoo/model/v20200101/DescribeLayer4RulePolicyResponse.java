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
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeLayer4RulePolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLayer4RulePolicyResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private Integer frontendPort;

	private Integer backendPort;

	private String forwardProtocol;

	private String bakMode;

	private Integer currentIndex;

	private List<PriRealServersItem> priRealServers;

	private List<SecRealServersItem> secRealServers;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
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

	public String getForwardProtocol() {
		return this.forwardProtocol;
	}

	public void setForwardProtocol(String forwardProtocol) {
		this.forwardProtocol = forwardProtocol;
	}

	public String getBakMode() {
		return this.bakMode;
	}

	public void setBakMode(String bakMode) {
		this.bakMode = bakMode;
	}

	public Integer getCurrentIndex() {
		return this.currentIndex;
	}

	public void setCurrentIndex(Integer currentIndex) {
		this.currentIndex = currentIndex;
	}

	public List<PriRealServersItem> getPriRealServers() {
		return this.priRealServers;
	}

	public void setPriRealServers(List<PriRealServersItem> priRealServers) {
		this.priRealServers = priRealServers;
	}

	public List<SecRealServersItem> getSecRealServers() {
		return this.secRealServers;
	}

	public void setSecRealServers(List<SecRealServersItem> secRealServers) {
		this.secRealServers = secRealServers;
	}

	public static class PriRealServersItem {

		private String instanceId;

		private String eip;

		private Integer frontendPort;

		private String protocol;

		private String realServer;

		private Integer currentIndex;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getEip() {
			return this.eip;
		}

		public void setEip(String eip) {
			this.eip = eip;
		}

		public Integer getFrontendPort() {
			return this.frontendPort;
		}

		public void setFrontendPort(Integer frontendPort) {
			this.frontendPort = frontendPort;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getRealServer() {
			return this.realServer;
		}

		public void setRealServer(String realServer) {
			this.realServer = realServer;
		}

		public Integer getCurrentIndex() {
			return this.currentIndex;
		}

		public void setCurrentIndex(Integer currentIndex) {
			this.currentIndex = currentIndex;
		}
	}

	public static class SecRealServersItem {

		private String instanceId;

		private String eip;

		private Integer frontendPort;

		private String protocol;

		private String realServer;

		private Integer currentIndex;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getEip() {
			return this.eip;
		}

		public void setEip(String eip) {
			this.eip = eip;
		}

		public Integer getFrontendPort() {
			return this.frontendPort;
		}

		public void setFrontendPort(Integer frontendPort) {
			this.frontendPort = frontendPort;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getRealServer() {
			return this.realServer;
		}

		public void setRealServer(String realServer) {
			this.realServer = realServer;
		}

		public Integer getCurrentIndex() {
			return this.currentIndex;
		}

		public void setCurrentIndex(Integer currentIndex) {
			this.currentIndex = currentIndex;
		}
	}

	@Override
	public DescribeLayer4RulePolicyResponse getInstance(UnmarshallerContext context) {
		return	DescribeLayer4RulePolicyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
