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
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcIcShareholderResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcIcShareholderResponse extends AcsResponse {

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

		private String stockName;

		private String stockType;

		private String stockPercent;

		private String shouldCap;

		private String shouldCapTime;

		public String getStockName() {
			return this.stockName;
		}

		public void setStockName(String stockName) {
			this.stockName = stockName;
		}

		public String getStockType() {
			return this.stockType;
		}

		public void setStockType(String stockType) {
			this.stockType = stockType;
		}

		public String getStockPercent() {
			return this.stockPercent;
		}

		public void setStockPercent(String stockPercent) {
			this.stockPercent = stockPercent;
		}

		public String getShouldCap() {
			return this.shouldCap;
		}

		public void setShouldCap(String shouldCap) {
			this.shouldCap = shouldCap;
		}

		public String getShouldCapTime() {
			return this.shouldCapTime;
		}

		public void setShouldCapTime(String shouldCapTime) {
			this.shouldCapTime = shouldCapTime;
		}
	}

	@Override
	public GetOcIcShareholderResponse getInstance(UnmarshallerContext context) {
		return	GetOcIcShareholderResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
