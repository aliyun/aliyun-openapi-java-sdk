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

package com.aliyuncs.adb.model.v20190315;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeSQLPatternAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSQLPatternAttributeResponse extends AcsResponse {

	private String requestId;

	private PatternDetail patternDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PatternDetail getPatternDetail() {
		return this.patternDetail;
	}

	public void setPatternDetail(PatternDetail patternDetail) {
		this.patternDetail = patternDetail;
	}

	public static class PatternDetail {

		private String sQLPattern;

		private Long queryCount;

		private String totalQueryTime;

		private String averageQueryTime;

		private String averageMemory;

		public String getSQLPattern() {
			return this.sQLPattern;
		}

		public void setSQLPattern(String sQLPattern) {
			this.sQLPattern = sQLPattern;
		}

		public Long getQueryCount() {
			return this.queryCount;
		}

		public void setQueryCount(Long queryCount) {
			this.queryCount = queryCount;
		}

		public String getTotalQueryTime() {
			return this.totalQueryTime;
		}

		public void setTotalQueryTime(String totalQueryTime) {
			this.totalQueryTime = totalQueryTime;
		}

		public String getAverageQueryTime() {
			return this.averageQueryTime;
		}

		public void setAverageQueryTime(String averageQueryTime) {
			this.averageQueryTime = averageQueryTime;
		}

		public String getAverageMemory() {
			return this.averageMemory;
		}

		public void setAverageMemory(String averageMemory) {
			this.averageMemory = averageMemory;
		}
	}

	@Override
	public DescribeSQLPatternAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeSQLPatternAttributeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
