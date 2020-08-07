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

package com.aliyuncs.premiumpics.model.v20200505;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.premiumpics.transform.v20200505.ListUserCollectionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUserCollectionsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMsg;

	private String errorCode;

	private Integer pageSize;

	private Integer totalCount;

	private Integer pageNumber;

	private List<Collections> data;

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

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Collections> getData() {
		return this.data;
	}

	public void setData(List<Collections> data) {
		this.data = data;
	}

	public static class Collections {

		private String unitId;

		private String unitName;

		private String image;

		public String getUnitId() {
			return this.unitId;
		}

		public void setUnitId(String unitId) {
			this.unitId = unitId;
		}

		public String getUnitName() {
			return this.unitName;
		}

		public void setUnitName(String unitName) {
			this.unitName = unitName;
		}

		public String getImage() {
			return this.image;
		}

		public void setImage(String image) {
			this.image = image;
		}
	}

	@Override
	public ListUserCollectionsResponse getInstance(UnmarshallerContext context) {
		return	ListUserCollectionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
