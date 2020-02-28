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
import com.aliyuncs.vpc.transform.v20160428.AllocateEipSegmentAddressResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AllocateEipSegmentAddressResponse extends AcsResponse {

	private String requestId;

	private String eipSegmentInstanceId;

	private Long orderId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEipSegmentInstanceId() {
		return this.eipSegmentInstanceId;
	}

	public void setEipSegmentInstanceId(String eipSegmentInstanceId) {
		this.eipSegmentInstanceId = eipSegmentInstanceId;
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	@Override
	public AllocateEipSegmentAddressResponse getInstance(UnmarshallerContext context) {
		return	AllocateEipSegmentAddressResponseUnmarshaller.unmarshall(this, context);
	}
}
