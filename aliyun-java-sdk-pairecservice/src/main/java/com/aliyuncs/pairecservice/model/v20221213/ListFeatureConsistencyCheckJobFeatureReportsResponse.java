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
import com.aliyuncs.pairecservice.transform.v20221213.ListFeatureConsistencyCheckJobFeatureReportsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFeatureConsistencyCheckJobFeatureReportsResponse extends AcsResponse {

	private String requestId;

	private String dataPath;

	private String ossPath;

	private List<ReportsOfFeatureDiffItem> reportsOfFeatureDiff;

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

	public List<ReportsOfFeatureDiffItem> getReportsOfFeatureDiff() {
		return this.reportsOfFeatureDiff;
	}

	public void setReportsOfFeatureDiff(List<ReportsOfFeatureDiffItem> reportsOfFeatureDiff) {
		this.reportsOfFeatureDiff = reportsOfFeatureDiff;
	}

	public static class ReportsOfFeatureDiffItem {

		private String logUserId;

		private String logItemId;

		private String logRequestId;

		private String featureName;

		private String offlineValue;

		private String onlineValue;

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

		public String getFeatureName() {
			return this.featureName;
		}

		public void setFeatureName(String featureName) {
			this.featureName = featureName;
		}

		public String getOfflineValue() {
			return this.offlineValue;
		}

		public void setOfflineValue(String offlineValue) {
			this.offlineValue = offlineValue;
		}

		public String getOnlineValue() {
			return this.onlineValue;
		}

		public void setOnlineValue(String onlineValue) {
			this.onlineValue = onlineValue;
		}
	}

	@Override
	public ListFeatureConsistencyCheckJobFeatureReportsResponse getInstance(UnmarshallerContext context) {
		return	ListFeatureConsistencyCheckJobFeatureReportsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
