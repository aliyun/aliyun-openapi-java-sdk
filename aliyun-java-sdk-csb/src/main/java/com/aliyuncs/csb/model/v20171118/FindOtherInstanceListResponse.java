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

package com.aliyuncs.csb.model.v20171118;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.csb.transform.v20171118.FindOtherInstanceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindOtherInstanceListResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer currentPage;

		private Integer pageNumber;

		private List<Item> itemList;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public List<Item> getItemList() {
			return this.itemList;
		}

		public void setItemList(List<Item> itemList) {
			this.itemList = itemList;
		}

		public static class Item {

			private String description;

			private String runStatus;

			private Long gmtCreate;

			private Long gmtModified;

			private Long id;

			private Integer instanceCategory;

			private String name;

			private String statusStr;

			private Long ownerId;

			private String vpcName;

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getRunStatus() {
				return this.runStatus;
			}

			public void setRunStatus(String runStatus) {
				this.runStatus = runStatus;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Integer getInstanceCategory() {
				return this.instanceCategory;
			}

			public void setInstanceCategory(Integer instanceCategory) {
				this.instanceCategory = instanceCategory;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getStatusStr() {
				return this.statusStr;
			}

			public void setStatusStr(String statusStr) {
				this.statusStr = statusStr;
			}

			public Long getOwnerId() {
				return this.ownerId;
			}

			public void setOwnerId(Long ownerId) {
				this.ownerId = ownerId;
			}

			public String getVpcName() {
				return this.vpcName;
			}

			public void setVpcName(String vpcName) {
				this.vpcName = vpcName;
			}
		}
	}

	@Override
	public FindOtherInstanceListResponse getInstance(UnmarshallerContext context) {
		return	FindOtherInstanceListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
