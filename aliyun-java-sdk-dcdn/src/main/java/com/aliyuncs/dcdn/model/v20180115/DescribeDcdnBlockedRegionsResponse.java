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

package com.aliyuncs.dcdn.model.v20180115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnBlockedRegionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnBlockedRegionsResponse extends AcsResponse {

	private String requestId;

	private List<InfoItem> infoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<InfoItem> getInfoList() {
		return this.infoList;
	}

	public void setInfoList(List<InfoItem> infoList) {
		this.infoList = infoList;
	}

	public static class InfoItem {

		private String countriesAndRegions;

		private String countriesAndRegionsName;

		private String continent;

		public String getCountriesAndRegions() {
			return this.countriesAndRegions;
		}

		public void setCountriesAndRegions(String countriesAndRegions) {
			this.countriesAndRegions = countriesAndRegions;
		}

		public String getCountriesAndRegionsName() {
			return this.countriesAndRegionsName;
		}

		public void setCountriesAndRegionsName(String countriesAndRegionsName) {
			this.countriesAndRegionsName = countriesAndRegionsName;
		}

		public String getContinent() {
			return this.continent;
		}

		public void setContinent(String continent) {
			this.continent = continent;
		}
	}

	@Override
	public DescribeDcdnBlockedRegionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnBlockedRegionsResponseUnmarshaller.unmarshall(this, context);
	}
}
