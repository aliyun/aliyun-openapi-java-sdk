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

package com.aliyuncs.config.transform.v20200907;

import com.aliyuncs.config.model.v20200907.GetAggregateResourceInventoryResponse;
import com.aliyuncs.config.model.v20200907.GetAggregateResourceInventoryResponse.ResourceInventory;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAggregateResourceInventoryResponseUnmarshaller {

	public static GetAggregateResourceInventoryResponse unmarshall(GetAggregateResourceInventoryResponse getAggregateResourceInventoryResponse, UnmarshallerContext _ctx) {
		
		getAggregateResourceInventoryResponse.setRequestId(_ctx.stringValue("GetAggregateResourceInventoryResponse.RequestId"));

		ResourceInventory resourceInventory = new ResourceInventory();
		resourceInventory.setDownloadUrl(_ctx.stringValue("GetAggregateResourceInventoryResponse.ResourceInventory.DownloadUrl"));
		resourceInventory.setStatus(_ctx.stringValue("GetAggregateResourceInventoryResponse.ResourceInventory.Status"));
		resourceInventory.setAccountId(_ctx.longValue("GetAggregateResourceInventoryResponse.ResourceInventory.AccountId"));
		resourceInventory.setResourceInventoryGenerateTime(_ctx.longValue("GetAggregateResourceInventoryResponse.ResourceInventory.ResourceInventoryGenerateTime"));
		getAggregateResourceInventoryResponse.setResourceInventory(resourceInventory);
	 
	 	return getAggregateResourceInventoryResponse;
	}
}