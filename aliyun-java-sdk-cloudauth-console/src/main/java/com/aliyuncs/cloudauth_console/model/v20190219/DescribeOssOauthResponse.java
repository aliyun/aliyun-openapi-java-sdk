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

package com.aliyuncs.cloudauth_console.model.v20190219;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudauth_console.transform.v20190219.DescribeOssOauthResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOssOauthResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Boolean ossServe;

		private Boolean openOssService;

		private Boolean ossAuthorized;

		private String bucketName;

		private Long openOssTime;

		public Boolean getOssServe() {
			return this.ossServe;
		}

		public void setOssServe(Boolean ossServe) {
			this.ossServe = ossServe;
		}

		public Boolean getOpenOssService() {
			return this.openOssService;
		}

		public void setOpenOssService(Boolean openOssService) {
			this.openOssService = openOssService;
		}

		public Boolean getOssAuthorized() {
			return this.ossAuthorized;
		}

		public void setOssAuthorized(Boolean ossAuthorized) {
			this.ossAuthorized = ossAuthorized;
		}

		public String getBucketName() {
			return this.bucketName;
		}

		public void setBucketName(String bucketName) {
			this.bucketName = bucketName;
		}

		public Long getOpenOssTime() {
			return this.openOssTime;
		}

		public void setOpenOssTime(Long openOssTime) {
			this.openOssTime = openOssTime;
		}
	}

	@Override
	public DescribeOssOauthResponse getInstance(UnmarshallerContext context) {
		return	DescribeOssOauthResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
