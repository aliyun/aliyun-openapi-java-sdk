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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.PurchaseStorageCapacityUnitResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PurchaseStorageCapacityUnitResponse extends AcsResponse {

	private String orderId;

	private String requestId;

	private List<String> storageCapacityUnitIds;

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getStorageCapacityUnitIds() {
		return this.storageCapacityUnitIds;
	}

	public void setStorageCapacityUnitIds(List<String> storageCapacityUnitIds) {
		this.storageCapacityUnitIds = storageCapacityUnitIds;
	}

	@Override
	public PurchaseStorageCapacityUnitResponse getInstance(UnmarshallerContext context) {
		return	PurchaseStorageCapacityUnitResponseUnmarshaller.unmarshall(this, context);
	}
}
