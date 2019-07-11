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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.QueryEccInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryEccInfoResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private EccInfo eccInfo;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
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

	public EccInfo getEccInfo() {
		return this.eccInfo;
	}

	public void setEccInfo(EccInfo eccInfo) {
		this.eccInfo = eccInfo;
	}

	public static class EccInfo {

		private String appId;

		private String eccId;

		private String ecuId;

		private String groupId;

		private String groupName;

		private String packageMd5;

		private String packageVersion;

		private String vpcId;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getEccId() {
			return this.eccId;
		}

		public void setEccId(String eccId) {
			this.eccId = eccId;
		}

		public String getEcuId() {
			return this.ecuId;
		}

		public void setEcuId(String ecuId) {
			this.ecuId = ecuId;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getPackageMd5() {
			return this.packageMd5;
		}

		public void setPackageMd5(String packageMd5) {
			this.packageMd5 = packageMd5;
		}

		public String getPackageVersion() {
			return this.packageVersion;
		}

		public void setPackageVersion(String packageVersion) {
			this.packageVersion = packageVersion;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}
	}

	@Override
	public QueryEccInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryEccInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
