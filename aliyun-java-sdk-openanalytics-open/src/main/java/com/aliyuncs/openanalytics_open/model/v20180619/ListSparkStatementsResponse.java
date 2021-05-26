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

package com.aliyuncs.openanalytics_open.model.v20180619;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.openanalytics_open.transform.v20180619.ListSparkStatementsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSparkStatementsResponse extends AcsResponse {

	private String requestId;

	private List<StatementsItem> statements;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<StatementsItem> getStatements() {
		return this.statements;
	}

	public void setStatements(List<StatementsItem> statements) {
		this.statements = statements;
	}

	public static class StatementsItem {

		private Integer id;

		private String code;

		private String state;

		private String output;

		private Float progress;

		private Long startedTime;

		private Long completedTime;

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getOutput() {
			return this.output;
		}

		public void setOutput(String output) {
			this.output = output;
		}

		public Float getProgress() {
			return this.progress;
		}

		public void setProgress(Float progress) {
			this.progress = progress;
		}

		public Long getStartedTime() {
			return this.startedTime;
		}

		public void setStartedTime(Long startedTime) {
			this.startedTime = startedTime;
		}

		public Long getCompletedTime() {
			return this.completedTime;
		}

		public void setCompletedTime(Long completedTime) {
			this.completedTime = completedTime;
		}
	}

	@Override
	public ListSparkStatementsResponse getInstance(UnmarshallerContext context) {
		return	ListSparkStatementsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
