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

import com.aliyuncs.ens.model.v20171110.DescribeStorageGatewayResponse;
import com.aliyuncs.ens.model.v20171110.DescribeStorageGatewayResponse.StorageGatewaysItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStorageGatewayResponseUnmarshaller {

	public static DescribeStorageGatewayResponse unmarshall(DescribeStorageGatewayResponse describeStorageGatewayResponse, UnmarshallerContext _ctx) {
		
		describeStorageGatewayResponse.setRequestId(_ctx.stringValue("DescribeStorageGatewayResponse.RequestId"));
		describeStorageGatewayResponse.setPageNumber(_ctx.integerValue("DescribeStorageGatewayResponse.PageNumber"));
		describeStorageGatewayResponse.setPageSize(_ctx.integerValue("DescribeStorageGatewayResponse.PageSize"));
		describeStorageGatewayResponse.setTotalCount(_ctx.integerValue("DescribeStorageGatewayResponse.TotalCount"));

		List<StorageGatewaysItem> storageGateways = new ArrayList<StorageGatewaysItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStorageGatewayResponse.StorageGateways.Length"); i++) {
			StorageGatewaysItem storageGatewaysItem = new StorageGatewaysItem();
			storageGatewaysItem.setEnsRegionId(_ctx.stringValue("DescribeStorageGatewayResponse.StorageGateways["+ i +"].EnsRegionId"));
			storageGatewaysItem.setStorageGatewayId(_ctx.stringValue("DescribeStorageGatewayResponse.StorageGateways["+ i +"].StorageGatewayId"));
			storageGatewaysItem.setStorageGatewayName(_ctx.stringValue("DescribeStorageGatewayResponse.StorageGateways["+ i +"].StorageGatewayName"));
			storageGatewaysItem.setStorageGatewayType(_ctx.integerValue("DescribeStorageGatewayResponse.StorageGateways["+ i +"].StorageGatewayType"));
			storageGatewaysItem.setServiceIp(_ctx.stringValue("DescribeStorageGatewayResponse.StorageGateways["+ i +"].ServiceIp"));
			storageGatewaysItem.setCreationTime(_ctx.stringValue("DescribeStorageGatewayResponse.StorageGateways["+ i +"].CreationTime"));
			storageGatewaysItem.setStatus(_ctx.stringValue("DescribeStorageGatewayResponse.StorageGateways["+ i +"].Status"));
			storageGatewaysItem.setDescription(_ctx.stringValue("DescribeStorageGatewayResponse.StorageGateways["+ i +"].Description"));
			storageGatewaysItem.setVpcId(_ctx.stringValue("DescribeStorageGatewayResponse.StorageGateways["+ i +"].VpcId"));
			storageGatewaysItem.setCidrBlock(_ctx.stringValue("DescribeStorageGatewayResponse.StorageGateways["+ i +"].CidrBlock"));

			storageGateways.add(storageGatewaysItem);
		}
		describeStorageGatewayResponse.setStorageGateways(storageGateways);
	 
	 	return describeStorageGatewayResponse;
	}
}