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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20181230.GetGatewayStatusStatResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetGatewayStatusStatResponse extends AcsResponse {

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

		private String gwEui;

		private Float cpuRadio;

		private Float memoryRadio;

		private Long rxCount;

		private Long txCount;

		private String onlineState;

		private Long onlineHour;

		private Boolean enabled;

		public String getGwEui() {
			return this.gwEui;
		}

		public void setGwEui(String gwEui) {
			this.gwEui = gwEui;
		}

		public Float getCpuRadio() {
			return this.cpuRadio;
		}

		public void setCpuRadio(Float cpuRadio) {
			this.cpuRadio = cpuRadio;
		}

		public Float getMemoryRadio() {
			return this.memoryRadio;
		}

		public void setMemoryRadio(Float memoryRadio) {
			this.memoryRadio = memoryRadio;
		}

		public Long getRxCount() {
			return this.rxCount;
		}

		public void setRxCount(Long rxCount) {
			this.rxCount = rxCount;
		}

		public Long getTxCount() {
			return this.txCount;
		}

		public void setTxCount(Long txCount) {
			this.txCount = txCount;
		}

		public String getOnlineState() {
			return this.onlineState;
		}

		public void setOnlineState(String onlineState) {
			this.onlineState = onlineState;
		}

		public Long getOnlineHour() {
			return this.onlineHour;
		}

		public void setOnlineHour(Long onlineHour) {
			this.onlineHour = onlineHour;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}
	}

	@Override
	public GetGatewayStatusStatResponse getInstance(UnmarshallerContext context) {
		return	GetGatewayStatusStatResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
