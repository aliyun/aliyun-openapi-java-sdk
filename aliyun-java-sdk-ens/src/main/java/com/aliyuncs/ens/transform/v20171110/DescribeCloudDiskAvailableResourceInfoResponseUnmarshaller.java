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

import com.aliyuncs.ens.model.v20171110.DescribeCloudDiskAvailableResourceInfoResponse;
import com.aliyuncs.ens.model.v20171110.DescribeCloudDiskAvailableResourceInfoResponse.SupportResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCloudDiskAvailableResourceInfoResponseUnmarshaller {

	public static DescribeCloudDiskAvailableResourceInfoResponse unmarshall(DescribeCloudDiskAvailableResourceInfoResponse describeCloudDiskAvailableResourceInfoResponse, UnmarshallerContext _ctx) {
		
		describeCloudDiskAvailableResourceInfoResponse.setRequestId(_ctx.stringValue("DescribeCloudDiskAvailableResourceInfoResponse.RequestId"));

		List<SupportResource> supportResources = new ArrayList<SupportResource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCloudDiskAvailableResourceInfoResponse.SupportResources.Length"); i++) {
			SupportResource supportResource = new SupportResource();
			supportResource.setEnsRegionId(_ctx.stringValue("DescribeCloudDiskAvailableResourceInfoResponse.SupportResources["+ i +"].EnsRegionId"));
			supportResource.setEnsRegionName(_ctx.stringValue("DescribeCloudDiskAvailableResourceInfoResponse.SupportResources["+ i +"].EnsRegionName"));
			supportResource.setDiskMinSize(_ctx.longValue("DescribeCloudDiskAvailableResourceInfoResponse.SupportResources["+ i +"].DiskMinSize"));
			supportResource.setDiskMaxSize(_ctx.longValue("DescribeCloudDiskAvailableResourceInfoResponse.SupportResources["+ i +"].DiskMaxSize"));
			supportResource.setCanBuyCount(_ctx.longValue("DescribeCloudDiskAvailableResourceInfoResponse.SupportResources["+ i +"].CanBuyCount"));
			supportResource.setCategory(_ctx.stringValue("DescribeCloudDiskAvailableResourceInfoResponse.SupportResources["+ i +"].Category"));
			supportResource.setDefaultDiskSize(_ctx.longValue("DescribeCloudDiskAvailableResourceInfoResponse.SupportResources["+ i +"].DefaultDiskSize"));

			List<String> ability = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCloudDiskAvailableResourceInfoResponse.SupportResources["+ i +"].Ability.Length"); j++) {
				ability.add(_ctx.stringValue("DescribeCloudDiskAvailableResourceInfoResponse.SupportResources["+ i +"].Ability["+ j +"]"));
			}
			supportResource.setAbility(ability);

			supportResources.add(supportResource);
		}
		describeCloudDiskAvailableResourceInfoResponse.setSupportResources(supportResources);
	 
	 	return describeCloudDiskAvailableResourceInfoResponse;
	}
}