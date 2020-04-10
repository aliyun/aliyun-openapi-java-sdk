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
import com.aliyuncs.digitalstore.transform.v20200107.ListExpressCompanyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListExpressCompanyResponse extends AcsResponse {

	private Integer pageSize;

	private Integer totalCount;

	private Integer pageNumber;

	private Boolean success;

	private String requestId;

	private List<ExpressCompanyBiz> expressCompanies;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ExpressCompanyBiz> getExpressCompanies() {
		return this.expressCompanies;
	}

	public void setExpressCompanies(List<ExpressCompanyBiz> expressCompanies) {
		this.expressCompanies = expressCompanies;
	}

	public static class ExpressCompanyBiz {

		private Integer disable;

		private String updateDate;

		private String createDate;

		private String expressCompanyId;

		private String expressCompanyName;

		private String expressCompanyCode;

		private String description;

		public Integer getDisable() {
			return this.disable;
		}

		public void setDisable(Integer disable) {
			this.disable = disable;
		}

		public String getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getExpressCompanyId() {
			return this.expressCompanyId;
		}

		public void setExpressCompanyId(String expressCompanyId) {
			this.expressCompanyId = expressCompanyId;
		}

		public String getExpressCompanyName() {
			return this.expressCompanyName;
		}

		public void setExpressCompanyName(String expressCompanyName) {
			this.expressCompanyName = expressCompanyName;
		}

		public String getExpressCompanyCode() {
			return this.expressCompanyCode;
		}

		public void setExpressCompanyCode(String expressCompanyCode) {
			this.expressCompanyCode = expressCompanyCode;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public ListExpressCompanyResponse getInstance(UnmarshallerContext context) {
		return	ListExpressCompanyResponseUnmarshaller.unmarshall(this, context);
	}
}
