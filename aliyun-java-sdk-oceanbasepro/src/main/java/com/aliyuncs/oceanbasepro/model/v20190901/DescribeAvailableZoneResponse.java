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

package com.aliyuncs.oceanbasepro.model.v20190901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeAvailableZoneResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAvailableZoneResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<AvailableZonesItem> availableZones;

		public List<AvailableZonesItem> getAvailableZones() {
			return this.availableZones;
		}

		public void setAvailableZones(List<AvailableZonesItem> availableZones) {
			this.availableZones = availableZones;
		}

		public static class AvailableZonesItem {

			private String region;

			private String zones;

			private String channel;

			private String deployType;

			private String instanceType;

			private String series;

			private String cpuArch;

			private List<SupportSpecificationsItem> supportSpecifications;

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getZones() {
				return this.zones;
			}

			public void setZones(String zones) {
				this.zones = zones;
			}

			public String getChannel() {
				return this.channel;
			}

			public void setChannel(String channel) {
				this.channel = channel;
			}

			public String getDeployType() {
				return this.deployType;
			}

			public void setDeployType(String deployType) {
				this.deployType = deployType;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public String getSeries() {
				return this.series;
			}

			public void setSeries(String series) {
				this.series = series;
			}

			public String getCpuArch() {
				return this.cpuArch;
			}

			public void setCpuArch(String cpuArch) {
				this.cpuArch = cpuArch;
			}

			public List<SupportSpecificationsItem> getSupportSpecifications() {
				return this.supportSpecifications;
			}

			public void setSupportSpecifications(List<SupportSpecificationsItem> supportSpecifications) {
				this.supportSpecifications = supportSpecifications;
			}

			public static class SupportSpecificationsItem {

				private String spec;

				private String instanceClass;

				private List<SupportEngineVersionsItem> supportEngineVersions;

				private List<String> diskTypes;

				private DiskSizeRange diskSizeRange;

				public String getSpec() {
					return this.spec;
				}

				public void setSpec(String spec) {
					this.spec = spec;
				}

				public String getInstanceClass() {
					return this.instanceClass;
				}

				public void setInstanceClass(String instanceClass) {
					this.instanceClass = instanceClass;
				}

				public List<SupportEngineVersionsItem> getSupportEngineVersions() {
					return this.supportEngineVersions;
				}

				public void setSupportEngineVersions(List<SupportEngineVersionsItem> supportEngineVersions) {
					this.supportEngineVersions = supportEngineVersions;
				}

				public List<String> getDiskTypes() {
					return this.diskTypes;
				}

				public void setDiskTypes(List<String> diskTypes) {
					this.diskTypes = diskTypes;
				}

				public DiskSizeRange getDiskSizeRange() {
					return this.diskSizeRange;
				}

				public void setDiskSizeRange(DiskSizeRange diskSizeRange) {
					this.diskSizeRange = diskSizeRange;
				}

				public static class SupportEngineVersionsItem {

					private String obVersion;

					private Boolean supportIsolationOptimization;

					private List<String> supportReplicaModes;

					public String getObVersion() {
						return this.obVersion;
					}

					public void setObVersion(String obVersion) {
						this.obVersion = obVersion;
					}

					public Boolean getSupportIsolationOptimization() {
						return this.supportIsolationOptimization;
					}

					public void setSupportIsolationOptimization(Boolean supportIsolationOptimization) {
						this.supportIsolationOptimization = supportIsolationOptimization;
					}

					public List<String> getSupportReplicaModes() {
						return this.supportReplicaModes;
					}

					public void setSupportReplicaModes(List<String> supportReplicaModes) {
						this.supportReplicaModes = supportReplicaModes;
					}
				}

				public static class DiskSizeRange {

					private Long step;

					private Long max;

					private Long min;

					public Long getStep() {
						return this.step;
					}

					public void setStep(Long step) {
						this.step = step;
					}

					public Long getMax() {
						return this.max;
					}

					public void setMax(Long max) {
						this.max = max;
					}

					public Long getMin() {
						return this.min;
					}

					public void setMin(Long min) {
						this.min = min;
					}
				}
			}
		}
	}

	@Override
	public DescribeAvailableZoneResponse getInstance(UnmarshallerContext context) {
		return	DescribeAvailableZoneResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
