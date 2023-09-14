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

package com.aliyuncs.pairecservice.model.v20221213;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pairecservice.transform.v20221213.ListFeatureConsistencyCheckJobScoreReportsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFeatureConsistencyCheckJobScoreReportsResponse extends AcsResponse {

	private String requestId;

	private String dataPath;

	private String ossPath;

	private List<ReportsOfScoreDiffItem> reportsOfScoreDiff;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDataPath() {
		return this.dataPath;
	}

	public void setDataPath(String dataPath) {
		this.dataPath = dataPath;
	}

	public String getOssPath() {
		return this.ossPath;
	}

	public void setOssPath(String ossPath) {
		this.ossPath = ossPath;
	}

	public List<ReportsOfScoreDiffItem> getReportsOfScoreDiff() {
		return this.reportsOfScoreDiff;
	}

	public void setReportsOfScoreDiff(List<ReportsOfScoreDiffItem> reportsOfScoreDiff) {
		this.reportsOfScoreDiff = reportsOfScoreDiff;
	}

	public static class ReportsOfScoreDiffItem {

		private String logUserId;

		private String logItemId;

		private String logRequestId;

		private String scoreDiff;

		private String scoreDiffDetail;

		public String getLogUserId() {
			return this.logUserId;
		}

		public void setLogUserId(String logUserId) {
			this.logUserId = logUserId;
		}

		public String getLogItemId() {
			return this.logItemId;
		}

		public void setLogItemId(String logItemId) {
			this.logItemId = logItemId;
		}

		public String getLogRequestId() {
			return this.logRequestId;
		}

		public void setLogRequestId(String logRequestId) {
			this.logRequestId = logRequestId;
		}

		public String getScoreDiff() {
			return this.scoreDiff;
		}

		public void setScoreDiff(String scoreDiff) {
			this.scoreDiff = scoreDiff;
		}

		public String getScoreDiffDetail() {
			return this.scoreDiffDetail;
		}

		public void setScoreDiffDetail(String scoreDiffDetail) {
			this.scoreDiffDetail = scoreDiffDetail;
		}
	}

	@Override
	public ListFeatureConsistencyCheckJobScoreReportsResponse getInstance(UnmarshallerContext context) {
		return	ListFeatureConsistencyCheckJobScoreReportsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
