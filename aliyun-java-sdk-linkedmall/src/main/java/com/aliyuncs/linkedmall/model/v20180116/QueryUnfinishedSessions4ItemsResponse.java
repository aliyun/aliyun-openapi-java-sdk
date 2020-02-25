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
import com.aliyuncs.linkedmall.transform.v20180116.QueryUnfinishedSessions4ItemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryUnfinishedSessions4ItemsResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private List<LmItemActivitySessionModelList> lmItemActivitySessionModelListList;

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

	public List<LmItemActivitySessionModelList> getLmItemActivitySessionModelListList() {
		return this.lmItemActivitySessionModelListList;
	}

	public void setLmItemActivitySessionModelListList(List<LmItemActivitySessionModelList> lmItemActivitySessionModelListList) {
		this.lmItemActivitySessionModelListList = lmItemActivitySessionModelListList;
	}

	public static class LmItemActivitySessionModelList {

		private Long itemId;

		private String lmItemId;

		private List<LmActivitySessionModel> lmActivitySessionModels;

		public Long getItemId() {
			return this.itemId;
		}

		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}

		public String getLmItemId() {
			return this.lmItemId;
		}

		public void setLmItemId(String lmItemId) {
			this.lmItemId = lmItemId;
		}

		public List<LmActivitySessionModel> getLmActivitySessionModels() {
			return this.lmActivitySessionModels;
		}

		public void setLmActivitySessionModels(List<LmActivitySessionModel> lmActivitySessionModels) {
			this.lmActivitySessionModels = lmActivitySessionModels;
		}

		public static class LmActivitySessionModel {

			private String bizId;

			private String description;

			private String displayDate;

			private String endDate;

			private Map<Object,Object> extInfo;

			private Long lmActivityId;

			private Long lmSessionId;

			private String name;

			private String startDate;

			private String subBizCode;

			public String getBizId() {
				return this.bizId;
			}

			public void setBizId(String bizId) {
				this.bizId = bizId;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getDisplayDate() {
				return this.displayDate;
			}

			public void setDisplayDate(String displayDate) {
				this.displayDate = displayDate;
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

			public String getStartDate() {
				return this.startDate;
			}

			public void setStartDate(String startDate) {
				this.startDate = startDate;
			}

			public String getSubBizCode() {
				return this.subBizCode;
			}

			public void setSubBizCode(String subBizCode) {
				this.subBizCode = subBizCode;
			}
		}
	}

	@Override
	public QueryUnfinishedSessions4ItemsResponse getInstance(UnmarshallerContext context) {
		return	QueryUnfinishedSessions4ItemsResponseUnmarshaller.unmarshall(this, context);
	}
}
