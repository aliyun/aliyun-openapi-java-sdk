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

package com.aliyuncs.netana.model.v20201016;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.netana.transform.v20201016.ListIpGeolocationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListIpGeolocationsResponse extends AcsResponse {

	private String requestId;

	private Integer nextToken;

	private Integer totalCount;

	private Integer maxResults;

	private List<IpGeolocationModel> ipGeolocationModels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(Integer nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<IpGeolocationModel> getIpGeolocationModels() {
		return this.ipGeolocationModels;
	}

	public void setIpGeolocationModels(List<IpGeolocationModel> ipGeolocationModels) {
		this.ipGeolocationModels = ipGeolocationModels;
	}

	public static class IpGeolocationModel {

		private String ipv4Prefix;

		private String countryCode;

		private String cityCode;

		private String resourcePoolName;

		public String getIpv4Prefix() {
			return this.ipv4Prefix;
		}

		public void setIpv4Prefix(String ipv4Prefix) {
			this.ipv4Prefix = ipv4Prefix;
		}

		public String getCountryCode() {
			return this.countryCode;
		}

		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}

		public String getCityCode() {
			return this.cityCode;
		}

		public void setCityCode(String cityCode) {
			this.cityCode = cityCode;
		}

		public String getResourcePoolName() {
			return this.resourcePoolName;
		}

		public void setResourcePoolName(String resourcePoolName) {
			this.resourcePoolName = resourcePoolName;
		}
	}

	@Override
	public ListIpGeolocationsResponse getInstance(UnmarshallerContext context) {
		return	ListIpGeolocationsResponseUnmarshaller.unmarshall(this, context);
	}
}
