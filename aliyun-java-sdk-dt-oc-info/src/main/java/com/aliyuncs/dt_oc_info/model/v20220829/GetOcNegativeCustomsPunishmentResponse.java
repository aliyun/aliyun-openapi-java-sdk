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
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcNegativeCustomsPunishmentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcNegativeCustomsPunishmentResponse extends AcsResponse {

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

		private String basis;

		private String title;

		private String punishType;

		private String legalName;

		private String customs;

		private String punishDate;

		private String customsNo;

		private String caseNo;

		public String getBasis() {
			return this.basis;
		}

		public void setBasis(String basis) {
			this.basis = basis;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getPunishType() {
			return this.punishType;
		}

		public void setPunishType(String punishType) {
			this.punishType = punishType;
		}

		public String getLegalName() {
			return this.legalName;
		}

		public void setLegalName(String legalName) {
			this.legalName = legalName;
		}

		public String getCustoms() {
			return this.customs;
		}

		public void setCustoms(String customs) {
			this.customs = customs;
		}

		public String getPunishDate() {
			return this.punishDate;
		}

		public void setPunishDate(String punishDate) {
			this.punishDate = punishDate;
		}

		public String getCustomsNo() {
			return this.customsNo;
		}

		public void setCustomsNo(String customsNo) {
			this.customsNo = customsNo;
		}

		public String getCaseNo() {
			return this.caseNo;
		}

		public void setCaseNo(String caseNo) {
			this.caseNo = caseNo;
		}
	}

	@Override
	public GetOcNegativeCustomsPunishmentResponse getInstance(UnmarshallerContext context) {
		return	GetOcNegativeCustomsPunishmentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
