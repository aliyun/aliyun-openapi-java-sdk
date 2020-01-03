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

package com.aliyuncs.ehpc.model.v20180412;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.DescribeNFSClientStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNFSClientStatusResponse extends AcsResponse {

	private String status;

	private Result result;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String invokeRecordStatus;

		private Integer exitCode;

		private String output;

		public String getInvokeRecordStatus() {
			return this.invokeRecordStatus;
		}

		public void setInvokeRecordStatus(String invokeRecordStatus) {
			this.invokeRecordStatus = invokeRecordStatus;
		}

		public Integer getExitCode() {
			return this.exitCode;
		}

		public void setExitCode(Integer exitCode) {
			this.exitCode = exitCode;
		}

		public String getOutput() {
			return this.output;
		}

		public void setOutput(String output) {
			this.output = output;
		}
	}

	@Override
	public DescribeNFSClientStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeNFSClientStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
