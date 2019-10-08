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
import com.aliyuncs.linkedmall.transform.v20180116.ListItemActivitiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListItemActivitiesResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private List<LmItemActivityModel> lmItemActivityModelList;

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

	public List<LmItemActivityModel> getLmItemActivityModelList() {
		return this.lmItemActivityModelList;
	}

	public void setLmItemActivityModelList(List<LmItemActivityModel> lmItemActivityModelList) {
		this.lmItemActivityModelList = lmItemActivityModelList;
	}

	public static class LmItemActivityModel {

		private Long itemId;

		private String lmItemId;

		private LmActivityPopModel lmActivityPopModel;

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

		public LmActivityPopModel getLmActivityPopModel() {
			return this.lmActivityPopModel;
		}

		public void setLmActivityPopModel(LmActivityPopModel lmActivityPopModel) {
			this.lmActivityPopModel = lmActivityPopModel;
		}

		public static class LmActivityPopModel {

			private Long id;

			private String bizId;

			private String subBizCode;

			private String title;

			private Long displayDate;

			private Long startDate;

			private Long endDate;

			private Map<Object,Object> extInfo;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
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

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public Long getDisplayDate() {
				return this.displayDate;
			}

			public void setDisplayDate(Long displayDate) {
				this.displayDate = displayDate;
			}

			public Long getStartDate() {
				return this.startDate;
			}

			public void setStartDate(Long startDate) {
				this.startDate = startDate;
			}

			public Long getEndDate() {
				return this.endDate;
			}

			public void setEndDate(Long endDate) {
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
	public ListItemActivitiesResponse getInstance(UnmarshallerContext context) {
		return	ListItemActivitiesResponseUnmarshaller.unmarshall(this, context);
	}
}
