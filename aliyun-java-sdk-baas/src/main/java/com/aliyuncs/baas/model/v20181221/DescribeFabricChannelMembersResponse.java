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

package com.aliyuncs.baas.model.v20181221;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20181221.DescribeFabricChannelMembersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFabricChannelMembersResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer errorCode;

	private List<ResultItem> result;

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

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String channelId;

		private String organizationId;

		private Boolean withPeer;

		private String state;

		private String inviteTime;

		private String acceptTime;

		private String organizationName;

		private String organizationDomain;

		private String organizationDescription;

		public String getChannelId() {
			return this.channelId;
		}

		public void setChannelId(String channelId) {
			this.channelId = channelId;
		}

		public String getOrganizationId() {
			return this.organizationId;
		}

		public void setOrganizationId(String organizationId) {
			this.organizationId = organizationId;
		}

		public Boolean getWithPeer() {
			return this.withPeer;
		}

		public void setWithPeer(Boolean withPeer) {
			this.withPeer = withPeer;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getInviteTime() {
			return this.inviteTime;
		}

		public void setInviteTime(String inviteTime) {
			this.inviteTime = inviteTime;
		}

		public String getAcceptTime() {
			return this.acceptTime;
		}

		public void setAcceptTime(String acceptTime) {
			this.acceptTime = acceptTime;
		}

		public String getOrganizationName() {
			return this.organizationName;
		}

		public void setOrganizationName(String organizationName) {
			this.organizationName = organizationName;
		}

		public String getOrganizationDomain() {
			return this.organizationDomain;
		}

		public void setOrganizationDomain(String organizationDomain) {
			this.organizationDomain = organizationDomain;
		}

		public String getOrganizationDescription() {
			return this.organizationDescription;
		}

		public void setOrganizationDescription(String organizationDescription) {
			this.organizationDescription = organizationDescription;
		}
	}

	@Override
	public DescribeFabricChannelMembersResponse getInstance(UnmarshallerContext context) {
		return	DescribeFabricChannelMembersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
