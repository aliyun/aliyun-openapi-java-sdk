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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeCloudConnectNetworksResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeCloudConnectNetworksResponse.CloudConnectNetwork;
import com.aliyuncs.smartag.model.v20180313.DescribeCloudConnectNetworksResponse.CloudConnectNetwork.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCloudConnectNetworksResponseUnmarshaller {

	public static DescribeCloudConnectNetworksResponse unmarshall(DescribeCloudConnectNetworksResponse describeCloudConnectNetworksResponse, UnmarshallerContext _ctx) {
		
		describeCloudConnectNetworksResponse.setRequestId(_ctx.stringValue("DescribeCloudConnectNetworksResponse.RequestId"));
		describeCloudConnectNetworksResponse.setTotalCount(_ctx.integerValue("DescribeCloudConnectNetworksResponse.TotalCount"));
		describeCloudConnectNetworksResponse.setPageNumber(_ctx.integerValue("DescribeCloudConnectNetworksResponse.PageNumber"));
		describeCloudConnectNetworksResponse.setPageSize(_ctx.integerValue("DescribeCloudConnectNetworksResponse.PageSize"));

		List<CloudConnectNetwork> cloudConnectNetworks = new ArrayList<CloudConnectNetwork>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCloudConnectNetworksResponse.CloudConnectNetworks.Length"); i++) {
			CloudConnectNetwork cloudConnectNetwork = new CloudConnectNetwork();
			cloudConnectNetwork.setCcnId(_ctx.stringValue("DescribeCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].CcnId"));
			cloudConnectNetwork.setName(_ctx.stringValue("DescribeCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].Name"));
			cloudConnectNetwork.setAssociatedCloudBoxCount(_ctx.stringValue("DescribeCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].AssociatedCloudBoxCount"));
			cloudConnectNetwork.setAvailableCloudBoxCount(_ctx.stringValue("DescribeCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].AvailableCloudBoxCount"));
			cloudConnectNetwork.setAssociatedCenId(_ctx.stringValue("DescribeCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].AssociatedCenId"));
			cloudConnectNetwork.setAssociatedCenOwnerId(_ctx.stringValue("DescribeCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].AssociatedCenOwnerId"));
			cloudConnectNetwork.setDescription(_ctx.stringValue("DescribeCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].Description"));
			cloudConnectNetwork.setCreateTime(_ctx.longValue("DescribeCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].CreateTime"));
			cloudConnectNetwork.setIsDefault(_ctx.booleanValue("DescribeCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].IsDefault"));
			cloudConnectNetwork.setCidrBlock(_ctx.stringValue("DescribeCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].CidrBlock"));
			cloudConnectNetwork.setSnatCidrBlock(_ctx.stringValue("DescribeCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].SnatCidrBlock"));
			cloudConnectNetwork.setInterworkingStatus(_ctx.stringValue("DescribeCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].InterworkingStatus"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			cloudConnectNetwork.setTags(tags);

			cloudConnectNetworks.add(cloudConnectNetwork);
		}
		describeCloudConnectNetworksResponse.setCloudConnectNetworks(cloudConnectNetworks);
	 
	 	return describeCloudConnectNetworksResponse;
	}
}