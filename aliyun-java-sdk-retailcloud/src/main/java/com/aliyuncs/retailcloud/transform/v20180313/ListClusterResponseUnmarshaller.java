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

import com.aliyuncs.retailcloud.model.v20180313.ListClusterResponse;
import com.aliyuncs.retailcloud.model.v20180313.ListClusterResponse.ClusterInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterResponseUnmarshaller {

	public static ListClusterResponse unmarshall(ListClusterResponse listClusterResponse, UnmarshallerContext _ctx) {
		
		listClusterResponse.setRequestId(_ctx.stringValue("ListClusterResponse.RequestId"));
		listClusterResponse.setCode(_ctx.integerValue("ListClusterResponse.Code"));
		listClusterResponse.setErrorMsg(_ctx.stringValue("ListClusterResponse.ErrorMsg"));
		listClusterResponse.setPageNumber(_ctx.integerValue("ListClusterResponse.PageNumber"));
		listClusterResponse.setPageSize(_ctx.integerValue("ListClusterResponse.PageSize"));
		listClusterResponse.setTotalCount(_ctx.longValue("ListClusterResponse.TotalCount"));

		List<ClusterInfo> data = new ArrayList<ClusterInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterResponse.Data.Length"); i++) {
			ClusterInfo clusterInfo = new ClusterInfo();
			clusterInfo.setBusinessCode(_ctx.stringValue("ListClusterResponse.Data["+ i +"].BusinessCode"));
			clusterInfo.setClusterTitle(_ctx.stringValue("ListClusterResponse.Data["+ i +"].ClusterTitle"));
			clusterInfo.setCreateStatus(_ctx.stringValue("ListClusterResponse.Data["+ i +"].CreateStatus"));
			clusterInfo.setEnvType(_ctx.stringValue("ListClusterResponse.Data["+ i +"].EnvType"));
			clusterInfo.setId(_ctx.longValue("ListClusterResponse.Data["+ i +"].Id"));
			clusterInfo.setInstanceId(_ctx.stringValue("ListClusterResponse.Data["+ i +"].InstanceId"));
			clusterInfo.setKeyPair(_ctx.stringValue("ListClusterResponse.Data["+ i +"].KeyPair"));
			clusterInfo.setNetPlug(_ctx.stringValue("ListClusterResponse.Data["+ i +"].NetPlug"));
			clusterInfo.setPassword(_ctx.stringValue("ListClusterResponse.Data["+ i +"].Password"));
			clusterInfo.setPodCIDR(_ctx.stringValue("ListClusterResponse.Data["+ i +"].PodCIDR"));
			clusterInfo.setRegionId(_ctx.stringValue("ListClusterResponse.Data["+ i +"].RegionId"));
			clusterInfo.setRegionName(_ctx.stringValue("ListClusterResponse.Data["+ i +"].RegionName"));
			clusterInfo.setServiceCIDR(_ctx.stringValue("ListClusterResponse.Data["+ i +"].ServiceCIDR"));
			clusterInfo.setStatus(_ctx.stringValue("ListClusterResponse.Data["+ i +"].Status"));
			clusterInfo.setVpcId(_ctx.stringValue("ListClusterResponse.Data["+ i +"].VpcId"));
			clusterInfo.setWorkLoadCpu(_ctx.stringValue("ListClusterResponse.Data["+ i +"].WorkLoadCpu"));
			clusterInfo.setWorkLoadMem(_ctx.stringValue("ListClusterResponse.Data["+ i +"].WorkLoadMem"));

			List<String> ecsIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListClusterResponse.Data["+ i +"].EcsIds.Length"); j++) {
				ecsIds.add(_ctx.stringValue("ListClusterResponse.Data["+ i +"].EcsIds["+ j +"]"));
			}
			clusterInfo.setEcsIds(ecsIds);

			List<String> vswitchIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListClusterResponse.Data["+ i +"].VswitchIds.Length"); j++) {
				vswitchIds.add(_ctx.stringValue("ListClusterResponse.Data["+ i +"].VswitchIds["+ j +"]"));
			}
			clusterInfo.setVswitchIds(vswitchIds);

			data.add(clusterInfo);
		}
		listClusterResponse.setData(data);
	 
	 	return listClusterResponse;
	}
}