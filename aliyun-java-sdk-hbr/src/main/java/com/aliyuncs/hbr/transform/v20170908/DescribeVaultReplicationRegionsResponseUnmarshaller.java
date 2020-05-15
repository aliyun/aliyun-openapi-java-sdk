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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribeVaultReplicationRegionsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVaultReplicationRegionsResponseUnmarshaller {

	public static DescribeVaultReplicationRegionsResponse unmarshall(DescribeVaultReplicationRegionsResponse describeVaultReplicationRegionsResponse, UnmarshallerContext _ctx) {
		
		describeVaultReplicationRegionsResponse.setRequestId(_ctx.stringValue("DescribeVaultReplicationRegionsResponse.RequestId"));
		describeVaultReplicationRegionsResponse.setSuccess(_ctx.booleanValue("DescribeVaultReplicationRegionsResponse.Success"));
		describeVaultReplicationRegionsResponse.setCode(_ctx.stringValue("DescribeVaultReplicationRegionsResponse.Code"));
		describeVaultReplicationRegionsResponse.setMessage(_ctx.stringValue("DescribeVaultReplicationRegionsResponse.Message"));

		List<String> regions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVaultReplicationRegionsResponse.Regions.Length"); i++) {
			regions.add(_ctx.stringValue("DescribeVaultReplicationRegionsResponse.Regions["+ i +"]"));
		}
		describeVaultReplicationRegionsResponse.setRegions(regions);
	 
	 	return describeVaultReplicationRegionsResponse;
	}
}