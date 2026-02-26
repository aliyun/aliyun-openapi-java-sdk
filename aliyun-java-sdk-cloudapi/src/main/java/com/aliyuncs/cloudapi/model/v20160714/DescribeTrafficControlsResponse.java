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

package com.aliyuncs.cloudapi.model.v20160714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeTrafficControlsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTrafficControlsResponse extends AcsResponse {

	private Integer pageNumber;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<TrafficControl> trafficControls;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<TrafficControl> getTrafficControls() {
		return this.trafficControls;
	}

	public void setTrafficControls(List<TrafficControl> trafficControls) {
		this.trafficControls = trafficControls;
	}

	public static class TrafficControl {

		private Integer userDefault;

		private Integer apiDefault;

		private String modifiedTime;

		private String description;

		private String trafficControlUnit;

		private String trafficControlName;

		private Integer appDefault;

		private String trafficControlId;

		private String createdTime;

		private List<SpecialPolicy> specialPolicies;

		public Integer getUserDefault() {
			return this.userDefault;
		}

		public void setUserDefault(Integer userDefault) {
			this.userDefault = userDefault;
		}

		public Integer getApiDefault() {
			return this.apiDefault;
		}

		public void setApiDefault(Integer apiDefault) {
			this.apiDefault = apiDefault;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getTrafficControlUnit() {
			return this.trafficControlUnit;
		}

		public void setTrafficControlUnit(String trafficControlUnit) {
			this.trafficControlUnit = trafficControlUnit;
		}

		public String getTrafficControlName() {
			return this.trafficControlName;
		}

		public void setTrafficControlName(String trafficControlName) {
			this.trafficControlName = trafficControlName;
		}

		public Integer getAppDefault() {
			return this.appDefault;
		}

		public void setAppDefault(Integer appDefault) {
			this.appDefault = appDefault;
		}

		public String getTrafficControlId() {
			return this.trafficControlId;
		}

		public void setTrafficControlId(String trafficControlId) {
			this.trafficControlId = trafficControlId;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public List<SpecialPolicy> getSpecialPolicies() {
			return this.specialPolicies;
		}

		public void setSpecialPolicies(List<SpecialPolicy> specialPolicies) {
			this.specialPolicies = specialPolicies;
		}

		public static class SpecialPolicy {

			private String specialType;

			private List<Special> specials;

			public String getSpecialType() {
				return this.specialType;
			}

			public void setSpecialType(String specialType) {
				this.specialType = specialType;
			}

			public List<Special> getSpecials() {
				return this.specials;
			}

			public void setSpecials(List<Special> specials) {
				this.specials = specials;
			}

			public static class Special {

				private Integer trafficValue;

				private String specialKey;

				public Integer getTrafficValue() {
					return this.trafficValue;
				}

				public void setTrafficValue(Integer trafficValue) {
					this.trafficValue = trafficValue;
				}

				public String getSpecialKey() {
					return this.specialKey;
				}

				public void setSpecialKey(String specialKey) {
					this.specialKey = specialKey;
				}
			}
		}
	}

	@Override
	public DescribeTrafficControlsResponse getInstance(UnmarshallerContext context) {
		return	DescribeTrafficControlsResponseUnmarshaller.unmarshall(this, context);
	}
}
