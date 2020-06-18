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

package com.aliyuncs.dyiotapi.model.v20171111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dyiotapi.transform.v20171111.DoIotIsImeiExistResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DoIotIsImeiExistResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private IotImeiExist iotImeiExist;

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

	public IotImeiExist getIotImeiExist() {
		return this.iotImeiExist;
	}

	public void setIotImeiExist(IotImeiExist iotImeiExist) {
		this.iotImeiExist = iotImeiExist;
	}

	public static class IotImeiExist {

		private Boolean isImeiExist;

		public Boolean getIsImeiExist() {
			return this.isImeiExist;
		}

		public void setIsImeiExist(Boolean isImeiExist) {
			this.isImeiExist = isImeiExist;
		}
	}

	@Override
	public DoIotIsImeiExistResponse getInstance(UnmarshallerContext context) {
		return	DoIotIsImeiExistResponseUnmarshaller.unmarshall(this, context);
	}
}
