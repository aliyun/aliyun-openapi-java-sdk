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

import com.aliyuncs.pts.model.v20190810.DescribeUnboundSlbByGroupIdsResponse;
import com.aliyuncs.pts.model.v20190810.DescribeUnboundSlbByGroupIdsResponse.SceneMonitorSlbInfoView;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUnboundSlbByGroupIdsResponseUnmarshaller {

	public static DescribeUnboundSlbByGroupIdsResponse unmarshall(DescribeUnboundSlbByGroupIdsResponse describeUnboundSlbByGroupIdsResponse, UnmarshallerContext _ctx) {
		
		describeUnboundSlbByGroupIdsResponse.setRequestId(_ctx.stringValue("DescribeUnboundSlbByGroupIdsResponse.RequestId"));
		describeUnboundSlbByGroupIdsResponse.setCode(_ctx.stringValue("DescribeUnboundSlbByGroupIdsResponse.Code"));
		describeUnboundSlbByGroupIdsResponse.setMessage(_ctx.stringValue("DescribeUnboundSlbByGroupIdsResponse.Message"));
		describeUnboundSlbByGroupIdsResponse.setSuccess(_ctx.booleanValue("DescribeUnboundSlbByGroupIdsResponse.Success"));
		describeUnboundSlbByGroupIdsResponse.setHttpStatusCode(_ctx.integerValue("DescribeUnboundSlbByGroupIdsResponse.HttpStatusCode"));
		describeUnboundSlbByGroupIdsResponse.setPageNumber(_ctx.integerValue("DescribeUnboundSlbByGroupIdsResponse.PageNumber"));
		describeUnboundSlbByGroupIdsResponse.setPageSize(_ctx.integerValue("DescribeUnboundSlbByGroupIdsResponse.PageSize"));
		describeUnboundSlbByGroupIdsResponse.setTotalCount(_ctx.longValue("DescribeUnboundSlbByGroupIdsResponse.TotalCount"));

		List<SceneMonitorSlbInfoView> slbList = new ArrayList<SceneMonitorSlbInfoView>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUnboundSlbByGroupIdsResponse.SlbList.Length"); i++) {
			SceneMonitorSlbInfoView sceneMonitorSlbInfoView = new SceneMonitorSlbInfoView();
			sceneMonitorSlbInfoView.setInstanceId(_ctx.stringValue("DescribeUnboundSlbByGroupIdsResponse.SlbList["+ i +"].InstanceId"));
			sceneMonitorSlbInfoView.setInstanceName(_ctx.stringValue("DescribeUnboundSlbByGroupIdsResponse.SlbList["+ i +"].InstanceName"));
			sceneMonitorSlbInfoView.setRegionId(_ctx.stringValue("DescribeUnboundSlbByGroupIdsResponse.SlbList["+ i +"].RegionId"));
			sceneMonitorSlbInfoView.setRegionName(_ctx.stringValue("DescribeUnboundSlbByGroupIdsResponse.SlbList["+ i +"].RegionName"));
			sceneMonitorSlbInfoView.setInstanceNetworkType(_ctx.stringValue("DescribeUnboundSlbByGroupIdsResponse.SlbList["+ i +"].InstanceNetworkType"));
			sceneMonitorSlbInfoView.setInstanceNetworkTypeName(_ctx.stringValue("DescribeUnboundSlbByGroupIdsResponse.SlbList["+ i +"].InstanceNetworkTypeName"));
			sceneMonitorSlbInfoView.setAddress(_ctx.stringValue("DescribeUnboundSlbByGroupIdsResponse.SlbList["+ i +"].Address"));
			sceneMonitorSlbInfoView.setStatus(_ctx.stringValue("DescribeUnboundSlbByGroupIdsResponse.SlbList["+ i +"].Status"));
			sceneMonitorSlbInfoView.setStatusName(_ctx.stringValue("DescribeUnboundSlbByGroupIdsResponse.SlbList["+ i +"].StatusName"));
			sceneMonitorSlbInfoView.setAddressType(_ctx.stringValue("DescribeUnboundSlbByGroupIdsResponse.SlbList["+ i +"].AddressType"));
			sceneMonitorSlbInfoView.setAddressTypeName(_ctx.integerValue("DescribeUnboundSlbByGroupIdsResponse.SlbList["+ i +"].AddressTypeName"));
			sceneMonitorSlbInfoView.setPort(_ctx.stringValue("DescribeUnboundSlbByGroupIdsResponse.SlbList["+ i +"].Port"));
			sceneMonitorSlbInfoView.setBizProtocol(_ctx.stringValue("DescribeUnboundSlbByGroupIdsResponse.SlbList["+ i +"].Protocol"));
			sceneMonitorSlbInfoView.setMasterZoneId(_ctx.stringValue("DescribeUnboundSlbByGroupIdsResponse.SlbList["+ i +"].MasterZoneId"));
			sceneMonitorSlbInfoView.setSlaveZoneId(_ctx.stringValue("DescribeUnboundSlbByGroupIdsResponse.SlbList["+ i +"].SlaveZoneId"));
			sceneMonitorSlbInfoView.setBandwidth(_ctx.stringValue("DescribeUnboundSlbByGroupIdsResponse.SlbList["+ i +"].Bandwidth"));
			sceneMonitorSlbInfoView.setLoadBalancerSpec(_ctx.stringValue("DescribeUnboundSlbByGroupIdsResponse.SlbList["+ i +"].LoadBalancerSpec"));
			sceneMonitorSlbInfoView.setMaxConn(_ctx.integerValue("DescribeUnboundSlbByGroupIdsResponse.SlbList["+ i +"].MaxConn"));
			sceneMonitorSlbInfoView.setQps(_ctx.integerValue("DescribeUnboundSlbByGroupIdsResponse.SlbList["+ i +"].Qps"));
			sceneMonitorSlbInfoView.setCpu(_ctx.integerValue("DescribeUnboundSlbByGroupIdsResponse.SlbList["+ i +"].Cpu"));

			slbList.add(sceneMonitorSlbInfoView);
		}
		describeUnboundSlbByGroupIdsResponse.setSlbList(slbList);
	 
	 	return describeUnboundSlbByGroupIdsResponse;
	}
}