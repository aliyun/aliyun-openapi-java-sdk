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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.CreateGADInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateGADInstanceResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String gadInstanceName;

		private String createMemberCount;

		private String taskID;

		public String getGadInstanceName() {
			return this.gadInstanceName;
		}

		public void setGadInstanceName(String gadInstanceName) {
			this.gadInstanceName = gadInstanceName;
		}

		public String getCreateMemberCount() {
			return this.createMemberCount;
		}

		public void setCreateMemberCount(String createMemberCount) {
			this.createMemberCount = createMemberCount;
		}

		public String getTaskID() {
			return this.taskID;
		}

		public void setTaskID(String taskID) {
			this.taskID = taskID;
		}
	}

	@Override
	public CreateGADInstanceResponse getInstance(UnmarshallerContext context) {
		return	CreateGADInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
