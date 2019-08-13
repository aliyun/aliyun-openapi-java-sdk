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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListResourcePoolResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListResourcePoolResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer total;

	private List<PoolInfo> poolInfoList;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<PoolInfo> getPoolInfoList() {
		return this.poolInfoList;
	}

	public void setPoolInfoList(List<PoolInfo> poolInfoList) {
		this.poolInfoList = poolInfoList;
	}

	public static class PoolInfo {

		private List<Queue> queueList;

		private List<EcmResourcePoolConfig2> ecmResourcePoolConfigList;

		private EcmResourcePool ecmResourcePool;

		public List<Queue> getQueueList() {
			return this.queueList;
		}

		public void setQueueList(List<Queue> queueList) {
			this.queueList = queueList;
		}

		public List<EcmResourcePoolConfig2> getEcmResourcePoolConfigList() {
			return this.ecmResourcePoolConfigList;
		}

		public void setEcmResourcePoolConfigList(List<EcmResourcePoolConfig2> ecmResourcePoolConfigList) {
			this.ecmResourcePoolConfigList = ecmResourcePoolConfigList;
		}

		public EcmResourcePool getEcmResourcePool() {
			return this.ecmResourcePool;
		}

		public void setEcmResourcePool(EcmResourcePool ecmResourcePool) {
			this.ecmResourcePool = ecmResourcePool;
		}

		public static class Queue {

			private List<EcmResourcePoolConfig> ecmResourcePoolConfigList1;

			private EcmResourceQueue ecmResourceQueue;

			public List<EcmResourcePoolConfig> getEcmResourcePoolConfigList1() {
				return this.ecmResourcePoolConfigList1;
			}

			public void setEcmResourcePoolConfigList1(List<EcmResourcePoolConfig> ecmResourcePoolConfigList1) {
				this.ecmResourcePoolConfigList1 = ecmResourcePoolConfigList1;
			}

			public EcmResourceQueue getEcmResourceQueue() {
				return this.ecmResourceQueue;
			}

			public void setEcmResourceQueue(EcmResourceQueue ecmResourceQueue) {
				this.ecmResourceQueue = ecmResourceQueue;
			}

			public static class EcmResourcePoolConfig {

				private Long id;

				private String configKey;

				private String configValue;

				private String configType;

				private String category;

				private String status;

				private String note;

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getConfigKey() {
					return this.configKey;
				}

				public void setConfigKey(String configKey) {
					this.configKey = configKey;
				}

				public String getConfigValue() {
					return this.configValue;
				}

				public void setConfigValue(String configValue) {
					this.configValue = configValue;
				}

				public String getConfigType() {
					return this.configType;
				}

				public void setConfigType(String configType) {
					this.configType = configType;
				}

				public String getCategory() {
					return this.category;
				}

				public void setCategory(String category) {
					this.category = category;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getNote() {
					return this.note;
				}

				public void setNote(String note) {
					this.note = note;
				}
			}

			public static class EcmResourceQueue {

				private Long id;

				private String name;

				private String qualifiedName;

				private String queueType;

				private Long parentQueueId;

				private Boolean leaf;

				private String status;

				private String userId;

				private Long resourcePoolId;

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

				public String getQualifiedName() {
					return this.qualifiedName;
				}

				public void setQualifiedName(String qualifiedName) {
					this.qualifiedName = qualifiedName;
				}

				public String getQueueType() {
					return this.queueType;
				}

				public void setQueueType(String queueType) {
					this.queueType = queueType;
				}

				public Long getParentQueueId() {
					return this.parentQueueId;
				}

				public void setParentQueueId(Long parentQueueId) {
					this.parentQueueId = parentQueueId;
				}

				public Boolean getLeaf() {
					return this.leaf;
				}

				public void setLeaf(Boolean leaf) {
					this.leaf = leaf;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getUserId() {
					return this.userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}

				public Long getResourcePoolId() {
					return this.resourcePoolId;
				}

				public void setResourcePoolId(Long resourcePoolId) {
					this.resourcePoolId = resourcePoolId;
				}
			}
		}

		public static class EcmResourcePoolConfig2 {

			private Long id;

			private String configKey;

			private String configValue;

			private String configType;

			private String category;

			private String status;

			private String note;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getConfigKey() {
				return this.configKey;
			}

			public void setConfigKey(String configKey) {
				this.configKey = configKey;
			}

			public String getConfigValue() {
				return this.configValue;
			}

			public void setConfigValue(String configValue) {
				this.configValue = configValue;
			}

			public String getConfigType() {
				return this.configType;
			}

			public void setConfigType(String configType) {
				this.configType = configType;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getNote() {
				return this.note;
			}

			public void setNote(String note) {
				this.note = note;
			}
		}

		public static class EcmResourcePool {

			private Long id;

			private String name;

			private String poolType;

			private Boolean active;

			private String note;

			private String userId;

			private String yarnSiteConfig;

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

			public String getPoolType() {
				return this.poolType;
			}

			public void setPoolType(String poolType) {
				this.poolType = poolType;
			}

			public Boolean getActive() {
				return this.active;
			}

			public void setActive(Boolean active) {
				this.active = active;
			}

			public String getNote() {
				return this.note;
			}

			public void setNote(String note) {
				this.note = note;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getYarnSiteConfig() {
				return this.yarnSiteConfig;
			}

			public void setYarnSiteConfig(String yarnSiteConfig) {
				this.yarnSiteConfig = yarnSiteConfig;
			}
		}
	}

	@Override
	public ListResourcePoolResponse getInstance(UnmarshallerContext context) {
		return	ListResourcePoolResponseUnmarshaller.unmarshall(this, context);
	}
}
