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

package com.aliyuncs.pts.transform.v20190810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20190810.DescribeGroupPerformanceForECSResponse;
import com.aliyuncs.pts.model.v20190810.DescribeGroupPerformanceForECSResponse.EcsPerformanceView;
import com.aliyuncs.pts.model.v20190810.DescribeGroupPerformanceForECSResponse.GroupInfo;
import com.aliyuncs.pts.model.v20190810.DescribeGroupPerformanceForECSResponse.GroupInfo.InstanceAndPort;
import com.aliyuncs.pts.model.v20190810.DescribeGroupPerformanceForECSResponse.RdsPerformanceView;
import com.aliyuncs.pts.model.v20190810.DescribeGroupPerformanceForECSResponse.SlbPerformanceView;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGroupPerformanceForECSResponseUnmarshaller {

	public static DescribeGroupPerformanceForECSResponse unmarshall(DescribeGroupPerformanceForECSResponse describeGroupPerformanceForECSResponse, UnmarshallerContext _ctx) {
		
		describeGroupPerformanceForECSResponse.setRequestId(_ctx.stringValue("DescribeGroupPerformanceForECSResponse.RequestId"));
		describeGroupPerformanceForECSResponse.setCode(_ctx.stringValue("DescribeGroupPerformanceForECSResponse.Code"));
		describeGroupPerformanceForECSResponse.setMessage(_ctx.stringValue("DescribeGroupPerformanceForECSResponse.Message"));
		describeGroupPerformanceForECSResponse.setHttpStatusCode(_ctx.integerValue("DescribeGroupPerformanceForECSResponse.HttpStatusCode"));
		describeGroupPerformanceForECSResponse.setSuccess(_ctx.booleanValue("DescribeGroupPerformanceForECSResponse.Success"));
		describeGroupPerformanceForECSResponse.setGroupPerformanceList(_ctx.mapValue("DescribeGroupPerformanceForECSResponse.GroupPerformanceList"));

		List<SlbPerformanceView> slbPerformanceViewList = new ArrayList<SlbPerformanceView>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupPerformanceForECSResponse.SlbPerformanceViewList.Length"); i++) {
			SlbPerformanceView slbPerformanceView = new SlbPerformanceView();
			slbPerformanceView.setAddress(_ctx.stringValue("DescribeGroupPerformanceForECSResponse.SlbPerformanceViewList["+ i +"].Address"));
			slbPerformanceView.setInstanceId(_ctx.stringValue("DescribeGroupPerformanceForECSResponse.SlbPerformanceViewList["+ i +"].InstanceId"));
			slbPerformanceView.setListenPort(_ctx.stringValue("DescribeGroupPerformanceForECSResponse.SlbPerformanceViewList["+ i +"].ListenPort"));
			slbPerformanceView.setMetricMap(_ctx.mapValue("DescribeGroupPerformanceForECSResponse.SlbPerformanceViewList["+ i +"].MetricMap"));

			slbPerformanceViewList.add(slbPerformanceView);
		}
		describeGroupPerformanceForECSResponse.setSlbPerformanceViewList(slbPerformanceViewList);

		List<RdsPerformanceView> rdsPerformanceViewList = new ArrayList<RdsPerformanceView>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupPerformanceForECSResponse.RdsPerformanceViewList.Length"); i++) {
			RdsPerformanceView rdsPerformanceView = new RdsPerformanceView();
			rdsPerformanceView.setInstanceId(_ctx.stringValue("DescribeGroupPerformanceForECSResponse.RdsPerformanceViewList["+ i +"].InstanceId"));
			rdsPerformanceView.setInstanceName(_ctx.stringValue("DescribeGroupPerformanceForECSResponse.RdsPerformanceViewList["+ i +"].InstanceName"));
			rdsPerformanceView.setConnection(_ctx.stringValue("DescribeGroupPerformanceForECSResponse.RdsPerformanceViewList["+ i +"].Connection"));
			rdsPerformanceView.setIopsValue(_ctx.integerValue("DescribeGroupPerformanceForECSResponse.RdsPerformanceViewList["+ i +"].IopsValue"));
			rdsPerformanceView.setCpu(_ctx.stringValue("DescribeGroupPerformanceForECSResponse.RdsPerformanceViewList["+ i +"].Cpu"));
			rdsPerformanceView.setDiskValue(_ctx.integerValue("DescribeGroupPerformanceForECSResponse.RdsPerformanceViewList["+ i +"].DiskValue"));
			rdsPerformanceView.setIops(_ctx.stringValue("DescribeGroupPerformanceForECSResponse.RdsPerformanceViewList["+ i +"].Iops"));
			rdsPerformanceView.setMemoryValue(_ctx.integerValue("DescribeGroupPerformanceForECSResponse.RdsPerformanceViewList["+ i +"].MemoryValue"));
			rdsPerformanceView.setCpuValue(_ctx.integerValue("DescribeGroupPerformanceForECSResponse.RdsPerformanceViewList["+ i +"].CpuValue"));
			rdsPerformanceView.setRt(_ctx.stringValue("DescribeGroupPerformanceForECSResponse.RdsPerformanceViewList["+ i +"].Rt"));
			rdsPerformanceView.setDisk(_ctx.stringValue("DescribeGroupPerformanceForECSResponse.RdsPerformanceViewList["+ i +"].Disk"));
			rdsPerformanceView.setRtValue(_ctx.integerValue("DescribeGroupPerformanceForECSResponse.RdsPerformanceViewList["+ i +"].RtValue"));
			rdsPerformanceView.setMemory(_ctx.stringValue("DescribeGroupPerformanceForECSResponse.RdsPerformanceViewList["+ i +"].Memory"));
			rdsPerformanceView.setConnectionValue(_ctx.integerValue("DescribeGroupPerformanceForECSResponse.RdsPerformanceViewList["+ i +"].ConnectionValue"));

			rdsPerformanceViewList.add(rdsPerformanceView);
		}
		describeGroupPerformanceForECSResponse.setRdsPerformanceViewList(rdsPerformanceViewList);

		List<EcsPerformanceView> ecsPerformanceViewList = new ArrayList<EcsPerformanceView>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupPerformanceForECSResponse.EcsPerformanceViewList.Length"); i++) {
			EcsPerformanceView ecsPerformanceView = new EcsPerformanceView();
			ecsPerformanceView.setInstanceId(_ctx.stringValue("DescribeGroupPerformanceForECSResponse.EcsPerformanceViewList["+ i +"].InstanceId"));
			ecsPerformanceView.setInstanceName(_ctx.stringValue("DescribeGroupPerformanceForECSResponse.EcsPerformanceViewList["+ i +"].InstanceName"));
			ecsPerformanceView.setCpu(_ctx.stringValue("DescribeGroupPerformanceForECSResponse.EcsPerformanceViewList["+ i +"].Cpu"));
			ecsPerformanceView.setLoad(_ctx.stringValue("DescribeGroupPerformanceForECSResponse.EcsPerformanceViewList["+ i +"].Load"));
			ecsPerformanceView.setMemoryValue(_ctx.integerValue("DescribeGroupPerformanceForECSResponse.EcsPerformanceViewList["+ i +"].MemoryValue"));
			ecsPerformanceView.setCpuValue(_ctx.integerValue("DescribeGroupPerformanceForECSResponse.EcsPerformanceViewList["+ i +"].CpuValue"));
			ecsPerformanceView.setLoadValue(_ctx.integerValue("DescribeGroupPerformanceForECSResponse.EcsPerformanceViewList["+ i +"].LoadValue"));
			ecsPerformanceView.setCpuCore(_ctx.integerValue("DescribeGroupPerformanceForECSResponse.EcsPerformanceViewList["+ i +"].CpuCore"));
			ecsPerformanceView.setMemory(_ctx.stringValue("DescribeGroupPerformanceForECSResponse.EcsPerformanceViewList["+ i +"].Memory"));

			ecsPerformanceViewList.add(ecsPerformanceView);
		}
		describeGroupPerformanceForECSResponse.setEcsPerformanceViewList(ecsPerformanceViewList);

		List<GroupInfo> groupInfoList = new ArrayList<GroupInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupPerformanceForECSResponse.GroupInfoList.Length"); i++) {
			GroupInfo groupInfo = new GroupInfo();
			groupInfo.setType(_ctx.stringValue("DescribeGroupPerformanceForECSResponse.GroupInfoList["+ i +"].Type"));
			groupInfo.setGroupId(_ctx.integerValue("DescribeGroupPerformanceForECSResponse.GroupInfoList["+ i +"].GroupId"));
			groupInfo.setGroupName(_ctx.stringValue("DescribeGroupPerformanceForECSResponse.GroupInfoList["+ i +"].GroupName"));

			List<InstanceAndPort> instanceAndPortList = new ArrayList<InstanceAndPort>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGroupPerformanceForECSResponse.GroupInfoList["+ i +"].InstanceAndPortList.Length"); j++) {
				InstanceAndPort instanceAndPort = new InstanceAndPort();
				instanceAndPort.setAddress(_ctx.stringValue("DescribeGroupPerformanceForECSResponse.GroupInfoList["+ i +"].InstanceAndPortList["+ j +"].Address"));
				instanceAndPort.setInstanceId(_ctx.stringValue("DescribeGroupPerformanceForECSResponse.GroupInfoList["+ i +"].InstanceAndPortList["+ j +"].InstanceId"));
				instanceAndPort.setAddressPort(_ctx.stringValue("DescribeGroupPerformanceForECSResponse.GroupInfoList["+ i +"].InstanceAndPortList["+ j +"].AddressPort"));
				instanceAndPort.setInstanceName(_ctx.stringValue("DescribeGroupPerformanceForECSResponse.GroupInfoList["+ i +"].InstanceAndPortList["+ j +"].InstanceName"));

				instanceAndPortList.add(instanceAndPort);
			}
			groupInfo.setInstanceAndPortList(instanceAndPortList);

			groupInfoList.add(groupInfo);
		}
		describeGroupPerformanceForECSResponse.setGroupInfoList(groupInfoList);
	 
	 	return describeGroupPerformanceForECSResponse;
	}
}