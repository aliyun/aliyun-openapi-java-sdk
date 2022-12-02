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

package com.aliyuncs.airec.model.v20201126;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20201126.ListFlowControlTaskReferenceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFlowControlTaskReferenceResponse extends AcsResponse {

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

		private Double last7PvPercent;

		private Double last7ScenePv;

		private Double last7TaskPv;

		private Double lastPvPercent;

		private Long lastScenePv;

		private Long lastTaskPv;

		private String referenceId;

		public Double getLast7PvPercent() {
			return this.last7PvPercent;
		}

		public void setLast7PvPercent(Double last7PvPercent) {
			this.last7PvPercent = last7PvPercent;
		}

		public Double getLast7ScenePv() {
			return this.last7ScenePv;
		}

		public void setLast7ScenePv(Double last7ScenePv) {
			this.last7ScenePv = last7ScenePv;
		}

		public Double getLast7TaskPv() {
			return this.last7TaskPv;
		}

		public void setLast7TaskPv(Double last7TaskPv) {
			this.last7TaskPv = last7TaskPv;
		}

		public Double getLastPvPercent() {
			return this.lastPvPercent;
		}

		public void setLastPvPercent(Double lastPvPercent) {
			this.lastPvPercent = lastPvPercent;
		}

		public Long getLastScenePv() {
			return this.lastScenePv;
		}

		public void setLastScenePv(Long lastScenePv) {
			this.lastScenePv = lastScenePv;
		}

		public Long getLastTaskPv() {
			return this.lastTaskPv;
		}

		public void setLastTaskPv(Long lastTaskPv) {
			this.lastTaskPv = lastTaskPv;
		}

		public String getReferenceId() {
			return this.referenceId;
		}

		public void setReferenceId(String referenceId) {
			this.referenceId = referenceId;
		}
	}

	@Override
	public ListFlowControlTaskReferenceResponse getInstance(UnmarshallerContext context) {
		return	ListFlowControlTaskReferenceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
