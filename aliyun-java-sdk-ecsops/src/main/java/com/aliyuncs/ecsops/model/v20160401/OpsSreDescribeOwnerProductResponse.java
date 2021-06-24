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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsSreDescribeOwnerProductResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsSreDescribeOwnerProductResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer pageSize;

	private Integer total;

	private Integer pageNo;

	private String code;

	private String success;

	private List<OwnerProducts> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public List<OwnerProducts> getData() {
		return this.data;
	}

	public void setData(List<OwnerProducts> data) {
		this.data = data;
	}

	public static class OwnerProducts {

		private String gmtCreate;

		private String gmtModified;

		private String ownerProductTagName;

		private String ownerProduct;

		private Long id;

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getOwnerProductTagName() {
			return this.ownerProductTagName;
		}

		public void setOwnerProductTagName(String ownerProductTagName) {
			this.ownerProductTagName = ownerProductTagName;
		}

		public String getOwnerProduct() {
			return this.ownerProduct;
		}

		public void setOwnerProduct(String ownerProduct) {
			this.ownerProduct = ownerProduct;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	}

	@Override
	public OpsSreDescribeOwnerProductResponse getInstance(UnmarshallerContext context) {
		return	OpsSreDescribeOwnerProductResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
