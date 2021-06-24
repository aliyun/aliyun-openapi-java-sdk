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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsListCloudBoxSitesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsListCloudBoxSitesResponse extends AcsResponse {

	private Integer totalCount;

	private String nextToken;

	private String requestId;

	private List<CloudBoxSiteSet> cloudBoxSiteSets;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

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

	public List<CloudBoxSiteSet> getCloudBoxSiteSets() {
		return this.cloudBoxSiteSets;
	}

	public void setCloudBoxSiteSets(List<CloudBoxSiteSet> cloudBoxSiteSets) {
		this.cloudBoxSiteSets = cloudBoxSiteSets;
	}

	public static class CloudBoxSiteSet {

		private String cloudBoxSiteName;

		private String description;

		private String siteQuestionares;

		private String cloudBoxSiteId;

		private String country;

		private String streetAddress;

		private String city;

		private String province;

		public String getCloudBoxSiteName() {
			return this.cloudBoxSiteName;
		}

		public void setCloudBoxSiteName(String cloudBoxSiteName) {
			this.cloudBoxSiteName = cloudBoxSiteName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSiteQuestionares() {
			return this.siteQuestionares;
		}

		public void setSiteQuestionares(String siteQuestionares) {
			this.siteQuestionares = siteQuestionares;
		}

		public String getCloudBoxSiteId() {
			return this.cloudBoxSiteId;
		}

		public void setCloudBoxSiteId(String cloudBoxSiteId) {
			this.cloudBoxSiteId = cloudBoxSiteId;
		}

		public String getCountry() {
			return this.country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getStreetAddress() {
			return this.streetAddress;
		}

		public void setStreetAddress(String streetAddress) {
			this.streetAddress = streetAddress;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
		}
	}

	@Override
	public OpsListCloudBoxSitesResponse getInstance(UnmarshallerContext context) {
		return	OpsListCloudBoxSitesResponseUnmarshaller.unmarshall(this, context);
	}
}
