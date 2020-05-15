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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.CreateSimilarSecurityEventsQueryTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateSimilarSecurityEventsQueryTaskResponse extends AcsResponse {

	private String requestId;

	private CreateSimilarSecurityEventsQueryTaskResponse1 createSimilarSecurityEventsQueryTaskResponse1;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public CreateSimilarSecurityEventsQueryTaskResponse1 getCreateSimilarSecurityEventsQueryTaskResponse1() {
		return this.createSimilarSecurityEventsQueryTaskResponse1;
	}

	public void setCreateSimilarSecurityEventsQueryTaskResponse1(CreateSimilarSecurityEventsQueryTaskResponse1 createSimilarSecurityEventsQueryTaskResponse1) {
		this.createSimilarSecurityEventsQueryTaskResponse1 = createSimilarSecurityEventsQueryTaskResponse1;
	}

	public static class CreateSimilarSecurityEventsQueryTaskResponse1 {

		private Long taskId;

		private String status;

		public Long getTaskId() {
			return this.taskId;
		}

		public void setTaskId(Long taskId) {
			this.taskId = taskId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public CreateSimilarSecurityEventsQueryTaskResponse getInstance(UnmarshallerContext context) {
		return	CreateSimilarSecurityEventsQueryTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
