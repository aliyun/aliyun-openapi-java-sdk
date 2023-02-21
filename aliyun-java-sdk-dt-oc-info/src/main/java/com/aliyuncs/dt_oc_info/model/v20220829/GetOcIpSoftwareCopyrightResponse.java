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
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcIpSoftwareCopyrightResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcIpSoftwareCopyrightResponse extends AcsResponse {

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

		private String copyNum;

		private String typeNum;

		private String shortName;

		private String copyName;

		private String version;

		private String successDate;

		private String firstDate;

		private String approvalDate;

		public String getEntName() {
			return this.entName;
		}

		public void setEntName(String entName) {
			this.entName = entName;
		}

		public String getCopyNum() {
			return this.copyNum;
		}

		public void setCopyNum(String copyNum) {
			this.copyNum = copyNum;
		}

		public String getTypeNum() {
			return this.typeNum;
		}

		public void setTypeNum(String typeNum) {
			this.typeNum = typeNum;
		}

		public String getShortName() {
			return this.shortName;
		}

		public void setShortName(String shortName) {
			this.shortName = shortName;
		}

		public String getCopyName() {
			return this.copyName;
		}

		public void setCopyName(String copyName) {
			this.copyName = copyName;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getSuccessDate() {
			return this.successDate;
		}

		public void setSuccessDate(String successDate) {
			this.successDate = successDate;
		}

		public String getFirstDate() {
			return this.firstDate;
		}

		public void setFirstDate(String firstDate) {
			this.firstDate = firstDate;
		}

		public String getApprovalDate() {
			return this.approvalDate;
		}

		public void setApprovalDate(String approvalDate) {
			this.approvalDate = approvalDate;
		}
	}

	@Override
	public GetOcIpSoftwareCopyrightResponse getInstance(UnmarshallerContext context) {
		return	GetOcIpSoftwareCopyrightResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
