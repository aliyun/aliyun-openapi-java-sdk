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
import com.aliyuncs.cspro.transform.v20180315.QuerySecCheckResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySecCheckResultResponse extends AcsResponse {

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

		private List<OmniSecCheckResultDTO> list;

		private PageInfo pageInfo;

		public List<OmniSecCheckResultDTO> getList() {
			return this.list;
		}

		public void setList(List<OmniSecCheckResultDTO> list) {
			this.list = list;
		}

		public PageInfo getPageInfo() {
			return this.pageInfo;
		}

		public void setPageInfo(PageInfo pageInfo) {
			this.pageInfo = pageInfo;
		}

		public static class OmniSecCheckResultDTO {

			private Long id;

			private String checkType;

			private String checkTarget;

			private String checkTime;

			private String url;

			private String riskTypes;

			private String riskSources;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
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

			public String getCheckTime() {
				return this.checkTime;
			}

			public void setCheckTime(String checkTime) {
				this.checkTime = checkTime;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public String getRiskTypes() {
				return this.riskTypes;
			}

			public void setRiskTypes(String riskTypes) {
				this.riskTypes = riskTypes;
			}

			public String getRiskSources() {
				return this.riskSources;
			}

			public void setRiskSources(String riskSources) {
				this.riskSources = riskSources;
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
	public QuerySecCheckResultResponse getInstance(UnmarshallerContext context) {
		return	QuerySecCheckResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
