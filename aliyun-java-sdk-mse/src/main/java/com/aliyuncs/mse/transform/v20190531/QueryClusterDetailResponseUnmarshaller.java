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
		queryClusterDetailResponse.setMessage(_ctx.stringValue("QueryClusterDetailResponse.Message"));
		queryClusterDetailResponse.setErrorCode(_ctx.stringValue("QueryClusterDetailResponse.ErrorCode"));
		queryClusterDetailResponse.setSuccess(_ctx.booleanValue("QueryClusterDetailResponse.Success"));

		Data data = new Data();
		data.setVpcId(_ctx.stringValue("QueryClusterDetailResponse.Data.VpcId"));
		data.setCreateTime(_ctx.stringValue("QueryClusterDetailResponse.Data.CreateTime"));
		data.setIntranetAddress(_ctx.stringValue("QueryClusterDetailResponse.Data.IntranetAddress"));
		data.setDiskType(_ctx.stringValue("QueryClusterDetailResponse.Data.DiskType"));
		data.setPubNetworkFlow(_ctx.stringValue("QueryClusterDetailResponse.Data.PubNetworkFlow"));
		data.setDiskCapacity(_ctx.longValue("QueryClusterDetailResponse.Data.DiskCapacity"));
		data.setMemoryCapacity(_ctx.longValue("QueryClusterDetailResponse.Data.MemoryCapacity"));
		data.setClusterAliasName(_ctx.stringValue("QueryClusterDetailResponse.Data.ClusterAliasName"));
		data.setInstanceCount(_ctx.integerValue("QueryClusterDetailResponse.Data.InstanceCount"));
		data.setIntranetPort(_ctx.stringValue("QueryClusterDetailResponse.Data.IntranetPort"));
		data.setClusterId(_ctx.stringValue("QueryClusterDetailResponse.Data.ClusterId"));
		data.setIntranetDomain(_ctx.stringValue("QueryClusterDetailResponse.Data.IntranetDomain"));
		data.setInternetDomain(_ctx.stringValue("QueryClusterDetailResponse.Data.InternetDomain"));
		data.setPayInfo(_ctx.stringValue("QueryClusterDetailResponse.Data.PayInfo"));
		data.setInternetAddress(_ctx.stringValue("QueryClusterDetailResponse.Data.InternetAddress"));
		data.setInstanceId(_ctx.stringValue("QueryClusterDetailResponse.Data.InstanceId"));
		data.setAclEntryList(_ctx.stringValue("QueryClusterDetailResponse.Data.AclEntryList"));
		data.setHealthStatus(_ctx.stringValue("QueryClusterDetailResponse.Data.HealthStatus"));
		data.setInitCostTime(_ctx.longValue("QueryClusterDetailResponse.Data.InitCostTime"));
		data.setRegionId(_ctx.stringValue("QueryClusterDetailResponse.Data.RegionId"));
		data.setAclId(_ctx.stringValue("QueryClusterDetailResponse.Data.AclId"));
		data.setCpu(_ctx.integerValue("QueryClusterDetailResponse.Data.Cpu"));
		data.setClusterType(_ctx.stringValue("QueryClusterDetailResponse.Data.ClusterType"));
		data.setClusterName(_ctx.stringValue("QueryClusterDetailResponse.Data.ClusterName"));
		data.setInitStatus(_ctx.stringValue("QueryClusterDetailResponse.Data.InitStatus"));
		data.setInternetPort(_ctx.stringValue("QueryClusterDetailResponse.Data.InternetPort"));
		data.setAppVersion(_ctx.stringValue("QueryClusterDetailResponse.Data.AppVersion"));
		data.setNetType(_ctx.stringValue("QueryClusterDetailResponse.Data.NetType"));
		data.setClusterVersion(_ctx.stringValue("QueryClusterDetailResponse.Data.ClusterVersion"));
		data.setClusterSpecification(_ctx.stringValue("QueryClusterDetailResponse.Data.ClusterSpecification"));
		data.setVSwitchId(_ctx.stringValue("QueryClusterDetailResponse.Data.VSwitchId"));
		data.setConnectionType(_ctx.stringValue("QueryClusterDetailResponse.Data.ConnectionType"));
		data.setMseVersion(_ctx.stringValue("QueryClusterDetailResponse.Data.MseVersion"));
		data.setChargeType(_ctx.stringValue("QueryClusterDetailResponse.Data.ChargeType"));

		List<InstanceModel> instanceModels = new ArrayList<InstanceModel>();
		for (int i = 0; i < _ctx.lengthValue("QueryClusterDetailResponse.Data.InstanceModels.Length"); i++) {
			InstanceModel instanceModel = new InstanceModel();
			instanceModel.setPodName(_ctx.stringValue("QueryClusterDetailResponse.Data.InstanceModels["+ i +"].PodName"));
			instanceModel.setSingleTunnelVip(_ctx.stringValue("QueryClusterDetailResponse.Data.InstanceModels["+ i +"].SingleTunnelVip"));
			instanceModel.setInternetIp(_ctx.stringValue("QueryClusterDetailResponse.Data.InstanceModels["+ i +"].InternetIp"));
			instanceModel.setIp(_ctx.stringValue("QueryClusterDetailResponse.Data.InstanceModels["+ i +"].Ip"));
			instanceModel.setRole(_ctx.stringValue("QueryClusterDetailResponse.Data.InstanceModels["+ i +"].Role"));
			instanceModel.setHealthStatus(_ctx.stringValue("QueryClusterDetailResponse.Data.InstanceModels["+ i +"].HealthStatus"));

			instanceModels.add(instanceModel);
		}
		data.setInstanceModels(instanceModels);
		queryClusterDetailResponse.setData(data);
	 
	 	return queryClusterDetailResponse;
	}
}