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

import com.aliyuncs.ens.model.v20171110.CopySnapshotResponse;
import com.aliyuncs.ens.model.v20171110.CopySnapshotResponse.AllocationIdItem;
import com.aliyuncs.ens.model.v20171110.CopySnapshotResponse.UnAllocationIdItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CopySnapshotResponseUnmarshaller {

	public static CopySnapshotResponse unmarshall(CopySnapshotResponse copySnapshotResponse, UnmarshallerContext _ctx) {
		
		copySnapshotResponse.setRequestId(_ctx.stringValue("CopySnapshotResponse.RequestId"));
		copySnapshotResponse.setBizStatusCode(_ctx.stringValue("CopySnapshotResponse.BizStatusCode"));

		List<AllocationIdItem> allocationId = new ArrayList<AllocationIdItem>();
		for (int i = 0; i < _ctx.lengthValue("CopySnapshotResponse.AllocationId.Length"); i++) {
			AllocationIdItem allocationIdItem = new AllocationIdItem();
			allocationIdItem.setEnsRegionId(_ctx.stringValue("CopySnapshotResponse.AllocationId["+ i +"].EnsRegionId"));

			List<String> instanceId = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CopySnapshotResponse.AllocationId["+ i +"].InstanceId.Length"); j++) {
				instanceId.add(_ctx.stringValue("CopySnapshotResponse.AllocationId["+ i +"].InstanceId["+ j +"]"));
			}
			allocationIdItem.setInstanceId(instanceId);

			allocationId.add(allocationIdItem);
		}
		copySnapshotResponse.setAllocationId(allocationId);

		List<UnAllocationIdItem> unAllocationId = new ArrayList<UnAllocationIdItem>();
		for (int i = 0; i < _ctx.lengthValue("CopySnapshotResponse.UnAllocationId.Length"); i++) {
			UnAllocationIdItem unAllocationIdItem = new UnAllocationIdItem();
			unAllocationIdItem.setEnsRegionId(_ctx.stringValue("CopySnapshotResponse.UnAllocationId["+ i +"].EnsRegionId"));

			unAllocationId.add(unAllocationIdItem);
		}
		copySnapshotResponse.setUnAllocationId(unAllocationId);
	 
	 	return copySnapshotResponse;
	}
}