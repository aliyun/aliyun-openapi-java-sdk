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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeExposedStatisticsDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeExposedStatisticsDetailResponse extends AcsResponse {

	private String requestId;

	private List<StatisticsDetail> statisticsDetails;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<StatisticsDetail> getStatisticsDetails() {
		return this.statisticsDetails;
	}

	public void setStatisticsDetails(List<StatisticsDetail> statisticsDetails) {
		this.statisticsDetails = statisticsDetails;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class StatisticsDetail {

		private String exposureComponent;

		private String exposureType;

		private String exposureTypeId;

		private String exposurePort;

		private String exposureIp;

		private String exposureTypeInstanceName;

		private Integer exposedCount;

		private String regionId;

		public String getExposureComponent() {
			return this.exposureComponent;
		}

		public void setExposureComponent(String exposureComponent) {
			this.exposureComponent = exposureComponent;
		}

		public String getExposureType() {
			return this.exposureType;
		}

		public void setExposureType(String exposureType) {
			this.exposureType = exposureType;
		}

		public String getExposureTypeId() {
			return this.exposureTypeId;
		}

		public void setExposureTypeId(String exposureTypeId) {
			this.exposureTypeId = exposureTypeId;
		}

		public String getExposurePort() {
			return this.exposurePort;
		}

		public void setExposurePort(String exposurePort) {
			this.exposurePort = exposurePort;
		}

		public String getExposureIp() {
			return this.exposureIp;
		}

		public void setExposureIp(String exposureIp) {
			this.exposureIp = exposureIp;
		}

		public String getExposureTypeInstanceName() {
			return this.exposureTypeInstanceName;
		}

		public void setExposureTypeInstanceName(String exposureTypeInstanceName) {
			this.exposureTypeInstanceName = exposureTypeInstanceName;
		}

		public Integer getExposedCount() {
			return this.exposedCount;
		}

		public void setExposedCount(Integer exposedCount) {
			this.exposedCount = exposedCount;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	public static class PageInfo {

		private Integer count;

		private Integer pageSize;

		private Integer totalCount;

		private Integer currentPage;

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
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

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}
	}

	@Override
	public DescribeExposedStatisticsDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeExposedStatisticsDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
