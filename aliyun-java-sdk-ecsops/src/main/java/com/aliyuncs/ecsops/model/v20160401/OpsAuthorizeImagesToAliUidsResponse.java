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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsAuthorizeImagesToAliUidsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsAuthorizeImagesToAliUidsResponse extends AcsResponse {

	private String requestId;

	private List<AuthorizeAliUid> authorizeAliUids;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AuthorizeAliUid> getAuthorizeAliUids() {
		return this.authorizeAliUids;
	}

	public void setAuthorizeAliUids(List<AuthorizeAliUid> authorizeAliUids) {
		this.authorizeAliUids = authorizeAliUids;
	}

	public static class AuthorizeAliUid {

		private String hiddenImageId;

		private String onlineImageId;

		private String osName;

		private String offlineImageId;

		private String deprecatedImageId;

		private List<String> aliUids;

		public String getHiddenImageId() {
			return this.hiddenImageId;
		}

		public void setHiddenImageId(String hiddenImageId) {
			this.hiddenImageId = hiddenImageId;
		}

		public String getOnlineImageId() {
			return this.onlineImageId;
		}

		public void setOnlineImageId(String onlineImageId) {
			this.onlineImageId = onlineImageId;
		}

		public String getOsName() {
			return this.osName;
		}

		public void setOsName(String osName) {
			this.osName = osName;
		}

		public String getOfflineImageId() {
			return this.offlineImageId;
		}

		public void setOfflineImageId(String offlineImageId) {
			this.offlineImageId = offlineImageId;
		}

		public String getDeprecatedImageId() {
			return this.deprecatedImageId;
		}

		public void setDeprecatedImageId(String deprecatedImageId) {
			this.deprecatedImageId = deprecatedImageId;
		}

		public List<String> getAliUids() {
			return this.aliUids;
		}

		public void setAliUids(List<String> aliUids) {
			this.aliUids = aliUids;
		}
	}

	@Override
	public OpsAuthorizeImagesToAliUidsResponse getInstance(UnmarshallerContext context) {
		return	OpsAuthorizeImagesToAliUidsResponseUnmarshaller.unmarshall(this, context);
	}
}
