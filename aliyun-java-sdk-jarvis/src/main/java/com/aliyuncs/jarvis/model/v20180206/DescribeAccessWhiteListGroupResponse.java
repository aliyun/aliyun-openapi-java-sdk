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

package com.aliyuncs.jarvis.model.v20180206;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.jarvis.transform.v20180206.DescribeAccessWhiteListGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAccessWhiteListGroupResponse extends AcsResponse {

	private String requestId;

	private String module;

	private List<Data> dataList;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public List<Data> getDataList() {
		return this.dataList;
	}

	public void setDataList(List<Data> dataList) {
		this.dataList = dataList;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class Data {

		private String status;

		private String insProduct;

		private String gmtCreate;

		private String gmtRealExpire;

		private String srcIP;

		private Integer autoConfig;

		private Integer groupId;

		private List<Item> items;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getInsProduct() {
			return this.insProduct;
		}

		public void setInsProduct(String insProduct) {
			this.insProduct = insProduct;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtRealExpire() {
			return this.gmtRealExpire;
		}

		public void setGmtRealExpire(String gmtRealExpire) {
			this.gmtRealExpire = gmtRealExpire;
		}

		public String getSrcIP() {
			return this.srcIP;
		}

		public void setSrcIP(String srcIP) {
			this.srcIP = srcIP;
		}

		public Integer getAutoConfig() {
			return this.autoConfig;
		}

		public void setAutoConfig(Integer autoConfig) {
			this.autoConfig = autoConfig;
		}

		public Integer getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Integer groupId) {
			this.groupId = groupId;
		}

		public List<Item> getItems() {
			return this.items;
		}

		public void setItems(List<Item> items) {
			this.items = items;
		}

		public static class Item {

			private String iP;

			private String regionId;

			public String getIP() {
				return this.iP;
			}

			public void setIP(String iP) {
				this.iP = iP;
			}

			public String getBizRegionId() {
				return this.regionId;
			}

			public void setBizRegionId(String regionId) {
				this.regionId = regionId;
			}

			/**
			 * @deprecated use getBizRegionId instead of this.
			 */
			@Deprecated
			public String getRegionId() {
				return this.regionId;
			}

			/**
			 * @deprecated use setBizRegionId instead of this.
			 */
			@Deprecated
			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}
		}
	}

	public static class PageInfo {

		private Integer total;

		private Integer pageSize;

		private Integer currentPage;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}
	}

	@Override
	public DescribeAccessWhiteListGroupResponse getInstance(UnmarshallerContext context) {
		return	DescribeAccessWhiteListGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
