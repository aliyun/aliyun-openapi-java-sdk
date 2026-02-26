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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeAbnormalPatternDetectionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAbnormalPatternDetectionResponse extends AcsResponse {

	private String totalCount;

	private String requestId;

	private String dBClusterId;

	private List<OpenApiFasDetectionItem> detectionItems;

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public List<OpenApiFasDetectionItem> getDetectionItems() {
		return this.detectionItems;
	}

	public void setDetectionItems(List<OpenApiFasDetectionItem> detectionItems) {
		this.detectionItems = detectionItems;
	}

	public static class OpenApiFasDetectionItem {

		private String name;

		private String status;

		private String message;

		private List<AbnormalPatterns> results;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public List<AbnormalPatterns> getResults() {
			return this.results;
		}

		public void setResults(List<AbnormalPatterns> results) {
			this.results = results;
		}

		public static class AbnormalPatterns {

			private String patternId;

			private String sQLPattern;

			private String detail;

			private String relatedMetrics;

			private String user;

			private String accessIp;

			private String tables;

			private Long queryCount;

			private Long failedCount;

			public String getPatternId() {
				return this.patternId;
			}

			public void setPatternId(String patternId) {
				this.patternId = patternId;
			}

			public String getSQLPattern() {
				return this.sQLPattern;
			}

			public void setSQLPattern(String sQLPattern) {
				this.sQLPattern = sQLPattern;
			}

			public String getDetail() {
				return this.detail;
			}

			public void setDetail(String detail) {
				this.detail = detail;
			}

			public String getRelatedMetrics() {
				return this.relatedMetrics;
			}

			public void setRelatedMetrics(String relatedMetrics) {
				this.relatedMetrics = relatedMetrics;
			}

			public String getUser() {
				return this.user;
			}

			public void setUser(String user) {
				this.user = user;
			}

			public String getAccessIp() {
				return this.accessIp;
			}

			public void setAccessIp(String accessIp) {
				this.accessIp = accessIp;
			}

			public String getTables() {
				return this.tables;
			}

			public void setTables(String tables) {
				this.tables = tables;
			}

			public Long getQueryCount() {
				return this.queryCount;
			}

			public void setQueryCount(Long queryCount) {
				this.queryCount = queryCount;
			}

			public Long getFailedCount() {
				return this.failedCount;
			}

			public void setFailedCount(Long failedCount) {
				this.failedCount = failedCount;
			}
		}
	}

	@Override
	public DescribeAbnormalPatternDetectionResponse getInstance(UnmarshallerContext context) {
		return	DescribeAbnormalPatternDetectionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
