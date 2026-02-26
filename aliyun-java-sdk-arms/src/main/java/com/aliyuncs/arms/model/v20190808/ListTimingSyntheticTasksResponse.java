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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.ListTimingSyntheticTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTimingSyntheticTasksResponse extends AcsResponse {

	private String requestId;

	private Long code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer total;

		private Integer page;

		private Integer pageSize;

		private List<Item> items;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

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

		public List<Item> getItems() {
			return this.items;
		}

		public void setItems(List<Item> items) {
			this.items = items;
		}

		public static class Item {

			private String taskId;

			private String regionId;

			private String name;

			private Integer taskType;

			private String url;

			private Integer monitorCategory;

			private String frequency;

			private String monitorNum;

			private String status;

			private String gmtCreate;

			private String gmtModified;

			private String resourceGroupId;

			private List<Tag> tags;

			private CommonSetting commonSetting;

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Integer getTaskType() {
				return this.taskType;
			}

			public void setTaskType(Integer taskType) {
				this.taskType = taskType;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public Integer getMonitorCategory() {
				return this.monitorCategory;
			}

			public void setMonitorCategory(Integer monitorCategory) {
				this.monitorCategory = monitorCategory;
			}

			public String getFrequency() {
				return this.frequency;
			}

			public void setFrequency(String frequency) {
				this.frequency = frequency;
			}

			public String getMonitorNum() {
				return this.monitorNum;
			}

			public void setMonitorNum(String monitorNum) {
				this.monitorNum = monitorNum;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getResourceGroupId() {
				return this.resourceGroupId;
			}

			public void setResourceGroupId(String resourceGroupId) {
				this.resourceGroupId = resourceGroupId;
			}

			public List<Tag> getTags() {
				return this.tags;
			}

			public void setTags(List<Tag> tags) {
				this.tags = tags;
			}

			public CommonSetting getCommonSetting() {
				return this.commonSetting;
			}

			public void setCommonSetting(CommonSetting commonSetting) {
				this.commonSetting = commonSetting;
			}

			public static class Tag {

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

			public static class CommonSetting {

				private Integer ipType;

				private Integer monitorSamples;

				private Boolean isOpenTrace;

				private Integer traceClientType;

				private String xtraceRegion;

				private CustomHost customHost;

				private CustomVPCSetting customVPCSetting;

				private CustomPrometheusSetting customPrometheusSetting;

				public Integer getIpType() {
					return this.ipType;
				}

				public void setIpType(Integer ipType) {
					this.ipType = ipType;
				}

				public Integer getMonitorSamples() {
					return this.monitorSamples;
				}

				public void setMonitorSamples(Integer monitorSamples) {
					this.monitorSamples = monitorSamples;
				}

				public Boolean getIsOpenTrace() {
					return this.isOpenTrace;
				}

				public void setIsOpenTrace(Boolean isOpenTrace) {
					this.isOpenTrace = isOpenTrace;
				}

				public Integer getTraceClientType() {
					return this.traceClientType;
				}

				public void setTraceClientType(Integer traceClientType) {
					this.traceClientType = traceClientType;
				}

				public String getXtraceRegion() {
					return this.xtraceRegion;
				}

				public void setXtraceRegion(String xtraceRegion) {
					this.xtraceRegion = xtraceRegion;
				}

				public CustomHost getCustomHost() {
					return this.customHost;
				}

				public void setCustomHost(CustomHost customHost) {
					this.customHost = customHost;
				}

				public CustomVPCSetting getCustomVPCSetting() {
					return this.customVPCSetting;
				}

				public void setCustomVPCSetting(CustomVPCSetting customVPCSetting) {
					this.customVPCSetting = customVPCSetting;
				}

				public CustomPrometheusSetting getCustomPrometheusSetting() {
					return this.customPrometheusSetting;
				}

				public void setCustomPrometheusSetting(CustomPrometheusSetting customPrometheusSetting) {
					this.customPrometheusSetting = customPrometheusSetting;
				}

				public static class CustomHost {

					private Integer selectType;

					private List<Host> hosts;

					public Integer getSelectType() {
						return this.selectType;
					}

					public void setSelectType(Integer selectType) {
						this.selectType = selectType;
					}

					public List<Host> getHosts() {
						return this.hosts;
					}

					public void setHosts(List<Host> hosts) {
						this.hosts = hosts;
					}

					public static class Host {

						private String domain;

						private Integer ipType;

						private List<String> ips;

						public String getDomain() {
							return this.domain;
						}

						public void setDomain(String domain) {
							this.domain = domain;
						}

						public Integer getIpType() {
							return this.ipType;
						}

						public void setIpType(Integer ipType) {
							this.ipType = ipType;
						}

						public List<String> getIps() {
							return this.ips;
						}

						public void setIps(List<String> ips) {
							this.ips = ips;
						}
					}
				}

				public static class CustomVPCSetting {

					private String regionId;

					private String vpcId;

					private String vSwitchId;

					private String secureGroupId;

					public String getRegionId() {
						return this.regionId;
					}

					public void setRegionId(String regionId) {
						this.regionId = regionId;
					}

					public String getVpcId() {
						return this.vpcId;
					}

					public void setVpcId(String vpcId) {
						this.vpcId = vpcId;
					}

					public String getVSwitchId() {
						return this.vSwitchId;
					}

					public void setVSwitchId(String vSwitchId) {
						this.vSwitchId = vSwitchId;
					}

					public String getSecureGroupId() {
						return this.secureGroupId;
					}

					public void setSecureGroupId(String secureGroupId) {
						this.secureGroupId = secureGroupId;
					}
				}

				public static class CustomPrometheusSetting {

					private Map<Object,Object> prometheusLabels;

					private String prometheusClusterId;

					private String prometheusClusterRegion;

					public Map<Object,Object> getPrometheusLabels() {
						return this.prometheusLabels;
					}

					public void setPrometheusLabels(Map<Object,Object> prometheusLabels) {
						this.prometheusLabels = prometheusLabels;
					}

					public String getPrometheusClusterId() {
						return this.prometheusClusterId;
					}

					public void setPrometheusClusterId(String prometheusClusterId) {
						this.prometheusClusterId = prometheusClusterId;
					}

					public String getPrometheusClusterRegion() {
						return this.prometheusClusterRegion;
					}

					public void setPrometheusClusterRegion(String prometheusClusterRegion) {
						this.prometheusClusterRegion = prometheusClusterRegion;
					}
				}
			}
		}
	}

	@Override
	public ListTimingSyntheticTasksResponse getInstance(UnmarshallerContext context) {
		return	ListTimingSyntheticTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
