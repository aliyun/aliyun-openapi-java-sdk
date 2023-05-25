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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.PurchaseStorageCapacityUnitResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PurchaseStorageCapacityUnitResponseUnmarshaller {

	public static PurchaseStorageCapacityUnitResponse unmarshall(PurchaseStorageCapacityUnitResponse purchaseStorageCapacityUnitResponse, UnmarshallerContext _ctx) {
		
		purchaseStorageCapacityUnitResponse.setRequestId(_ctx.stringValue("PurchaseStorageCapacityUnitResponse.RequestId"));
		purchaseStorageCapacityUnitResponse.setOrderId(_ctx.stringValue("PurchaseStorageCapacityUnitResponse.OrderId"));

		List<String> storageCapacityUnitIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("PurchaseStorageCapacityUnitResponse.StorageCapacityUnitIds.Length"); i++) {
			storageCapacityUnitIds.add(_ctx.stringValue("PurchaseStorageCapacityUnitResponse.StorageCapacityUnitIds["+ i +"]"));
		}
		purchaseStorageCapacityUnitResponse.setStorageCapacityUnitIds(storageCapacityUnitIds);
	 
	 	return purchaseStorageCapacityUnitResponse;
	}
}