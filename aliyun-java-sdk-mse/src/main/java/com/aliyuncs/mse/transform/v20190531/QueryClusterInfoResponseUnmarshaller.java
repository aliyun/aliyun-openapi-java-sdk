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

import com.aliyuncs.mse.model.v20190531.QueryClusterInfoResponse;
import com.aliyuncs.mse.model.v20190531.QueryClusterInfoResponse.Data;
import com.aliyuncs.mse.model.v20190531.QueryClusterInfoResponse.Data.InstanceModel;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryClusterInfoResponseUnmarshaller {

	public static QueryClusterInfoResponse unmarshall(QueryClusterInfoResponse queryClusterInfoResponse, UnmarshallerContext _ctx) {
		
		queryClusterInfoResponse.setRequestId(_ctx.stringValue("QueryClusterInfoResponse.RequestId"));
		queryClusterInfoResponse.setMessage(_ctx.stringValue("QueryClusterInfoResponse.Message"));
		queryClusterInfoResponse.setErrorCode(_ctx.stringValue("QueryClusterInfoResponse.ErrorCode"));
		queryClusterInfoResponse.setSuccess(_ctx.booleanValue("QueryClusterInfoResponse.Success"));

		Data data = new Data();
		data.setVpcId(_ctx.stringValue("QueryClusterInfoResponse.Data.VpcId"));
		data.setCreateTime(_ctx.stringValue("QueryClusterInfoResponse.Data.CreateTime"));
		data.setIntranetAddress(_ctx.stringValue("QueryClusterInfoResponse.Data.IntranetAddress"));
		data.setDiskType(_ctx.stringValue("QueryClusterInfoResponse.Data.DiskType"));
		data.setPubNetworkFlow(_ctx.stringValue("QueryClusterInfoResponse.Data.PubNetworkFlow"));
		data.setDiskCapacity(_ctx.longValue("QueryClusterInfoResponse.Data.DiskCapacity"));
		data.setMemoryCapacity(_ctx.longValue("QueryClusterInfoResponse.Data.MemoryCapacity"));
		data.setClusterAliasName(_ctx.stringValue("QueryClusterInfoResponse.Data.ClusterAliasName"));
		data.setInstanceCount(_ctx.integerValue("QueryClusterInfoResponse.Data.InstanceCount"));
		data.setIntranetPort(_ctx.stringValue("QueryClusterInfoResponse.Data.IntranetPort"));
		data.setClusterId(_ctx.stringValue("QueryClusterInfoResponse.Data.ClusterId"));
		data.setIntranetDomain(_ctx.stringValue("QueryClusterInfoResponse.Data.IntranetDomain"));
		data.setInternetDomain(_ctx.stringValue("QueryClusterInfoResponse.Data.InternetDomain"));
		data.setPayInfo(_ctx.stringValue("QueryClusterInfoResponse.Data.PayInfo"));
		data.setInternetAddress(_ctx.stringValue("QueryClusterInfoResponse.Data.InternetAddress"));
		data.setInstanceId(_ctx.stringValue("QueryClusterInfoResponse.Data.InstanceId"));
		data.setAclEntryList(_ctx.stringValue("QueryClusterInfoResponse.Data.AclEntryList"));
		data.setHealthStatus(_ctx.stringValue("QueryClusterInfoResponse.Data.HealthStatus"));
		data.setInitCostTime(_ctx.longValue("QueryClusterInfoResponse.Data.InitCostTime"));
		data.setRegionId(_ctx.stringValue("QueryClusterInfoResponse.Data.RegionId"));
		data.setAclId(_ctx.stringValue("QueryClusterInfoResponse.Data.AclId"));
		data.setCpu(_ctx.integerValue("QueryClusterInfoResponse.Data.Cpu"));
		data.setClusterType(_ctx.stringValue("QueryClusterInfoResponse.Data.ClusterType"));
		data.setClusterName(_ctx.stringValue("QueryClusterInfoResponse.Data.ClusterName"));
		data.setInitStatus(_ctx.stringValue("QueryClusterInfoResponse.Data.InitStatus"));
		data.setInternetPort(_ctx.stringValue("QueryClusterInfoResponse.Data.InternetPort"));
		data.setAppVersion(_ctx.stringValue("QueryClusterInfoResponse.Data.AppVersion"));
		data.setNetType(_ctx.stringValue("QueryClusterInfoResponse.Data.NetType"));
		data.setClusterVersion(_ctx.stringValue("QueryClusterInfoResponse.Data.ClusterVersion"));
		data.setClusterSpecification(_ctx.stringValue("QueryClusterInfoResponse.Data.ClusterSpecification"));
		data.setVSwitchId(_ctx.stringValue("QueryClusterInfoResponse.Data.VSwitchId"));
		data.setConnectionType(_ctx.stringValue("QueryClusterInfoResponse.Data.ConnectionType"));
		data.setMseVersion(_ctx.stringValue("QueryClusterInfoResponse.Data.MseVersion"));
		data.setChargeType(_ctx.stringValue("QueryClusterInfoResponse.Data.ChargeType"));
		data.setTags(_ctx.mapValue("QueryClusterInfoResponse.Data.Tags"));

		List<InstanceModel> instanceModels = new ArrayList<InstanceModel>();
		for (int i = 0; i < _ctx.lengthValue("QueryClusterInfoResponse.Data.InstanceModels.Length"); i++) {
			InstanceModel instanceModel = new InstanceModel();
			instanceModel.setPodName(_ctx.stringValue("QueryClusterInfoResponse.Data.InstanceModels["+ i +"].PodName"));
			instanceModel.setSingleTunnelVip(_ctx.stringValue("QueryClusterInfoResponse.Data.InstanceModels["+ i +"].SingleTunnelVip"));
			instanceModel.setInternetIp(_ctx.stringValue("QueryClusterInfoResponse.Data.InstanceModels["+ i +"].InternetIp"));
			instanceModel.setIp(_ctx.stringValue("QueryClusterInfoResponse.Data.InstanceModels["+ i +"].Ip"));
			instanceModel.setRole(_ctx.stringValue("QueryClusterInfoResponse.Data.InstanceModels["+ i +"].Role"));
			instanceModel.setHealthStatus(_ctx.stringValue("QueryClusterInfoResponse.Data.InstanceModels["+ i +"].HealthStatus"));
			instanceModel.setCreationTimestamp(_ctx.stringValue("QueryClusterInfoResponse.Data.InstanceModels["+ i +"].CreationTimestamp"));
			instanceModel.setZone(_ctx.stringValue("QueryClusterInfoResponse.Data.InstanceModels["+ i +"].Zone"));

			instanceModels.add(instanceModel);
		}
		data.setInstanceModels(instanceModels);
		queryClusterInfoResponse.setData(data);
	 
	 	return queryClusterInfoResponse;
	}
}