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
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcIcEquityPledgeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcIcEquityPledgeResponse extends AcsResponse {

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

		private String number;

		private String pledgor;

		private String relatedComp;

		private String pawnee;

		private String regDate;

		private String status;

		private String pledgorAmount;

		private String pawneeIdentifyNo;

		private String pledgorIdentifyNo;

		private String publicDate;

		public String getNumber() {
			return this.number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public String getPledgor() {
			return this.pledgor;
		}

		public void setPledgor(String pledgor) {
			this.pledgor = pledgor;
		}

		public String getRelatedComp() {
			return this.relatedComp;
		}

		public void setRelatedComp(String relatedComp) {
			this.relatedComp = relatedComp;
		}

		public String getPawnee() {
			return this.pawnee;
		}

		public void setPawnee(String pawnee) {
			this.pawnee = pawnee;
		}

		public String getRegDate() {
			return this.regDate;
		}

		public void setRegDate(String regDate) {
			this.regDate = regDate;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPledgorAmount() {
			return this.pledgorAmount;
		}

		public void setPledgorAmount(String pledgorAmount) {
			this.pledgorAmount = pledgorAmount;
		}

		public String getPawneeIdentifyNo() {
			return this.pawneeIdentifyNo;
		}

		public void setPawneeIdentifyNo(String pawneeIdentifyNo) {
			this.pawneeIdentifyNo = pawneeIdentifyNo;
		}

		public String getPledgorIdentifyNo() {
			return this.pledgorIdentifyNo;
		}

		public void setPledgorIdentifyNo(String pledgorIdentifyNo) {
			this.pledgorIdentifyNo = pledgorIdentifyNo;
		}

		public String getPublicDate() {
			return this.publicDate;
		}

		public void setPublicDate(String publicDate) {
			this.publicDate = publicDate;
		}
	}

	@Override
	public GetOcIcEquityPledgeResponse getInstance(UnmarshallerContext context) {
		return	GetOcIcEquityPledgeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
