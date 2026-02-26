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

package com.aliyuncs.cloud_siem.model.v20220616;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.GetStorageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetStorageResponse extends AcsResponse {

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

		private Integer ttl;

		private String region;

		private Boolean displayRegion;

		private Boolean canOperate;

		public Integer getTtl() {
			return this.ttl;
		}

		public void setTtl(Integer ttl) {
			this.ttl = ttl;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public Boolean getDisplayRegion() {
			return this.displayRegion;
		}

		public void setDisplayRegion(Boolean displayRegion) {
			this.displayRegion = displayRegion;
		}

		public Boolean getCanOperate() {
			return this.canOperate;
		}

		public void setCanOperate(Boolean canOperate) {
			this.canOperate = canOperate;
		}
	}

	@Override
	public GetStorageResponse getInstance(UnmarshallerContext context) {
		return	GetStorageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
