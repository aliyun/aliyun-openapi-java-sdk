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

package com.aliyuncs.airec.model.v20201126;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20201126.CreateCustomSampleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateCustomSampleResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String status;

		private String gmtCreate;

		private String gmtModified;

		private String sampleId;

		private Meta meta;

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

		public String getSampleId() {
			return this.sampleId;
		}

		public void setSampleId(String sampleId) {
			this.sampleId = sampleId;
		}

		public Meta getMeta() {
			return this.meta;
		}

		public void setMeta(Meta meta) {
			this.meta = meta;
		}

		public static class Meta {

			private Boolean autoUpdate;

			private Long autoUpdateFrequency;

			private String clonedId;

			private String metaType;

			private String name;

			private String storeConfig;

			private String type;

			private Config config;

			private ExtendParams extendParams;

			public Boolean getAutoUpdate() {
				return this.autoUpdate;
			}

			public void setAutoUpdate(Boolean autoUpdate) {
				this.autoUpdate = autoUpdate;
			}

			public Long getAutoUpdateFrequency() {
				return this.autoUpdateFrequency;
			}

			public void setAutoUpdateFrequency(Long autoUpdateFrequency) {
				this.autoUpdateFrequency = autoUpdateFrequency;
			}

			public String getClonedId() {
				return this.clonedId;
			}

			public void setClonedId(String clonedId) {
				this.clonedId = clonedId;
			}

			public String getMetaType() {
				return this.metaType;
			}

			public void setMetaType(String metaType) {
				this.metaType = metaType;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getStoreConfig() {
				return this.storeConfig;
			}

			public void setStoreConfig(String storeConfig) {
				this.storeConfig = storeConfig;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Config getConfig() {
				return this.config;
			}

			public void setConfig(Config config) {
				this.config = config;
			}

			public ExtendParams getExtendParams() {
				return this.extendParams;
			}

			public void setExtendParams(ExtendParams extendParams) {
				this.extendParams = extendParams;
			}

			public static class Config {

				private List<WeightLogicListItem> weightLogicList;

				private List<String> bhvTableSourceIds;

				private FeatureConfig featureConfig;

				private LabelLogic labelLogic;

				public List<WeightLogicListItem> getWeightLogicList() {
					return this.weightLogicList;
				}

				public void setWeightLogicList(List<WeightLogicListItem> weightLogicList) {
					this.weightLogicList = weightLogicList;
				}

				public List<String> getBhvTableSourceIds() {
					return this.bhvTableSourceIds;
				}

				public void setBhvTableSourceIds(List<String> bhvTableSourceIds) {
					this.bhvTableSourceIds = bhvTableSourceIds;
				}

				public FeatureConfig getFeatureConfig() {
					return this.featureConfig;
				}

				public void setFeatureConfig(FeatureConfig featureConfig) {
					this.featureConfig = featureConfig;
				}

				public LabelLogic getLabelLogic() {
					return this.labelLogic;
				}

				public void setLabelLogic(LabelLogic labelLogic) {
					this.labelLogic = labelLogic;
				}

				public static class WeightLogicListItem {

					private String bhv;

					private String weight;

					public String getBhv() {
						return this.bhv;
					}

					public void setBhv(String bhv) {
						this.bhv = bhv;
					}

					public String getWeight() {
						return this.weight;
					}

					public void setWeight(String weight) {
						this.weight = weight;
					}
				}

				public static class FeatureConfig {

					private String itemFeatures;

					private String userFeatures;

					public String getItemFeatures() {
						return this.itemFeatures;
					}

					public void setItemFeatures(String itemFeatures) {
						this.itemFeatures = itemFeatures;
					}

					public String getUserFeatures() {
						return this.userFeatures;
					}

					public void setUserFeatures(String userFeatures) {
						this.userFeatures = userFeatures;
					}
				}

				public static class LabelLogic {

					private Long bhvTimeWindow;

					private String negativeBhvTypes;

					private String positiveBhvTypes;

					public Long getBhvTimeWindow() {
						return this.bhvTimeWindow;
					}

					public void setBhvTimeWindow(Long bhvTimeWindow) {
						this.bhvTimeWindow = bhvTimeWindow;
					}

					public String getNegativeBhvTypes() {
						return this.negativeBhvTypes;
					}

					public void setNegativeBhvTypes(String negativeBhvTypes) {
						this.negativeBhvTypes = negativeBhvTypes;
					}

					public String getPositiveBhvTypes() {
						return this.positiveBhvTypes;
					}

					public void setPositiveBhvTypes(String positiveBhvTypes) {
						this.positiveBhvTypes = positiveBhvTypes;
					}
				}
			}

			public static class ExtendParams {

				private Long latestTaskStatus;

				private Long sampleCount;

				public Long getLatestTaskStatus() {
					return this.latestTaskStatus;
				}

				public void setLatestTaskStatus(Long latestTaskStatus) {
					this.latestTaskStatus = latestTaskStatus;
				}

				public Long getSampleCount() {
					return this.sampleCount;
				}

				public void setSampleCount(Long sampleCount) {
					this.sampleCount = sampleCount;
				}
			}
		}
	}

	@Override
	public CreateCustomSampleResponse getInstance(UnmarshallerContext context) {
		return	CreateCustomSampleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
