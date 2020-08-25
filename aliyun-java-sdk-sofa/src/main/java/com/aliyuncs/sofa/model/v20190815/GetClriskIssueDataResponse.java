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
import com.aliyuncs.sofa.transform.v20190815.GetClriskIssueDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetClriskIssueDataResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String cycle;

	private String issueDataId;

	private Long taskId;

	private List<ValuesItem> values;

	private List<String> heads;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getCycle() {
		return this.cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	public String getIssueDataId() {
		return this.issueDataId;
	}

	public void setIssueDataId(String issueDataId) {
		this.issueDataId = issueDataId;
	}

	public Long getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public List<ValuesItem> getValues() {
		return this.values;
	}

	public void setValues(List<ValuesItem> values) {
		this.values = values;
	}

	public List<String> getHeads() {
		return this.heads;
	}

	public void setHeads(List<String> heads) {
		this.heads = heads;
	}

	public static class ValuesItem {

		private List<String> names;

		private List<String> values1;

		public List<String> getNames() {
			return this.names;
		}

		public void setNames(List<String> names) {
			this.names = names;
		}

		public List<String> getValues1() {
			return this.values1;
		}

		public void setValues1(List<String> values1) {
			this.values1 = values1;
		}
	}

	@Override
	public GetClriskIssueDataResponse getInstance(UnmarshallerContext context) {
		return	GetClriskIssueDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
