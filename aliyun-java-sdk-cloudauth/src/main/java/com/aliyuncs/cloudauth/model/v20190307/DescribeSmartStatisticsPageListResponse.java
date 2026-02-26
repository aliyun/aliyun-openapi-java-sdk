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

package com.aliyuncs.cloudauth.model.v20190307;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudauth.transform.v20190307.DescribeSmartStatisticsPageListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSmartStatisticsPageListResponse extends AcsResponse {

	private Integer currentPage;

	private Integer totalPage;

	private Integer pageSize;

	private String requestId;

	private Integer totalCount;

	private List<ItemsItem> items;

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalPage() {
		return this.totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ItemsItem> getItems() {
		return this.items;
	}

	public void setItems(List<ItemsItem> items) {
		this.items = items;
	}

	public static class ItemsItem {

		private String date;

		private Long sceneId;

		private String sceneName;

		private Integer totalCount;

		private Integer successCount;

		private String passRate;

		private String productCode;

		public String getDate() {
			return this.date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public Long getSceneId() {
			return this.sceneId;
		}

		public void setSceneId(Long sceneId) {
			this.sceneId = sceneId;
		}

		public String getSceneName() {
			return this.sceneName;
		}

		public void setSceneName(String sceneName) {
			this.sceneName = sceneName;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getSuccessCount() {
			return this.successCount;
		}

		public void setSuccessCount(Integer successCount) {
			this.successCount = successCount;
		}

		public String getPassRate() {
			return this.passRate;
		}

		public void setPassRate(String passRate) {
			this.passRate = passRate;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}
	}

	@Override
	public DescribeSmartStatisticsPageListResponse getInstance(UnmarshallerContext context) {
		return	DescribeSmartStatisticsPageListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
