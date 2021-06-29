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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.GetDeviceCaptureStrategyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDeviceCaptureStrategyResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Data data;

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

		private String deviceType;

		private String deviceCode;

		private String mondayCaptureStrategy;

		private String tuesdayCaptureStrategy;

		private String wednesdayCaptureStrategy;

		private String thursdayCaptureStrategy;

		private String fridayCaptureStrategy;

		private String saturdayCaptureStrategy;

		private String sundayCaptureStrategy;

		public String getDeviceType() {
			return this.deviceType;
		}

		public void setDeviceType(String deviceType) {
			this.deviceType = deviceType;
		}

		public String getDeviceCode() {
			return this.deviceCode;
		}

		public void setDeviceCode(String deviceCode) {
			this.deviceCode = deviceCode;
		}

		public String getMondayCaptureStrategy() {
			return this.mondayCaptureStrategy;
		}

		public void setMondayCaptureStrategy(String mondayCaptureStrategy) {
			this.mondayCaptureStrategy = mondayCaptureStrategy;
		}

		public String getTuesdayCaptureStrategy() {
			return this.tuesdayCaptureStrategy;
		}

		public void setTuesdayCaptureStrategy(String tuesdayCaptureStrategy) {
			this.tuesdayCaptureStrategy = tuesdayCaptureStrategy;
		}

		public String getWednesdayCaptureStrategy() {
			return this.wednesdayCaptureStrategy;
		}

		public void setWednesdayCaptureStrategy(String wednesdayCaptureStrategy) {
			this.wednesdayCaptureStrategy = wednesdayCaptureStrategy;
		}

		public String getThursdayCaptureStrategy() {
			return this.thursdayCaptureStrategy;
		}

		public void setThursdayCaptureStrategy(String thursdayCaptureStrategy) {
			this.thursdayCaptureStrategy = thursdayCaptureStrategy;
		}

		public String getFridayCaptureStrategy() {
			return this.fridayCaptureStrategy;
		}

		public void setFridayCaptureStrategy(String fridayCaptureStrategy) {
			this.fridayCaptureStrategy = fridayCaptureStrategy;
		}

		public String getSaturdayCaptureStrategy() {
			return this.saturdayCaptureStrategy;
		}

		public void setSaturdayCaptureStrategy(String saturdayCaptureStrategy) {
			this.saturdayCaptureStrategy = saturdayCaptureStrategy;
		}

		public String getSundayCaptureStrategy() {
			return this.sundayCaptureStrategy;
		}

		public void setSundayCaptureStrategy(String sundayCaptureStrategy) {
			this.sundayCaptureStrategy = sundayCaptureStrategy;
		}
	}

	@Override
	public GetDeviceCaptureStrategyResponse getInstance(UnmarshallerContext context) {
		return	GetDeviceCaptureStrategyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
