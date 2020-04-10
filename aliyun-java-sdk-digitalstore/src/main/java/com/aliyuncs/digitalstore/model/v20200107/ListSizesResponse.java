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

package com.aliyuncs.digitalstore.model.v20200107;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.digitalstore.transform.v20200107.ListSizesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSizesResponse extends AcsResponse {

	private Integer pageSize;

	private Integer pageNumber;

	private String requestId;

	private Boolean success;

	private Integer totalCount;

	private List<SizeModel> sizes;

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<SizeModel> getSizes() {
		return this.sizes;
	}

	public void setSizes(List<SizeModel> sizes) {
		this.sizes = sizes;
	}

	public static class SizeModel {

		private String description;

		private String name;

		private String sizeGroupCode;

		private String createDate;

		private String sizeGroupId;

		private String code;

		private String sizeGroupName;

		private String updateDate;

		private Integer disable;

		private String sizeId;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSizeGroupCode() {
			return this.sizeGroupCode;
		}

		public void setSizeGroupCode(String sizeGroupCode) {
			this.sizeGroupCode = sizeGroupCode;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getSizeGroupId() {
			return this.sizeGroupId;
		}

		public void setSizeGroupId(String sizeGroupId) {
			this.sizeGroupId = sizeGroupId;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getSizeGroupName() {
			return this.sizeGroupName;
		}

		public void setSizeGroupName(String sizeGroupName) {
			this.sizeGroupName = sizeGroupName;
		}

		public String getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}

		public Integer getDisable() {
			return this.disable;
		}

		public void setDisable(Integer disable) {
			this.disable = disable;
		}

		public String getSizeId() {
			return this.sizeId;
		}

		public void setSizeId(String sizeId) {
			this.sizeId = sizeId;
		}
	}

	@Override
	public ListSizesResponse getInstance(UnmarshallerContext context) {
		return	ListSizesResponseUnmarshaller.unmarshall(this, context);
	}
}
