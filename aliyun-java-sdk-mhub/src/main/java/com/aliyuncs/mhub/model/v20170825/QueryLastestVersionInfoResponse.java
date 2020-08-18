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

package com.aliyuncs.mhub.model.v20170825;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mhub.transform.v20170825.QueryLastestVersionInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLastestVersionInfoResponse extends AcsResponse {

	private String requestId;

	private List<VersionInfo> versionInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<VersionInfo> getVersionInfos() {
		return this.versionInfos;
	}

	public void setVersionInfos(List<VersionInfo> versionInfos) {
		this.versionInfos = versionInfos;
	}

	public static class VersionInfo {

		private String oS;

		private String version;

		private String productID;

		private String createTime;

		private String content;

		public String getOS() {
			return this.oS;
		}

		public void setOS(String oS) {
			this.oS = oS;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getProductID() {
			return this.productID;
		}

		public void setProductID(String productID) {
			this.productID = productID;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}
	}

	@Override
	public QueryLastestVersionInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryLastestVersionInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
