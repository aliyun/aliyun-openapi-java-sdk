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

package com.aliyuncs.cloudgameapi.model.v20200728;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudgameapi.transform.v20200728.GetOutAccountBindDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOutAccountBindDetailResponse extends AcsResponse {

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

		private Integer bindStatus;

		private String outAccountType;

		private String outAccountId;

		private String token;

		private Long tokenExpireTime;

		public Integer getBindStatus() {
			return this.bindStatus;
		}

		public void setBindStatus(Integer bindStatus) {
			this.bindStatus = bindStatus;
		}

		public String getOutAccountType() {
			return this.outAccountType;
		}

		public void setOutAccountType(String outAccountType) {
			this.outAccountType = outAccountType;
		}

		public String getOutAccountId() {
			return this.outAccountId;
		}

		public void setOutAccountId(String outAccountId) {
			this.outAccountId = outAccountId;
		}

		public String getToken() {
			return this.token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public Long getTokenExpireTime() {
			return this.tokenExpireTime;
		}

		public void setTokenExpireTime(Long tokenExpireTime) {
			this.tokenExpireTime = tokenExpireTime;
		}
	}

	@Override
	public GetOutAccountBindDetailResponse getInstance(UnmarshallerContext context) {
		return	GetOutAccountBindDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
