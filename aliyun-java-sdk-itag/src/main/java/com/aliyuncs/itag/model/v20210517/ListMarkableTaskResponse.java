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
import com.aliyuncs.itag.transform.v20210517.ListMarkableTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMarkableTaskResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String errInfo;

	private String msg;

	private Boolean succ;

	private String errorCode;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrInfo() {
		return this.errInfo;
	}

	public void setErrInfo(String errInfo) {
		this.errInfo = errInfo;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Boolean getSucc() {
		return this.succ;
	}

	public void setSucc(Boolean succ) {
		this.succ = succ;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Long pageNum;

		private Long pageSize;

		private Long total;

		private Long totalPage;

		private List<ListItem> list;

		public Long getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Long pageNum) {
			this.pageNum = pageNum;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public Long getTotalPage() {
			return this.totalPage;
		}

		public void setTotalPage(Long totalPage) {
			this.totalPage = totalPage;
		}

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private String taskId;

			private String taskName;

			private Long count;

			private List<String> tags;

			private Creator creator;

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

			public Long getCount() {
				return this.count;
			}

			public void setCount(Long count) {
				this.count = count;
			}

			public List<String> getTags() {
				return this.tags;
			}

			public void setTags(List<String> tags) {
				this.tags = tags;
			}

			public Creator getCreator() {
				return this.creator;
			}

			public void setCreator(Creator creator) {
				this.creator = creator;
			}

			public static class Creator {

				private String userId;

				private String userName;

				private String accountType;

				private String accountNo;

				public String getUserId() {
					return this.userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}

				public String getUserName() {
					return this.userName;
				}

				public void setUserName(String userName) {
					this.userName = userName;
				}

				public String getAccountType() {
					return this.accountType;
				}

				public void setAccountType(String accountType) {
					this.accountType = accountType;
				}

				public String getAccountNo() {
					return this.accountNo;
				}

				public void setAccountNo(String accountNo) {
					this.accountNo = accountNo;
				}
			}
		}
	}

	@Override
	public ListMarkableTaskResponse getInstance(UnmarshallerContext context) {
		return	ListMarkableTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
