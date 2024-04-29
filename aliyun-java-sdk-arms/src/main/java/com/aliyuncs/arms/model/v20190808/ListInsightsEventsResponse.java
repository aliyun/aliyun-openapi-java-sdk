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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.ListInsightsEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInsightsEventsResponse extends AcsResponse {

	private String requestId;

	private List<ProblemInfos> insightsEvents;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ProblemInfos> getInsightsEvents() {
		return this.insightsEvents;
	}

	public void setInsightsEvents(List<ProblemInfos> insightsEvents) {
		this.insightsEvents = insightsEvents;
	}

	public static class ProblemInfos {

		private String title;

		private String desc;

		private String type;

		private String pid;

		private String level;

		private Long date;

		private String problemId;

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getPid() {
			return this.pid;
		}

		public void setPid(String pid) {
			this.pid = pid;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public Long getDate() {
			return this.date;
		}

		public void setDate(Long date) {
			this.date = date;
		}

		public String getProblemId() {
			return this.problemId;
		}

		public void setProblemId(String problemId) {
			this.problemId = problemId;
		}
	}

	@Override
	public ListInsightsEventsResponse getInstance(UnmarshallerContext context) {
		return	ListInsightsEventsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
