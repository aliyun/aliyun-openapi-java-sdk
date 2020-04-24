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

import com.aliyuncs.pts.model.v20190810.DescribeGroupPerformanceResponse;
import com.aliyuncs.pts.model.v20190810.DescribeGroupPerformanceResponse.EcsPerformanceView;
import com.aliyuncs.pts.model.v20190810.DescribeGroupPerformanceResponse.GroupInfo;
import com.aliyuncs.pts.model.v20190810.DescribeGroupPerformanceResponse.GroupInfo.InstanceAndPort;
import com.aliyuncs.pts.model.v20190810.DescribeGroupPerformanceResponse.RdsPerformanceView;
import com.aliyuncs.pts.model.v20190810.DescribeGroupPerformanceResponse.SlbPerformanceView;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGroupPerformanceResponseUnmarshaller {

	public static DescribeGroupPerformanceResponse unmarshall(DescribeGroupPerformanceResponse describeGroupPerformanceResponse, UnmarshallerContext _ctx) {
		
		describeGroupPerformanceResponse.setRequestId(_ctx.stringValue("DescribeGroupPerformanceResponse.RequestId"));
		describeGroupPerformanceResponse.setCode(_ctx.stringValue("DescribeGroupPerformanceResponse.Code"));
		describeGroupPerformanceResponse.setMessage(_ctx.stringValue("DescribeGroupPerformanceResponse.Message"));
		describeGroupPerformanceResponse.setHttpStatusCode(_ctx.integerValue("DescribeGroupPerformanceResponse.HttpStatusCode"));
		describeGroupPerformanceResponse.setSuccess(_ctx.booleanValue("DescribeGroupPerformanceResponse.Success"));
		describeGroupPerformanceResponse.setGroupPerformanceList(_ctx.mapValue("DescribeGroupPerformanceResponse.GroupPerformanceList"));
		describeGroupPerformanceResponse.setMonitorGroupPerformanceViewList(_ctx.stringValue("DescribeGroupPerformanceResponse.MonitorGroupPerformanceViewList"));

		List<SlbPerformanceView> slbPerformanceViewList = new ArrayList<SlbPerformanceView>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupPerformanceResponse.SlbPerformanceViewList.Length"); i++) {
			SlbPerformanceView slbPerformanceView = new SlbPerformanceView();
			slbPerformanceView.setAddress(_ctx.stringValue("DescribeGroupPerformanceResponse.SlbPerformanceViewList["+ i +"].Address"));
			slbPerformanceView.setInstanceId(_ctx.stringValue("DescribeGroupPerformanceResponse.SlbPerformanceViewList["+ i +"].InstanceId"));
			slbPerformanceView.setListenPort(_ctx.stringValue("DescribeGroupPerformanceResponse.SlbPerformanceViewList["+ i +"].ListenPort"));
			slbPerformanceView.setMetricMap(_ctx.mapValue("DescribeGroupPerformanceResponse.SlbPerformanceViewList["+ i +"].MetricMap"));

			slbPerformanceViewList.add(slbPerformanceView);
		}
		describeGroupPerformanceResponse.setSlbPerformanceViewList(slbPerformanceViewList);

		List<RdsPerformanceView> rdsPerformanceViewList = new ArrayList<RdsPerformanceView>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupPerformanceResponse.RdsPerformanceViewList.Length"); i++) {
			RdsPerformanceView rdsPerformanceView = new RdsPerformanceView();
			rdsPerformanceView.setInstanceId(_ctx.stringValue("DescribeGroupPerformanceResponse.RdsPerformanceViewList["+ i +"].InstanceId"));
			rdsPerformanceView.setInstanceName(_ctx.stringValue("DescribeGroupPerformanceResponse.RdsPerformanceViewList["+ i +"].InstanceName"));
			rdsPerformanceView.setConnection(_ctx.stringValue("DescribeGroupPerformanceResponse.RdsPerformanceViewList["+ i +"].Connection"));
			rdsPerformanceView.setIopsValue(_ctx.integerValue("DescribeGroupPerformanceResponse.RdsPerformanceViewList["+ i +"].IopsValue"));
			rdsPerformanceView.setCpu(_ctx.stringValue("DescribeGroupPerformanceResponse.RdsPerformanceViewList["+ i +"].Cpu"));
			rdsPerformanceView.setDiskValue(_ctx.integerValue("DescribeGroupPerformanceResponse.RdsPerformanceViewList["+ i +"].DiskValue"));
			rdsPerformanceView.setIops(_ctx.stringValue("DescribeGroupPerformanceResponse.RdsPerformanceViewList["+ i +"].Iops"));
			rdsPerformanceView.setMemoryValue(_ctx.integerValue("DescribeGroupPerformanceResponse.RdsPerformanceViewList["+ i +"].MemoryValue"));
			rdsPerformanceView.setCpuValue(_ctx.integerValue("DescribeGroupPerformanceResponse.RdsPerformanceViewList["+ i +"].CpuValue"));
			rdsPerformanceView.setRt(_ctx.stringValue("DescribeGroupPerformanceResponse.RdsPerformanceViewList["+ i +"].Rt"));
			rdsPerformanceView.setDisk(_ctx.stringValue("DescribeGroupPerformanceResponse.RdsPerformanceViewList["+ i +"].Disk"));
			rdsPerformanceView.setRtValue(_ctx.integerValue("DescribeGroupPerformanceResponse.RdsPerformanceViewList["+ i +"].RtValue"));
			rdsPerformanceView.setMemory(_ctx.stringValue("DescribeGroupPerformanceResponse.RdsPerformanceViewList["+ i +"].Memory"));
			rdsPerformanceView.setConnectionValue(_ctx.integerValue("DescribeGroupPerformanceResponse.RdsPerformanceViewList["+ i +"].ConnectionValue"));

			rdsPerformanceViewList.add(rdsPerformanceView);
		}
		describeGroupPerformanceResponse.setRdsPerformanceViewList(rdsPerformanceViewList);

		List<EcsPerformanceView> ecsPerformanceViewList = new ArrayList<EcsPerformanceView>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupPerformanceResponse.EcsPerformanceViewList.Length"); i++) {
			EcsPerformanceView ecsPerformanceView = new EcsPerformanceView();
			ecsPerformanceView.setInstanceId(_ctx.stringValue("DescribeGroupPerformanceResponse.EcsPerformanceViewList["+ i +"].InstanceId"));
			ecsPerformanceView.setInstanceName(_ctx.stringValue("DescribeGroupPerformanceResponse.EcsPerformanceViewList["+ i +"].InstanceName"));
			ecsPerformanceView.setCpu(_ctx.stringValue("DescribeGroupPerformanceResponse.EcsPerformanceViewList["+ i +"].Cpu"));
			ecsPerformanceView.setLoad(_ctx.stringValue("DescribeGroupPerformanceResponse.EcsPerformanceViewList["+ i +"].Load"));
			ecsPerformanceView.setMemoryValue(_ctx.integerValue("DescribeGroupPerformanceResponse.EcsPerformanceViewList["+ i +"].MemoryValue"));
			ecsPerformanceView.setCpuValue(_ctx.integerValue("DescribeGroupPerformanceResponse.EcsPerformanceViewList["+ i +"].CpuValue"));
			ecsPerformanceView.setLoadValue(_ctx.integerValue("DescribeGroupPerformanceResponse.EcsPerformanceViewList["+ i +"].LoadValue"));
			ecsPerformanceView.setCpuCore(_ctx.integerValue("DescribeGroupPerformanceResponse.EcsPerformanceViewList["+ i +"].CpuCore"));
			ecsPerformanceView.setMemory(_ctx.stringValue("DescribeGroupPerformanceResponse.EcsPerformanceViewList["+ i +"].Memory"));

			ecsPerformanceViewList.add(ecsPerformanceView);
		}
		describeGroupPerformanceResponse.setEcsPerformanceViewList(ecsPerformanceViewList);

		List<GroupInfo> groupInfoList = new ArrayList<GroupInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupPerformanceResponse.GroupInfoList.Length"); i++) {
			GroupInfo groupInfo = new GroupInfo();
			groupInfo.setType(_ctx.stringValue("DescribeGroupPerformanceResponse.GroupInfoList["+ i +"].Type"));
			groupInfo.setGroupId(_ctx.integerValue("DescribeGroupPerformanceResponse.GroupInfoList["+ i +"].GroupId"));
			groupInfo.setGroupName(_ctx.stringValue("DescribeGroupPerformanceResponse.GroupInfoList["+ i +"].GroupName"));

			List<InstanceAndPort> instanceAndPortList = new ArrayList<InstanceAndPort>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGroupPerformanceResponse.GroupInfoList["+ i +"].InstanceAndPortList.Length"); j++) {
				InstanceAndPort instanceAndPort = new InstanceAndPort();
				instanceAndPort.setAddress(_ctx.stringValue("DescribeGroupPerformanceResponse.GroupInfoList["+ i +"].InstanceAndPortList["+ j +"].Address"));
				instanceAndPort.setInstanceId(_ctx.stringValue("DescribeGroupPerformanceResponse.GroupInfoList["+ i +"].InstanceAndPortList["+ j +"].InstanceId"));
				instanceAndPort.setAddressPort(_ctx.stringValue("DescribeGroupPerformanceResponse.GroupInfoList["+ i +"].InstanceAndPortList["+ j +"].AddressPort"));
				instanceAndPort.setInstanceName(_ctx.stringValue("DescribeGroupPerformanceResponse.GroupInfoList["+ i +"].InstanceAndPortList["+ j +"].InstanceName"));

				instanceAndPortList.add(instanceAndPort);
			}
			groupInfo.setInstanceAndPortList(instanceAndPortList);

			groupInfoList.add(groupInfo);
		}
		describeGroupPerformanceResponse.setGroupInfoList(groupInfoList);
	 
	 	return describeGroupPerformanceResponse;
	}
}