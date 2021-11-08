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

package com.aliyuncs.elasticsearch.model.v20170613;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.elasticsearch.transform.v20170613.GetOpenStoreUsageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOpenStoreUsageResponse extends AcsResponse {

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

		private Long lastDayUsage;

		private Long currentUsage;

		public Long getLastDayUsage() {
			return this.lastDayUsage;
		}

		public void setLastDayUsage(Long lastDayUsage) {
			this.lastDayUsage = lastDayUsage;
		}

		public Long getCurrentUsage() {
			return this.currentUsage;
		}

		public void setCurrentUsage(Long currentUsage) {
			this.currentUsage = currentUsage;
		}
	}

	@Override
	public GetOpenStoreUsageResponse getInstance(UnmarshallerContext context) {
		return	GetOpenStoreUsageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
