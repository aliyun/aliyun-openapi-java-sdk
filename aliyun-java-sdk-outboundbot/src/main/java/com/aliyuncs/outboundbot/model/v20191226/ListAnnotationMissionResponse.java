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

package com.aliyuncs.outboundbot.model.v20191226;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.ListAnnotationMissionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAnnotationMissionResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private String requestId;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long pageIndex;

		private Long pageSize;

		private Long totalCount;

		private Long totalPageCount;

		private Boolean success;

		private String message;

		private List<AnnotationMissionListItem> annotationMissionList;

		public Long getPageIndex() {
			return this.pageIndex;
		}

		public void setPageIndex(Long pageIndex) {
			this.pageIndex = pageIndex;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public Long getTotalPageCount() {
			return this.totalPageCount;
		}

		public void setTotalPageCount(Long totalPageCount) {
			this.totalPageCount = totalPageCount;
		}

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public List<AnnotationMissionListItem> getAnnotationMissionList() {
			return this.annotationMissionList;
		}

		public void setAnnotationMissionList(List<AnnotationMissionListItem> annotationMissionList) {
			this.annotationMissionList = annotationMissionList;
		}

		public static class AnnotationMissionListItem {

			private Integer annotationMissionDataSourceType;

			private String instanceId;

			private String annotationMissionId;

			private String annotationMissionName;

			private Integer annotationStatus;

			private Long createTime;

			private Integer sessionTotalCount;

			private Integer sessionFinishCount;

			private Long finishTime;

			private Boolean excludeOtherMissionSession;

			private Long conversationTimeStartFilter;

			private Long conversationTimeEndFilter;

			private Integer samplingType;

			private Integer samplingRate;

			private Integer samplingCount;

			private String samplingDescription;

			private List<Integer> sessionEndReasonFilterList;

			private List<Integer> annotationMissionDebugDataSourceList;

			public Integer getAnnotationMissionDataSourceType() {
				return this.annotationMissionDataSourceType;
			}

			public void setAnnotationMissionDataSourceType(Integer annotationMissionDataSourceType) {
				this.annotationMissionDataSourceType = annotationMissionDataSourceType;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getAnnotationMissionId() {
				return this.annotationMissionId;
			}

			public void setAnnotationMissionId(String annotationMissionId) {
				this.annotationMissionId = annotationMissionId;
			}

			public String getAnnotationMissionName() {
				return this.annotationMissionName;
			}

			public void setAnnotationMissionName(String annotationMissionName) {
				this.annotationMissionName = annotationMissionName;
			}

			public Integer getAnnotationStatus() {
				return this.annotationStatus;
			}

			public void setAnnotationStatus(Integer annotationStatus) {
				this.annotationStatus = annotationStatus;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public Integer getSessionTotalCount() {
				return this.sessionTotalCount;
			}

			public void setSessionTotalCount(Integer sessionTotalCount) {
				this.sessionTotalCount = sessionTotalCount;
			}

			public Integer getSessionFinishCount() {
				return this.sessionFinishCount;
			}

			public void setSessionFinishCount(Integer sessionFinishCount) {
				this.sessionFinishCount = sessionFinishCount;
			}

			public Long getFinishTime() {
				return this.finishTime;
			}

			public void setFinishTime(Long finishTime) {
				this.finishTime = finishTime;
			}

			public Boolean getExcludeOtherMissionSession() {
				return this.excludeOtherMissionSession;
			}

			public void setExcludeOtherMissionSession(Boolean excludeOtherMissionSession) {
				this.excludeOtherMissionSession = excludeOtherMissionSession;
			}

			public Long getConversationTimeStartFilter() {
				return this.conversationTimeStartFilter;
			}

			public void setConversationTimeStartFilter(Long conversationTimeStartFilter) {
				this.conversationTimeStartFilter = conversationTimeStartFilter;
			}

			public Long getConversationTimeEndFilter() {
				return this.conversationTimeEndFilter;
			}

			public void setConversationTimeEndFilter(Long conversationTimeEndFilter) {
				this.conversationTimeEndFilter = conversationTimeEndFilter;
			}

			public Integer getSamplingType() {
				return this.samplingType;
			}

			public void setSamplingType(Integer samplingType) {
				this.samplingType = samplingType;
			}

			public Integer getSamplingRate() {
				return this.samplingRate;
			}

			public void setSamplingRate(Integer samplingRate) {
				this.samplingRate = samplingRate;
			}

			public Integer getSamplingCount() {
				return this.samplingCount;
			}

			public void setSamplingCount(Integer samplingCount) {
				this.samplingCount = samplingCount;
			}

			public String getSamplingDescription() {
				return this.samplingDescription;
			}

			public void setSamplingDescription(String samplingDescription) {
				this.samplingDescription = samplingDescription;
			}

			public List<Integer> getSessionEndReasonFilterList() {
				return this.sessionEndReasonFilterList;
			}

			public void setSessionEndReasonFilterList(List<Integer> sessionEndReasonFilterList) {
				this.sessionEndReasonFilterList = sessionEndReasonFilterList;
			}

			public List<Integer> getAnnotationMissionDebugDataSourceList() {
				return this.annotationMissionDebugDataSourceList;
			}

			public void setAnnotationMissionDebugDataSourceList(List<Integer> annotationMissionDebugDataSourceList) {
				this.annotationMissionDebugDataSourceList = annotationMissionDebugDataSourceList;
			}
		}
	}

	@Override
	public ListAnnotationMissionResponse getInstance(UnmarshallerContext context) {
		return	ListAnnotationMissionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
