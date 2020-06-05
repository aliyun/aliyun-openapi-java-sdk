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

import com.aliyuncs.sgw.model.v20180511.DescribeStorageBundleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStorageBundleResponseUnmarshaller {

	public static DescribeStorageBundleResponse unmarshall(DescribeStorageBundleResponse describeStorageBundleResponse, UnmarshallerContext _ctx) {
		
		describeStorageBundleResponse.setRequestId(_ctx.stringValue("DescribeStorageBundleResponse.RequestId"));
		describeStorageBundleResponse.setSuccess(_ctx.booleanValue("DescribeStorageBundleResponse.Success"));
		describeStorageBundleResponse.setCode(_ctx.stringValue("DescribeStorageBundleResponse.Code"));
		describeStorageBundleResponse.setMessage(_ctx.stringValue("DescribeStorageBundleResponse.Message"));
		describeStorageBundleResponse.setStorageBundleId(_ctx.stringValue("DescribeStorageBundleResponse.StorageBundleId"));
		describeStorageBundleResponse.setName(_ctx.stringValue("DescribeStorageBundleResponse.Name"));
		describeStorageBundleResponse.setDescription(_ctx.stringValue("DescribeStorageBundleResponse.Description"));
		describeStorageBundleResponse.setBackendBucketRegionId(_ctx.stringValue("DescribeStorageBundleResponse.BackendBucketRegionId"));
		describeStorageBundleResponse.setLocation(_ctx.stringValue("DescribeStorageBundleResponse.Location"));
		describeStorageBundleResponse.setCreatedTime(_ctx.longValue("DescribeStorageBundleResponse.CreatedTime"));
		describeStorageBundleResponse.setResourceGroupId(_ctx.stringValue("DescribeStorageBundleResponse.ResourceGroupId"));
	 
	 	return describeStorageBundleResponse;
	}
}