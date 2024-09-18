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

package com.aliyuncs.quickbi_public.model.v20220101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20220101.QueryTicketInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTicketInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Result result;

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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String accessTicket;

		private String cmptId;

		private String globalParam;

		private String invalidTime;

		private Integer maxTicketNum;

		private String organizationId;

		private String registerTime;

		private Integer usedTicketNum;

		private String userId;

		private String watermarkParam;

		private String worksId;

		public String getAccessTicket() {
			return this.accessTicket;
		}

		public void setAccessTicket(String accessTicket) {
			this.accessTicket = accessTicket;
		}

		public String getCmptId() {
			return this.cmptId;
		}

		public void setCmptId(String cmptId) {
			this.cmptId = cmptId;
		}

		public String getGlobalParam() {
			return this.globalParam;
		}

		public void setGlobalParam(String globalParam) {
			this.globalParam = globalParam;
		}

		public String getInvalidTime() {
			return this.invalidTime;
		}

		public void setInvalidTime(String invalidTime) {
			this.invalidTime = invalidTime;
		}

		public Integer getMaxTicketNum() {
			return this.maxTicketNum;
		}

		public void setMaxTicketNum(Integer maxTicketNum) {
			this.maxTicketNum = maxTicketNum;
		}

		public String getOrganizationId() {
			return this.organizationId;
		}

		public void setOrganizationId(String organizationId) {
			this.organizationId = organizationId;
		}

		public String getRegisterTime() {
			return this.registerTime;
		}

		public void setRegisterTime(String registerTime) {
			this.registerTime = registerTime;
		}

		public Integer getUsedTicketNum() {
			return this.usedTicketNum;
		}

		public void setUsedTicketNum(Integer usedTicketNum) {
			this.usedTicketNum = usedTicketNum;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getWatermarkParam() {
			return this.watermarkParam;
		}

		public void setWatermarkParam(String watermarkParam) {
			this.watermarkParam = watermarkParam;
		}

		public String getWorksId() {
			return this.worksId;
		}

		public void setWorksId(String worksId) {
			this.worksId = worksId;
		}
	}

	@Override
	public QueryTicketInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryTicketInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
