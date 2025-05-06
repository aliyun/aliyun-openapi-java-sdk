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

package com.aliyuncs.itag.model.v20210517;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.itag.transform.v20210517.GetMarkResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMarkResultResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String errInfo;

	private String msg;

	private Boolean succ;

	private String errorCode;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrInfo() {
		return this.errInfo;
	}

	public void setErrInfo(String errInfo) {
		this.errInfo = errInfo;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Boolean getSucc() {
		return this.succ;
	}

	public void setSucc(Boolean succ) {
		this.succ = succ;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Long pageNum;

		private Long pageSize;

		private Long total;

		private Long totalPage;

		private List<ITagMarkResultReport> list;

		public Long getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Long pageNum) {
			this.pageNum = pageNum;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public Long getTotalPage() {
			return this.totalPage;
		}

		public void setTotalPage(Long totalPage) {
			this.totalPage = totalPage;
		}

		public List<ITagMarkResultReport> getList() {
			return this.list;
		}

		public void setList(List<ITagMarkResultReport> list) {
			this.list = list;
		}

		public static class ITagMarkResultReport {

			private String updateTime;

			private String labelType;

			private String markTitle;

			private List<ITagMarkResultDetail> labelList;

			public String getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(String updateTime) {
				this.updateTime = updateTime;
			}

			public String getLabelType() {
				return this.labelType;
			}

			public void setLabelType(String labelType) {
				this.labelType = labelType;
			}

			public String getMarkTitle() {
				return this.markTitle;
			}

			public void setMarkTitle(String markTitle) {
				this.markTitle = markTitle;
			}

			public List<ITagMarkResultDetail> getLabelList() {
				return this.labelList;
			}

			public void setLabelList(List<ITagMarkResultDetail> labelList) {
				this.labelList = labelList;
			}

			public static class ITagMarkResultDetail {

				private String labelName;

				private Double labelRate;

				private Integer labelCount;

				public String getLabelName() {
					return this.labelName;
				}

				public void setLabelName(String labelName) {
					this.labelName = labelName;
				}

				public Double getLabelRate() {
					return this.labelRate;
				}

				public void setLabelRate(Double labelRate) {
					this.labelRate = labelRate;
				}

				public Integer getLabelCount() {
					return this.labelCount;
				}

				public void setLabelCount(Integer labelCount) {
					this.labelCount = labelCount;
				}
			}
		}
	}

	@Override
	public GetMarkResultResponse getInstance(UnmarshallerContext context) {
		return	GetMarkResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
