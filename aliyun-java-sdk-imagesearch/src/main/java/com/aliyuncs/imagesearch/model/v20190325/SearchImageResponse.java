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

package com.aliyuncs.imagesearch.model.v20190325;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imagesearch.transform.v20190325.SearchImageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchImageResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer code;

	private String msg;

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

		private Integer categoryId;

		private String productId;

		private String picName;

		private String customContent;

		private String sortExprValues;

		private Integer intAttr;

		private String strAttr;

		public Integer getCategoryId() {
			return this.categoryId;
		}

		public void setCategoryId(Integer categoryId) {
			this.categoryId = categoryId;
		}

		public String getProductId() {
			return this.productId;
		}

		public void setProductId(String productId) {
			this.productId = productId;
		}

		public String getPicName() {
			return this.picName;
		}

		public void setPicName(String picName) {
			this.picName = picName;
		}

		public String getCustomContent() {
			return this.customContent;
		}

		public void setCustomContent(String customContent) {
			this.customContent = customContent;
		}

		public String getSortExprValues() {
			return this.sortExprValues;
		}

		public void setSortExprValues(String sortExprValues) {
			this.sortExprValues = sortExprValues;
		}

		public Integer getIntAttr() {
			return this.intAttr;
		}

		public void setIntAttr(Integer intAttr) {
			this.intAttr = intAttr;
		}

		public String getStrAttr() {
			return this.strAttr;
		}

		public void setStrAttr(String strAttr) {
			this.strAttr = strAttr;
		}
	}

	public static class Head {

		private Integer docsReturn;

		private Integer docsFound;

		private Integer searchTime;

		public Integer getDocsReturn() {
			return this.docsReturn;
		}

		public void setDocsReturn(Integer docsReturn) {
			this.docsReturn = docsReturn;
		}

		public Integer getDocsFound() {
			return this.docsFound;
		}

		public void setDocsFound(Integer docsFound) {
			this.docsFound = docsFound;
		}

		public Integer getSearchTime() {
			return this.searchTime;
		}

		public void setSearchTime(Integer searchTime) {
			this.searchTime = searchTime;
		}
	}

	public static class PicInfo {

		private Integer categoryId;

		private String region;

		private List<Category> allCategories;

		public Integer getCategoryId() {
			return this.categoryId;
		}

		public void setCategoryId(Integer categoryId) {
			this.categoryId = categoryId;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public List<Category> getAllCategories() {
			return this.allCategories;
		}

		public void setAllCategories(List<Category> allCategories) {
			this.allCategories = allCategories;
		}

		public static class Category {

			private Integer id;

			private String name;

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public SearchImageResponse getInstance(UnmarshallerContext context) {
		return	SearchImageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
