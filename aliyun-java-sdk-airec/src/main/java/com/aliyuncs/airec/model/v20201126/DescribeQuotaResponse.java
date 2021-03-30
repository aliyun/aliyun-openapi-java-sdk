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
import com.aliyuncs.airec.transform.v20201126.DescribeQuotaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeQuotaResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Result result;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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

		private Integer currentQps;

		private Long itemCount;

		private Long itemCountUsed;

		private Integer qps;

		private Long userCount;

		private Long userCountUsed;

		public Integer getCurrentQps() {
			return this.currentQps;
		}

		public void setCurrentQps(Integer currentQps) {
			this.currentQps = currentQps;
		}

		public Long getItemCount() {
			return this.itemCount;
		}

		public void setItemCount(Long itemCount) {
			this.itemCount = itemCount;
		}

		public Long getItemCountUsed() {
			return this.itemCountUsed;
		}

		public void setItemCountUsed(Long itemCountUsed) {
			this.itemCountUsed = itemCountUsed;
		}

		public Integer getQps() {
			return this.qps;
		}

		public void setQps(Integer qps) {
			this.qps = qps;
		}

		public Long getUserCount() {
			return this.userCount;
		}

		public void setUserCount(Long userCount) {
			this.userCount = userCount;
		}

		public Long getUserCountUsed() {
			return this.userCountUsed;
		}

		public void setUserCountUsed(Long userCountUsed) {
			this.userCountUsed = userCountUsed;
		}
	}

	@Override
	public DescribeQuotaResponse getInstance(UnmarshallerContext context) {
		return	DescribeQuotaResponseUnmarshaller.unmarshall(this, context);
	}
}
