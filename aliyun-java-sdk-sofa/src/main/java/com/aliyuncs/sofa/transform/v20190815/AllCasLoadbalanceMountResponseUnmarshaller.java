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

import com.aliyuncs.sofa.model.v20190815.AllCasLoadbalanceMountResponse;
import com.aliyuncs.sofa.model.v20190815.AllCasLoadbalanceMountResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.AllCasLoadbalanceMountResponse.DataItem.Computer;
import com.aliyuncs.sofa.model.v20190815.AllCasLoadbalanceMountResponse.DataItem.Computer.SystemDisk;
import com.aliyuncs.sofa.model.v20190815.AllCasLoadbalanceMountResponse.DataItem.Loadbalancer;
import com.aliyuncs.sofa.model.v20190815.AllCasLoadbalanceMountResponse.DataItem.Loadbalancer.Scope;
import com.aliyuncs.transform.UnmarshallerContext;


public class AllCasLoadbalanceMountResponseUnmarshaller {

	public static AllCasLoadbalanceMountResponse unmarshall(AllCasLoadbalanceMountResponse allCasLoadbalanceMountResponse, UnmarshallerContext _ctx) {
		
		allCasLoadbalanceMountResponse.setRequestId(_ctx.stringValue("AllCasLoadbalanceMountResponse.RequestId"));
		allCasLoadbalanceMountResponse.setResultCode(_ctx.stringValue("AllCasLoadbalanceMountResponse.ResultCode"));
		allCasLoadbalanceMountResponse.setResultMessage(_ctx.stringValue("AllCasLoadbalanceMountResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("AllCasLoadbalanceMountResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDomain(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Domain"));
			dataItem.setStatus(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Status"));
			dataItem.setWeight(_ctx.longValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Weight"));

			Computer computer = new Computer();
			computer.setAppId(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.AppId"));
			computer.setBandwidth(_ctx.longValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.Bandwidth"));
			computer.setCommonImage(_ctx.booleanValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.CommonImage"));
			computer.setCpu(_ctx.longValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.Cpu"));
			computer.setCpuShared(_ctx.booleanValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.CpuShared"));
			computer.setCreationTime(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.CreationTime"));
			computer.setDescription(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.Description"));
			computer.setElasticIp(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.ElasticIp"));
			computer.setExpiredTime(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.ExpiredTime"));
			computer.setId(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.Id"));
			computer.setImageIaasId(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.ImageIaasId"));
			computer.setImageId(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.ImageId"));
			computer.setImageName(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.ImageName"));
			computer.setInitialized(_ctx.booleanValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.Initialized"));
			computer.setIoOptimized(_ctx.booleanValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.IoOptimized"));
			computer.setLastOpsOrderId(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.LastOpsOrderId"));
			computer.setLastOpsType(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.LastOpsType"));
			computer.setMemory(_ctx.longValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.Memory"));
			computer.setOs(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.Os"));
			computer.setOsBit(_ctx.longValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.OsBit"));
			computer.setOsVersion(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.OsVersion"));
			computer.setPassword(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.Password"));
			computer.setPrivateIp(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.PrivateIp"));
			computer.setPublicIp(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.PublicIp"));
			computer.setSerialNumber(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.SerialNumber"));
			computer.setSpecIaasId(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.SpecIaasId"));
			computer.setStatus(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.Status"));
			computer.setThreadsPerCore(_ctx.longValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.ThreadsPerCore"));
			computer.setWorkspaceId(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.WorkspaceId"));

			SystemDisk systemDisk = new SystemDisk();
			systemDisk.setDevice(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.SystemDisk.Device"));
			systemDisk.setSize(_ctx.longValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.SystemDisk.Size"));
			systemDisk.setSnapshotSequence(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.SystemDisk.SnapshotSequence"));
			systemDisk.setSpecId(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Computer.SystemDisk.SpecId"));
			computer.setSystemDisk(systemDisk);
			dataItem.setComputer(computer);

			Loadbalancer loadbalancer = new Loadbalancer();
			loadbalancer.setBandwidth(_ctx.longValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.Bandwidth"));
			loadbalancer.setClusterId(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.ClusterId"));
			loadbalancer.setClusterMode(_ctx.booleanValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.ClusterMode"));
			loadbalancer.setId(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.Id"));
			loadbalancer.setInternetChargeType(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.InternetChargeType"));
			loadbalancer.setName(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.Name"));
			loadbalancer.setNetworkType(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.NetworkType"));
			loadbalancer.setShareMode(_ctx.booleanValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.ShareMode"));
			loadbalancer.setStatus(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.Status"));
			loadbalancer.setVipAddressType(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.VipAddressType"));
			loadbalancer.setVipType(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.VipType"));
			loadbalancer.setVpcId(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.VpcId"));
			loadbalancer.setVswitchIaasId(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.VswitchIaasId"));
			loadbalancer.setWorkspaceId(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.WorkspaceId"));

			List<String> domains = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.Domains.Length"); j++) {
				domains.add(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.Domains["+ j +"]"));
			}
			loadbalancer.setDomains(domains);

			List<String> vipAddresses = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.VipAddresses.Length"); j++) {
				vipAddresses.add(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.VipAddresses["+ j +"]"));
			}
			loadbalancer.setVipAddresses(vipAddresses);

			Scope scope = new Scope();
			scope.setCell(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.Scope.Cell"));
			scope.setCluster(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.Scope.Cluster"));
			scope.setRegion(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.Scope.Region"));
			scope.setTenant(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.Scope.Tenant"));
			scope.setWorkspace(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.Scope.Workspace"));
			scope.setWorkspaceGroup(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.Scope.WorkspaceGroup"));
			scope.setZone(_ctx.stringValue("AllCasLoadbalanceMountResponse.Data["+ i +"].Loadbalancer.Scope.Zone"));
			loadbalancer.setScope(scope);
			dataItem.setLoadbalancer(loadbalancer);

			data.add(dataItem);
		}
		allCasLoadbalanceMountResponse.setData(data);
	 
	 	return allCasLoadbalanceMountResponse;
	}
}