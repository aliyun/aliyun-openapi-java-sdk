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
import com.aliyuncs.cspro.transform.v20180315.QuerySecCheckConfigsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySecCheckConfigsResponse extends AcsResponse {

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

		private List<OmniSecCheckDTO> list;

		private PageInfo pageInfo;

		public List<OmniSecCheckDTO> getList() {
			return this.list;
		}

		public void setList(List<OmniSecCheckDTO> list) {
			this.list = list;
		}

		public PageInfo getPageInfo() {
			return this.pageInfo;
		}

		public void setPageInfo(PageInfo pageInfo) {
			this.pageInfo = pageInfo;
		}

		public static class OmniSecCheckDTO {

			private String name;

			private String confType;

			private String checkTarget;

			private String extras;

			private Boolean valid;

			private Boolean accessible;

			private Long id;

			private String spec;

			private List<OmniSecCheckDetailDTO> checkDetailDTOList;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getConfType() {
				return this.confType;
			}

			public void setConfType(String confType) {
				this.confType = confType;
			}

			public String getCheckTarget() {
				return this.checkTarget;
			}

			public void setCheckTarget(String checkTarget) {
				this.checkTarget = checkTarget;
			}

			public String getExtras() {
				return this.extras;
			}

			public void setExtras(String extras) {
				this.extras = extras;
			}

			public Boolean getValid() {
				return this.valid;
			}

			public void setValid(Boolean valid) {
				this.valid = valid;
			}

			public Boolean getAccessible() {
				return this.accessible;
			}

			public void setAccessible(Boolean accessible) {
				this.accessible = accessible;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getSpec() {
				return this.spec;
			}

			public void setSpec(String spec) {
				this.spec = spec;
			}

			public List<OmniSecCheckDetailDTO> getCheckDetailDTOList() {
				return this.checkDetailDTOList;
			}

			public void setCheckDetailDTOList(List<OmniSecCheckDetailDTO> checkDetailDTOList) {
				this.checkDetailDTOList = checkDetailDTOList;
			}

			public static class OmniSecCheckDetailDTO {

				private String checkType;

				private String checkIntervalUnit;

				private String checkIntervalVal;

				private String checkExtras;

				public String getCheckType() {
					return this.checkType;
				}

				public void setCheckType(String checkType) {
					this.checkType = checkType;
				}

				public String getCheckIntervalUnit() {
					return this.checkIntervalUnit;
				}

				public void setCheckIntervalUnit(String checkIntervalUnit) {
					this.checkIntervalUnit = checkIntervalUnit;
				}

				public String getCheckIntervalVal() {
					return this.checkIntervalVal;
				}

				public void setCheckIntervalVal(String checkIntervalVal) {
					this.checkIntervalVal = checkIntervalVal;
				}

				public String getCheckExtras() {
					return this.checkExtras;
				}

				public void setCheckExtras(String checkExtras) {
					this.checkExtras = checkExtras;
				}
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
	public QuerySecCheckConfigsResponse getInstance(UnmarshallerContext context) {
		return	QuerySecCheckConfigsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
