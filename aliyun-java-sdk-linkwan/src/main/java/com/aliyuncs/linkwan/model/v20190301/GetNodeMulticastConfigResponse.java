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

package com.aliyuncs.linkwan.model.v20190301;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20190301.GetNodeMulticastConfigResponseUnmarshaller;
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

		private Slot0 slot0;

		private Slot1 slot1;

		private Slot2 slot2;

		private Slot3 slot3;

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

		public Slot0 getSlot0() {
			return this.slot0;
		}

		public void setSlot0(Slot0 slot0) {
			this.slot0 = slot0;
		}

		public Slot1 getSlot1() {
			return this.slot1;
		}

		public void setSlot1(Slot1 slot1) {
			this.slot1 = slot1;
		}

		public Slot2 getSlot2() {
			return this.slot2;
		}

		public void setSlot2(Slot2 slot2) {
			this.slot2 = slot2;
		}

		public Slot3 getSlot3() {
			return this.slot3;
		}

		public void setSlot3(Slot3 slot3) {
			this.slot3 = slot3;
		}

		public static class Slot0 {

			private String toBeSynchronizedMcAddress;

			private String synchronizedMcAddress;

			private String syncState;

			private String syncAction;

			public String getToBeSynchronizedMcAddress() {
				return this.toBeSynchronizedMcAddress;
			}

			public void setToBeSynchronizedMcAddress(String toBeSynchronizedMcAddress) {
				this.toBeSynchronizedMcAddress = toBeSynchronizedMcAddress;
			}

			public String getSynchronizedMcAddress() {
				return this.synchronizedMcAddress;
			}

			public void setSynchronizedMcAddress(String synchronizedMcAddress) {
				this.synchronizedMcAddress = synchronizedMcAddress;
			}

			public String getSyncState() {
				return this.syncState;
			}

			public void setSyncState(String syncState) {
				this.syncState = syncState;
			}

			public String getSyncAction() {
				return this.syncAction;
			}

			public void setSyncAction(String syncAction) {
				this.syncAction = syncAction;
			}
		}

		public static class Slot1 {

			private String toBeSynchronizedMcAddress;

			private String synchronizedMcAddress;

			private String syncState;

			private String syncAction;

			public String getToBeSynchronizedMcAddress() {
				return this.toBeSynchronizedMcAddress;
			}

			public void setToBeSynchronizedMcAddress(String toBeSynchronizedMcAddress) {
				this.toBeSynchronizedMcAddress = toBeSynchronizedMcAddress;
			}

			public String getSynchronizedMcAddress() {
				return this.synchronizedMcAddress;
			}

			public void setSynchronizedMcAddress(String synchronizedMcAddress) {
				this.synchronizedMcAddress = synchronizedMcAddress;
			}

			public String getSyncState() {
				return this.syncState;
			}

			public void setSyncState(String syncState) {
				this.syncState = syncState;
			}

			public String getSyncAction() {
				return this.syncAction;
			}

			public void setSyncAction(String syncAction) {
				this.syncAction = syncAction;
			}
		}

		public static class Slot2 {

			private String toBeSynchronizedMcAddress;

			private String synchronizedMcAddress;

			private String syncState;

			private String syncAction;

			public String getToBeSynchronizedMcAddress() {
				return this.toBeSynchronizedMcAddress;
			}

			public void setToBeSynchronizedMcAddress(String toBeSynchronizedMcAddress) {
				this.toBeSynchronizedMcAddress = toBeSynchronizedMcAddress;
			}

			public String getSynchronizedMcAddress() {
				return this.synchronizedMcAddress;
			}

			public void setSynchronizedMcAddress(String synchronizedMcAddress) {
				this.synchronizedMcAddress = synchronizedMcAddress;
			}

			public String getSyncState() {
				return this.syncState;
			}

			public void setSyncState(String syncState) {
				this.syncState = syncState;
			}

			public String getSyncAction() {
				return this.syncAction;
			}

			public void setSyncAction(String syncAction) {
				this.syncAction = syncAction;
			}
		}

		public static class Slot3 {

			private String toBeSynchronizedMcAddress;

			private String synchronizedMcAddress;

			private String syncState;

			private String syncAction;

			public String getToBeSynchronizedMcAddress() {
				return this.toBeSynchronizedMcAddress;
			}

			public void setToBeSynchronizedMcAddress(String toBeSynchronizedMcAddress) {
				this.toBeSynchronizedMcAddress = toBeSynchronizedMcAddress;
			}

			public String getSynchronizedMcAddress() {
				return this.synchronizedMcAddress;
			}

			public void setSynchronizedMcAddress(String synchronizedMcAddress) {
				this.synchronizedMcAddress = synchronizedMcAddress;
			}

			public String getSyncState() {
				return this.syncState;
			}

			public void setSyncState(String syncState) {
				this.syncState = syncState;
			}

			public String getSyncAction() {
				return this.syncAction;
			}

			public void setSyncAction(String syncAction) {
				this.syncAction = syncAction;
			}
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
