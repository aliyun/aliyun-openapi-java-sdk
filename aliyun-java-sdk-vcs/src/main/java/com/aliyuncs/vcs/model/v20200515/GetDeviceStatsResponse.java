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

package com.aliyuncs.vcs.model.v20200515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.GetDeviceStatsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDeviceStatsResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private List<Result> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Result> getData() {
		return this.data;
	}

	public void setData(List<Result> data) {
		this.data = data;
	}

	public static class Result {

		private String deviceType;

		private String deviceStatus;

		private Long count;

		public String getDeviceType() {
			return this.deviceType;
		}

		public void setDeviceType(String deviceType) {
			this.deviceType = deviceType;
		}

		public String getDeviceStatus() {
			return this.deviceStatus;
		}

		public void setDeviceStatus(String deviceStatus) {
			this.deviceStatus = deviceStatus;
		}

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}
	}

	@Override
	public GetDeviceStatsResponse getInstance(UnmarshallerContext context) {
		return	GetDeviceStatsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
