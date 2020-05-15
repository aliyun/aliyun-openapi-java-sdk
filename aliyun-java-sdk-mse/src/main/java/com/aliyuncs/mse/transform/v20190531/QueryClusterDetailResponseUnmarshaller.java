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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.QueryClusterDetailResponse;
import com.aliyuncs.mse.model.v20190531.QueryClusterDetailResponse.Data;
import com.aliyuncs.mse.model.v20190531.QueryClusterDetailResponse.Data.InstanceModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryClusterDetailResponseUnmarshaller {

	public static QueryClusterDetailResponse unmarshall(QueryClusterDetailResponse queryClusterDetailResponse, UnmarshallerContext _ctx) {
		
		queryClusterDetailResponse.setRequestId(_ctx.stringValue("QueryClusterDetailResponse.RequestId"));
		queryClusterDetailResponse.setSuccess(_ctx.stringValue("QueryClusterDetailResponse.Success"));
		queryClusterDetailResponse.setMessage(_ctx.stringValue("QueryClusterDetailResponse.Message"));
		queryClusterDetailResponse.setErrorCode(_ctx.stringValue("QueryClusterDetailResponse.ErrorCode"));

		Data data = new Data();
		data.setClusterType(_ctx.stringValue("QueryClusterDetailResponse.Data.ClusterType"));
		data.setClusterId(_ctx.stringValue("QueryClusterDetailResponse.Data.ClusterId"));
		data.setAppVersion(_ctx.stringValue("QueryClusterDetailResponse.Data.AppVersion"));
		data.setRegionId(_ctx.stringValue("QueryClusterDetailResponse.Data.RegionId"));
		data.setInstanceCount(_ctx.integerValue("QueryClusterDetailResponse.Data.InstanceCount"));
		data.setCpu(_ctx.integerValue("QueryClusterDetailResponse.Data.Cpu"));
		data.setMemoryCapacity(_ctx.longValue("QueryClusterDetailResponse.Data.MemoryCapacity"));
		data.setDiskCapacity(_ctx.longValue("QueryClusterDetailResponse.Data.DiskCapacity"));
		data.setDiskType(_ctx.stringValue("QueryClusterDetailResponse.Data.DiskType"));
		data.setHealthStatus(_ctx.stringValue("QueryClusterDetailResponse.Data.HealthStatus"));
		data.setClusterName(_ctx.stringValue("QueryClusterDetailResponse.Data.ClusterName"));
		data.setClusterAliasName(_ctx.stringValue("QueryClusterDetailResponse.Data.ClusterAliasName"));
		data.setInitStatus(_ctx.stringValue("QueryClusterDetailResponse.Data.InitStatus"));
		data.setPayInfo(_ctx.stringValue("QueryClusterDetailResponse.Data.PayInfo"));
		data.setIntranetAddress(_ctx.stringValue("QueryClusterDetailResponse.Data.IntranetAddress"));
		data.setInternetAddress(_ctx.stringValue("QueryClusterDetailResponse.Data.InternetAddress"));
		data.setIntranetDomain(_ctx.stringValue("QueryClusterDetailResponse.Data.IntranetDomain"));
		data.setInternetDomain(_ctx.stringValue("QueryClusterDetailResponse.Data.InternetDomain"));
		data.setIntranetPort(_ctx.stringValue("QueryClusterDetailResponse.Data.IntranetPort"));
		data.setInternetPort(_ctx.stringValue("QueryClusterDetailResponse.Data.InternetPort"));
		data.setCreateTime(_ctx.stringValue("QueryClusterDetailResponse.Data.CreateTime"));
		data.setAclId(_ctx.stringValue("QueryClusterDetailResponse.Data.AclId"));
		data.setAclEntryList(_ctx.stringValue("QueryClusterDetailResponse.Data.AclEntryList"));
		data.setInitCostTime(_ctx.longValue("QueryClusterDetailResponse.Data.InitCostTime"));
		data.setVpcId(_ctx.stringValue("QueryClusterDetailResponse.Data.VpcId"));
		data.setPubNetworkFlow(_ctx.stringValue("QueryClusterDetailResponse.Data.PubNetworkFlow"));

		List<InstanceModel> instanceModels = new ArrayList<InstanceModel>();
		for (int i = 0; i < _ctx.lengthValue("QueryClusterDetailResponse.Data.InstanceModels.Length"); i++) {
			InstanceModel instanceModel = new InstanceModel();
			instanceModel.setInstanceType(_ctx.stringValue("QueryClusterDetailResponse.Data.InstanceModels["+ i +"].InstanceType"));
			instanceModel.setInstanceId(_ctx.stringValue("QueryClusterDetailResponse.Data.InstanceModels["+ i +"].InstanceId"));
			instanceModel.setIp(_ctx.stringValue("QueryClusterDetailResponse.Data.InstanceModels["+ i +"].Ip"));
			instanceModel.setVip(_ctx.stringValue("QueryClusterDetailResponse.Data.InstanceModels["+ i +"].Vip"));
			instanceModel.setHealthStatus(_ctx.stringValue("QueryClusterDetailResponse.Data.InstanceModels["+ i +"].HealthStatus"));
			instanceModel.setClusterId(_ctx.stringValue("QueryClusterDetailResponse.Data.InstanceModels["+ i +"].ClusterId"));
			instanceModel.setRole(_ctx.stringValue("QueryClusterDetailResponse.Data.InstanceModels["+ i +"].Role"));
			instanceModel.setPodName(_ctx.stringValue("QueryClusterDetailResponse.Data.InstanceModels["+ i +"].PodName"));
			instanceModel.setInternetIp(_ctx.stringValue("QueryClusterDetailResponse.Data.InstanceModels["+ i +"].InternetIp"));
			instanceModel.setSingleTunnelVip(_ctx.stringValue("QueryClusterDetailResponse.Data.InstanceModels["+ i +"].SingleTunnelVip"));
			instanceModel.setZkClientPort(_ctx.stringValue("QueryClusterDetailResponse.Data.InstanceModels["+ i +"].ZkClientPort"));

			instanceModels.add(instanceModel);
		}
		data.setInstanceModels(instanceModels);
		queryClusterDetailResponse.setData(data);
	 
	 	return queryClusterDetailResponse;
	}
}