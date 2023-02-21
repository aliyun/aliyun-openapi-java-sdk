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
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcListedCompanyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcListedCompanyResponse extends AcsResponse {

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

		private String entNameEng;

		private String securitiesCode;

		private String securitiesName;

		private String securitiesMarket;

		private String listDate;

		private String totalShares;

		private String totalFlowShares;

		private String circulationMarketValue;

		public String getEntName() {
			return this.entName;
		}

		public void setEntName(String entName) {
			this.entName = entName;
		}

		public String getEntNameEng() {
			return this.entNameEng;
		}

		public void setEntNameEng(String entNameEng) {
			this.entNameEng = entNameEng;
		}

		public String getSecuritiesCode() {
			return this.securitiesCode;
		}

		public void setSecuritiesCode(String securitiesCode) {
			this.securitiesCode = securitiesCode;
		}

		public String getSecuritiesName() {
			return this.securitiesName;
		}

		public void setSecuritiesName(String securitiesName) {
			this.securitiesName = securitiesName;
		}

		public String getSecuritiesMarket() {
			return this.securitiesMarket;
		}

		public void setSecuritiesMarket(String securitiesMarket) {
			this.securitiesMarket = securitiesMarket;
		}

		public String getListDate() {
			return this.listDate;
		}

		public void setListDate(String listDate) {
			this.listDate = listDate;
		}

		public String getTotalShares() {
			return this.totalShares;
		}

		public void setTotalShares(String totalShares) {
			this.totalShares = totalShares;
		}

		public String getTotalFlowShares() {
			return this.totalFlowShares;
		}

		public void setTotalFlowShares(String totalFlowShares) {
			this.totalFlowShares = totalFlowShares;
		}

		public String getCirculationMarketValue() {
			return this.circulationMarketValue;
		}

		public void setCirculationMarketValue(String circulationMarketValue) {
			this.circulationMarketValue = circulationMarketValue;
		}
	}

	@Override
	public GetOcListedCompanyResponse getInstance(UnmarshallerContext context) {
		return	GetOcListedCompanyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
