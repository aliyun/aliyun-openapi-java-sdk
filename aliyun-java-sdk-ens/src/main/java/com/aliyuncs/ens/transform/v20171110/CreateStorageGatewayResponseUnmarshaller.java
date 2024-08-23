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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.CreateStorageGatewayResponse;
import com.aliyuncs.ens.model.v20171110.CreateStorageGatewayResponse.AllocationIdItem;
import com.aliyuncs.ens.model.v20171110.CreateStorageGatewayResponse.UnAllocationIdItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateStorageGatewayResponseUnmarshaller {

	public static CreateStorageGatewayResponse unmarshall(CreateStorageGatewayResponse createStorageGatewayResponse, UnmarshallerContext _ctx) {
		
		createStorageGatewayResponse.setRequestId(_ctx.stringValue("CreateStorageGatewayResponse.RequestId"));
		createStorageGatewayResponse.setBizStatusCode(_ctx.stringValue("CreateStorageGatewayResponse.BizStatusCode"));

		List<AllocationIdItem> allocationId = new ArrayList<AllocationIdItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateStorageGatewayResponse.AllocationId.Length"); i++) {
			AllocationIdItem allocationIdItem = new AllocationIdItem();
			allocationIdItem.setInstanceId(_ctx.stringValue("CreateStorageGatewayResponse.AllocationId["+ i +"].InstanceId"));
			allocationIdItem.setEnsRegionId(_ctx.stringValue("CreateStorageGatewayResponse.AllocationId["+ i +"].EnsRegionId"));

			allocationId.add(allocationIdItem);
		}
		createStorageGatewayResponse.setAllocationId(allocationId);

		List<UnAllocationIdItem> unAllocationId = new ArrayList<UnAllocationIdItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateStorageGatewayResponse.UnAllocationId.Length"); i++) {
			UnAllocationIdItem unAllocationIdItem = new UnAllocationIdItem();
			unAllocationIdItem.setInstanceId(_ctx.stringValue("CreateStorageGatewayResponse.UnAllocationId["+ i +"].InstanceId"));
			unAllocationIdItem.setEnsRegionId(_ctx.stringValue("CreateStorageGatewayResponse.UnAllocationId["+ i +"].EnsRegionId"));

			unAllocationId.add(unAllocationIdItem);
		}
		createStorageGatewayResponse.setUnAllocationId(unAllocationId);
	 
	 	return createStorageGatewayResponse;
	}
}