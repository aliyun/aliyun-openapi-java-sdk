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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCloudConnectNetworksResponseUnmarshaller {

	public static DescribeCloudConnectNetworksResponse unmarshall(DescribeCloudConnectNetworksResponse describeCloudConnectNetworksResponse, UnmarshallerContext context) {
		
		describeCloudConnectNetworksResponse.setRequestId(context.stringValue("DescribeCloudConnectNetworksResponse.RequestId"));
		describeCloudConnectNetworksResponse.setTotalCount(context.integerValue("DescribeCloudConnectNetworksResponse.TotalCount"));
		describeCloudConnectNetworksResponse.setPageNumber(context.integerValue("DescribeCloudConnectNetworksResponse.PageNumber"));
		describeCloudConnectNetworksResponse.setPageSize(context.integerValue("DescribeCloudConnectNetworksResponse.PageSize"));

		List<CloudConnectNetwork> cloudConnectNetworks = new ArrayList<CloudConnectNetwork>();
		for (int i = 0; i < context.lengthValue("DescribeCloudConnectNetworksResponse.CloudConnectNetworks.Length"); i++) {
			CloudConnectNetwork cloudConnectNetwork = new CloudConnectNetwork();
			cloudConnectNetwork.setCcnId(context.stringValue("DescribeCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].CcnId"));
			cloudConnectNetwork.setName(context.stringValue("DescribeCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].Name"));
			cloudConnectNetwork.setAssociatedCloudBoxCount(context.stringValue("DescribeCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].AssociatedCloudBoxCount"));
			cloudConnectNetwork.setAvailableCloudBoxCount(context.stringValue("DescribeCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].AvailableCloudBoxCount"));
			cloudConnectNetwork.setAssociatedCenId(context.stringValue("DescribeCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].AssociatedCenId"));
			cloudConnectNetwork.setAssociatedCenOwnerId(context.stringValue("DescribeCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].AssociatedCenOwnerId"));
			cloudConnectNetwork.setDescription(context.stringValue("DescribeCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].Description"));
			cloudConnectNetwork.setCreateTime(context.longValue("DescribeCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].CreateTime"));
			cloudConnectNetwork.setIsDefault(context.booleanValue("DescribeCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].IsDefault"));

			cloudConnectNetworks.add(cloudConnectNetwork);
		}
		describeCloudConnectNetworksResponse.setCloudConnectNetworks(cloudConnectNetworks);
	 
	 	return describeCloudConnectNetworksResponse;
	}
}