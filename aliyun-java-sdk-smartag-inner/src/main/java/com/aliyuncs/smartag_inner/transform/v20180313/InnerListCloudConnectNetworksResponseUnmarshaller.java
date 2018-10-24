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

package com.aliyuncs.smartag_inner.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag_inner.model.v20180313.InnerListCloudConnectNetworksResponse;
import com.aliyuncs.smartag_inner.model.v20180313.InnerListCloudConnectNetworksResponse.CloudConnectNetwork;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerListCloudConnectNetworksResponseUnmarshaller {

	public static InnerListCloudConnectNetworksResponse unmarshall(InnerListCloudConnectNetworksResponse innerListCloudConnectNetworksResponse, UnmarshallerContext context) {
		
		innerListCloudConnectNetworksResponse.setRequestId(context.stringValue("InnerListCloudConnectNetworksResponse.RequestId"));
		innerListCloudConnectNetworksResponse.setTotal(context.integerValue("InnerListCloudConnectNetworksResponse.Total"));
		innerListCloudConnectNetworksResponse.setPageNumber(context.integerValue("InnerListCloudConnectNetworksResponse.PageNumber"));
		innerListCloudConnectNetworksResponse.setPageSize(context.integerValue("InnerListCloudConnectNetworksResponse.PageSize"));
		innerListCloudConnectNetworksResponse.setAliUid(context.longValue("InnerListCloudConnectNetworksResponse.AliUid"));
		innerListCloudConnectNetworksResponse.setBid(context.stringValue("InnerListCloudConnectNetworksResponse.Bid"));

		List<CloudConnectNetwork> cloudConnectNetworks = new ArrayList<CloudConnectNetwork>();
		for (int i = 0; i < context.lengthValue("InnerListCloudConnectNetworksResponse.CloudConnectNetworks.Length"); i++) {
			CloudConnectNetwork cloudConnectNetwork = new CloudConnectNetwork();
			cloudConnectNetwork.setInstanceId(context.stringValue("InnerListCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].InstanceId"));
			cloudConnectNetwork.setName(context.stringValue("InnerListCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].Name"));
			cloudConnectNetwork.setAssociatedCloudBoxCount(context.integerValue("InnerListCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].AssociatedCloudBoxCount"));
			cloudConnectNetwork.setAvailableCloudBoxCount(context.integerValue("InnerListCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].AvailableCloudBoxCount"));
			cloudConnectNetwork.setAssociatedCenId(context.stringValue("InnerListCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].AssociatedCenId"));
			cloudConnectNetwork.setAssociatedCenOwnerId(context.longValue("InnerListCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].AssociatedCenOwnerId"));
			cloudConnectNetwork.setDescription(context.stringValue("InnerListCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].Description"));
			cloudConnectNetwork.setCreateTime(context.longValue("InnerListCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].CreateTime"));
			cloudConnectNetwork.setIsDefault(context.booleanValue("InnerListCloudConnectNetworksResponse.CloudConnectNetworks["+ i +"].IsDefault"));

			cloudConnectNetworks.add(cloudConnectNetwork);
		}
		innerListCloudConnectNetworksResponse.setCloudConnectNetworks(cloudConnectNetworks);
	 
	 	return innerListCloudConnectNetworksResponse;
	}
}