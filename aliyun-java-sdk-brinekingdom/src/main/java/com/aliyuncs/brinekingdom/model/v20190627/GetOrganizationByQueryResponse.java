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

package com.aliyuncs.brinekingdom.model.v20190627;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.brinekingdom.transform.v20190627.GetOrganizationByQueryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOrganizationByQueryResponse extends AcsResponse {

	private String _class;

	private String errorMessage;

	private Boolean success;

	private String resultCode;

	private String requestId;

	private List<Data> result;

	public String get_Class() {
		return this._class;
	}

	public void set_Class(String _class) {
		this._class = _class;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getResult() {
		return this.result;
	}

	public void setResult(List<Data> result) {
		this.result = result;
	}

	public static class Data {

		private String businessType;

		private String businessTypeName;

		private String _class;

		private String division;

		private Long gmtCreate;

		private Long gmtModified;

		private Long id;

		private String orgName;

		private String orgRemark;

		private String product1;

		private String product1Name;

		private String product2;

		private String product2Name;

		private String requireType;

		private String requireTypeName;

		public String getBusinessType() {
			return this.businessType;
		}

		public void setBusinessType(String businessType) {
			this.businessType = businessType;
		}

		public String getBusinessTypeName() {
			return this.businessTypeName;
		}

		public void setBusinessTypeName(String businessTypeName) {
			this.businessTypeName = businessTypeName;
		}

		public String get_Class() {
			return this._class;
		}

		public void set_Class(String _class) {
			this._class = _class;
		}

		public String getDivision() {
			return this.division;
		}

		public void setDivision(String division) {
			this.division = division;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getOrgName() {
			return this.orgName;
		}

		public void setOrgName(String orgName) {
			this.orgName = orgName;
		}

		public String getOrgRemark() {
			return this.orgRemark;
		}

		public void setOrgRemark(String orgRemark) {
			this.orgRemark = orgRemark;
		}

		public String getProduct1() {
			return this.product1;
		}

		public void setProduct1(String product1) {
			this.product1 = product1;
		}

		public String getProduct1Name() {
			return this.product1Name;
		}

		public void setProduct1Name(String product1Name) {
			this.product1Name = product1Name;
		}

		public String getProduct2() {
			return this.product2;
		}

		public void setProduct2(String product2) {
			this.product2 = product2;
		}

		public String getProduct2Name() {
			return this.product2Name;
		}

		public void setProduct2Name(String product2Name) {
			this.product2Name = product2Name;
		}

		public String getRequireType() {
			return this.requireType;
		}

		public void setRequireType(String requireType) {
			this.requireType = requireType;
		}

		public String getRequireTypeName() {
			return this.requireTypeName;
		}

		public void setRequireTypeName(String requireTypeName) {
			this.requireTypeName = requireTypeName;
		}
	}

	@Override
	public GetOrganizationByQueryResponse getInstance(UnmarshallerContext context) {
		return	GetOrganizationByQueryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
