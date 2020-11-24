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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeDomainViewSourceCountriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainViewSourceCountriesResponse extends AcsResponse {

	private String requestId;

	private List<Country> sourceCountrys;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Country> getSourceCountrys() {
		return this.sourceCountrys;
	}

	public void setSourceCountrys(List<Country> sourceCountrys) {
		this.sourceCountrys = sourceCountrys;
	}

	public static class Country {

		private Long count;

		private String countryId;

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public String getCountryId() {
			return this.countryId;
		}

		public void setCountryId(String countryId) {
			this.countryId = countryId;
		}
	}

	@Override
	public DescribeDomainViewSourceCountriesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainViewSourceCountriesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
