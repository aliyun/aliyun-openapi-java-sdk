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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListJobExecutionPlanParamsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListJobExecutionPlanParamsResponse extends AcsResponse {

	private String requestId;

	private String success;

	private String errCode;

	private String errMsg;

	private List<ParamInfo> paramInfoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return this.errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public List<ParamInfo> getParamInfoList() {
		return this.paramInfoList;
	}

	public void setParamInfoList(List<ParamInfo> paramInfoList) {
		this.paramInfoList = paramInfoList;
	}

	public static class ParamInfo {

		private String paramBizType;

		private String relateId;

		private String paramName;

		private String paramValue;

		private Long utcCreateTimestamp;

		private Long utcModifiedTimestamp;

		public String getParamBizType() {
			return this.paramBizType;
		}

		public void setParamBizType(String paramBizType) {
			this.paramBizType = paramBizType;
		}

		public String getRelateId() {
			return this.relateId;
		}

		public void setRelateId(String relateId) {
			this.relateId = relateId;
		}

		public String getParamName() {
			return this.paramName;
		}

		public void setParamName(String paramName) {
			this.paramName = paramName;
		}

		public String getParamValue() {
			return this.paramValue;
		}

		public void setParamValue(String paramValue) {
			this.paramValue = paramValue;
		}

		public Long getUtcCreateTimestamp() {
			return this.utcCreateTimestamp;
		}

		public void setUtcCreateTimestamp(Long utcCreateTimestamp) {
			this.utcCreateTimestamp = utcCreateTimestamp;
		}

		public Long getUtcModifiedTimestamp() {
			return this.utcModifiedTimestamp;
		}

		public void setUtcModifiedTimestamp(Long utcModifiedTimestamp) {
			this.utcModifiedTimestamp = utcModifiedTimestamp;
		}
	}

	@Override
	public ListJobExecutionPlanParamsResponse getInstance(UnmarshallerContext context) {
		return	ListJobExecutionPlanParamsResponseUnmarshaller.unmarshall(this, context);
	}
}
