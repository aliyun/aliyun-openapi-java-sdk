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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.CreateDiagnosticReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateDiagnosticReportResponse extends AcsResponse {

	private String status;

	private String reportId;

	private String requestId;

	private String createTime;

	private List<InvokeResult> commandInvokeResults;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReportId() {
		return this.reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public List<InvokeResult> getCommandInvokeResults() {
		return this.commandInvokeResults;
	}

	public void setCommandInvokeResults(List<InvokeResult> commandInvokeResults) {
		this.commandInvokeResults = commandInvokeResults;
	}

	public static class InvokeResult {

		private String dataFileDir;

		private String invokeResult;

		private String commandName;

		public String getDataFileDir() {
			return this.dataFileDir;
		}

		public void setDataFileDir(String dataFileDir) {
			this.dataFileDir = dataFileDir;
		}

		public String getInvokeResult() {
			return this.invokeResult;
		}

		public void setInvokeResult(String invokeResult) {
			this.invokeResult = invokeResult;
		}

		public String getCommandName() {
			return this.commandName;
		}

		public void setCommandName(String commandName) {
			this.commandName = commandName;
		}
	}

	@Override
	public CreateDiagnosticReportResponse getInstance(UnmarshallerContext context) {
		return	CreateDiagnosticReportResponseUnmarshaller.unmarshall(this, context);
	}
}
