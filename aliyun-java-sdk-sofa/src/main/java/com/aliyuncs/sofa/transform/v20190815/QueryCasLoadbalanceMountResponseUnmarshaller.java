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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryCasLoadbalanceMountResponse;
import com.aliyuncs.sofa.model.v20190815.QueryCasLoadbalanceMountResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.QueryCasLoadbalanceMountResponse.DataItem.Computer;
import com.aliyuncs.sofa.model.v20190815.QueryCasLoadbalanceMountResponse.DataItem.Computer.SystemDisk;
import com.aliyuncs.sofa.model.v20190815.QueryCasLoadbalanceMountResponse.DataItem.Loadbalancer;
import com.aliyuncs.sofa.model.v20190815.QueryCasLoadbalanceMountResponse.DataItem.Loadbalancer.Scope;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCasLoadbalanceMountResponseUnmarshaller {

	public static QueryCasLoadbalanceMountResponse unmarshall(QueryCasLoadbalanceMountResponse queryCasLoadbalanceMountResponse, UnmarshallerContext _ctx) {
		
		queryCasLoadbalanceMountResponse.setRequestId(_ctx.stringValue("QueryCasLoadbalanceMountResponse.RequestId"));
		queryCasLoadbalanceMountResponse.setResultCode(_ctx.stringValue("QueryCasLoadbalanceMountResponse.ResultCode"));
		queryCasLoadbalanceMountResponse.setResultMessage(_ctx.stringValue("QueryCasLoadbalanceMountResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryCasLoadbalanceMountResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDomain(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Domain"));
			dataItem.setStatus(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Status"));
			dataItem.setWeight(_ctx.longValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Weight"));

			Computer computer = new Computer();
			computer.setAppId(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.AppId"));
			computer.setBandwidth(_ctx.longValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.Bandwidth"));
			computer.setCommonImage(_ctx.booleanValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.CommonImage"));
			computer.setCpu(_ctx.longValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.Cpu"));
			computer.setCpuShared(_ctx.booleanValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.CpuShared"));
			computer.setCreationTime(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.CreationTime"));
			computer.setDescription(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.Description"));
			computer.setElasticIp(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.ElasticIp"));
			computer.setExpiredTime(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.ExpiredTime"));
			computer.setIaasId(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.IaasId"));
			computer.setIaasStatus(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.IaasStatus"));
			computer.setId(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.Id"));
			computer.setImageIaasId(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.ImageIaasId"));
			computer.setImageId(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.ImageId"));
			computer.setImageName(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.ImageName"));
			computer.setInitialized(_ctx.booleanValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.Initialized"));
			computer.setIoOptimized(_ctx.booleanValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.IoOptimized"));
			computer.setLastOpsOrderId(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.LastOpsOrderId"));
			computer.setLastOpsType(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.LastOpsType"));
			computer.setMemory(_ctx.longValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.Memory"));
			computer.setName(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.Name"));
			computer.setOs(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.Os"));
			computer.setOsBit(_ctx.longValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.OsBit"));
			computer.setOsVersion(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.OsVersion"));
			computer.setPaasStatus(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.PaasStatus"));
			computer.setPassword(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.Password"));
			computer.setPrivateIp(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.PrivateIp"));
			computer.setProviderId(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.ProviderId"));
			computer.setPublicIp(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.PublicIp"));
			computer.setSerialNumber(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.SerialNumber"));
			computer.setSpecIaasId(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.SpecIaasId"));
			computer.setStatus(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.Status"));
			computer.setThreadsPerCore(_ctx.longValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.ThreadsPerCore"));
			computer.setWorkspaceId(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.WorkspaceId"));

			SystemDisk systemDisk = new SystemDisk();
			systemDisk.setCategory(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.SystemDisk.Category"));
			systemDisk.setDeleteAutoSnapshot(_ctx.booleanValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.SystemDisk.DeleteAutoSnapshot"));
			systemDisk.setDeleteWithComputer(_ctx.booleanValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.SystemDisk.DeleteWithComputer"));
			systemDisk.setDevice(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.SystemDisk.Device"));
			systemDisk.setEnableAutoSnapshot(_ctx.booleanValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.SystemDisk.EnableAutoSnapshot"));
			systemDisk.setImageId(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.SystemDisk.ImageId"));
			systemDisk.setPortable(_ctx.booleanValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.SystemDisk.Portable"));
			systemDisk.setSize(_ctx.longValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.SystemDisk.Size"));
			systemDisk.setStatus(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.SystemDisk.Status"));
			systemDisk.setType(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Computer.SystemDisk.Type"));
			computer.setSystemDisk(systemDisk);
			dataItem.setComputer(computer);

			Loadbalancer loadbalancer = new Loadbalancer();
			loadbalancer.setBandwidth(_ctx.longValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.Bandwidth"));
			loadbalancer.setClusterId(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.ClusterId"));
			loadbalancer.setClusterMode(_ctx.booleanValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.ClusterMode"));
			loadbalancer.setId(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.Id"));
			loadbalancer.setInternetChargeType(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.InternetChargeType"));
			loadbalancer.setName(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.Name"));
			loadbalancer.setNetworkType(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.NetworkType"));
			loadbalancer.setShareMode(_ctx.booleanValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.ShareMode"));
			loadbalancer.setStatus(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.Status"));
			loadbalancer.setVipAddressType(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.VipAddressType"));
			loadbalancer.setVipType(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.VipType"));
			loadbalancer.setVpcId(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.VpcId"));
			loadbalancer.setVswitchIaasId(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.VswitchIaasId"));
			loadbalancer.setWorkspaceId(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.WorkspaceId"));

			List<String> domains = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.Domains.Length"); j++) {
				domains.add(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.Domains["+ j +"]"));
			}
			loadbalancer.setDomains(domains);

			List<String> vipAddresses = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.VipAddresses.Length"); j++) {
				vipAddresses.add(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.VipAddresses["+ j +"]"));
			}
			loadbalancer.setVipAddresses(vipAddresses);

			Scope scope = new Scope();
			scope.setCell(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.Scope.Cell"));
			scope.setCluster(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.Scope.Cluster"));
			scope.setRegion(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.Scope.Region"));
			scope.setTenant(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.Scope.Tenant"));
			scope.setWorkspace(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.Scope.Workspace"));
			scope.setWorkspaceGroup(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.Scope.WorkspaceGroup"));
			scope.setZone(_ctx.stringValue("QueryCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.Scope.Zone"));
			loadbalancer.setScope(scope);
			dataItem.setLoadbalancer(loadbalancer);

			data.add(dataItem);
		}
		queryCasLoadbalanceMountResponse.setData(data);
	 
	 	return queryCasLoadbalanceMountResponse;
	}
}