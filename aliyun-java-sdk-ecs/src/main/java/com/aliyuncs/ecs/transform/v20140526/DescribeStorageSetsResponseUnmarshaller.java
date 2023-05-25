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

import com.aliyuncs.ecs.model.v20140526.DescribeStorageSetsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeStorageSetsResponse.StorageSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStorageSetsResponseUnmarshaller {

	public static DescribeStorageSetsResponse unmarshall(DescribeStorageSetsResponse describeStorageSetsResponse, UnmarshallerContext _ctx) {
		
		describeStorageSetsResponse.setRequestId(_ctx.stringValue("DescribeStorageSetsResponse.RequestId"));
		describeStorageSetsResponse.setPageSize(_ctx.integerValue("DescribeStorageSetsResponse.PageSize"));
		describeStorageSetsResponse.setPageNumber(_ctx.integerValue("DescribeStorageSetsResponse.PageNumber"));
		describeStorageSetsResponse.setTotalCount(_ctx.integerValue("DescribeStorageSetsResponse.TotalCount"));

		List<StorageSet> storageSets = new ArrayList<StorageSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStorageSetsResponse.StorageSets.Length"); i++) {
			StorageSet storageSet = new StorageSet();
			storageSet.setCreationTime(_ctx.stringValue("DescribeStorageSetsResponse.StorageSets["+ i +"].CreationTime"));
			storageSet.setDescription(_ctx.stringValue("DescribeStorageSetsResponse.StorageSets["+ i +"].Description"));
			storageSet.setZoneId(_ctx.stringValue("DescribeStorageSetsResponse.StorageSets["+ i +"].ZoneId"));
			storageSet.setStorageSetId(_ctx.stringValue("DescribeStorageSetsResponse.StorageSets["+ i +"].StorageSetId"));
			storageSet.setStorageSetPartitionNumber(_ctx.integerValue("DescribeStorageSetsResponse.StorageSets["+ i +"].StorageSetPartitionNumber"));
			storageSet.setStorageSetName(_ctx.stringValue("DescribeStorageSetsResponse.StorageSets["+ i +"].StorageSetName"));
			storageSet.setRegionId(_ctx.stringValue("DescribeStorageSetsResponse.StorageSets["+ i +"].RegionId"));

			storageSets.add(storageSet);
		}
		describeStorageSetsResponse.setStorageSets(storageSets);
	 
	 	return describeStorageSetsResponse;
	}
}