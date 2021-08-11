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

package com.aliyuncs.ess.transform.v20140828;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ess.model.v20140828.DescribeLifecycleActionsResponse;
import com.aliyuncs.ess.model.v20140828.DescribeLifecycleActionsResponse.LifecycleAction;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLifecycleActionsResponseUnmarshaller {

	public static DescribeLifecycleActionsResponse unmarshall(DescribeLifecycleActionsResponse describeLifecycleActionsResponse, UnmarshallerContext _ctx) {
		
		describeLifecycleActionsResponse.setRequestId(_ctx.stringValue("DescribeLifecycleActionsResponse.RequestId"));
		describeLifecycleActionsResponse.setNextToken(_ctx.stringValue("DescribeLifecycleActionsResponse.NextToken"));
		describeLifecycleActionsResponse.setMaxResults(_ctx.integerValue("DescribeLifecycleActionsResponse.MaxResults"));
		describeLifecycleActionsResponse.setTotalCount(_ctx.integerValue("DescribeLifecycleActionsResponse.TotalCount"));

		List<LifecycleAction> lifecycleActions = new ArrayList<LifecycleAction>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLifecycleActionsResponse.LifecycleActions.Length"); i++) {
			LifecycleAction lifecycleAction = new LifecycleAction();
			lifecycleAction.setLifecycleActionToken(_ctx.stringValue("DescribeLifecycleActionsResponse.LifecycleActions["+ i +"].LifecycleActionToken"));
			lifecycleAction.setLifecycleActionStatus(_ctx.stringValue("DescribeLifecycleActionsResponse.LifecycleActions["+ i +"].LifecycleActionStatus"));
			lifecycleAction.setLifecycleActionResult(_ctx.stringValue("DescribeLifecycleActionsResponse.LifecycleActions["+ i +"].LifecycleActionResult"));
			lifecycleAction.setLifecycleHookId(_ctx.stringValue("DescribeLifecycleActionsResponse.LifecycleActions["+ i +"].LifecycleHookId"));

			List<String> instanceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLifecycleActionsResponse.LifecycleActions["+ i +"].InstanceIds.Length"); j++) {
				instanceIds.add(_ctx.stringValue("DescribeLifecycleActionsResponse.LifecycleActions["+ i +"].InstanceIds["+ j +"]"));
			}
			lifecycleAction.setInstanceIds(instanceIds);

			lifecycleActions.add(lifecycleAction);
		}
		describeLifecycleActionsResponse.setLifecycleActions(lifecycleActions);
	 
	 	return describeLifecycleActionsResponse;
	}
}