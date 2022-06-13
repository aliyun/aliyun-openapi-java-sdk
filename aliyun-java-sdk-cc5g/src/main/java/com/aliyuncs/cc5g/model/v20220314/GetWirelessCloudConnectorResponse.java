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

package com.aliyuncs.cc5g.model.v20220314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cc5g.transform.v20220314.GetWirelessCloudConnectorResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetWirelessCloudConnectorResponse extends AcsResponse {

	private String requestId;

	private String wirelessCloudConnectorId;

	private String status;

	private String name;

	private String description;

	private String regionId;

	private String useCase;

	private String dataPackageId;

	private String dataPackageType;

	private String cardCount;

	private String createTime;

	private List<NetLink> netLinks;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getWirelessCloudConnectorId() {
		return this.wirelessCloudConnectorId;
	}

	public void setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
		this.wirelessCloudConnectorId = wirelessCloudConnectorId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getUseCase() {
		return this.useCase;
	}

	public void setUseCase(String useCase) {
		this.useCase = useCase;
	}

	public String getDataPackageId() {
		return this.dataPackageId;
	}

	public void setDataPackageId(String dataPackageId) {
		this.dataPackageId = dataPackageId;
	}

	public String getDataPackageType() {
		return this.dataPackageType;
	}

	public void setDataPackageType(String dataPackageType) {
		this.dataPackageType = dataPackageType;
	}

	public String getCardCount() {
		return this.cardCount;
	}

	public void setCardCount(String cardCount) {
		this.cardCount = cardCount;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public List<NetLink> getNetLinks() {
		return this.netLinks;
	}

	public void setNetLinks(List<NetLink> netLinks) {
		this.netLinks = netLinks;
	}

	public static class NetLink {

		private String regionId;

		private String netLinkId;

		private String name;

		private String description;

		private String status;

		private String aPN;

		private String iSP;

		private String vpcId;

		private String createTime;

		private List<String> vSwitchs;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getNetLinkId() {
			return this.netLinkId;
		}

		public void setNetLinkId(String netLinkId) {
			this.netLinkId = netLinkId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getAPN() {
			return this.aPN;
		}

		public void setAPN(String aPN) {
			this.aPN = aPN;
		}

		public String getISP() {
			return this.iSP;
		}

		public void setISP(String iSP) {
			this.iSP = iSP;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public List<String> getVSwitchs() {
			return this.vSwitchs;
		}

		public void setVSwitchs(List<String> vSwitchs) {
			this.vSwitchs = vSwitchs;
		}
	}

	@Override
	public GetWirelessCloudConnectorResponse getInstance(UnmarshallerContext context) {
		return	GetWirelessCloudConnectorResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
