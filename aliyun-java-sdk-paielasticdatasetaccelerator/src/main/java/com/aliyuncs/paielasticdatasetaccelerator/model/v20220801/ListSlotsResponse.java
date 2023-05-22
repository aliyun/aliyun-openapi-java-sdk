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

package com.aliyuncs.paielasticdatasetaccelerator.model.v20220801;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.paielasticdatasetaccelerator.transform.v20220801.ListSlotsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSlotsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<SlotsItem> slots;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<SlotsItem> getSlots() {
		return this.slots;
	}

	public void setSlots(List<SlotsItem> slots) {
		this.slots = slots;
	}

	public static class SlotsItem {

		private String userId;

		private String ownerId;

		private String gmtCreateTime;

		private String gmtModifiedTime;

		private String uuid;

		private String instanceId;

		private String name;

		private String description;

		private String storageType;

		private String storageUri;

		private String capacity;

		private String ioType;

		private List<TagsItem> tags;

		private List<EndpointsItem> endpoints;

		private LifeCycle lifeCycle;

		private Status status;

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(String ownerId) {
			this.ownerId = ownerId;
		}

		public String getGmtCreateTime() {
			return this.gmtCreateTime;
		}

		public void setGmtCreateTime(String gmtCreateTime) {
			this.gmtCreateTime = gmtCreateTime;
		}

		public String getGmtModifiedTime() {
			return this.gmtModifiedTime;
		}

		public void setGmtModifiedTime(String gmtModifiedTime) {
			this.gmtModifiedTime = gmtModifiedTime;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
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

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public String getStorageUri() {
			return this.storageUri;
		}

		public void setStorageUri(String storageUri) {
			this.storageUri = storageUri;
		}

		public String getCapacity() {
			return this.capacity;
		}

		public void setCapacity(String capacity) {
			this.capacity = capacity;
		}

		public String getIoType() {
			return this.ioType;
		}

		public void setIoType(String ioType) {
			this.ioType = ioType;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public List<EndpointsItem> getEndpoints() {
			return this.endpoints;
		}

		public void setEndpoints(List<EndpointsItem> endpoints) {
			this.endpoints = endpoints;
		}

		public LifeCycle getLifeCycle() {
			return this.lifeCycle;
		}

		public void setLifeCycle(LifeCycle lifeCycle) {
			this.lifeCycle = lifeCycle;
		}

		public Status getStatus() {
			return this.status;
		}

		public void setStatus(Status status) {
			this.status = status;
		}

		public static class TagsItem {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class EndpointsItem {

			private String userId;

			private String ownerId;

			private String gmtCreateTime;

			private String gmtModifiedTime;

			private String uuid;

			private String name;

			private String type;

			private String vpcId;

			private String vswitchId;

			private Status1 status1;

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getOwnerId() {
				return this.ownerId;
			}

			public void setOwnerId(String ownerId) {
				this.ownerId = ownerId;
			}

			public String getGmtCreateTime() {
				return this.gmtCreateTime;
			}

			public void setGmtCreateTime(String gmtCreateTime) {
				this.gmtCreateTime = gmtCreateTime;
			}

			public String getGmtModifiedTime() {
				return this.gmtModifiedTime;
			}

			public void setGmtModifiedTime(String gmtModifiedTime) {
				this.gmtModifiedTime = gmtModifiedTime;
			}

			public String getUuid() {
				return this.uuid;
			}

			public void setUuid(String uuid) {
				this.uuid = uuid;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getVswitchId() {
				return this.vswitchId;
			}

			public void setVswitchId(String vswitchId) {
				this.vswitchId = vswitchId;
			}

			public Status1 getStatus1() {
				return this.status1;
			}

			public void setStatus1(Status1 status1) {
				this.status1 = status1;
			}

			public static class Status1 {

				private String phase;

				private String code;

				private String message;

				private Detail detail;

				public String getPhase() {
					return this.phase;
				}

				public void setPhase(String phase) {
					this.phase = phase;
				}

				public String getCode() {
					return this.code;
				}

				public void setCode(String code) {
					this.code = code;
				}

				public String getMessage() {
					return this.message;
				}

				public void setMessage(String message) {
					this.message = message;
				}

				public Detail getDetail() {
					return this.detail;
				}

				public void setDetail(Detail detail) {
					this.detail = detail;
				}

				public static class Detail {

					private Map<Object,Object> ipPortMapping;

					public Map<Object,Object> getIpPortMapping() {
						return this.ipPortMapping;
					}

					public void setIpPortMapping(Map<Object,Object> ipPortMapping) {
						this.ipPortMapping = ipPortMapping;
					}
				}
			}
		}

		public static class LifeCycle {

			private String type;

			private String config;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getConfig() {
				return this.config;
			}

			public void setConfig(String config) {
				this.config = config;
			}
		}

		public static class Status {

			private String phase;

			private String code;

			private String message;

			private Detail2 detail2;

			public String getPhase() {
				return this.phase;
			}

			public void setPhase(String phase) {
				this.phase = phase;
			}

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public Detail2 getDetail2() {
				return this.detail2;
			}

			public void setDetail2(Detail2 detail2) {
				this.detail2 = detail2;
			}

			public static class Detail2 {

				private Long loadedFileNum;

				private String loadedFileSize;

				private Long loadingTimeCost;

				public Long getLoadedFileNum() {
					return this.loadedFileNum;
				}

				public void setLoadedFileNum(Long loadedFileNum) {
					this.loadedFileNum = loadedFileNum;
				}

				public String getLoadedFileSize() {
					return this.loadedFileSize;
				}

				public void setLoadedFileSize(String loadedFileSize) {
					this.loadedFileSize = loadedFileSize;
				}

				public Long getLoadingTimeCost() {
					return this.loadingTimeCost;
				}

				public void setLoadingTimeCost(Long loadingTimeCost) {
					this.loadingTimeCost = loadingTimeCost;
				}
			}
		}
	}

	@Override
	public ListSlotsResponse getInstance(UnmarshallerContext context) {
		return	ListSlotsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
