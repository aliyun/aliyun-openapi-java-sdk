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

package com.aliyuncs.cloudesl.model.v20200201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudesl.transform.v20200201.DescribeItemMaterialsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeItemMaterialsResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private Boolean success;

	private String message;

	private String errorCode;

	private String errorMessage;

	private String code;

	private String dynamicCode;

	private String dynamicMessage;

	private List<ItemMaterialInfo> materials;

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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public List<ItemMaterialInfo> getMaterials() {
		return this.materials;
	}

	public void setMaterials(List<ItemMaterialInfo> materials) {
		this.materials = materials;
	}

	public static class ItemMaterialInfo {

		private String barCode;

		private String itemName;

		private String gmtCreate;

		public String getBarCode() {
			return this.barCode;
		}

		public void setBarCode(String barCode) {
			this.barCode = barCode;
		}

		public String getItemName() {
			return this.itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
	}

	@Override
	public DescribeItemMaterialsResponse getInstance(UnmarshallerContext context) {
		return	DescribeItemMaterialsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
