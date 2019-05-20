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

package com.aliyuncs.yundun_ds.model.v20190103;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.yundun_ds.transform.v20190103.DescribeUserStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserStatusResponse extends AcsResponse {

	private String requestId;

	private UserStatus userStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public UserStatus getUserStatus() {
		return this.userStatus;
	}

	public void setUserStatus(UserStatus userStatus) {
		this.userStatus = userStatus;
	}

	public static class UserStatus {

		private Boolean authed;

		private Boolean buyed;

		private Boolean ossBucketSet;

		private Boolean odpsSet;

		private Boolean rdsSet;

		private String accessKeyId;

		public Boolean getAuthed() {
			return this.authed;
		}

		public void setAuthed(Boolean authed) {
			this.authed = authed;
		}

		public Boolean getBuyed() {
			return this.buyed;
		}

		public void setBuyed(Boolean buyed) {
			this.buyed = buyed;
		}

		public Boolean getOssBucketSet() {
			return this.ossBucketSet;
		}

		public void setOssBucketSet(Boolean ossBucketSet) {
			this.ossBucketSet = ossBucketSet;
		}

		public Boolean getOdpsSet() {
			return this.odpsSet;
		}

		public void setOdpsSet(Boolean odpsSet) {
			this.odpsSet = odpsSet;
		}

		public Boolean getRdsSet() {
			return this.rdsSet;
		}

		public void setRdsSet(Boolean rdsSet) {
			this.rdsSet = rdsSet;
		}

		public String getAccessKeyId() {
			return this.accessKeyId;
		}

		public void setAccessKeyId(String accessKeyId) {
			this.accessKeyId = accessKeyId;
		}
	}

	@Override
	public DescribeUserStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
