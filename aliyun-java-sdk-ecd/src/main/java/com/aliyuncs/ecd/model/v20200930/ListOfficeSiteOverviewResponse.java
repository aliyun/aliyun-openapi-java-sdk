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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.ListOfficeSiteOverviewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListOfficeSiteOverviewResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<OfficeSiteOverviewResult> officeSiteOverviewResults;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<OfficeSiteOverviewResult> getOfficeSiteOverviewResults() {
		return this.officeSiteOverviewResults;
	}

	public void setOfficeSiteOverviewResults(List<OfficeSiteOverviewResult> officeSiteOverviewResults) {
		this.officeSiteOverviewResults = officeSiteOverviewResults;
	}

	public static class OfficeSiteOverviewResult {

		private String officeSiteStatus;

		private Integer totalEdsCount;

		private Integer willExpiredEdsCount;

		private String officeSiteId;

		private Integer runningEdsCount;

		private String officeSiteName;

		private Integer hasExpiredEdsCount;

		private String regionId;

		public String getOfficeSiteStatus() {
			return this.officeSiteStatus;
		}

		public void setOfficeSiteStatus(String officeSiteStatus) {
			this.officeSiteStatus = officeSiteStatus;
		}

		public Integer getTotalEdsCount() {
			return this.totalEdsCount;
		}

		public void setTotalEdsCount(Integer totalEdsCount) {
			this.totalEdsCount = totalEdsCount;
		}

		public Integer getWillExpiredEdsCount() {
			return this.willExpiredEdsCount;
		}

		public void setWillExpiredEdsCount(Integer willExpiredEdsCount) {
			this.willExpiredEdsCount = willExpiredEdsCount;
		}

		public String getOfficeSiteId() {
			return this.officeSiteId;
		}

		public void setOfficeSiteId(String officeSiteId) {
			this.officeSiteId = officeSiteId;
		}

		public Integer getRunningEdsCount() {
			return this.runningEdsCount;
		}

		public void setRunningEdsCount(Integer runningEdsCount) {
			this.runningEdsCount = runningEdsCount;
		}

		public String getOfficeSiteName() {
			return this.officeSiteName;
		}

		public void setOfficeSiteName(String officeSiteName) {
			this.officeSiteName = officeSiteName;
		}

		public Integer getHasExpiredEdsCount() {
			return this.hasExpiredEdsCount;
		}

		public void setHasExpiredEdsCount(Integer hasExpiredEdsCount) {
			this.hasExpiredEdsCount = hasExpiredEdsCount;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public ListOfficeSiteOverviewResponse getInstance(UnmarshallerContext context) {
		return	ListOfficeSiteOverviewResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
