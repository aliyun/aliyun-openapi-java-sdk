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
import com.aliyuncs.linkwan.transform.v20181230.GetNodeMulticastConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetNodeMulticastConfigResponse extends AcsResponse {

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

		private String mcAddress1;

		private String mcAddress2;

		private String mcAddress3;

		private String mcAddress4;

		public String getDevEui() {
			return this.devEui;
		}

		public void setDevEui(String devEui) {
			this.devEui = devEui;
		}

		public String getMcAddress1() {
			return this.mcAddress1;
		}

		public void setMcAddress1(String mcAddress1) {
			this.mcAddress1 = mcAddress1;
		}

		public String getMcAddress2() {
			return this.mcAddress2;
		}

		public void setMcAddress2(String mcAddress2) {
			this.mcAddress2 = mcAddress2;
		}

		public String getMcAddress3() {
			return this.mcAddress3;
		}

		public void setMcAddress3(String mcAddress3) {
			this.mcAddress3 = mcAddress3;
		}

		public String getMcAddress4() {
			return this.mcAddress4;
		}

		public void setMcAddress4(String mcAddress4) {
			this.mcAddress4 = mcAddress4;
		}
	}

	@Override
	public GetNodeMulticastConfigResponse getInstance(UnmarshallerContext context) {
		return	GetNodeMulticastConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
