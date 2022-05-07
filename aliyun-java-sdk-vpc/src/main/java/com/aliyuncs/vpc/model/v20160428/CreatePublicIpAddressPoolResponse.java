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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.CreatePublicIpAddressPoolResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreatePublicIpAddressPoolResponse extends AcsResponse {

	private String pulbicIpAddressPoolId;

	private String requestId;

	public String getPulbicIpAddressPoolId() {
		return this.pulbicIpAddressPoolId;
	}

	public void setPulbicIpAddressPoolId(String pulbicIpAddressPoolId) {
		this.pulbicIpAddressPoolId = pulbicIpAddressPoolId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public CreatePublicIpAddressPoolResponse getInstance(UnmarshallerContext context) {
		return	CreatePublicIpAddressPoolResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
