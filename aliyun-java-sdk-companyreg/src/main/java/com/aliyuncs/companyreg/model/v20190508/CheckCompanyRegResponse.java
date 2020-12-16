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

package com.aliyuncs.companyreg.model.v20190508;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.companyreg.transform.v20190508.CheckCompanyRegResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckCompanyRegResponse extends AcsResponse {

	private String requestId;

	private String matchCity;

	private String matchBrand;

	private String matchSensitive;

	private String level;

	private List<Company> similarCompanies;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMatchCity() {
		return this.matchCity;
	}

	public void setMatchCity(String matchCity) {
		this.matchCity = matchCity;
	}

	public String getMatchBrand() {
		return this.matchBrand;
	}

	public void setMatchBrand(String matchBrand) {
		this.matchBrand = matchBrand;
	}

	public String getMatchSensitive() {
		return this.matchSensitive;
	}

	public void setMatchSensitive(String matchSensitive) {
		this.matchSensitive = matchSensitive;
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public List<Company> getSimilarCompanies() {
		return this.similarCompanies;
	}

	public void setSimilarCompanies(List<Company> similarCompanies) {
		this.similarCompanies = similarCompanies;
	}

	public static class Company {

		private String companyName;

		private String level;

		public String getCompanyName() {
			return this.companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}
	}

	@Override
	public CheckCompanyRegResponse getInstance(UnmarshallerContext context) {
		return	CheckCompanyRegResponseUnmarshaller.unmarshall(this, context);
	}
}
