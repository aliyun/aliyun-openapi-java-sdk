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

import com.aliyuncs.pts.model.v20190810.DescribeUnboundEcsByGroupIdsResponse;
import com.aliyuncs.pts.model.v20190810.DescribeUnboundEcsByGroupIdsResponse.SceneMonitorEcsInfoView;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUnboundEcsByGroupIdsResponseUnmarshaller {

	public static DescribeUnboundEcsByGroupIdsResponse unmarshall(DescribeUnboundEcsByGroupIdsResponse describeUnboundEcsByGroupIdsResponse, UnmarshallerContext _ctx) {
		
		describeUnboundEcsByGroupIdsResponse.setRequestId(_ctx.stringValue("DescribeUnboundEcsByGroupIdsResponse.RequestId"));
		describeUnboundEcsByGroupIdsResponse.setCode(_ctx.stringValue("DescribeUnboundEcsByGroupIdsResponse.Code"));
		describeUnboundEcsByGroupIdsResponse.setMessage(_ctx.stringValue("DescribeUnboundEcsByGroupIdsResponse.Message"));
		describeUnboundEcsByGroupIdsResponse.setSuccess(_ctx.booleanValue("DescribeUnboundEcsByGroupIdsResponse.Success"));
		describeUnboundEcsByGroupIdsResponse.setHttpStatusCode(_ctx.integerValue("DescribeUnboundEcsByGroupIdsResponse.HttpStatusCode"));
		describeUnboundEcsByGroupIdsResponse.setPageNumber(_ctx.integerValue("DescribeUnboundEcsByGroupIdsResponse.PageNumber"));
		describeUnboundEcsByGroupIdsResponse.setPageSize(_ctx.integerValue("DescribeUnboundEcsByGroupIdsResponse.PageSize"));
		describeUnboundEcsByGroupIdsResponse.setTotalCount(_ctx.longValue("DescribeUnboundEcsByGroupIdsResponse.TotalCount"));

		List<SceneMonitorEcsInfoView> ecsList = new ArrayList<SceneMonitorEcsInfoView>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUnboundEcsByGroupIdsResponse.EcsList.Length"); i++) {
			SceneMonitorEcsInfoView sceneMonitorEcsInfoView = new SceneMonitorEcsInfoView();
			sceneMonitorEcsInfoView.setInstanceId(_ctx.stringValue("DescribeUnboundEcsByGroupIdsResponse.EcsList["+ i +"].InstanceId"));
			sceneMonitorEcsInfoView.setInstanceName(_ctx.stringValue("DescribeUnboundEcsByGroupIdsResponse.EcsList["+ i +"].InstanceName"));
			sceneMonitorEcsInfoView.setRegionId(_ctx.stringValue("DescribeUnboundEcsByGroupIdsResponse.EcsList["+ i +"].RegionId"));
			sceneMonitorEcsInfoView.setRegionName(_ctx.stringValue("DescribeUnboundEcsByGroupIdsResponse.EcsList["+ i +"].RegionName"));
			sceneMonitorEcsInfoView.setInstanceNetworkType(_ctx.stringValue("DescribeUnboundEcsByGroupIdsResponse.EcsList["+ i +"].InstanceNetworkType"));
			sceneMonitorEcsInfoView.setInstanceNetworkTypeName(_ctx.stringValue("DescribeUnboundEcsByGroupIdsResponse.EcsList["+ i +"].InstanceNetworkTypeName"));
			sceneMonitorEcsInfoView.setEipAddress(_ctx.stringValue("DescribeUnboundEcsByGroupIdsResponse.EcsList["+ i +"].EipAddress"));
			sceneMonitorEcsInfoView.setStatus(_ctx.stringValue("DescribeUnboundEcsByGroupIdsResponse.EcsList["+ i +"].Status"));
			sceneMonitorEcsInfoView.setStatusName(_ctx.stringValue("DescribeUnboundEcsByGroupIdsResponse.EcsList["+ i +"].StatusName"));
			sceneMonitorEcsInfoView.setInternetMaxBandwidthOut(_ctx.stringValue("DescribeUnboundEcsByGroupIdsResponse.EcsList["+ i +"].InternetMaxBandwidthOut"));
			sceneMonitorEcsInfoView.setEipBandwidth(_ctx.integerValue("DescribeUnboundEcsByGroupIdsResponse.EcsList["+ i +"].EipBandwidth"));
			sceneMonitorEcsInfoView.setAgentStatus(_ctx.stringValue("DescribeUnboundEcsByGroupIdsResponse.EcsList["+ i +"].AgentStatus"));

			List<String> primaryIpAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeUnboundEcsByGroupIdsResponse.EcsList["+ i +"].PrimaryIpAddress.Length"); j++) {
				primaryIpAddress.add(_ctx.stringValue("DescribeUnboundEcsByGroupIdsResponse.EcsList["+ i +"].PrimaryIpAddress["+ j +"]"));
			}
			sceneMonitorEcsInfoView.setPrimaryIpAddress(primaryIpAddress);

			List<String> publicIpAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeUnboundEcsByGroupIdsResponse.EcsList["+ i +"].PublicIpAddress.Length"); j++) {
				publicIpAddress.add(_ctx.stringValue("DescribeUnboundEcsByGroupIdsResponse.EcsList["+ i +"].PublicIpAddress["+ j +"]"));
			}
			sceneMonitorEcsInfoView.setPublicIpAddress(publicIpAddress);

			List<String> innerIpAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeUnboundEcsByGroupIdsResponse.EcsList["+ i +"].InnerIpAddress.Length"); j++) {
				innerIpAddress.add(_ctx.stringValue("DescribeUnboundEcsByGroupIdsResponse.EcsList["+ i +"].InnerIpAddress["+ j +"]"));
			}
			sceneMonitorEcsInfoView.setInnerIpAddress(innerIpAddress);

			ecsList.add(sceneMonitorEcsInfoView);
		}
		describeUnboundEcsByGroupIdsResponse.setEcsList(ecsList);
	 
	 	return describeUnboundEcsByGroupIdsResponse;
	}
}