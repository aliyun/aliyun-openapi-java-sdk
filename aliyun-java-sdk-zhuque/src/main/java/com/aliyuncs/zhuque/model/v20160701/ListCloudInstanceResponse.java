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

package com.aliyuncs.zhuque.model.v20160701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.zhuque.transform.v20160701.ListCloudInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCloudInstanceResponse extends AcsResponse {

	private String requestId;

	private String result;

	private String message;

	private List<CloudInstanceItem> cloudInstance;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<CloudInstanceItem> getCloudInstance() {
		return this.cloudInstance;
	}

	public void setCloudInstance(List<CloudInstanceItem> cloudInstance) {
		this.cloudInstance = cloudInstance;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class CloudInstanceItem {

		private Integer id;

		private String cloudInstance;

		private String cloudType;

		private String displayName;

		private String propertyMode;

		private String customerId;

		private String cloudModel;

		private String description;

		private String updateTime;

		private String createTime;

		private String creator;

		private String modifier;

		private List<LocationTreeItem> locationTree;

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getCloudInstance() {
			return this.cloudInstance;
		}

		public void setCloudInstance(String cloudInstance) {
			this.cloudInstance = cloudInstance;
		}

		public String getCloudType() {
			return this.cloudType;
		}

		public void setCloudType(String cloudType) {
			this.cloudType = cloudType;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getPropertyMode() {
			return this.propertyMode;
		}

		public void setPropertyMode(String propertyMode) {
			this.propertyMode = propertyMode;
		}

		public String getCustomerId() {
			return this.customerId;
		}

		public void setCustomerId(String customerId) {
			this.customerId = customerId;
		}

		public String getCloudModel() {
			return this.cloudModel;
		}

		public void setCloudModel(String cloudModel) {
			this.cloudModel = cloudModel;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getModifier() {
			return this.modifier;
		}

		public void setModifier(String modifier) {
			this.modifier = modifier;
		}

		public List<LocationTreeItem> getLocationTree() {
			return this.locationTree;
		}

		public void setLocationTree(List<LocationTreeItem> locationTree) {
			this.locationTree = locationTree;
		}

		public static class LocationTreeItem {

			private String region;

			private String displayName;

			private String deployMode;

			private List<ZoneListItem> zoneList;

			private Details details;

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public String getDeployMode() {
				return this.deployMode;
			}

			public void setDeployMode(String deployMode) {
				this.deployMode = deployMode;
			}

			public List<ZoneListItem> getZoneList() {
				return this.zoneList;
			}

			public void setZoneList(List<ZoneListItem> zoneList) {
				this.zoneList = zoneList;
			}

			public Details getDetails() {
				return this.details;
			}

			public void setDetails(Details details) {
				this.details = details;
			}

			public static class ZoneListItem {

				private String zone;

				private String displayName;

				private String zoneType;

				private Details1 details1;

				public String getZone() {
					return this.zone;
				}

				public void setZone(String zone) {
					this.zone = zone;
				}

				public String getDisplayName() {
					return this.displayName;
				}

				public void setDisplayName(String displayName) {
					this.displayName = displayName;
				}

				public String getZoneType() {
					return this.zoneType;
				}

				public void setZoneType(String zoneType) {
					this.zoneType = zoneType;
				}

				public Details1 getDetails1() {
					return this.details1;
				}

				public void setDetails1(Details1 details1) {
					this.details1 = details1;
				}

				public static class Details1 {

					private Integer machineCount;

					private Integer rackCount;

					private Integer seatCount;

					private Integer usedSeatCount;

					private Integer appCount;

					public Integer getMachineCount() {
						return this.machineCount;
					}

					public void setMachineCount(Integer machineCount) {
						this.machineCount = machineCount;
					}

					public Integer getRackCount() {
						return this.rackCount;
					}

					public void setRackCount(Integer rackCount) {
						this.rackCount = rackCount;
					}

					public Integer getSeatCount() {
						return this.seatCount;
					}

					public void setSeatCount(Integer seatCount) {
						this.seatCount = seatCount;
					}

					public Integer getUsedSeatCount() {
						return this.usedSeatCount;
					}

					public void setUsedSeatCount(Integer usedSeatCount) {
						this.usedSeatCount = usedSeatCount;
					}

					public Integer getAppCount() {
						return this.appCount;
					}

					public void setAppCount(Integer appCount) {
						this.appCount = appCount;
					}
				}
			}

			public static class Details {

				private Integer machineCount;

				private Integer rackCount;

				private Integer seatCount;

				private Integer usedSeatCount;

				private Integer appCount;

				public Integer getMachineCount() {
					return this.machineCount;
				}

				public void setMachineCount(Integer machineCount) {
					this.machineCount = machineCount;
				}

				public Integer getRackCount() {
					return this.rackCount;
				}

				public void setRackCount(Integer rackCount) {
					this.rackCount = rackCount;
				}

				public Integer getSeatCount() {
					return this.seatCount;
				}

				public void setSeatCount(Integer seatCount) {
					this.seatCount = seatCount;
				}

				public Integer getUsedSeatCount() {
					return this.usedSeatCount;
				}

				public void setUsedSeatCount(Integer usedSeatCount) {
					this.usedSeatCount = usedSeatCount;
				}

				public Integer getAppCount() {
					return this.appCount;
				}

				public void setAppCount(Integer appCount) {
					this.appCount = appCount;
				}
			}
		}
	}

	public static class PageInfo {

		private Integer page;

		private Integer pageSize;

		private Integer total;

		public Integer getPage() {
			return this.page;
		}

		public void setPage(Integer page) {
			this.page = page;
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
	}

	@Override
	public ListCloudInstanceResponse getInstance(UnmarshallerContext context) {
		return	ListCloudInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
