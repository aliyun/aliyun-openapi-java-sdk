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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribePortFlowListResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribePortFlowListResponse.PortFlow;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePortFlowListResponseUnmarshaller {

	public static DescribePortFlowListResponse unmarshall(DescribePortFlowListResponse describePortFlowListResponse, UnmarshallerContext _ctx) {
		
		describePortFlowListResponse.setRequestId(_ctx.stringValue("DescribePortFlowListResponse.RequestId"));

		List<PortFlow> portFlowList = new ArrayList<PortFlow>();
		for (int i = 0; i < _ctx.lengthValue("DescribePortFlowListResponse.PortFlowList.Length"); i++) {
			PortFlow portFlow = new PortFlow();
			portFlow.setAttackBps(_ctx.longValue("DescribePortFlowListResponse.PortFlowList["+ i +"].AttackBps"));
			portFlow.setAttackPps(_ctx.longValue("DescribePortFlowListResponse.PortFlowList["+ i +"].AttackPps"));
			portFlow.setOutPps(_ctx.longValue("DescribePortFlowListResponse.PortFlowList["+ i +"].OutPps"));
			portFlow.setIndex(_ctx.longValue("DescribePortFlowListResponse.PortFlowList["+ i +"].Index"));
			portFlow.setTime(_ctx.longValue("DescribePortFlowListResponse.PortFlowList["+ i +"].Time"));
			portFlow.setInBps(_ctx.longValue("DescribePortFlowListResponse.PortFlowList["+ i +"].InBps"));
			portFlow.setOutBps(_ctx.longValue("DescribePortFlowListResponse.PortFlowList["+ i +"].OutBps"));
			portFlow.setInPps(_ctx.longValue("DescribePortFlowListResponse.PortFlowList["+ i +"].InPps"));
			portFlow.setRegion(_ctx.stringValue("DescribePortFlowListResponse.PortFlowList["+ i +"].Region"));

			portFlowList.add(portFlow);
		}
		describePortFlowListResponse.setPortFlowList(portFlowList);
	 
	 	return describePortFlowListResponse;
	}
}