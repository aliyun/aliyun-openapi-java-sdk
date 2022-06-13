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
import com.aliyuncs.cc5g.transform.v20220314.ListWirelessCloudConnectorsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListWirelessCloudConnectorsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private String maxResults;

	private String totalCount;

	private List<WirelessCloudConnector> wirelessCloudConnectors;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(String maxResults) {
		this.maxResults = maxResults;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<WirelessCloudConnector> getWirelessCloudConnectors() {
		return this.wirelessCloudConnectors;
	}

	public void setWirelessCloudConnectors(List<WirelessCloudConnector> wirelessCloudConnectors) {
		this.wirelessCloudConnectors = wirelessCloudConnectors;
	}

	public static class WirelessCloudConnector {

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
	}

	@Override
	public ListWirelessCloudConnectorsResponse getInstance(UnmarshallerContext context) {
		return	ListWirelessCloudConnectorsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
