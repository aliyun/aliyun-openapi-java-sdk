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

package com.aliyuncs.linkedmall.model.v20180116;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.QueryUnfinishedActivitiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryUnfinishedActivitiesResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Long pageSize;

	private Long pageNumber;

	private Long totalCount;

	private List<LmActivityModelV2Ext> lmActivityModelExtList;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<LmActivityModelV2Ext> getLmActivityModelExtList() {
		return this.lmActivityModelExtList;
	}

	public void setLmActivityModelExtList(List<LmActivityModelV2Ext> lmActivityModelExtList) {
		this.lmActivityModelExtList = lmActivityModelExtList;
	}

	public static class LmActivityModelV2Ext {

		private String startDate;

		private String name;

		private Long lmActivityId;

		private String endDate;

		private String description;

		private String bizId;

		private String activityPicUrl;

		private List<LmActivitySessionModel> lmActivitySessionModels;

		public String getStartDate() {
			return this.startDate;
		}

		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getLmActivityId() {
			return this.lmActivityId;
		}

		public void setLmActivityId(Long lmActivityId) {
			this.lmActivityId = lmActivityId;
		}

		public String getEndDate() {
			return this.endDate;
		}

		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getActivityPicUrl() {
			return this.activityPicUrl;
		}

		public void setActivityPicUrl(String activityPicUrl) {
			this.activityPicUrl = activityPicUrl;
		}

		public List<LmActivitySessionModel> getLmActivitySessionModels() {
			return this.lmActivitySessionModels;
		}

		public void setLmActivitySessionModels(List<LmActivitySessionModel> lmActivitySessionModels) {
			this.lmActivitySessionModels = lmActivitySessionModels;
		}

		public static class LmActivitySessionModel {

			private Long lmActivityId;

			private Long lmSessionId;

			private String name;

			private String description;

			private String bizId;

			private String subBizCode;

			private String displayDate;

			private String startDate;

			private String endDate;

			private Map<Object,Object> extInfo;

			public Long getLmActivityId() {
				return this.lmActivityId;
			}

			public void setLmActivityId(Long lmActivityId) {
				this.lmActivityId = lmActivityId;
			}

			public Long getLmSessionId() {
				return this.lmSessionId;
			}

			public void setLmSessionId(Long lmSessionId) {
				this.lmSessionId = lmSessionId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getBizId() {
				return this.bizId;
			}

			public void setBizId(String bizId) {
				this.bizId = bizId;
			}

			public String getSubBizCode() {
				return this.subBizCode;
			}

			public void setSubBizCode(String subBizCode) {
				this.subBizCode = subBizCode;
			}

			public String getDisplayDate() {
				return this.displayDate;
			}

			public void setDisplayDate(String displayDate) {
				this.displayDate = displayDate;
			}

			public String getStartDate() {
				return this.startDate;
			}

			public void setStartDate(String startDate) {
				this.startDate = startDate;
			}

			public String getEndDate() {
				return this.endDate;
			}

			public void setEndDate(String endDate) {
				this.endDate = endDate;
			}

			public Map<Object,Object> getExtInfo() {
				return this.extInfo;
			}

			public void setExtInfo(Map<Object,Object> extInfo) {
				this.extInfo = extInfo;
			}
		}
	}

	@Override
	public QueryUnfinishedActivitiesResponse getInstance(UnmarshallerContext context) {
		return	QueryUnfinishedActivitiesResponseUnmarshaller.unmarshall(this, context);
	}
}
