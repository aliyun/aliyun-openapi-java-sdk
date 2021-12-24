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

package com.aliyuncs.sgw.transform.v20180511;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sgw.model.v20180511.DescribeStorageBundlesResponse;
import com.aliyuncs.sgw.model.v20180511.DescribeStorageBundlesResponse.StorageBundle;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStorageBundlesResponseUnmarshaller {

	public static DescribeStorageBundlesResponse unmarshall(DescribeStorageBundlesResponse describeStorageBundlesResponse, UnmarshallerContext _ctx) {
		
		describeStorageBundlesResponse.setRequestId(_ctx.stringValue("DescribeStorageBundlesResponse.RequestId"));
		describeStorageBundlesResponse.setTotalCount(_ctx.integerValue("DescribeStorageBundlesResponse.TotalCount"));
		describeStorageBundlesResponse.setMessage(_ctx.stringValue("DescribeStorageBundlesResponse.Message"));
		describeStorageBundlesResponse.setPageSize(_ctx.integerValue("DescribeStorageBundlesResponse.PageSize"));
		describeStorageBundlesResponse.setPageNumber(_ctx.integerValue("DescribeStorageBundlesResponse.PageNumber"));
		describeStorageBundlesResponse.setCode(_ctx.stringValue("DescribeStorageBundlesResponse.Code"));
		describeStorageBundlesResponse.setSuccess(_ctx.booleanValue("DescribeStorageBundlesResponse.Success"));

		List<StorageBundle> storageBundles = new ArrayList<StorageBundle>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStorageBundlesResponse.StorageBundles.Length"); i++) {
			StorageBundle storageBundle = new StorageBundle();
			storageBundle.setDescription(_ctx.stringValue("DescribeStorageBundlesResponse.StorageBundles["+ i +"].Description"));
			storageBundle.setBackendBucketRegionId(_ctx.stringValue("DescribeStorageBundlesResponse.StorageBundles["+ i +"].BackendBucketRegionId"));
			storageBundle.setResourceGroupId(_ctx.stringValue("DescribeStorageBundlesResponse.StorageBundles["+ i +"].ResourceGroupId"));
			storageBundle.setStorageBundleId(_ctx.stringValue("DescribeStorageBundlesResponse.StorageBundles["+ i +"].StorageBundleId"));
			storageBundle.setName(_ctx.stringValue("DescribeStorageBundlesResponse.StorageBundles["+ i +"].Name"));
			storageBundle.setCreatedTime(_ctx.longValue("DescribeStorageBundlesResponse.StorageBundles["+ i +"].CreatedTime"));
			storageBundle.setLocation(_ctx.stringValue("DescribeStorageBundlesResponse.StorageBundles["+ i +"].Location"));

			storageBundles.add(storageBundle);
		}
		describeStorageBundlesResponse.setStorageBundles(storageBundles);
	 
	 	return describeStorageBundlesResponse;
	}
}