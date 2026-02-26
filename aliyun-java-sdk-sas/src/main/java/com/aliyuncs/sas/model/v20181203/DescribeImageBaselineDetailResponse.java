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
import com.aliyuncs.sas.transform.v20181203.DescribeImageBaselineDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageBaselineDetailResponse extends AcsResponse {

	private String requestId;

	private BaselineDetail baselineDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public BaselineDetail getBaselineDetail() {
		return this.baselineDetail;
	}

	public void setBaselineDetail(BaselineDetail baselineDetail) {
		this.baselineDetail = baselineDetail;
	}

	public static class BaselineDetail {

		private String advice;

		private String resultId;

		private String description;

		private String baselineItemAlias;

		private String baselineNameAlias;

		private String baselineClassAlias;

		private String baselineItemKey;

		private String prompt;

		private String level;

		public String getAdvice() {
			return this.advice;
		}

		public void setAdvice(String advice) {
			this.advice = advice;
		}

		public String getResultId() {
			return this.resultId;
		}

		public void setResultId(String resultId) {
			this.resultId = resultId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getBaselineItemAlias() {
			return this.baselineItemAlias;
		}

		public void setBaselineItemAlias(String baselineItemAlias) {
			this.baselineItemAlias = baselineItemAlias;
		}

		public String getBaselineNameAlias() {
			return this.baselineNameAlias;
		}

		public void setBaselineNameAlias(String baselineNameAlias) {
			this.baselineNameAlias = baselineNameAlias;
		}

		public String getBaselineClassAlias() {
			return this.baselineClassAlias;
		}

		public void setBaselineClassAlias(String baselineClassAlias) {
			this.baselineClassAlias = baselineClassAlias;
		}

		public String getBaselineItemKey() {
			return this.baselineItemKey;
		}

		public void setBaselineItemKey(String baselineItemKey) {
			this.baselineItemKey = baselineItemKey;
		}

		public String getPrompt() {
			return this.prompt;
		}

		public void setPrompt(String prompt) {
			this.prompt = prompt;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}
	}

	@Override
	public DescribeImageBaselineDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeImageBaselineDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
