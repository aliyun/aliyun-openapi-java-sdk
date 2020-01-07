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

import com.aliyuncs.retailcloud.model.v20180313.ListClusterNodeResponse;
import com.aliyuncs.retailcloud.model.v20180313.ListClusterNodeResponse.ClusterNodeInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterNodeResponseUnmarshaller {

	public static ListClusterNodeResponse unmarshall(ListClusterNodeResponse listClusterNodeResponse, UnmarshallerContext _ctx) {
		
		listClusterNodeResponse.setRequestId(_ctx.stringValue("ListClusterNodeResponse.RequestId"));
		listClusterNodeResponse.setCode(_ctx.integerValue("ListClusterNodeResponse.Code"));
		listClusterNodeResponse.setErrorMsg(_ctx.stringValue("ListClusterNodeResponse.ErrorMsg"));
		listClusterNodeResponse.setPageNumber(_ctx.integerValue("ListClusterNodeResponse.PageNumber"));
		listClusterNodeResponse.setPageSize(_ctx.integerValue("ListClusterNodeResponse.PageSize"));
		listClusterNodeResponse.setTotalCount(_ctx.longValue("ListClusterNodeResponse.TotalCount"));

		List<ClusterNodeInfo> data = new ArrayList<ClusterNodeInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterNodeResponse.Data.Length"); i++) {
			ClusterNodeInfo clusterNodeInfo = new ClusterNodeInfo();
			clusterNodeInfo.setOSName(_ctx.stringValue("ListClusterNodeResponse.Data["+ i +"].OSName"));
			clusterNodeInfo.setBusinessCode(_ctx.stringValue("ListClusterNodeResponse.Data["+ i +"].BusinessCode"));
			clusterNodeInfo.setEcsConfiguration(_ctx.stringValue("ListClusterNodeResponse.Data["+ i +"].EcsConfiguration"));
			clusterNodeInfo.setEcsCpu(_ctx.stringValue("ListClusterNodeResponse.Data["+ i +"].EcsCpu"));
			clusterNodeInfo.setEcsEip(_ctx.stringValue("ListClusterNodeResponse.Data["+ i +"].EcsEip"));
			clusterNodeInfo.setEcsExpiredTime(_ctx.stringValue("ListClusterNodeResponse.Data["+ i +"].EcsExpiredTime"));
			clusterNodeInfo.setEcsLocalStorageCapacity(_ctx.stringValue("ListClusterNodeResponse.Data["+ i +"].EcsLocalStorageCapacity"));
			clusterNodeInfo.setEcsMemory(_ctx.stringValue("ListClusterNodeResponse.Data["+ i +"].EcsMemory"));
			clusterNodeInfo.setEcsOsType(_ctx.stringValue("ListClusterNodeResponse.Data["+ i +"].EcsOsType"));
			clusterNodeInfo.setEcsPrivateIp(_ctx.stringValue("ListClusterNodeResponse.Data["+ i +"].EcsPrivateIp"));
			clusterNodeInfo.setEcsPublicIp(_ctx.stringValue("ListClusterNodeResponse.Data["+ i +"].EcsPublicIp"));
			clusterNodeInfo.setEcsZone(_ctx.stringValue("ListClusterNodeResponse.Data["+ i +"].EcsZone"));
			clusterNodeInfo.setInstanceId(_ctx.stringValue("ListClusterNodeResponse.Data["+ i +"].InstanceId"));
			clusterNodeInfo.setInstanceName(_ctx.stringValue("ListClusterNodeResponse.Data["+ i +"].InstanceName"));
			clusterNodeInfo.setInstanceNetworkType(_ctx.stringValue("ListClusterNodeResponse.Data["+ i +"].InstanceNetworkType"));
			clusterNodeInfo.setInstanceType(_ctx.stringValue("ListClusterNodeResponse.Data["+ i +"].InstanceType"));
			clusterNodeInfo.setInternetMaxBandwidthIn(_ctx.stringValue("ListClusterNodeResponse.Data["+ i +"].InternetMaxBandwidthIn"));
			clusterNodeInfo.setInternetMaxBandwidthOut(_ctx.stringValue("ListClusterNodeResponse.Data["+ i +"].InternetMaxBandwidthOut"));
			clusterNodeInfo.setRegionId(_ctx.stringValue("ListClusterNodeResponse.Data["+ i +"].RegionId"));
			clusterNodeInfo.setVpcId(_ctx.stringValue("ListClusterNodeResponse.Data["+ i +"].VpcId"));

			data.add(clusterNodeInfo);
		}
		listClusterNodeResponse.setData(data);
	 
	 	return listClusterNodeResponse;
	}
}