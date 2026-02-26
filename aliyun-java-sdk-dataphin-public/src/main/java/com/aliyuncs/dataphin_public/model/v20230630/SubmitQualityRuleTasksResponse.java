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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.SubmitQualityRuleTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SubmitQualityRuleTasksResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private SubmitResult submitResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

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

	public SubmitResult getSubmitResult() {
		return this.submitResult;
	}

	public void setSubmitResult(SubmitResult submitResult) {
		this.submitResult = submitResult;
	}

	public static class SubmitResult {

		private List<Long> ruleTaskIdList;

		private List<Long> watchTaskIdList;

		public List<Long> getRuleTaskIdList() {
			return this.ruleTaskIdList;
		}

		public void setRuleTaskIdList(List<Long> ruleTaskIdList) {
			this.ruleTaskIdList = ruleTaskIdList;
		}

		public List<Long> getWatchTaskIdList() {
			return this.watchTaskIdList;
		}

		public void setWatchTaskIdList(List<Long> watchTaskIdList) {
			this.watchTaskIdList = watchTaskIdList;
		}
	}

	@Override
	public SubmitQualityRuleTasksResponse getInstance(UnmarshallerContext context) {
		return	SubmitQualityRuleTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
