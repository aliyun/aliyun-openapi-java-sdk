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

import com.aliyuncs.ens.model.v20171110.DescribeCloudDiskTypesResponse;
import com.aliyuncs.ens.model.v20171110.DescribeCloudDiskTypesResponse.SupportResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCloudDiskTypesResponseUnmarshaller {

	public static DescribeCloudDiskTypesResponse unmarshall(DescribeCloudDiskTypesResponse describeCloudDiskTypesResponse, UnmarshallerContext _ctx) {
		
		describeCloudDiskTypesResponse.setRequestId(_ctx.stringValue("DescribeCloudDiskTypesResponse.RequestId"));

		List<SupportResource> supportResources = new ArrayList<SupportResource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCloudDiskTypesResponse.SupportResources.Length"); i++) {
			SupportResource supportResource = new SupportResource();
			supportResource.setCategory(_ctx.stringValue("DescribeCloudDiskTypesResponse.SupportResources["+ i +"].Category"));
			supportResource.setEnsRegionId(_ctx.stringValue("DescribeCloudDiskTypesResponse.SupportResources["+ i +"].EnsRegionId"));

			supportResources.add(supportResource);
		}
		describeCloudDiskTypesResponse.setSupportResources(supportResources);
	 
	 	return describeCloudDiskTypesResponse;
	}
}