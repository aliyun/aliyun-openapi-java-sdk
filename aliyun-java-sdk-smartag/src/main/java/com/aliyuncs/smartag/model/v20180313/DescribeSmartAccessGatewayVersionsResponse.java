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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeSmartAccessGatewayVersionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSmartAccessGatewayVersionsResponse extends AcsResponse {

	private String requestId;

	private List<SmartAGVersion> smartAGVersions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SmartAGVersion> getSmartAGVersions() {
		return this.smartAGVersions;
	}

	public void setSmartAGVersions(List<SmartAGVersion> smartAGVersions) {
		this.smartAGVersions = smartAGVersions;
	}

	public static class SmartAGVersion {

		private String versionCode;

		private String type;

		private Long createTime;

		private String versionName;

		public String getVersionCode() {
			return this.versionCode;
		}

		public void setVersionCode(String versionCode) {
			this.versionCode = versionCode;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getVersionName() {
			return this.versionName;
		}

		public void setVersionName(String versionName) {
			this.versionName = versionName;
		}
	}

	@Override
	public DescribeSmartAccessGatewayVersionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSmartAccessGatewayVersionsResponseUnmarshaller.unmarshall(this, context);
	}
}
