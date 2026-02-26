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
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcNegativeEnvironmentPunishmentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcNegativeEnvironmentPunishmentResponse extends AcsResponse {

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

		private String punishNum;

		private String punishLaw;

		private String punishBasis;

		private String punishRes;

		private String department;

		private String punishDate;

		private String execStatus;

		private String punishContent;

		public String getEntName() {
			return this.entName;
		}

		public void setEntName(String entName) {
			this.entName = entName;
		}

		public String getPunishNum() {
			return this.punishNum;
		}

		public void setPunishNum(String punishNum) {
			this.punishNum = punishNum;
		}

		public String getPunishLaw() {
			return this.punishLaw;
		}

		public void setPunishLaw(String punishLaw) {
			this.punishLaw = punishLaw;
		}

		public String getPunishBasis() {
			return this.punishBasis;
		}

		public void setPunishBasis(String punishBasis) {
			this.punishBasis = punishBasis;
		}

		public String getPunishRes() {
			return this.punishRes;
		}

		public void setPunishRes(String punishRes) {
			this.punishRes = punishRes;
		}

		public String getDepartment() {
			return this.department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getPunishDate() {
			return this.punishDate;
		}

		public void setPunishDate(String punishDate) {
			this.punishDate = punishDate;
		}

		public String getExecStatus() {
			return this.execStatus;
		}

		public void setExecStatus(String execStatus) {
			this.execStatus = execStatus;
		}

		public String getPunishContent() {
			return this.punishContent;
		}

		public void setPunishContent(String punishContent) {
			this.punishContent = punishContent;
		}
	}

	@Override
	public GetOcNegativeEnvironmentPunishmentResponse getInstance(UnmarshallerContext context) {
		return	GetOcNegativeEnvironmentPunishmentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
