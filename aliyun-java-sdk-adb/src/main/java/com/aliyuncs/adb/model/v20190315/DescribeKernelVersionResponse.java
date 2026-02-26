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

package com.aliyuncs.adb.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeKernelVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeKernelVersionResponse extends AcsResponse {

	private String requestId;

	private String kernelVersion;

	private String expireDate;

	private List<AvailableKernelVersionsItem> availableKernelVersions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getKernelVersion() {
		return this.kernelVersion;
	}

	public void setKernelVersion(String kernelVersion) {
		this.kernelVersion = kernelVersion;
	}

	public String getExpireDate() {
		return this.expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public List<AvailableKernelVersionsItem> getAvailableKernelVersions() {
		return this.availableKernelVersions;
	}

	public void setAvailableKernelVersions(List<AvailableKernelVersionsItem> availableKernelVersions) {
		this.availableKernelVersions = availableKernelVersions;
	}

	public static class AvailableKernelVersionsItem {

		private String kernelVersion;

		private String releaseDate;

		private String expireDate;

		public String getKernelVersion() {
			return this.kernelVersion;
		}

		public void setKernelVersion(String kernelVersion) {
			this.kernelVersion = kernelVersion;
		}

		public String getReleaseDate() {
			return this.releaseDate;
		}

		public void setReleaseDate(String releaseDate) {
			this.releaseDate = releaseDate;
		}

		public String getExpireDate() {
			return this.expireDate;
		}

		public void setExpireDate(String expireDate) {
			this.expireDate = expireDate;
		}
	}

	@Override
	public DescribeKernelVersionResponse getInstance(UnmarshallerContext context) {
		return	DescribeKernelVersionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
