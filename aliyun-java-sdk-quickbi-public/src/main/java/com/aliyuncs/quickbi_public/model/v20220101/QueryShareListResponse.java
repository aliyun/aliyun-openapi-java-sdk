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

package com.aliyuncs.quickbi_public.model.v20220101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20220101.QueryShareListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryShareListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<Data> result;

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

	public List<Data> getResult() {
		return this.result;
	}

	public void setResult(List<Data> result) {
		this.result = result;
	}

	public static class Data {

		private String shareId;

		private String shareToId;

		private Long expireDate;

		private Integer shareToType;

		private Integer authPoint;

		private String shareToName;

		private String reportId;

		private String shareType;

		public String getShareId() {
			return this.shareId;
		}

		public void setShareId(String shareId) {
			this.shareId = shareId;
		}

		public String getShareToId() {
			return this.shareToId;
		}

		public void setShareToId(String shareToId) {
			this.shareToId = shareToId;
		}

		public Long getExpireDate() {
			return this.expireDate;
		}

		public void setExpireDate(Long expireDate) {
			this.expireDate = expireDate;
		}

		public Integer getShareToType() {
			return this.shareToType;
		}

		public void setShareToType(Integer shareToType) {
			this.shareToType = shareToType;
		}

		public Integer getAuthPoint() {
			return this.authPoint;
		}

		public void setAuthPoint(Integer authPoint) {
			this.authPoint = authPoint;
		}

		public String getShareToName() {
			return this.shareToName;
		}

		public void setShareToName(String shareToName) {
			this.shareToName = shareToName;
		}

		public String getReportId() {
			return this.reportId;
		}

		public void setReportId(String reportId) {
			this.reportId = reportId;
		}

		public String getShareType() {
			return this.shareType;
		}

		public void setShareType(String shareType) {
			this.shareType = shareType;
		}
	}

	@Override
	public QueryShareListResponse getInstance(UnmarshallerContext context) {
		return	QueryShareListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
