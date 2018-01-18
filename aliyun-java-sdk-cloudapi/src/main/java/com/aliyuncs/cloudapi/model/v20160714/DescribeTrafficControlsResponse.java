/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeTrafficControlsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class DescribeTrafficControlsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<TrafficControl> trafficControls;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<TrafficControl> getTrafficControls() {
		return this.trafficControls;
	}

	public void setTrafficControls(List<TrafficControl> trafficControls) {
		this.trafficControls = trafficControls;
	}

	public static class TrafficControl {

		private String trafficControlId;

		private String trafficControlName;

		private String description;

		private String trafficControlUnit;

		private Integer apiDefault;

		private Integer userDefault;

		private Integer appDefault;

		private String createdTime;

		private String modifiedTime;

		private List<SpecialPolicy> specialPolicies;

		public String getTrafficControlId() {
			return this.trafficControlId;
		}

		public void setTrafficControlId(String trafficControlId) {
			this.trafficControlId = trafficControlId;
		}

		public String getTrafficControlName() {
			return this.trafficControlName;
		}

		public void setTrafficControlName(String trafficControlName) {
			this.trafficControlName = trafficControlName;
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

		public Integer getApiDefault() {
			return this.apiDefault;
		}

		public void setApiDefault(Integer apiDefault) {
			this.apiDefault = apiDefault;
		}

		public Integer getUserDefault() {
			return this.userDefault;
		}

		public void setUserDefault(Integer userDefault) {
			this.userDefault = userDefault;
		}

		public Integer getAppDefault() {
			return this.appDefault;
		}

		public void setAppDefault(Integer appDefault) {
			this.appDefault = appDefault;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
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

				private String specialKey;

				private Integer trafficValue;

				public String getSpecialKey() {
					return this.specialKey;
				}

				public void setSpecialKey(String specialKey) {
					this.specialKey = specialKey;
				}

				public Integer getTrafficValue() {
					return this.trafficValue;
				}

				public void setTrafficValue(Integer trafficValue) {
					this.trafficValue = trafficValue;
				}
			}
		}
	}

	@Override
	public DescribeTrafficControlsResponse getInstance(UnmarshallerContext context) {
		return	DescribeTrafficControlsResponseUnmarshaller.unmarshall(this, context);
	}
}
