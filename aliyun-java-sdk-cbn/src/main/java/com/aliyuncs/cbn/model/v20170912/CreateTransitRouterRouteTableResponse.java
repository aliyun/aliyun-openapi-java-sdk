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

package com.aliyuncs.cbn.model.v20170912;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cbn.transform.v20170912.CreateTransitRouterRouteTableResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateTransitRouterRouteTableResponse extends AcsResponse {

	private String requestId;

	private String transitRouterRouteTableId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTransitRouterRouteTableId() {
		return this.transitRouterRouteTableId;
	}

	public void setTransitRouterRouteTableId(String transitRouterRouteTableId) {
		this.transitRouterRouteTableId = transitRouterRouteTableId;
	}

	@Override
	public CreateTransitRouterRouteTableResponse getInstance(UnmarshallerContext context) {
		return	CreateTransitRouterRouteTableResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
