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
import com.aliyuncs.zhuque.transform.v20160701.GetCloudInstanceDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCloudInstanceDetailsResponse extends AcsResponse {

	private String requestId;

	private String result;

	private String message;

	private CloudDetailResp cloudDetailResp;

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

	public CloudDetailResp getCloudDetailResp() {
		return this.cloudDetailResp;
	}

	public void setCloudDetailResp(CloudDetailResp cloudDetailResp) {
		this.cloudDetailResp = cloudDetailResp;
	}

	public static class CloudDetailResp {

		private String cloudInstance;

		private String cloudModel;

		private String cloudType;

		private String propertyMode;

		private String customerId;

		private String customerName;

		private String description;

		private String displayName;

		private List<LocationTreeItem> locationTree;

		public String getCloudInstance() {
			return this.cloudInstance;
		}

		public void setCloudInstance(String cloudInstance) {
			this.cloudInstance = cloudInstance;
		}

		public String getCloudModel() {
			return this.cloudModel;
		}

		public void setCloudModel(String cloudModel) {
			this.cloudModel = cloudModel;
		}

		public String getCloudType() {
			return this.cloudType;
		}

		public void setCloudType(String cloudType) {
			this.cloudType = cloudType;
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

		public String getCustomerName() {
			return this.customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
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

				private String zoneType;

				private String zone;

				private String displayName;

				private Details1 details1;

				public String getZoneType() {
					return this.zoneType;
				}

				public void setZoneType(String zoneType) {
					this.zoneType = zoneType;
				}

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

				public Details1 getDetails1() {
					return this.details1;
				}

				public void setDetails1(Details1 details1) {
					this.details1 = details1;
				}

				public static class Details1 {

					private Integer machineCount;

					private Integer netDevCount;

					private String platformVersion;

					private String platformCommit;

					private Integer productCount;

					private Integer rackCount;

					private Integer seatCount;

					private Integer seatUsage;

					private Integer unusedSeatCount;

					public Integer getMachineCount() {
						return this.machineCount;
					}

					public void setMachineCount(Integer machineCount) {
						this.machineCount = machineCount;
					}

					public Integer getNetDevCount() {
						return this.netDevCount;
					}

					public void setNetDevCount(Integer netDevCount) {
						this.netDevCount = netDevCount;
					}

					public String getPlatformVersion() {
						return this.platformVersion;
					}

					public void setPlatformVersion(String platformVersion) {
						this.platformVersion = platformVersion;
					}

					public String getPlatformCommit() {
						return this.platformCommit;
					}

					public void setPlatformCommit(String platformCommit) {
						this.platformCommit = platformCommit;
					}

					public Integer getProductCount() {
						return this.productCount;
					}

					public void setProductCount(Integer productCount) {
						this.productCount = productCount;
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

					public Integer getSeatUsage() {
						return this.seatUsage;
					}

					public void setSeatUsage(Integer seatUsage) {
						this.seatUsage = seatUsage;
					}

					public Integer getUnusedSeatCount() {
						return this.unusedSeatCount;
					}

					public void setUnusedSeatCount(Integer unusedSeatCount) {
						this.unusedSeatCount = unusedSeatCount;
					}
				}
			}

			public static class Details {

				private Integer machineCount;

				private Integer netDevCount;

				private String platformVersion;

				private String platformCommit;

				private Integer productCount;

				private Integer rackCount;

				private Integer seatCount;

				private Integer seatUsage;

				private Integer unusedSeatCount;

				public Integer getMachineCount() {
					return this.machineCount;
				}

				public void setMachineCount(Integer machineCount) {
					this.machineCount = machineCount;
				}

				public Integer getNetDevCount() {
					return this.netDevCount;
				}

				public void setNetDevCount(Integer netDevCount) {
					this.netDevCount = netDevCount;
				}

				public String getPlatformVersion() {
					return this.platformVersion;
				}

				public void setPlatformVersion(String platformVersion) {
					this.platformVersion = platformVersion;
				}

				public String getPlatformCommit() {
					return this.platformCommit;
				}

				public void setPlatformCommit(String platformCommit) {
					this.platformCommit = platformCommit;
				}

				public Integer getProductCount() {
					return this.productCount;
				}

				public void setProductCount(Integer productCount) {
					this.productCount = productCount;
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

				public Integer getSeatUsage() {
					return this.seatUsage;
				}

				public void setSeatUsage(Integer seatUsage) {
					this.seatUsage = seatUsage;
				}

				public Integer getUnusedSeatCount() {
					return this.unusedSeatCount;
				}

				public void setUnusedSeatCount(Integer unusedSeatCount) {
					this.unusedSeatCount = unusedSeatCount;
				}
			}
		}
	}

	@Override
	public GetCloudInstanceDetailsResponse getInstance(UnmarshallerContext context) {
		return	GetCloudInstanceDetailsResponseUnmarshaller.unmarshall(this, context);
	}
}
