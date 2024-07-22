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

package com.aliyuncs.elasticsearch.model.v20170613;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.elasticsearch.transform.v20170613.GetRegionalInstanceConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRegionalInstanceConfigResponse extends AcsResponse {

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

		private Map<Object,Object> specInfoMap;

		private List<MasterDiskListItem> masterDiskList;

		private List<ClientNodeDiskListItem> clientNodeDiskList;

		private List<DataNodeDiskListItem> dataNodeDiskList;

		private List<String> clientSpecs;

		private List<String> dataNodeSpecs;

		private List<String> kibanaSpecs;

		private List<String> masterSpecs;

		private List<String> versions;

		private List<String> masterAmountRange;

		private ClientNodeAmountRange clientNodeAmountRange;

		private DataNodeAmountRange dataNodeAmountRange;

		public Map<Object,Object> getSpecInfoMap() {
			return this.specInfoMap;
		}

		public void setSpecInfoMap(Map<Object,Object> specInfoMap) {
			this.specInfoMap = specInfoMap;
		}

		public List<MasterDiskListItem> getMasterDiskList() {
			return this.masterDiskList;
		}

		public void setMasterDiskList(List<MasterDiskListItem> masterDiskList) {
			this.masterDiskList = masterDiskList;
		}

		public List<ClientNodeDiskListItem> getClientNodeDiskList() {
			return this.clientNodeDiskList;
		}

		public void setClientNodeDiskList(List<ClientNodeDiskListItem> clientNodeDiskList) {
			this.clientNodeDiskList = clientNodeDiskList;
		}

		public List<DataNodeDiskListItem> getDataNodeDiskList() {
			return this.dataNodeDiskList;
		}

		public void setDataNodeDiskList(List<DataNodeDiskListItem> dataNodeDiskList) {
			this.dataNodeDiskList = dataNodeDiskList;
		}

		public List<String> getClientSpecs() {
			return this.clientSpecs;
		}

		public void setClientSpecs(List<String> clientSpecs) {
			this.clientSpecs = clientSpecs;
		}

		public List<String> getDataNodeSpecs() {
			return this.dataNodeSpecs;
		}

		public void setDataNodeSpecs(List<String> dataNodeSpecs) {
			this.dataNodeSpecs = dataNodeSpecs;
		}

		public List<String> getKibanaSpecs() {
			return this.kibanaSpecs;
		}

		public void setKibanaSpecs(List<String> kibanaSpecs) {
			this.kibanaSpecs = kibanaSpecs;
		}

		public List<String> getMasterSpecs() {
			return this.masterSpecs;
		}

		public void setMasterSpecs(List<String> masterSpecs) {
			this.masterSpecs = masterSpecs;
		}

		public List<String> getVersions() {
			return this.versions;
		}

		public void setVersions(List<String> versions) {
			this.versions = versions;
		}

		public List<String> getMasterAmountRange() {
			return this.masterAmountRange;
		}

		public void setMasterAmountRange(List<String> masterAmountRange) {
			this.masterAmountRange = masterAmountRange;
		}

		public ClientNodeAmountRange getClientNodeAmountRange() {
			return this.clientNodeAmountRange;
		}

		public void setClientNodeAmountRange(ClientNodeAmountRange clientNodeAmountRange) {
			this.clientNodeAmountRange = clientNodeAmountRange;
		}

		public DataNodeAmountRange getDataNodeAmountRange() {
			return this.dataNodeAmountRange;
		}

		public void setDataNodeAmountRange(DataNodeAmountRange dataNodeAmountRange) {
			this.dataNodeAmountRange = dataNodeAmountRange;
		}

		public static class MasterDiskListItem {

			private Integer minSize;

			private Integer maxSize;

			private Integer scaleLimit;

			private String diskType;

			private List<SubClassificationConfinesItem> subClassificationConfines;

			public Integer getMinSize() {
				return this.minSize;
			}

			public void setMinSize(Integer minSize) {
				this.minSize = minSize;
			}

			public Integer getMaxSize() {
				return this.maxSize;
			}

			public void setMaxSize(Integer maxSize) {
				this.maxSize = maxSize;
			}

			public Integer getScaleLimit() {
				return this.scaleLimit;
			}

			public void setScaleLimit(Integer scaleLimit) {
				this.scaleLimit = scaleLimit;
			}

			public String getDiskType() {
				return this.diskType;
			}

			public void setDiskType(String diskType) {
				this.diskType = diskType;
			}

			public List<SubClassificationConfinesItem> getSubClassificationConfines() {
				return this.subClassificationConfines;
			}

			public void setSubClassificationConfines(List<SubClassificationConfinesItem> subClassificationConfines) {
				this.subClassificationConfines = subClassificationConfines;
			}

			public static class SubClassificationConfinesItem {

				private Integer minSize;

				private Integer maxSize;

				private String performanceLevel;

				public Integer getMinSize() {
					return this.minSize;
				}

				public void setMinSize(Integer minSize) {
					this.minSize = minSize;
				}

				public Integer getMaxSize() {
					return this.maxSize;
				}

				public void setMaxSize(Integer maxSize) {
					this.maxSize = maxSize;
				}

				public String getPerformanceLevel() {
					return this.performanceLevel;
				}

				public void setPerformanceLevel(String performanceLevel) {
					this.performanceLevel = performanceLevel;
				}
			}
		}

		public static class ClientNodeDiskListItem {

			private Integer minSize;

			private Integer maxSize;

			private Integer scaleLimit;

			private String diskType;

			public Integer getMinSize() {
				return this.minSize;
			}

			public void setMinSize(Integer minSize) {
				this.minSize = minSize;
			}

			public Integer getMaxSize() {
				return this.maxSize;
			}

			public void setMaxSize(Integer maxSize) {
				this.maxSize = maxSize;
			}

			public Integer getScaleLimit() {
				return this.scaleLimit;
			}

			public void setScaleLimit(Integer scaleLimit) {
				this.scaleLimit = scaleLimit;
			}

			public String getDiskType() {
				return this.diskType;
			}

			public void setDiskType(String diskType) {
				this.diskType = diskType;
			}
		}

		public static class DataNodeDiskListItem {

			private Integer minSize;

			private Integer maxSize;

			private Integer scaleLimit;

			private String diskType;

			private List<SubClassificationConfinesItem2> subClassificationConfines1;

			private List<Integer> valueLimitSet;

			public Integer getMinSize() {
				return this.minSize;
			}

			public void setMinSize(Integer minSize) {
				this.minSize = minSize;
			}

			public Integer getMaxSize() {
				return this.maxSize;
			}

			public void setMaxSize(Integer maxSize) {
				this.maxSize = maxSize;
			}

			public Integer getScaleLimit() {
				return this.scaleLimit;
			}

			public void setScaleLimit(Integer scaleLimit) {
				this.scaleLimit = scaleLimit;
			}

			public String getDiskType() {
				return this.diskType;
			}

			public void setDiskType(String diskType) {
				this.diskType = diskType;
			}

			public List<SubClassificationConfinesItem2> getSubClassificationConfines1() {
				return this.subClassificationConfines1;
			}

			public void setSubClassificationConfines1(List<SubClassificationConfinesItem2> subClassificationConfines1) {
				this.subClassificationConfines1 = subClassificationConfines1;
			}

			public List<Integer> getValueLimitSet() {
				return this.valueLimitSet;
			}

			public void setValueLimitSet(List<Integer> valueLimitSet) {
				this.valueLimitSet = valueLimitSet;
			}

			public static class SubClassificationConfinesItem2 {

				private Integer minSize;

				private Integer maxSize;

				private String performanceLevel;

				public Integer getMinSize() {
					return this.minSize;
				}

				public void setMinSize(Integer minSize) {
					this.minSize = minSize;
				}

				public Integer getMaxSize() {
					return this.maxSize;
				}

				public void setMaxSize(Integer maxSize) {
					this.maxSize = maxSize;
				}

				public String getPerformanceLevel() {
					return this.performanceLevel;
				}

				public void setPerformanceLevel(String performanceLevel) {
					this.performanceLevel = performanceLevel;
				}
			}
		}

		public static class ClientNodeAmountRange {

			private Integer minAmount;

			private Integer maxAmount;

			public Integer getMinAmount() {
				return this.minAmount;
			}

			public void setMinAmount(Integer minAmount) {
				this.minAmount = minAmount;
			}

			public Integer getMaxAmount() {
				return this.maxAmount;
			}

			public void setMaxAmount(Integer maxAmount) {
				this.maxAmount = maxAmount;
			}
		}

		public static class DataNodeAmountRange {

			private Integer minAmount;

			private Integer maxAmount;

			public Integer getMinAmount() {
				return this.minAmount;
			}

			public void setMinAmount(Integer minAmount) {
				this.minAmount = minAmount;
			}

			public Integer getMaxAmount() {
				return this.maxAmount;
			}

			public void setMaxAmount(Integer maxAmount) {
				this.maxAmount = maxAmount;
			}
		}
	}

	@Override
	public GetRegionalInstanceConfigResponse getInstance(UnmarshallerContext context) {
		return	GetRegionalInstanceConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
