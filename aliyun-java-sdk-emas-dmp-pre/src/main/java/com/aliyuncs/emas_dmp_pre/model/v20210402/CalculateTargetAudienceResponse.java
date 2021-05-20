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

package com.aliyuncs.emas_dmp_pre.model.v20210402;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.emas_dmp_pre.transform.v20210402.CalculateTargetAudienceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CalculateTargetAudienceResponse extends AcsResponse {

	private String requestId;

	private CalculateResult calculateResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public CalculateResult getCalculateResult() {
		return this.calculateResult;
	}

	public void setCalculateResult(CalculateResult calculateResult) {
		this.calculateResult = calculateResult;
	}

	public static class CalculateResult {

		private Long totalNumber;

		public Long getTotalNumber() {
			return this.totalNumber;
		}

		public void setTotalNumber(Long totalNumber) {
			this.totalNumber = totalNumber;
		}
	}

	@Override
	public CalculateTargetAudienceResponse getInstance(UnmarshallerContext context) {
		return	CalculateTargetAudienceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
