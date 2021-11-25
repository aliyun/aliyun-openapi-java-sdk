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
import com.aliyuncs.vcs.transform.v20200515.PeekNvrResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PeekNvrResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long idleCount;

		private List<SubDevice> subDeviceList;

		public Long getIdleCount() {
			return this.idleCount;
		}

		public void setIdleCount(Long idleCount) {
			this.idleCount = idleCount;
		}

		public List<SubDevice> getSubDeviceList() {
			return this.subDeviceList;
		}

		public void setSubDeviceList(List<SubDevice> subDeviceList) {
			this.subDeviceList = subDeviceList;
		}

		public static class SubDevice {

			private String subDeviceId;

			private String subDeviceNum;

			private String subDeviceName;

			private String subDeviceStatus;

			private String associatedPlatform;

			public String getSubDeviceId() {
				return this.subDeviceId;
			}

			public void setSubDeviceId(String subDeviceId) {
				this.subDeviceId = subDeviceId;
			}

			public String getSubDeviceNum() {
				return this.subDeviceNum;
			}

			public void setSubDeviceNum(String subDeviceNum) {
				this.subDeviceNum = subDeviceNum;
			}

			public String getSubDeviceName() {
				return this.subDeviceName;
			}

			public void setSubDeviceName(String subDeviceName) {
				this.subDeviceName = subDeviceName;
			}

			public String getSubDeviceStatus() {
				return this.subDeviceStatus;
			}

			public void setSubDeviceStatus(String subDeviceStatus) {
				this.subDeviceStatus = subDeviceStatus;
			}

			public String getAssociatedPlatform() {
				return this.associatedPlatform;
			}

			public void setAssociatedPlatform(String associatedPlatform) {
				this.associatedPlatform = associatedPlatform;
			}
		}
	}

	@Override
	public PeekNvrResponse getInstance(UnmarshallerContext context) {
		return	PeekNvrResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
