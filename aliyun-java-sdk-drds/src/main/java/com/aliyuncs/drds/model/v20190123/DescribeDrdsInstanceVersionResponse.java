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

package com.aliyuncs.drds.model.v20190123;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeDrdsInstanceVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDrdsInstanceVersionResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

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

		private String newestVersion;

		private String instanceVersion;

		public String getNewestVersion() {
			return this.newestVersion;
		}

		public void setNewestVersion(String newestVersion) {
			this.newestVersion = newestVersion;
		}

		public String getInstanceVersion() {
			return this.instanceVersion;
		}

		public void setInstanceVersion(String instanceVersion) {
			this.instanceVersion = instanceVersion;
		}
	}

	@Override
	public DescribeDrdsInstanceVersionResponse getInstance(UnmarshallerContext context) {
		return	DescribeDrdsInstanceVersionResponseUnmarshaller.unmarshall(this, context);
	}
}
