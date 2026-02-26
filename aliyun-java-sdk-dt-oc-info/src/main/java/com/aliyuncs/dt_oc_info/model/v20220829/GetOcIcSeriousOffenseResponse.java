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
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcIcSeriousOffenseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcIcSeriousOffenseResponse extends AcsResponse {

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

		private String inReason;

		private String inDate;

		private String outReason;

		private String outDate;

		private String inDepartment;

		private String outDepartment;

		public String getEntName() {
			return this.entName;
		}

		public void setEntName(String entName) {
			this.entName = entName;
		}

		public String getInReason() {
			return this.inReason;
		}

		public void setInReason(String inReason) {
			this.inReason = inReason;
		}

		public String getInDate() {
			return this.inDate;
		}

		public void setInDate(String inDate) {
			this.inDate = inDate;
		}

		public String getOutReason() {
			return this.outReason;
		}

		public void setOutReason(String outReason) {
			this.outReason = outReason;
		}

		public String getOutDate() {
			return this.outDate;
		}

		public void setOutDate(String outDate) {
			this.outDate = outDate;
		}

		public String getInDepartment() {
			return this.inDepartment;
		}

		public void setInDepartment(String inDepartment) {
			this.inDepartment = inDepartment;
		}

		public String getOutDepartment() {
			return this.outDepartment;
		}

		public void setOutDepartment(String outDepartment) {
			this.outDepartment = outDepartment;
		}
	}

	@Override
	public GetOcIcSeriousOffenseResponse getInstance(UnmarshallerContext context) {
		return	GetOcIcSeriousOffenseResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
