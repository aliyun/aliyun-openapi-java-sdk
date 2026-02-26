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
import com.aliyuncs.itag.transform.v20210517.GetHistoryMarkResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetHistoryMarkResultResponse extends AcsResponse {

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

		private String workNode;

		private String accountNo;

		private String name;

		private List<UserMarkResult> userMarkResults;

		public String getWorkNode() {
			return this.workNode;
		}

		public void setWorkNode(String workNode) {
			this.workNode = workNode;
		}

		public String getAccountNo() {
			return this.accountNo;
		}

		public void setAccountNo(String accountNo) {
			this.accountNo = accountNo;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<UserMarkResult> getUserMarkResults() {
			return this.userMarkResults;
		}

		public void setUserMarkResults(List<UserMarkResult> userMarkResults) {
			this.userMarkResults = userMarkResults;
		}

		public static class UserMarkResult {

			private String markResultId;

			private String markTitle;

			private String markResult;

			private String questionId;

			private String resultType;

			private String version;

			private String markTime;

			private Progress progress;

			public String getMarkResultId() {
				return this.markResultId;
			}

			public void setMarkResultId(String markResultId) {
				this.markResultId = markResultId;
			}

			public String getMarkTitle() {
				return this.markTitle;
			}

			public void setMarkTitle(String markTitle) {
				this.markTitle = markTitle;
			}

			public String getMarkResult() {
				return this.markResult;
			}

			public void setMarkResult(String markResult) {
				this.markResult = markResult;
			}

			public String getQuestionId() {
				return this.questionId;
			}

			public void setQuestionId(String questionId) {
				this.questionId = questionId;
			}

			public String getResultType() {
				return this.resultType;
			}

			public void setResultType(String resultType) {
				this.resultType = resultType;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getMarkTime() {
				return this.markTime;
			}

			public void setMarkTime(String markTime) {
				this.markTime = markTime;
			}

			public Progress getProgress() {
				return this.progress;
			}

			public void setProgress(Progress progress) {
				this.progress = progress;
			}

			public static class Progress {

				private Integer total;

				private Integer finished;

				public Integer getTotal() {
					return this.total;
				}

				public void setTotal(Integer total) {
					this.total = total;
				}

				public Integer getFinished() {
					return this.finished;
				}

				public void setFinished(Integer finished) {
					this.finished = finished;
				}
			}
		}
	}

	@Override
	public GetHistoryMarkResultResponse getInstance(UnmarshallerContext context) {
		return	GetHistoryMarkResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
