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

package com.aliyuncs.lto.model.v20210707;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.lto.transform.v20210707.DescribeMemberStatInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMemberStatInfoResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Boolean success;

	private List<MemberStatInfo> data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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

	public List<MemberStatInfo> getData() {
		return this.data;
	}

	public void setData(List<MemberStatInfo> data) {
		this.data = data;
	}

	public static class MemberStatInfo {

		private Long authorizedCount;

		private String memberId;

		private String memberName;

		private Long usedCount;

		private Integer bizChainCount;

		public Long getAuthorizedCount() {
			return this.authorizedCount;
		}

		public void setAuthorizedCount(Long authorizedCount) {
			this.authorizedCount = authorizedCount;
		}

		public String getMemberId() {
			return this.memberId;
		}

		public void setMemberId(String memberId) {
			this.memberId = memberId;
		}

		public String getMemberName() {
			return this.memberName;
		}

		public void setMemberName(String memberName) {
			this.memberName = memberName;
		}

		public Long getUsedCount() {
			return this.usedCount;
		}

		public void setUsedCount(Long usedCount) {
			this.usedCount = usedCount;
		}

		public Integer getBizChainCount() {
			return this.bizChainCount;
		}

		public void setBizChainCount(Integer bizChainCount) {
			this.bizChainCount = bizChainCount;
		}
	}

	@Override
	public DescribeMemberStatInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeMemberStatInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
