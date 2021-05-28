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

package com.aliyuncs.sgw.transform.v20180511;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sgw.model.v20180511.DescribeGatewayActionsResponse;
import com.aliyuncs.sgw.model.v20180511.DescribeGatewayActionsResponse.Action;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewayActionsResponseUnmarshaller {

	public static DescribeGatewayActionsResponse unmarshall(DescribeGatewayActionsResponse describeGatewayActionsResponse, UnmarshallerContext _ctx) {
		
		describeGatewayActionsResponse.setRequestId(_ctx.stringValue("DescribeGatewayActionsResponse.RequestId"));
		describeGatewayActionsResponse.setSuccess(_ctx.booleanValue("DescribeGatewayActionsResponse.Success"));
		describeGatewayActionsResponse.setCode(_ctx.stringValue("DescribeGatewayActionsResponse.Code"));
		describeGatewayActionsResponse.setMessage(_ctx.stringValue("DescribeGatewayActionsResponse.Message"));

		List<Action> actions = new ArrayList<Action>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGatewayActionsResponse.Actions.Length"); i++) {
			Action action = new Action();
			action.setGatewayId(_ctx.stringValue("DescribeGatewayActionsResponse.Actions["+ i +"].GatewayId"));
			action.setSelf(_ctx.stringValue("DescribeGatewayActionsResponse.Actions["+ i +"].Self"));
			action.setMonitor(_ctx.stringValue("DescribeGatewayActionsResponse.Actions["+ i +"].Monitor"));
			action.setDisk(_ctx.stringValue("DescribeGatewayActionsResponse.Actions["+ i +"].Disk"));
			action.setCache(_ctx.stringValue("DescribeGatewayActionsResponse.Actions["+ i +"].Cache"));
			action.setSmbUser(_ctx.stringValue("DescribeGatewayActionsResponse.Actions["+ i +"].SmbUser"));
			action.setAdLdap(_ctx.stringValue("DescribeGatewayActionsResponse.Actions["+ i +"].AdLdap"));
			action.setTarget(_ctx.stringValue("DescribeGatewayActionsResponse.Actions["+ i +"].Target"));

			actions.add(action);
		}
		describeGatewayActionsResponse.setActions(actions);
	 
	 	return describeGatewayActionsResponse;
	}
}