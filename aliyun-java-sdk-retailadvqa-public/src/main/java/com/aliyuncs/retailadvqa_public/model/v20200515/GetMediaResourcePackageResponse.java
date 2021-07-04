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

package com.aliyuncs.retailadvqa_public.model.v20200515;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailadvqa_public.transform.v20200515.GetMediaResourcePackageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMediaResourcePackageResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer currentPage;

		private Boolean slrGrantedFlag;

		private Boolean effectiveInstanceFlag;

		private Integer pageSize;

		private String bagsInfo;

		private Integer totalCount;

		private Integer pageCount;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Boolean getSlrGrantedFlag() {
			return this.slrGrantedFlag;
		}

		public void setSlrGrantedFlag(Boolean slrGrantedFlag) {
			this.slrGrantedFlag = slrGrantedFlag;
		}

		public Boolean getEffectiveInstanceFlag() {
			return this.effectiveInstanceFlag;
		}

		public void setEffectiveInstanceFlag(Boolean effectiveInstanceFlag) {
			this.effectiveInstanceFlag = effectiveInstanceFlag;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public String getBagsInfo() {
			return this.bagsInfo;
		}

		public void setBagsInfo(String bagsInfo) {
			this.bagsInfo = bagsInfo;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPageCount() {
			return this.pageCount;
		}

		public void setPageCount(Integer pageCount) {
			this.pageCount = pageCount;
		}
	}

	@Override
	public GetMediaResourcePackageResponse getInstance(UnmarshallerContext context) {
		return	GetMediaResourcePackageResponseUnmarshaller.unmarshall(this, context);
	}
}
