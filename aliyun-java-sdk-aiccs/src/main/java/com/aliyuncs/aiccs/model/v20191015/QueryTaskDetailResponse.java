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

package com.aliyuncs.aiccs.model.v20191015;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aiccs.transform.v20191015.QueryTaskDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTaskDetailResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String httpStatusCode;

	private String code;

	private String success;

	private Data data;

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

	public String getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String totalResults;

		private String currentPage;

		private String pageSize;

		private List<ListItem> list;

		public String getTotalResults() {
			return this.totalResults;
		}

		public void setTotalResults(String totalResults) {
			this.totalResults = totalResults;
		}

		public String getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(String currentPage) {
			this.currentPage = currentPage;
		}

		public String getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(String pageSize) {
			this.pageSize = pageSize;
		}

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private Integer status;

			private String memberName;

			private String servicerName;

			private Integer outboundNum;

			private String retryTime;

			private Integer priority;

			private Long gmtModified;

			private String dnis;

			private Long servicerId;

			private Long outboundTaskId;

			private Long buId;

			private Integer endReason;

			private Long gmtCreate;

			private Long departmentId;

			private String ani;

			private Long memberId;

			private Integer skillGroup;

			private String extAttrs;

			private Integer id;

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getMemberName() {
				return this.memberName;
			}

			public void setMemberName(String memberName) {
				this.memberName = memberName;
			}

			public String getServicerName() {
				return this.servicerName;
			}

			public void setServicerName(String servicerName) {
				this.servicerName = servicerName;
			}

			public Integer getOutboundNum() {
				return this.outboundNum;
			}

			public void setOutboundNum(Integer outboundNum) {
				this.outboundNum = outboundNum;
			}

			public String getRetryTime() {
				return this.retryTime;
			}

			public void setRetryTime(String retryTime) {
				this.retryTime = retryTime;
			}

			public Integer getPriority() {
				return this.priority;
			}

			public void setPriority(Integer priority) {
				this.priority = priority;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getDnis() {
				return this.dnis;
			}

			public void setDnis(String dnis) {
				this.dnis = dnis;
			}

			public Long getServicerId() {
				return this.servicerId;
			}

			public void setServicerId(Long servicerId) {
				this.servicerId = servicerId;
			}

			public Long getOutboundTaskId() {
				return this.outboundTaskId;
			}

			public void setOutboundTaskId(Long outboundTaskId) {
				this.outboundTaskId = outboundTaskId;
			}

			public Long getBuId() {
				return this.buId;
			}

			public void setBuId(Long buId) {
				this.buId = buId;
			}

			public Integer getEndReason() {
				return this.endReason;
			}

			public void setEndReason(Integer endReason) {
				this.endReason = endReason;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getDepartmentId() {
				return this.departmentId;
			}

			public void setDepartmentId(Long departmentId) {
				this.departmentId = departmentId;
			}

			public String getAni() {
				return this.ani;
			}

			public void setAni(String ani) {
				this.ani = ani;
			}

			public Long getMemberId() {
				return this.memberId;
			}

			public void setMemberId(Long memberId) {
				this.memberId = memberId;
			}

			public Integer getSkillGroup() {
				return this.skillGroup;
			}

			public void setSkillGroup(Integer skillGroup) {
				this.skillGroup = skillGroup;
			}

			public String getExtAttrs() {
				return this.extAttrs;
			}

			public void setExtAttrs(String extAttrs) {
				this.extAttrs = extAttrs;
			}

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}
		}
	}

	@Override
	public QueryTaskDetailResponse getInstance(UnmarshallerContext context) {
		return	QueryTaskDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
