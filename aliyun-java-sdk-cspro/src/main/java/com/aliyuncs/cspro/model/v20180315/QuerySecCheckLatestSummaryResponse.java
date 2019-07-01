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

package com.aliyuncs.cspro.model.v20180315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cspro.transform.v20180315.QuerySecCheckLatestSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySecCheckLatestSummaryResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<OmniSecCheckLatestSummaryDTO> list;

		private PageInfo pageInfo;

		public List<OmniSecCheckLatestSummaryDTO> getList() {
			return this.list;
		}

		public void setList(List<OmniSecCheckLatestSummaryDTO> list) {
			this.list = list;
		}

		public PageInfo getPageInfo() {
			return this.pageInfo;
		}

		public void setPageInfo(PageInfo pageInfo) {
			this.pageInfo = pageInfo;
		}

		public static class OmniSecCheckLatestSummaryDTO {

			private Long id;

			private String confType;

			private String checkType;

			private String checkTarget;

			private Long urlCnt;

			private Long riskCnt;

			private String checkTime;

			private Long gmtCheckStart;

			private Long gmtCheckEnd;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getConfType() {
				return this.confType;
			}

			public void setConfType(String confType) {
				this.confType = confType;
			}

			public String getCheckType() {
				return this.checkType;
			}

			public void setCheckType(String checkType) {
				this.checkType = checkType;
			}

			public String getCheckTarget() {
				return this.checkTarget;
			}

			public void setCheckTarget(String checkTarget) {
				this.checkTarget = checkTarget;
			}

			public Long getUrlCnt() {
				return this.urlCnt;
			}

			public void setUrlCnt(Long urlCnt) {
				this.urlCnt = urlCnt;
			}

			public Long getRiskCnt() {
				return this.riskCnt;
			}

			public void setRiskCnt(Long riskCnt) {
				this.riskCnt = riskCnt;
			}

			public String getCheckTime() {
				return this.checkTime;
			}

			public void setCheckTime(String checkTime) {
				this.checkTime = checkTime;
			}

			public Long getGmtCheckStart() {
				return this.gmtCheckStart;
			}

			public void setGmtCheckStart(Long gmtCheckStart) {
				this.gmtCheckStart = gmtCheckStart;
			}

			public Long getGmtCheckEnd() {
				return this.gmtCheckEnd;
			}

			public void setGmtCheckEnd(Long gmtCheckEnd) {
				this.gmtCheckEnd = gmtCheckEnd;
			}
		}

		public static class PageInfo {

			private Integer currentPage;

			private Integer pageSize;

			private Integer total;

			public Integer getCurrentPage() {
				return this.currentPage;
			}

			public void setCurrentPage(Integer currentPage) {
				this.currentPage = currentPage;
			}

			public Integer getPageSize() {
				return this.pageSize;
			}

			public void setPageSize(Integer pageSize) {
				this.pageSize = pageSize;
			}

			public Integer getTotal() {
				return this.total;
			}

			public void setTotal(Integer total) {
				this.total = total;
			}
		}
	}

	@Override
	public QuerySecCheckLatestSummaryResponse getInstance(UnmarshallerContext context) {
		return	QuerySecCheckLatestSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
