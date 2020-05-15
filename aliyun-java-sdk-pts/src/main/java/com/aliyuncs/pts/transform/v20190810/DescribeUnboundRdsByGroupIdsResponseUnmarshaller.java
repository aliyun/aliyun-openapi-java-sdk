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

import com.aliyuncs.pts.model.v20190810.DescribeUnboundRdsByGroupIdsResponse;
import com.aliyuncs.pts.model.v20190810.DescribeUnboundRdsByGroupIdsResponse.SceneMonitorRdsInfoView;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUnboundRdsByGroupIdsResponseUnmarshaller {

	public static DescribeUnboundRdsByGroupIdsResponse unmarshall(DescribeUnboundRdsByGroupIdsResponse describeUnboundRdsByGroupIdsResponse, UnmarshallerContext _ctx) {
		
		describeUnboundRdsByGroupIdsResponse.setRequestId(_ctx.stringValue("DescribeUnboundRdsByGroupIdsResponse.RequestId"));
		describeUnboundRdsByGroupIdsResponse.setCode(_ctx.stringValue("DescribeUnboundRdsByGroupIdsResponse.Code"));
		describeUnboundRdsByGroupIdsResponse.setMessage(_ctx.stringValue("DescribeUnboundRdsByGroupIdsResponse.Message"));
		describeUnboundRdsByGroupIdsResponse.setSuccess(_ctx.booleanValue("DescribeUnboundRdsByGroupIdsResponse.Success"));
		describeUnboundRdsByGroupIdsResponse.setHttpStatusCode(_ctx.integerValue("DescribeUnboundRdsByGroupIdsResponse.HttpStatusCode"));
		describeUnboundRdsByGroupIdsResponse.setPageNumber(_ctx.integerValue("DescribeUnboundRdsByGroupIdsResponse.PageNumber"));
		describeUnboundRdsByGroupIdsResponse.setPageSize(_ctx.integerValue("DescribeUnboundRdsByGroupIdsResponse.PageSize"));
		describeUnboundRdsByGroupIdsResponse.setTotalCount(_ctx.longValue("DescribeUnboundRdsByGroupIdsResponse.TotalCount"));

		List<SceneMonitorRdsInfoView> rdsList = new ArrayList<SceneMonitorRdsInfoView>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUnboundRdsByGroupIdsResponse.RdsList.Length"); i++) {
			SceneMonitorRdsInfoView sceneMonitorRdsInfoView = new SceneMonitorRdsInfoView();
			sceneMonitorRdsInfoView.setInstanceId(_ctx.stringValue("DescribeUnboundRdsByGroupIdsResponse.RdsList["+ i +"].InstanceId"));
			sceneMonitorRdsInfoView.setInstanceName(_ctx.stringValue("DescribeUnboundRdsByGroupIdsResponse.RdsList["+ i +"].InstanceName"));
			sceneMonitorRdsInfoView.setRegionId(_ctx.stringValue("DescribeUnboundRdsByGroupIdsResponse.RdsList["+ i +"].RegionId"));
			sceneMonitorRdsInfoView.setRegionName(_ctx.stringValue("DescribeUnboundRdsByGroupIdsResponse.RdsList["+ i +"].RegionName"));
			sceneMonitorRdsInfoView.setInstanceNetworkType(_ctx.stringValue("DescribeUnboundRdsByGroupIdsResponse.RdsList["+ i +"].InstanceNetworkType"));
			sceneMonitorRdsInfoView.setInstanceNetworkTypeName(_ctx.stringValue("DescribeUnboundRdsByGroupIdsResponse.RdsList["+ i +"].InstanceNetworkTypeName"));
			sceneMonitorRdsInfoView.setStatus(_ctx.stringValue("DescribeUnboundRdsByGroupIdsResponse.RdsList["+ i +"].Status"));
			sceneMonitorRdsInfoView.setStatusName(_ctx.stringValue("DescribeUnboundRdsByGroupIdsResponse.RdsList["+ i +"].StatusName"));
			sceneMonitorRdsInfoView.setRdsType(_ctx.stringValue("DescribeUnboundRdsByGroupIdsResponse.RdsList["+ i +"].RdsType"));
			sceneMonitorRdsInfoView.setDbInstanceType(_ctx.stringValue("DescribeUnboundRdsByGroupIdsResponse.RdsList["+ i +"].DbInstanceType"));
			sceneMonitorRdsInfoView.setDbInstanceTypeName(_ctx.stringValue("DescribeUnboundRdsByGroupIdsResponse.RdsList["+ i +"].DbInstanceTypeName"));

			rdsList.add(sceneMonitorRdsInfoView);
		}
		describeUnboundRdsByGroupIdsResponse.setRdsList(rdsList);
	 
	 	return describeUnboundRdsByGroupIdsResponse;
	}
}