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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.ListMsSgServicePubsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMsSgServicePubsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private List<PublishersItem> publishers;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public List<PublishersItem> getPublishers() {
		return this.publishers;
	}

	public void setPublishers(List<PublishersItem> publishers) {
		this.publishers = publishers;
	}

	public static class PublishersItem {

		private Boolean alive;

		private String appName;

		private String appVersion;

		private String checkSum;

		private String configWeight;

		private String content;

		private String dataId;

		private String hostIp;

		private Long id;

		private String instanceId;

		private Boolean mosn;

		private String processId;

		private String protocol;

		private String serviceIp;

		private Long servicePort;

		private Boolean status;

		private Long timeout;

		private Boolean vmMode;

		private Long weight;

		private String zone;

		public Boolean getAlive() {
			return this.alive;
		}

		public void setAlive(Boolean alive) {
			this.alive = alive;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getAppVersion() {
			return this.appVersion;
		}

		public void setAppVersion(String appVersion) {
			this.appVersion = appVersion;
		}

		public String getCheckSum() {
			return this.checkSum;
		}

		public void setCheckSum(String checkSum) {
			this.checkSum = checkSum;
		}

		public String getConfigWeight() {
			return this.configWeight;
		}

		public void setConfigWeight(String configWeight) {
			this.configWeight = configWeight;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getDataId() {
			return this.dataId;
		}

		public void setDataId(String dataId) {
			this.dataId = dataId;
		}

		public String getHostIp() {
			return this.hostIp;
		}

		public void setHostIp(String hostIp) {
			this.hostIp = hostIp;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Boolean getMosn() {
			return this.mosn;
		}

		public void setMosn(Boolean mosn) {
			this.mosn = mosn;
		}

		public String getProcessId() {
			return this.processId;
		}

		public void setProcessId(String processId) {
			this.processId = processId;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getServiceIp() {
			return this.serviceIp;
		}

		public void setServiceIp(String serviceIp) {
			this.serviceIp = serviceIp;
		}

		public Long getServicePort() {
			return this.servicePort;
		}

		public void setServicePort(Long servicePort) {
			this.servicePort = servicePort;
		}

		public Boolean getStatus() {
			return this.status;
		}

		public void setStatus(Boolean status) {
			this.status = status;
		}

		public Long getTimeout() {
			return this.timeout;
		}

		public void setTimeout(Long timeout) {
			this.timeout = timeout;
		}

		public Boolean getVmMode() {
			return this.vmMode;
		}

		public void setVmMode(Boolean vmMode) {
			this.vmMode = vmMode;
		}

		public Long getWeight() {
			return this.weight;
		}

		public void setWeight(Long weight) {
			this.weight = weight;
		}

		public String getZone() {
			return this.zone;
		}

		public void setZone(String zone) {
			this.zone = zone;
		}
	}

	@Override
	public ListMsSgServicePubsResponse getInstance(UnmarshallerContext context) {
		return	ListMsSgServicePubsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
