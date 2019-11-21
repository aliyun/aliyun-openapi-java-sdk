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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeDomainDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainDetailResponse extends AcsResponse {

	private String requestId;

	private String domain;

	private String rootDomain;

	private List<DomainDetailItem> domainDetailItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getRootDomain() {
		return this.rootDomain;
	}

	public void setRootDomain(String rootDomain) {
		this.rootDomain = rootDomain;
	}

	public List<DomainDetailItem> getDomainDetailItems() {
		return this.domainDetailItems;
	}

	public void setDomainDetailItems(List<DomainDetailItem> domainDetailItems) {
		this.domainDetailItems = domainDetailItems;
	}

	public static class DomainDetailItem {

		private String internetIp;

		private String instanceId;

		private String uuid;

		private String assetType;

		private String instanceName;

		private String machineIp;

		private String intranetIp;

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getAssetType() {
			return this.assetType;
		}

		public void setAssetType(String assetType) {
			this.assetType = assetType;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getMachineIp() {
			return this.machineIp;
		}

		public void setMachineIp(String machineIp) {
			this.machineIp = machineIp;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}
	}

	@Override
	public DescribeDomainDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
