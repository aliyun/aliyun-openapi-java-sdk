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
import com.aliyuncs.cc5g.transform.v20220314.ListBatchOperateCardsTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBatchOperateCardsTasksResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private String maxResults;

	private String totalCount;

	private List<BatchOperateCardsTask> batchOperateCardsTasks;

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

	public List<BatchOperateCardsTask> getBatchOperateCardsTasks() {
		return this.batchOperateCardsTasks;
	}

	public void setBatchOperateCardsTasks(List<BatchOperateCardsTask> batchOperateCardsTasks) {
		this.batchOperateCardsTasks = batchOperateCardsTasks;
	}

	public static class BatchOperateCardsTask {

		private String batchOperateCardsTaskId;

		private String status;

		private String operateType;

		private String threshold;

		private String effectType;

		private String iccidsOssFilePath;

		private Boolean operateResultOssFilePath;

		private String description;

		private String name;

		private String createTime;

		private List<WirelessCloudConnector> wirelessCloudConnectors;

		public String getBatchOperateCardsTaskId() {
			return this.batchOperateCardsTaskId;
		}

		public void setBatchOperateCardsTaskId(String batchOperateCardsTaskId) {
			this.batchOperateCardsTaskId = batchOperateCardsTaskId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getOperateType() {
			return this.operateType;
		}

		public void setOperateType(String operateType) {
			this.operateType = operateType;
		}

		public String getThreshold() {
			return this.threshold;
		}

		public void setThreshold(String threshold) {
			this.threshold = threshold;
		}

		public String getEffectType() {
			return this.effectType;
		}

		public void setEffectType(String effectType) {
			this.effectType = effectType;
		}

		public String getIccidsOssFilePath() {
			return this.iccidsOssFilePath;
		}

		public void setIccidsOssFilePath(String iccidsOssFilePath) {
			this.iccidsOssFilePath = iccidsOssFilePath;
		}

		public Boolean getOperateResultOssFilePath() {
			return this.operateResultOssFilePath;
		}

		public void setOperateResultOssFilePath(Boolean operateResultOssFilePath) {
			this.operateResultOssFilePath = operateResultOssFilePath;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
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
		}
	}

	@Override
	public ListBatchOperateCardsTasksResponse getInstance(UnmarshallerContext context) {
		return	ListBatchOperateCardsTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
