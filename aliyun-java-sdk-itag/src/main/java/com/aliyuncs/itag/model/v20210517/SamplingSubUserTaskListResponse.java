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

package com.aliyuncs.itag.model.v20210517;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.itag.transform.v20210517.SamplingSubUserTaskListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SamplingSubUserTaskListResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String msg;

	private String errInfo;

	private Boolean succ;

	private Long rt;

	private String host;

	private String errorCode;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getErrInfo() {
		return this.errInfo;
	}

	public void setErrInfo(String errInfo) {
		this.errInfo = errInfo;
	}

	public Boolean getSucc() {
		return this.succ;
	}

	public void setSucc(Boolean succ) {
		this.succ = succ;
	}

	public Long getRt() {
		return this.rt;
	}

	public void setRt(Long rt) {
		this.rt = rt;
	}

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String taskId;

		private String taskName;

		private String userTaskId;

		private String state;

		private String sampleUserName;

		private String baseInfo;

		private Long totalItemCount;

		private Long finishedItemCount;

		private String type;

		private Boolean allowOperate;

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public String getUserTaskId() {
			return this.userTaskId;
		}

		public void setUserTaskId(String userTaskId) {
			this.userTaskId = userTaskId;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getSampleUserName() {
			return this.sampleUserName;
		}

		public void setSampleUserName(String sampleUserName) {
			this.sampleUserName = sampleUserName;
		}

		public String getBaseInfo() {
			return this.baseInfo;
		}

		public void setBaseInfo(String baseInfo) {
			this.baseInfo = baseInfo;
		}

		public Long getTotalItemCount() {
			return this.totalItemCount;
		}

		public void setTotalItemCount(Long totalItemCount) {
			this.totalItemCount = totalItemCount;
		}

		public Long getFinishedItemCount() {
			return this.finishedItemCount;
		}

		public void setFinishedItemCount(Long finishedItemCount) {
			this.finishedItemCount = finishedItemCount;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Boolean getAllowOperate() {
			return this.allowOperate;
		}

		public void setAllowOperate(Boolean allowOperate) {
			this.allowOperate = allowOperate;
		}
	}

	@Override
	public SamplingSubUserTaskListResponse getInstance(UnmarshallerContext context) {
		return	SamplingSubUserTaskListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
