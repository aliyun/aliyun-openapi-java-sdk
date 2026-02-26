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
import com.aliyuncs.lto.transform.v20210707.ListMemberAuthorizedBizChainResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMemberAuthorizedBizChainResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Boolean success;

	private List<MemberAuthorizedBizChainInfo> data;

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

	public List<MemberAuthorizedBizChainInfo> getData() {
		return this.data;
	}

	public void setData(List<MemberAuthorizedBizChainInfo> data) {
		this.data = data;
	}

	public static class MemberAuthorizedBizChainInfo {

		private String bizChainType;

		private String bizChainName;

		private String bizChainId;

		private Boolean authorized;

		private List<PeerInfo> peerList;

		public String getBizChainType() {
			return this.bizChainType;
		}

		public void setBizChainType(String bizChainType) {
			this.bizChainType = bizChainType;
		}

		public String getBizChainName() {
			return this.bizChainName;
		}

		public void setBizChainName(String bizChainName) {
			this.bizChainName = bizChainName;
		}

		public String getBizChainId() {
			return this.bizChainId;
		}

		public void setBizChainId(String bizChainId) {
			this.bizChainId = bizChainId;
		}

		public Boolean getAuthorized() {
			return this.authorized;
		}

		public void setAuthorized(Boolean authorized) {
			this.authorized = authorized;
		}

		public List<PeerInfo> getPeerList() {
			return this.peerList;
		}

		public void setPeerList(List<PeerInfo> peerList) {
			this.peerList = peerList;
		}

		public static class PeerInfo {

			private String peerName;

			private Boolean authorized;

			public String getPeerName() {
				return this.peerName;
			}

			public void setPeerName(String peerName) {
				this.peerName = peerName;
			}

			public Boolean getAuthorized() {
				return this.authorized;
			}

			public void setAuthorized(Boolean authorized) {
				this.authorized = authorized;
			}
		}
	}

	@Override
	public ListMemberAuthorizedBizChainResponse getInstance(UnmarshallerContext context) {
		return	ListMemberAuthorizedBizChainResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
