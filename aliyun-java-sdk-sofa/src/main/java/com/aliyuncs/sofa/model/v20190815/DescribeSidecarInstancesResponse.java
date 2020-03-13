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
import com.aliyuncs.sofa.transform.v20190815.DescribeSidecarInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSidecarInstancesResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long totalCnt;

	private List<ItemsItem> items;

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

	public Long getTotalCnt() {
		return this.totalCnt;
	}

	public void setTotalCnt(Long totalCnt) {
		this.totalCnt = totalCnt;
	}

	public List<ItemsItem> getItems() {
		return this.items;
	}

	public void setItems(List<ItemsItem> items) {
		this.items = items;
	}

	public static class ItemsItem {

		private String appServiceName;

		private String clustername;

		private String createdTime;

		private String name;

		private String namespace;

		private String podIp;

		private String podName;

		private String podStatus;

		private String sidecarStatus;

		private String sidecarType;

		private String sidecarVersion;

		private String type;

		public String getAppServiceName() {
			return this.appServiceName;
		}

		public void setAppServiceName(String appServiceName) {
			this.appServiceName = appServiceName;
		}

		public String getClustername() {
			return this.clustername;
		}

		public void setClustername(String clustername) {
			this.clustername = clustername;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getPodIp() {
			return this.podIp;
		}

		public void setPodIp(String podIp) {
			this.podIp = podIp;
		}

		public String getPodName() {
			return this.podName;
		}

		public void setPodName(String podName) {
			this.podName = podName;
		}

		public String getPodStatus() {
			return this.podStatus;
		}

		public void setPodStatus(String podStatus) {
			this.podStatus = podStatus;
		}

		public String getSidecarStatus() {
			return this.sidecarStatus;
		}

		public void setSidecarStatus(String sidecarStatus) {
			this.sidecarStatus = sidecarStatus;
		}

		public String getSidecarType() {
			return this.sidecarType;
		}

		public void setSidecarType(String sidecarType) {
			this.sidecarType = sidecarType;
		}

		public String getSidecarVersion() {
			return this.sidecarVersion;
		}

		public void setSidecarVersion(String sidecarVersion) {
			this.sidecarVersion = sidecarVersion;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public DescribeSidecarInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeSidecarInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
