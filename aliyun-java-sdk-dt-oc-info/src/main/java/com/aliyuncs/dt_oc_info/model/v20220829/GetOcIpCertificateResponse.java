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

package com.aliyuncs.dt_oc_info.model.v20220829;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcIpCertificateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcIpCertificateResponse extends AcsResponse {

	private String code;

	private Boolean success;

	private String message;

	private Integer totalNum;

	private Integer pageIndex;

	private Integer pageNum;

	private String requestId;

	private List<DataItem> data;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String entName;

		private String certType;

		private String certNum;

		private String validStartDate;

		private String validEndDate;

		private String authorizeDate;

		private String authorizeDepartment;

		private String pubDate;

		private String province;

		private String certScope;

		public String getEntName() {
			return this.entName;
		}

		public void setEntName(String entName) {
			this.entName = entName;
		}

		public String getCertType() {
			return this.certType;
		}

		public void setCertType(String certType) {
			this.certType = certType;
		}

		public String getCertNum() {
			return this.certNum;
		}

		public void setCertNum(String certNum) {
			this.certNum = certNum;
		}

		public String getValidStartDate() {
			return this.validStartDate;
		}

		public void setValidStartDate(String validStartDate) {
			this.validStartDate = validStartDate;
		}

		public String getValidEndDate() {
			return this.validEndDate;
		}

		public void setValidEndDate(String validEndDate) {
			this.validEndDate = validEndDate;
		}

		public String getAuthorizeDate() {
			return this.authorizeDate;
		}

		public void setAuthorizeDate(String authorizeDate) {
			this.authorizeDate = authorizeDate;
		}

		public String getAuthorizeDepartment() {
			return this.authorizeDepartment;
		}

		public void setAuthorizeDepartment(String authorizeDepartment) {
			this.authorizeDepartment = authorizeDepartment;
		}

		public String getPubDate() {
			return this.pubDate;
		}

		public void setPubDate(String pubDate) {
			this.pubDate = pubDate;
		}

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public String getCertScope() {
			return this.certScope;
		}

		public void setCertScope(String certScope) {
			this.certScope = certScope;
		}
	}

	@Override
	public GetOcIpCertificateResponse getInstance(UnmarshallerContext context) {
		return	GetOcIpCertificateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
