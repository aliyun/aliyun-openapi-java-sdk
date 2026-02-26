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
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcIpTrademarkResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcIpTrademarkResponse extends AcsResponse {

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

		private String trademarkName;

		private String regNum;

		private String trademarkType;

		private String trademarkForm;

		private String trademarkStatus;

		private String applyDate;

		private String imageUrl;

		private String typeName;

		private String period;

		private String agent;

		private String regPubNo;

		private String regPubDate;

		private String firstPubNo;

		private String firstPubDate;

		public String getEntName() {
			return this.entName;
		}

		public void setEntName(String entName) {
			this.entName = entName;
		}

		public String getTrademarkName() {
			return this.trademarkName;
		}

		public void setTrademarkName(String trademarkName) {
			this.trademarkName = trademarkName;
		}

		public String getRegNum() {
			return this.regNum;
		}

		public void setRegNum(String regNum) {
			this.regNum = regNum;
		}

		public String getTrademarkType() {
			return this.trademarkType;
		}

		public void setTrademarkType(String trademarkType) {
			this.trademarkType = trademarkType;
		}

		public String getTrademarkForm() {
			return this.trademarkForm;
		}

		public void setTrademarkForm(String trademarkForm) {
			this.trademarkForm = trademarkForm;
		}

		public String getTrademarkStatus() {
			return this.trademarkStatus;
		}

		public void setTrademarkStatus(String trademarkStatus) {
			this.trademarkStatus = trademarkStatus;
		}

		public String getApplyDate() {
			return this.applyDate;
		}

		public void setApplyDate(String applyDate) {
			this.applyDate = applyDate;
		}

		public String getImageUrl() {
			return this.imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public String getTypeName() {
			return this.typeName;
		}

		public void setTypeName(String typeName) {
			this.typeName = typeName;
		}

		public String getPeriod() {
			return this.period;
		}

		public void setPeriod(String period) {
			this.period = period;
		}

		public String getAgent() {
			return this.agent;
		}

		public void setAgent(String agent) {
			this.agent = agent;
		}

		public String getRegPubNo() {
			return this.regPubNo;
		}

		public void setRegPubNo(String regPubNo) {
			this.regPubNo = regPubNo;
		}

		public String getRegPubDate() {
			return this.regPubDate;
		}

		public void setRegPubDate(String regPubDate) {
			this.regPubDate = regPubDate;
		}

		public String getFirstPubNo() {
			return this.firstPubNo;
		}

		public void setFirstPubNo(String firstPubNo) {
			this.firstPubNo = firstPubNo;
		}

		public String getFirstPubDate() {
			return this.firstPubDate;
		}

		public void setFirstPubDate(String firstPubDate) {
			this.firstPubDate = firstPubDate;
		}
	}

	@Override
	public GetOcIpTrademarkResponse getInstance(UnmarshallerContext context) {
		return	GetOcIpTrademarkResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
