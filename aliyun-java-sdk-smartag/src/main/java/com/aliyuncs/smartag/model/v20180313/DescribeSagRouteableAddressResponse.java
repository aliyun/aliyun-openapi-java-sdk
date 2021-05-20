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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeSagRouteableAddressResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSagRouteableAddressResponse extends AcsResponse {

	private String origin;

	private String requestId;

	private String routeableAddress;

	public String getOrigin() {
		return this.origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRouteableAddress() {
		return this.routeableAddress;
	}

	public void setRouteableAddress(String routeableAddress) {
		this.routeableAddress = routeableAddress;
	}

	@Override
	public DescribeSagRouteableAddressResponse getInstance(UnmarshallerContext context) {
		return	DescribeSagRouteableAddressResponseUnmarshaller.unmarshall(this, context);
	}
}
