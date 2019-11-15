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

package com.aliyuncs.openanalytics_open.model.v20180619;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.openanalytics_open.transform.v20180619.QueryDataSourceDefResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDataSourceDefResponse extends AcsResponse {

	private String requestId;

	private String regionId;

	private List<RegionListItem> regionList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public List<RegionListItem> getRegionList() {
		return this.regionList;
	}

	public void setRegionList(List<RegionListItem> regionList) {
		this.regionList = regionList;
	}

	public static class RegionListItem {

		private String dataSourceName;

		private String roleArn;

		private String authorizedURL;

		public String getDataSourceName() {
			return this.dataSourceName;
		}

		public void setDataSourceName(String dataSourceName) {
			this.dataSourceName = dataSourceName;
		}

		public String getRoleArn() {
			return this.roleArn;
		}

		public void setRoleArn(String roleArn) {
			this.roleArn = roleArn;
		}

		public String getAuthorizedURL() {
			return this.authorizedURL;
		}

		public void setAuthorizedURL(String authorizedURL) {
			this.authorizedURL = authorizedURL;
		}
	}

	@Override
	public QueryDataSourceDefResponse getInstance(UnmarshallerContext context) {
		return	QueryDataSourceDefResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
