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

package com.aliyuncs.reid_cloud.model.v20201029;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.reid_cloud.transform.v20201029.DescribeBaseStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBaseStatisticsResponse extends AcsResponse {

	private String errorCode;

	private String cursorTime;

	private String errorMessage;

	private String message;

	private String code;

	private String dynamicCode;

	private String requestId;

	private Boolean success;

	private String dynamicMessage;

	private List<BaseStatisticsItem> baseStatistics;

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getCursorTime() {
		return this.cursorTime;
	}

	public void setCursorTime(String cursorTime) {
		this.cursorTime = cursorTime;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public List<BaseStatisticsItem> getBaseStatistics() {
		return this.baseStatistics;
	}

	public void setBaseStatistics(List<BaseStatisticsItem> baseStatistics) {
		this.baseStatistics = baseStatistics;
	}

	public static class BaseStatisticsItem {

		private Long storeId;

		private Integer femaleUvCount;

		private Integer oldCount;

		private Integer newCount;

		private String summaryType;

		private Integer maleUvCount;

		private String time;

		private Long locationId;

		private Long stayPeriod;

		private Integer uvCount;

		private Integer onlyBodyUvCount;

		private List<AgeItem> ageItems;

		private List<StayDistributionItem> stayDistributionItems;

		private List<AgeItem> maleAgeItems;

		private List<AgeItem> femaleAgeItems;

		public Long getStoreId() {
			return this.storeId;
		}

		public void setStoreId(Long storeId) {
			this.storeId = storeId;
		}

		public Integer getFemaleUvCount() {
			return this.femaleUvCount;
		}

		public void setFemaleUvCount(Integer femaleUvCount) {
			this.femaleUvCount = femaleUvCount;
		}

		public Integer getOldCount() {
			return this.oldCount;
		}

		public void setOldCount(Integer oldCount) {
			this.oldCount = oldCount;
		}

		public Integer getNewCount() {
			return this.newCount;
		}

		public void setNewCount(Integer newCount) {
			this.newCount = newCount;
		}

		public String getSummaryType() {
			return this.summaryType;
		}

		public void setSummaryType(String summaryType) {
			this.summaryType = summaryType;
		}

		public Integer getMaleUvCount() {
			return this.maleUvCount;
		}

		public void setMaleUvCount(Integer maleUvCount) {
			this.maleUvCount = maleUvCount;
		}

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public Long getLocationId() {
			return this.locationId;
		}

		public void setLocationId(Long locationId) {
			this.locationId = locationId;
		}

		public Long getStayPeriod() {
			return this.stayPeriod;
		}

		public void setStayPeriod(Long stayPeriod) {
			this.stayPeriod = stayPeriod;
		}

		public Integer getUvCount() {
			return this.uvCount;
		}

		public void setUvCount(Integer uvCount) {
			this.uvCount = uvCount;
		}

		public Integer getOnlyBodyUvCount() {
			return this.onlyBodyUvCount;
		}

		public void setOnlyBodyUvCount(Integer onlyBodyUvCount) {
			this.onlyBodyUvCount = onlyBodyUvCount;
		}

		public List<AgeItem> getAgeItems() {
			return this.ageItems;
		}

		public void setAgeItems(List<AgeItem> ageItems) {
			this.ageItems = ageItems;
		}

		public List<StayDistributionItem> getStayDistributionItems() {
			return this.stayDistributionItems;
		}

		public void setStayDistributionItems(List<StayDistributionItem> stayDistributionItems) {
			this.stayDistributionItems = stayDistributionItems;
		}

		public List<AgeItem> getMaleAgeItems() {
			return this.maleAgeItems;
		}

		public void setMaleAgeItems(List<AgeItem> maleAgeItems) {
			this.maleAgeItems = maleAgeItems;
		}

		public List<AgeItem> getFemaleAgeItems() {
			return this.femaleAgeItems;
		}

		public void setFemaleAgeItems(List<AgeItem> femaleAgeItems) {
			this.femaleAgeItems = femaleAgeItems;
		}

		public static class AgeItem {

			private String name;

			private Integer count;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}
		}

		public static class StayDistributionItem {

			private Long startTs;

			private Long endTs;

			private Integer count;

			public Long getStartTs() {
				return this.startTs;
			}

			public void setStartTs(Long startTs) {
				this.startTs = startTs;
			}

			public Long getEndTs() {
				return this.endTs;
			}

			public void setEndTs(Long endTs) {
				this.endTs = endTs;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}
		}
	}

	@Override
	public DescribeBaseStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeBaseStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
