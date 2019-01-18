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

package com.aliyuncs.linkwan.model.v20181230;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20181230.CreateLabNodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateLabNodeResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String devEui;

		private String joinEui;

		private String name;

		private String loraVersion;

		private String classMode;

		private String appKey;

		private Long freqBandPlanGroupId;

		private String nodeActivationState;

		private Long createMillis;

		public String getDevEui() {
			return this.devEui;
		}

		public void setDevEui(String devEui) {
			this.devEui = devEui;
		}

		public String getJoinEui() {
			return this.joinEui;
		}

		public void setJoinEui(String joinEui) {
			this.joinEui = joinEui;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLoraVersion() {
			return this.loraVersion;
		}

		public void setLoraVersion(String loraVersion) {
			this.loraVersion = loraVersion;
		}

		public String getClassMode() {
			return this.classMode;
		}

		public void setClassMode(String classMode) {
			this.classMode = classMode;
		}

		public String getAppKey() {
			return this.appKey;
		}

		public void setAppKey(String appKey) {
			this.appKey = appKey;
		}

		public Long getFreqBandPlanGroupId() {
			return this.freqBandPlanGroupId;
		}

		public void setFreqBandPlanGroupId(Long freqBandPlanGroupId) {
			this.freqBandPlanGroupId = freqBandPlanGroupId;
		}

		public String getNodeActivationState() {
			return this.nodeActivationState;
		}

		public void setNodeActivationState(String nodeActivationState) {
			this.nodeActivationState = nodeActivationState;
		}

		public Long getCreateMillis() {
			return this.createMillis;
		}

		public void setCreateMillis(Long createMillis) {
			this.createMillis = createMillis;
		}
	}

	@Override
	public CreateLabNodeResponse getInstance(UnmarshallerContext context) {
		return	CreateLabNodeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
