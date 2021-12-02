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

import com.aliyuncs.retailcloud.model.v20180313.DescribeClusterDetailResponse;
import com.aliyuncs.retailcloud.model.v20180313.DescribeClusterDetailResponse.Result;
import com.aliyuncs.retailcloud.model.v20180313.DescribeClusterDetailResponse.Result.BasicInfo;
import com.aliyuncs.retailcloud.model.v20180313.DescribeClusterDetailResponse.Result.ClusterNodeWorkLoad;
import com.aliyuncs.retailcloud.model.v20180313.DescribeClusterDetailResponse.Result.InstanceInfo;
import com.aliyuncs.retailcloud.model.v20180313.DescribeClusterDetailResponse.Result.InstanceInfo.AllocatedPodInstanceInfo;
import com.aliyuncs.retailcloud.model.v20180313.DescribeClusterDetailResponse.Result.InstanceInfo.AvailablePodInstanceInfo;
import com.aliyuncs.retailcloud.model.v20180313.DescribeClusterDetailResponse.Result.NetInfo;
import com.aliyuncs.retailcloud.model.v20180313.DescribeClusterDetailResponse.Result.WorkLoad;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterDetailResponseUnmarshaller {

	public static DescribeClusterDetailResponse unmarshall(DescribeClusterDetailResponse describeClusterDetailResponse, UnmarshallerContext _ctx) {
		
		describeClusterDetailResponse.setRequestId(_ctx.stringValue("DescribeClusterDetailResponse.RequestId"));
		describeClusterDetailResponse.setCode(_ctx.integerValue("DescribeClusterDetailResponse.Code"));
		describeClusterDetailResponse.setErrMsg(_ctx.stringValue("DescribeClusterDetailResponse.ErrMsg"));
		describeClusterDetailResponse.setSuccess(_ctx.booleanValue("DescribeClusterDetailResponse.Success"));

		Result result = new Result();

		BasicInfo basicInfo = new BasicInfo();
		basicInfo.setVpcId(_ctx.stringValue("DescribeClusterDetailResponse.Result.BasicInfo.VpcId"));
		basicInfo.setHasInstallLogController(_ctx.booleanValue("DescribeClusterDetailResponse.Result.BasicInfo.HasInstallLogController"));
		basicInfo.setInstallArmsInProcess(_ctx.booleanValue("DescribeClusterDetailResponse.Result.BasicInfo.InstallArmsInProcess"));
		basicInfo.setClusterInstanceId(_ctx.stringValue("DescribeClusterDetailResponse.Result.BasicInfo.ClusterInstanceId"));
		basicInfo.setBusinessCode(_ctx.stringValue("DescribeClusterDetailResponse.Result.BasicInfo.BusinessCode"));
		basicInfo.setUserNick(_ctx.stringValue("DescribeClusterDetailResponse.Result.BasicInfo.UserNick"));
		basicInfo.setEnvType(_ctx.stringValue("DescribeClusterDetailResponse.Result.BasicInfo.EnvType"));
		basicInfo.setRegionId(_ctx.stringValue("DescribeClusterDetailResponse.Result.BasicInfo.RegionId"));
		basicInfo.setInstallLogInProcess(_ctx.booleanValue("DescribeClusterDetailResponse.Result.BasicInfo.InstallLogInProcess"));
		basicInfo.setRegionName(_ctx.stringValue("DescribeClusterDetailResponse.Result.BasicInfo.RegionName"));
		basicInfo.setMainUserId(_ctx.stringValue("DescribeClusterDetailResponse.Result.BasicInfo.MainUserId"));
		basicInfo.setClusterName(_ctx.stringValue("DescribeClusterDetailResponse.Result.BasicInfo.ClusterName"));
		basicInfo.setHasInstallArmsPilot(_ctx.booleanValue("DescribeClusterDetailResponse.Result.BasicInfo.HasInstallArmsPilot"));
		basicInfo.setClusterId(_ctx.longValue("DescribeClusterDetailResponse.Result.BasicInfo.ClusterId"));

		List<String> vswitchs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterDetailResponse.Result.BasicInfo.Vswitchs.Length"); i++) {
			vswitchs.add(_ctx.stringValue("DescribeClusterDetailResponse.Result.BasicInfo.Vswitchs["+ i +"]"));
		}
		basicInfo.setVswitchs(vswitchs);

		List<String> ecsIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterDetailResponse.Result.BasicInfo.EcsIds.Length"); i++) {
			ecsIds.add(_ctx.stringValue("DescribeClusterDetailResponse.Result.BasicInfo.EcsIds["+ i +"]"));
		}
		basicInfo.setEcsIds(ecsIds);
		result.setBasicInfo(basicInfo);

		InstanceInfo instanceInfo = new InstanceInfo();
		instanceInfo.setAppCount(_ctx.integerValue("DescribeClusterDetailResponse.Result.InstanceInfo.AppCount"));
		instanceInfo.setAllocatePodCount(_ctx.integerValue("DescribeClusterDetailResponse.Result.InstanceInfo.AllocatePodCount"));

		List<AllocatedPodInstanceInfo> allocatedPodInfoList = new ArrayList<AllocatedPodInstanceInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterDetailResponse.Result.InstanceInfo.AllocatedPodInfoList.Length"); i++) {
			AllocatedPodInstanceInfo allocatedPodInstanceInfo = new AllocatedPodInstanceInfo();
			allocatedPodInstanceInfo.setAppName(_ctx.stringValue("DescribeClusterDetailResponse.Result.InstanceInfo.AllocatedPodInfoList["+ i +"].AppName"));
			allocatedPodInstanceInfo.setEnvName(_ctx.stringValue("DescribeClusterDetailResponse.Result.InstanceInfo.AllocatedPodInfoList["+ i +"].EnvName"));
			allocatedPodInstanceInfo.setAppId(_ctx.longValue("DescribeClusterDetailResponse.Result.InstanceInfo.AllocatedPodInfoList["+ i +"].AppId"));
			allocatedPodInstanceInfo.setPodCount(_ctx.integerValue("DescribeClusterDetailResponse.Result.InstanceInfo.AllocatedPodInfoList["+ i +"].PodCount"));
			allocatedPodInstanceInfo.setMemRequest(_ctx.stringValue("DescribeClusterDetailResponse.Result.InstanceInfo.AllocatedPodInfoList["+ i +"].MemRequest"));
			allocatedPodInstanceInfo.setEnvId(_ctx.longValue("DescribeClusterDetailResponse.Result.InstanceInfo.AllocatedPodInfoList["+ i +"].EnvId"));
			allocatedPodInstanceInfo.setCupRequest(_ctx.stringValue("DescribeClusterDetailResponse.Result.InstanceInfo.AllocatedPodInfoList["+ i +"].CupRequest"));

			allocatedPodInfoList.add(allocatedPodInstanceInfo);
		}
		instanceInfo.setAllocatedPodInfoList(allocatedPodInfoList);

		List<AvailablePodInstanceInfo> availablePodInfoList = new ArrayList<AvailablePodInstanceInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterDetailResponse.Result.InstanceInfo.AvailablePodInfoList.Length"); i++) {
			AvailablePodInstanceInfo availablePodInstanceInfo = new AvailablePodInstanceInfo();
			availablePodInstanceInfo.setAvailablePodCount(_ctx.integerValue("DescribeClusterDetailResponse.Result.InstanceInfo.AvailablePodInfoList["+ i +"].AvailablePodCount"));
			availablePodInstanceInfo.setCupRequest(_ctx.stringValue("DescribeClusterDetailResponse.Result.InstanceInfo.AvailablePodInfoList["+ i +"].CupRequest"));
			availablePodInstanceInfo.setMemRequest(_ctx.stringValue("DescribeClusterDetailResponse.Result.InstanceInfo.AvailablePodInfoList["+ i +"].MemRequest"));

			availablePodInfoList.add(availablePodInstanceInfo);
		}
		instanceInfo.setAvailablePodInfoList(availablePodInfoList);
		result.setInstanceInfo(instanceInfo);

		NetInfo netInfo = new NetInfo();
		netInfo.setProdCIDR(_ctx.stringValue("DescribeClusterDetailResponse.Result.NetInfo.ProdCIDR"));
		netInfo.setServiceCIDR(_ctx.stringValue("DescribeClusterDetailResponse.Result.NetInfo.ServiceCIDR"));
		netInfo.setNetPlugType(_ctx.stringValue("DescribeClusterDetailResponse.Result.NetInfo.NetPlugType"));
		result.setNetInfo(netInfo);

		WorkLoad workLoad = new WorkLoad();
		workLoad.setMemCapacityTotal(_ctx.stringValue("DescribeClusterDetailResponse.Result.WorkLoad.MemCapacityTotal"));
		workLoad.setAllocateAllPodCount(_ctx.integerValue("DescribeClusterDetailResponse.Result.WorkLoad.AllocateAllPodCount"));
		workLoad.setCpuRequest(_ctx.stringValue("DescribeClusterDetailResponse.Result.WorkLoad.CpuRequest"));
		workLoad.setAllNodeCount(_ctx.integerValue("DescribeClusterDetailResponse.Result.WorkLoad.AllNodeCount"));
		workLoad.setAllocateAppPodCount(_ctx.integerValue("DescribeClusterDetailResponse.Result.WorkLoad.AllocateAppPodCount"));
		workLoad.setMemUse(_ctx.stringValue("DescribeClusterDetailResponse.Result.WorkLoad.MemUse"));
		workLoad.setCpuCapacityTotal(_ctx.stringValue("DescribeClusterDetailResponse.Result.WorkLoad.CpuCapacityTotal"));
		workLoad.setCpuUsePercent(_ctx.stringValue("DescribeClusterDetailResponse.Result.WorkLoad.CpuUsePercent"));
		workLoad.setCpuRequestPercent(_ctx.stringValue("DescribeClusterDetailResponse.Result.WorkLoad.CpuRequestPercent"));
		workLoad.setMemRequest(_ctx.stringValue("DescribeClusterDetailResponse.Result.WorkLoad.MemRequest"));
		workLoad.setCpuLevel(_ctx.stringValue("DescribeClusterDetailResponse.Result.WorkLoad.CpuLevel"));
		workLoad.setMemUsePercent(_ctx.stringValue("DescribeClusterDetailResponse.Result.WorkLoad.MemUsePercent"));
		workLoad.setMemLevel(_ctx.stringValue("DescribeClusterDetailResponse.Result.WorkLoad.MemLevel"));
		workLoad.setCpuTotal(_ctx.stringValue("DescribeClusterDetailResponse.Result.WorkLoad.CpuTotal"));
		workLoad.setMemTotal(_ctx.stringValue("DescribeClusterDetailResponse.Result.WorkLoad.MemTotal"));
		workLoad.setMemRequestPercent(_ctx.stringValue("DescribeClusterDetailResponse.Result.WorkLoad.MemRequestPercent"));
		workLoad.setCpuUse(_ctx.stringValue("DescribeClusterDetailResponse.Result.WorkLoad.CpuUse"));
		result.setWorkLoad(workLoad);

		List<ClusterNodeWorkLoad> nodeWorkLoadList = new ArrayList<ClusterNodeWorkLoad>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterDetailResponse.Result.NodeWorkLoadList.Length"); i++) {
			ClusterNodeWorkLoad clusterNodeWorkLoad = new ClusterNodeWorkLoad();
			clusterNodeWorkLoad.setCpuRequest(_ctx.stringValue("DescribeClusterDetailResponse.Result.NodeWorkLoadList["+ i +"].CpuRequest"));
			clusterNodeWorkLoad.setMemUse(_ctx.stringValue("DescribeClusterDetailResponse.Result.NodeWorkLoadList["+ i +"].MemUse"));
			clusterNodeWorkLoad.setMemRequest(_ctx.stringValue("DescribeClusterDetailResponse.Result.NodeWorkLoadList["+ i +"].MemRequest"));
			clusterNodeWorkLoad.setInstanceId(_ctx.stringValue("DescribeClusterDetailResponse.Result.NodeWorkLoadList["+ i +"].InstanceId"));
			clusterNodeWorkLoad.setCpuTotal(_ctx.stringValue("DescribeClusterDetailResponse.Result.NodeWorkLoadList["+ i +"].CpuTotal"));
			clusterNodeWorkLoad.setMemTotal(_ctx.stringValue("DescribeClusterDetailResponse.Result.NodeWorkLoadList["+ i +"].MemTotal"));
			clusterNodeWorkLoad.setNodeName(_ctx.stringValue("DescribeClusterDetailResponse.Result.NodeWorkLoadList["+ i +"].NodeName"));
			clusterNodeWorkLoad.setPodCount(_ctx.integerValue("DescribeClusterDetailResponse.Result.NodeWorkLoadList["+ i +"].PodCount"));
			clusterNodeWorkLoad.setReady(_ctx.booleanValue("DescribeClusterDetailResponse.Result.NodeWorkLoadList["+ i +"].Ready"));
			clusterNodeWorkLoad.setCpuUse(_ctx.stringValue("DescribeClusterDetailResponse.Result.NodeWorkLoadList["+ i +"].CpuUse"));
			clusterNodeWorkLoad.setUnschedulable(_ctx.booleanValue("DescribeClusterDetailResponse.Result.NodeWorkLoadList["+ i +"].Unschedulable"));
			clusterNodeWorkLoad.setAppPodCount(_ctx.integerValue("DescribeClusterDetailResponse.Result.NodeWorkLoadList["+ i +"].AppPodCount"));

			nodeWorkLoadList.add(clusterNodeWorkLoad);
		}
		result.setNodeWorkLoadList(nodeWorkLoadList);
		describeClusterDetailResponse.setResult(result);
	 
	 	return describeClusterDetailResponse;
	}
}