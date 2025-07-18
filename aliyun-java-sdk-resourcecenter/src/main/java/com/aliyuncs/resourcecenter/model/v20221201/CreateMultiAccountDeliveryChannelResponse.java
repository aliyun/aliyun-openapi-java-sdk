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

package com.aliyuncs.resourcecenter.model.v20221201;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcecenter.transform.v20221201.CreateMultiAccountDeliveryChannelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateMultiAccountDeliveryChannelResponse extends AcsResponse {

	private String deliveryChannelId;

	private String requestId;

	public String getDeliveryChannelId() {
		return this.deliveryChannelId;
	}

	public void setDeliveryChannelId(String deliveryChannelId) {
		this.deliveryChannelId = deliveryChannelId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public CreateMultiAccountDeliveryChannelResponse getInstance(UnmarshallerContext context) {
		return	CreateMultiAccountDeliveryChannelResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
