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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryMSDdcsPushHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMSDdcsPushHistoryResponse extends AcsResponse {

	private String requestId;

	private List<HistoryItem> history;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<HistoryItem> getHistory() {
		return this.history;
	}

	public void setHistory(List<HistoryItem> history) {
		this.history = history;
	}

	public static class HistoryItem {

		private String changeType;

		private String dataId;

		private String env;

		private Long gmtEnd;

		private Long gmtStart;

		private Long id;

		private String influenceApp;

		private String operator;

		private String platform;

		private String pushResult;

		private String pushType;

		private String target;

		private String title;

		private String value;

		public String getChangeType() {
			return this.changeType;
		}

		public void setChangeType(String changeType) {
			this.changeType = changeType;
		}

		public String getDataId() {
			return this.dataId;
		}

		public void setDataId(String dataId) {
			this.dataId = dataId;
		}

		public String getEnv() {
			return this.env;
		}

		public void setEnv(String env) {
			this.env = env;
		}

		public Long getGmtEnd() {
			return this.gmtEnd;
		}

		public void setGmtEnd(Long gmtEnd) {
			this.gmtEnd = gmtEnd;
		}

		public Long getGmtStart() {
			return this.gmtStart;
		}

		public void setGmtStart(Long gmtStart) {
			this.gmtStart = gmtStart;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getInfluenceApp() {
			return this.influenceApp;
		}

		public void setInfluenceApp(String influenceApp) {
			this.influenceApp = influenceApp;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}

		public String getPlatform() {
			return this.platform;
		}

		public void setPlatform(String platform) {
			this.platform = platform;
		}

		public String getPushResult() {
			return this.pushResult;
		}

		public void setPushResult(String pushResult) {
			this.pushResult = pushResult;
		}

		public String getPushType() {
			return this.pushType;
		}

		public void setPushType(String pushType) {
			this.pushType = pushType;
		}

		public String getTarget() {
			return this.target;
		}

		public void setTarget(String target) {
			this.target = target;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public QueryMSDdcsPushHistoryResponse getInstance(UnmarshallerContext context) {
		return	QueryMSDdcsPushHistoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
