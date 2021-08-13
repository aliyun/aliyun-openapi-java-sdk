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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeSagRemoteAccessResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSagRemoteAccessResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String smartAGId;

	private String code;

	private Boolean success;

	private List<RemoteAccess> remoteAccesses;

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

	public String getSmartAGId() {
		return this.smartAGId;
	}

	public void setSmartAGId(String smartAGId) {
		this.smartAGId = smartAGId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<RemoteAccess> getRemoteAccesses() {
		return this.remoteAccesses;
	}

	public void setRemoteAccesses(List<RemoteAccess> remoteAccesses) {
		this.remoteAccesses = remoteAccesses;
	}

	public static class RemoteAccess {

		private String serialNumber;

		private String remoteAccessIp;

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getRemoteAccessIp() {
			return this.remoteAccessIp;
		}

		public void setRemoteAccessIp(String remoteAccessIp) {
			this.remoteAccessIp = remoteAccessIp;
		}
	}

	@Override
	public DescribeSagRemoteAccessResponse getInstance(UnmarshallerContext context) {
		return	DescribeSagRemoteAccessResponseUnmarshaller.unmarshall(this, context);
	}
}
