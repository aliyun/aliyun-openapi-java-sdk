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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.CreateADConnectorDirectoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateADConnectorDirectoryResponse extends AcsResponse {

	private String directoryId;

	private String requestId;

	private String trustPassword;

	private List<AdConnector> adConnectors;

	public String getDirectoryId() {
		return this.directoryId;
	}

	public void setDirectoryId(String directoryId) {
		this.directoryId = directoryId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTrustPassword() {
		return this.trustPassword;
	}

	public void setTrustPassword(String trustPassword) {
		this.trustPassword = trustPassword;
	}

	public List<AdConnector> getAdConnectors() {
		return this.adConnectors;
	}

	public void setAdConnectors(List<AdConnector> adConnectors) {
		this.adConnectors = adConnectors;
	}

	public static class AdConnector {

		private String address;

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
	}

	@Override
	public CreateADConnectorDirectoryResponse getInstance(UnmarshallerContext context) {
		return	CreateADConnectorDirectoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
