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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.QueryNotifyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryNotifyResponse extends AcsResponse {

	private String requestId;

	private Data data;

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

		private Integer pageSize;

		private Integer pageNumber;

		private Integer totalRecordCount;

		private List<NotifyItemListItem> notifyItemList;

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getTotalRecordCount() {
			return this.totalRecordCount;
		}

		public void setTotalRecordCount(Integer totalRecordCount) {
			this.totalRecordCount = totalRecordCount;
		}

		public List<NotifyItemListItem> getNotifyItemList() {
			return this.notifyItemList;
		}

		public void setNotifyItemList(List<NotifyItemListItem> notifyItemList) {
			this.notifyItemList = notifyItemList;
		}

		public static class NotifyItemListItem {

			private Long id;

			private String gmtCreated;

			private String gmtModified;

			private Long aliUid;

			private String idempotentId;

			private String idempotentCount;

			private String type;

			private String level;

			private String templateName;

			private String notifyElement;

			private Boolean confirmFlag;

			private Long confirmor;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getGmtCreated() {
				return this.gmtCreated;
			}

			public void setGmtCreated(String gmtCreated) {
				this.gmtCreated = gmtCreated;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public Long getAliUid() {
				return this.aliUid;
			}

			public void setAliUid(Long aliUid) {
				this.aliUid = aliUid;
			}

			public String getIdempotentId() {
				return this.idempotentId;
			}

			public void setIdempotentId(String idempotentId) {
				this.idempotentId = idempotentId;
			}

			public String getIdempotentCount() {
				return this.idempotentCount;
			}

			public void setIdempotentCount(String idempotentCount) {
				this.idempotentCount = idempotentCount;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getLevel() {
				return this.level;
			}

			public void setLevel(String level) {
				this.level = level;
			}

			public String getTemplateName() {
				return this.templateName;
			}

			public void setTemplateName(String templateName) {
				this.templateName = templateName;
			}

			public String getNotifyElement() {
				return this.notifyElement;
			}

			public void setNotifyElement(String notifyElement) {
				this.notifyElement = notifyElement;
			}

			public Boolean getConfirmFlag() {
				return this.confirmFlag;
			}

			public void setConfirmFlag(Boolean confirmFlag) {
				this.confirmFlag = confirmFlag;
			}

			public Long getConfirmor() {
				return this.confirmor;
			}

			public void setConfirmor(Long confirmor) {
				this.confirmor = confirmor;
			}
		}
	}

	@Override
	public QueryNotifyResponse getInstance(UnmarshallerContext context) {
		return	QueryNotifyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
