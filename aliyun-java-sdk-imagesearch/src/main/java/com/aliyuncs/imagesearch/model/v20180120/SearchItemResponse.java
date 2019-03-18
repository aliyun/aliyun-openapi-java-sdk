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

package com.aliyuncs.imagesearch.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imagesearch.transform.v20180120.SearchItemResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchItemResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String message;

	private Integer code;

	private List<Auction> auctions;

	private Head head;

	private PicInfo picInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public List<Auction> getAuctions() {
		return this.auctions;
	}

	public void setAuctions(List<Auction> auctions) {
		this.auctions = auctions;
	}

	public Head getHead() {
		return this.head;
	}

	public void setHead(Head head) {
		this.head = head;
	}

	public PicInfo getPicInfo() {
		return this.picInfo;
	}

	public void setPicInfo(PicInfo picInfo) {
		this.picInfo = picInfo;
	}

	public static class Auction {

		private String custContent;

		private String itemId;

		private String sortExprValues;

		private String catId;

		private String picName;

		public String getCustContent() {
			return this.custContent;
		}

		public void setCustContent(String custContent) {
			this.custContent = custContent;
		}

		public String getItemId() {
			return this.itemId;
		}

		public void setItemId(String itemId) {
			this.itemId = itemId;
		}

		public String getSortExprValues() {
			return this.sortExprValues;
		}

		public void setSortExprValues(String sortExprValues) {
			this.sortExprValues = sortExprValues;
		}

		public String getCatId() {
			return this.catId;
		}

		public void setCatId(String catId) {
			this.catId = catId;
		}

		public String getPicName() {
			return this.picName;
		}

		public void setPicName(String picName) {
			this.picName = picName;
		}
	}

	public static class Head {

		private Integer searchTime;

		private Integer docsFound;

		private Integer docsReturn;

		public Integer getSearchTime() {
			return this.searchTime;
		}

		public void setSearchTime(Integer searchTime) {
			this.searchTime = searchTime;
		}

		public Integer getDocsFound() {
			return this.docsFound;
		}

		public void setDocsFound(Integer docsFound) {
			this.docsFound = docsFound;
		}

		public Integer getDocsReturn() {
			return this.docsReturn;
		}

		public void setDocsReturn(Integer docsReturn) {
			this.docsReturn = docsReturn;
		}
	}

	public static class PicInfo {

		private String category;

		private String region;

		private List<Category> allCategory;

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public List<Category> getAllCategory() {
			return this.allCategory;
		}

		public void setAllCategory(List<Category> allCategory) {
			this.allCategory = allCategory;
		}

		public static class Category {

			private String name;

			private String id;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}
	}

	@Override
	public SearchItemResponse getInstance(UnmarshallerContext context) {
		return	SearchItemResponseUnmarshaller.unmarshall(this, context);
	}
}
