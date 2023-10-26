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

package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.ValidateVpcConnectivityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ValidateVpcConnectivityResponse extends AcsResponse {

	private String requestId;

	private Boolean connected;

	private String ipType;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getConnected() {
		return this.connected;
	}

	public void setConnected(Boolean connected) {
		this.connected = connected;
	}

	public String getIpType() {
		return this.ipType;
	}

	public void setIpType(String ipType) {
		this.ipType = ipType;
	}

	@Override
	public ValidateVpcConnectivityResponse getInstance(UnmarshallerContext context) {
		return	ValidateVpcConnectivityResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
