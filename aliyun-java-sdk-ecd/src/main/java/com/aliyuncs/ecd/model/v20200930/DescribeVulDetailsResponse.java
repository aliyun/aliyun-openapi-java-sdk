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
import com.aliyuncs.ecd.transform.v20200930.DescribeVulDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVulDetailsResponse extends AcsResponse {

	private String requestId;

	private List<Cve> cves;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Cve> getCves() {
		return this.cves;
	}

	public void setCves(List<Cve> cves) {
		this.cves = cves;
	}

	public static class Cve {

		private String cveId;

		private String title;

		private String cvssScore;

		private String summary;

		public String getCveId() {
			return this.cveId;
		}

		public void setCveId(String cveId) {
			this.cveId = cveId;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getCvssScore() {
			return this.cvssScore;
		}

		public void setCvssScore(String cvssScore) {
			this.cvssScore = cvssScore;
		}

		public String getSummary() {
			return this.summary;
		}

		public void setSummary(String summary) {
			this.summary = summary;
		}
	}

	@Override
	public DescribeVulDetailsResponse getInstance(UnmarshallerContext context) {
		return	DescribeVulDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
