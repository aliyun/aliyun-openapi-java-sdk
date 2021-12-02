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

package com.aliyuncs.retailcloud.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailcloud.model.v20180313.ListAvailableClusterNodeResponse;
import com.aliyuncs.retailcloud.model.v20180313.ListAvailableClusterNodeResponse.ClusterNodeInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAvailableClusterNodeResponseUnmarshaller {

	public static ListAvailableClusterNodeResponse unmarshall(ListAvailableClusterNodeResponse listAvailableClusterNodeResponse, UnmarshallerContext _ctx) {
		
		listAvailableClusterNodeResponse.setRequestId(_ctx.stringValue("ListAvailableClusterNodeResponse.RequestId"));
		listAvailableClusterNodeResponse.setCode(_ctx.integerValue("ListAvailableClusterNodeResponse.Code"));
		listAvailableClusterNodeResponse.setErrorMsg(_ctx.stringValue("ListAvailableClusterNodeResponse.ErrorMsg"));
		listAvailableClusterNodeResponse.setPageNumber(_ctx.integerValue("ListAvailableClusterNodeResponse.PageNumber"));
		listAvailableClusterNodeResponse.setPageSize(_ctx.integerValue("ListAvailableClusterNodeResponse.PageSize"));
		listAvailableClusterNodeResponse.setTotalCount(_ctx.longValue("ListAvailableClusterNodeResponse.TotalCount"));

		List<ClusterNodeInfo> data = new ArrayList<ClusterNodeInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListAvailableClusterNodeResponse.Data.Length"); i++) {
			ClusterNodeInfo clusterNodeInfo = new ClusterNodeInfo();
			clusterNodeInfo.setVpcId(_ctx.stringValue("ListAvailableClusterNodeResponse.Data["+ i +"].VpcId"));
			clusterNodeInfo.setEcsEip(_ctx.stringValue("ListAvailableClusterNodeResponse.Data["+ i +"].EcsEip"));
			clusterNodeInfo.setEcsOsType(_ctx.stringValue("ListAvailableClusterNodeResponse.Data["+ i +"].EcsOsType"));
			clusterNodeInfo.setBusinessCode(_ctx.stringValue("ListAvailableClusterNodeResponse.Data["+ i +"].BusinessCode"));
			clusterNodeInfo.setEcsLocalStorageCapacity(_ctx.stringValue("ListAvailableClusterNodeResponse.Data["+ i +"].EcsLocalStorageCapacity"));
			clusterNodeInfo.setInstanceId(_ctx.stringValue("ListAvailableClusterNodeResponse.Data["+ i +"].InstanceId"));
			clusterNodeInfo.setInternetMaxBandwidthOut(_ctx.stringValue("ListAvailableClusterNodeResponse.Data["+ i +"].InternetMaxBandwidthOut"));
			clusterNodeInfo.setInternetMaxBandwidthIn(_ctx.stringValue("ListAvailableClusterNodeResponse.Data["+ i +"].InternetMaxBandwidthIn"));
			clusterNodeInfo.setInstanceType(_ctx.stringValue("ListAvailableClusterNodeResponse.Data["+ i +"].InstanceType"));
			clusterNodeInfo.setEcsMemory(_ctx.stringValue("ListAvailableClusterNodeResponse.Data["+ i +"].EcsMemory"));
			clusterNodeInfo.setEcsConfiguration(_ctx.stringValue("ListAvailableClusterNodeResponse.Data["+ i +"].EcsConfiguration"));
			clusterNodeInfo.setRegionId(_ctx.stringValue("ListAvailableClusterNodeResponse.Data["+ i +"].RegionId"));
			clusterNodeInfo.setEcsPublicIp(_ctx.stringValue("ListAvailableClusterNodeResponse.Data["+ i +"].EcsPublicIp"));
			clusterNodeInfo.setEcsPrivateIp(_ctx.stringValue("ListAvailableClusterNodeResponse.Data["+ i +"].EcsPrivateIp"));
			clusterNodeInfo.setInstanceNetworkType(_ctx.stringValue("ListAvailableClusterNodeResponse.Data["+ i +"].InstanceNetworkType"));
			clusterNodeInfo.setInstanceName(_ctx.stringValue("ListAvailableClusterNodeResponse.Data["+ i +"].InstanceName"));
			clusterNodeInfo.setOSName(_ctx.stringValue("ListAvailableClusterNodeResponse.Data["+ i +"].OSName"));
			clusterNodeInfo.setEcsZone(_ctx.stringValue("ListAvailableClusterNodeResponse.Data["+ i +"].EcsZone"));
			clusterNodeInfo.setEcsExpiredTime(_ctx.stringValue("ListAvailableClusterNodeResponse.Data["+ i +"].EcsExpiredTime"));
			clusterNodeInfo.setEcsCpu(_ctx.stringValue("ListAvailableClusterNodeResponse.Data["+ i +"].EcsCpu"));

			data.add(clusterNodeInfo);
		}
		listAvailableClusterNodeResponse.setData(data);
	 
	 	return listAvailableClusterNodeResponse;
	}
}