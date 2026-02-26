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
import com.aliyuncs.itag.transform.v20210517.ListFinishedSubUserTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFinishedSubUserTaskResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String msg;

	private String errInfo;

	private Boolean succ;

	private Long rt;

	private String host;

	private String errorCode;

	private Result result;

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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Integer pageNum;

		private Integer pageSize;

		private Long total;

		private Long totalPage;

		private List<ListItem> list;

		public Integer getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
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

			private String subTaskId;

			private String taskName;

			private String taskId;

			private String state;

			private String workTime;

			private String workNode;

			private String userSubTaskId;

			private String gmtCreate;

			private String gmtModified;

			private Creator creator;

			private Modifier modifier;

			public String getSubTaskId() {
				return this.subTaskId;
			}

			public void setSubTaskId(String subTaskId) {
				this.subTaskId = subTaskId;
			}

			public String getTaskName() {
				return this.taskName;
			}

			public void setTaskName(String taskName) {
				this.taskName = taskName;
			}

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getWorkTime() {
				return this.workTime;
			}

			public void setWorkTime(String workTime) {
				this.workTime = workTime;
			}

			public String getWorkNode() {
				return this.workNode;
			}

			public void setWorkNode(String workNode) {
				this.workNode = workNode;
			}

			public String getUserSubTaskId() {
				return this.userSubTaskId;
			}

			public void setUserSubTaskId(String userSubTaskId) {
				this.userSubTaskId = userSubTaskId;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public Creator getCreator() {
				return this.creator;
			}

			public void setCreator(Creator creator) {
				this.creator = creator;
			}

			public Modifier getModifier() {
				return this.modifier;
			}

			public void setModifier(Modifier modifier) {
				this.modifier = modifier;
			}

			public static class Creator {

				private String userId;

				private String userName;

				private String accountType;

				private String accountNo;

				private String email;

				private String pamNo;

				private String supplierId;

				private String supplierName;

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

				public String getEmail() {
					return this.email;
				}

				public void setEmail(String email) {
					this.email = email;
				}

				public String getPamNo() {
					return this.pamNo;
				}

				public void setPamNo(String pamNo) {
					this.pamNo = pamNo;
				}

				public String getSupplierId() {
					return this.supplierId;
				}

				public void setSupplierId(String supplierId) {
					this.supplierId = supplierId;
				}

				public String getSupplierName() {
					return this.supplierName;
				}

				public void setSupplierName(String supplierName) {
					this.supplierName = supplierName;
				}
			}

			public static class Modifier {

				private String userId;

				private String userName;

				private String accountType;

				private String accountNo;

				private String email;

				private String pamNo;

				private String supplierId;

				private String supplierName;

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

				public String getEmail() {
					return this.email;
				}

				public void setEmail(String email) {
					this.email = email;
				}

				public String getPamNo() {
					return this.pamNo;
				}

				public void setPamNo(String pamNo) {
					this.pamNo = pamNo;
				}

				public String getSupplierId() {
					return this.supplierId;
				}

				public void setSupplierId(String supplierId) {
					this.supplierId = supplierId;
				}

				public String getSupplierName() {
					return this.supplierName;
				}

				public void setSupplierName(String supplierName) {
					this.supplierName = supplierName;
				}
			}
		}
	}

	@Override
	public ListFinishedSubUserTaskResponse getInstance(UnmarshallerContext context) {
		return	ListFinishedSubUserTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
