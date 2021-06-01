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

package com.aliyuncs.ivision.model.v20190308;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ivision.transform.v20190308.ListMyAlgorithmResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMyAlgorithmResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private Data data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

		private Integer totalCount;

		private List<AlgorithmListItem> algorithmList;

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

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<AlgorithmListItem> getAlgorithmList() {
			return this.algorithmList;
		}

		public void setAlgorithmList(List<AlgorithmListItem> algorithmList) {
			this.algorithmList = algorithmList;
		}

		public static class AlgorithmListItem {

			private String algorithmName;

			private String deployRegion;

			private Integer currentMonthCount;

			private String algorithmCode;

			private String apiDocUrl;

			private Integer yesterdayCount;

			private Integer algorithmOrder;

			public String getAlgorithmName() {
				return this.algorithmName;
			}

			public void setAlgorithmName(String algorithmName) {
				this.algorithmName = algorithmName;
			}

			public String getDeployRegion() {
				return this.deployRegion;
			}

			public void setDeployRegion(String deployRegion) {
				this.deployRegion = deployRegion;
			}

			public Integer getCurrentMonthCount() {
				return this.currentMonthCount;
			}

			public void setCurrentMonthCount(Integer currentMonthCount) {
				this.currentMonthCount = currentMonthCount;
			}

			public String getAlgorithmCode() {
				return this.algorithmCode;
			}

			public void setAlgorithmCode(String algorithmCode) {
				this.algorithmCode = algorithmCode;
			}

			public String getApiDocUrl() {
				return this.apiDocUrl;
			}

			public void setApiDocUrl(String apiDocUrl) {
				this.apiDocUrl = apiDocUrl;
			}

			public Integer getYesterdayCount() {
				return this.yesterdayCount;
			}

			public void setYesterdayCount(Integer yesterdayCount) {
				this.yesterdayCount = yesterdayCount;
			}

			public Integer getAlgorithmOrder() {
				return this.algorithmOrder;
			}

			public void setAlgorithmOrder(Integer algorithmOrder) {
				this.algorithmOrder = algorithmOrder;
			}
		}
	}

	@Override
	public ListMyAlgorithmResponse getInstance(UnmarshallerContext context) {
		return	ListMyAlgorithmResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
