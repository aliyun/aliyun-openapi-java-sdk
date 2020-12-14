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

package com.aliyuncs.cdrs.model.v20201101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdrs.transform.v20201101.ListCityMapPersonFlowResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCityMapPersonFlowResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Long pageNumber;

	private Long pageSize;

	private Long totalCount;

	private List<Datas> data;

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

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<Datas> getData() {
		return this.data;
	}

	public void setData(List<Datas> data) {
		this.data = data;
	}

	public static class Datas {

		private String originDataSourceId;

		private String targetDataSourceId;

		private String flowNumber;

		private String flowDirection;

		public String getOriginDataSourceId() {
			return this.originDataSourceId;
		}

		public void setOriginDataSourceId(String originDataSourceId) {
			this.originDataSourceId = originDataSourceId;
		}

		public String getTargetDataSourceId() {
			return this.targetDataSourceId;
		}

		public void setTargetDataSourceId(String targetDataSourceId) {
			this.targetDataSourceId = targetDataSourceId;
		}

		public String getFlowNumber() {
			return this.flowNumber;
		}

		public void setFlowNumber(String flowNumber) {
			this.flowNumber = flowNumber;
		}

		public String getFlowDirection() {
			return this.flowDirection;
		}

		public void setFlowDirection(String flowDirection) {
			this.flowDirection = flowDirection;
		}
	}

	@Override
	public ListCityMapPersonFlowResponse getInstance(UnmarshallerContext context) {
		return	ListCityMapPersonFlowResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
