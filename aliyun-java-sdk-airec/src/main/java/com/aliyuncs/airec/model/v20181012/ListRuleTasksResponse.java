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

package com.aliyuncs.airec.model.v20181012;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20181012.ListRuleTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRuleTasksResponse extends AcsResponse {

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

		private Integer finishRate;

		private Integer finishTime;

		public Integer getFinishRate() {
			return this.finishRate;
		}

		public void setFinishRate(Integer finishRate) {
			this.finishRate = finishRate;
		}

		public Integer getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(Integer finishTime) {
			this.finishTime = finishTime;
		}
	}

	@Override
	public ListRuleTasksResponse getInstance(UnmarshallerContext context) {
		return	ListRuleTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
