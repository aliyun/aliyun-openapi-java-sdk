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

import com.aliyuncs.ess.model.v20140828.DescribeLifecycleHooksResponse;
import com.aliyuncs.ess.model.v20140828.DescribeLifecycleHooksResponse.LifecycleHook;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLifecycleHooksResponseUnmarshaller {

	public static DescribeLifecycleHooksResponse unmarshall(DescribeLifecycleHooksResponse describeLifecycleHooksResponse, UnmarshallerContext context) {
		
		describeLifecycleHooksResponse.setRequestId(context.stringValue("DescribeLifecycleHooksResponse.RequestId"));
		describeLifecycleHooksResponse.setTotalCount(context.integerValue("DescribeLifecycleHooksResponse.TotalCount"));
		describeLifecycleHooksResponse.setPageNumber(context.integerValue("DescribeLifecycleHooksResponse.PageNumber"));
		describeLifecycleHooksResponse.setPageSize(context.integerValue("DescribeLifecycleHooksResponse.PageSize"));

		List<LifecycleHook> lifecycleHooks = new ArrayList<LifecycleHook>();
		for (int i = 0; i < context.lengthValue("DescribeLifecycleHooksResponse.LifecycleHooks.Length"); i++) {
			LifecycleHook lifecycleHook = new LifecycleHook();
			lifecycleHook.setScalingGroupId(context.stringValue("DescribeLifecycleHooksResponse.LifecycleHooks["+ i +"].ScalingGroupId"));
			lifecycleHook.setLifecycleHookId(context.stringValue("DescribeLifecycleHooksResponse.LifecycleHooks["+ i +"].LifecycleHookId"));
			lifecycleHook.setLifecycleHookName(context.stringValue("DescribeLifecycleHooksResponse.LifecycleHooks["+ i +"].LifecycleHookName"));
			lifecycleHook.setDefaultResult(context.stringValue("DescribeLifecycleHooksResponse.LifecycleHooks["+ i +"].DefaultResult"));
			lifecycleHook.setHeartbeatTimeout(context.integerValue("DescribeLifecycleHooksResponse.LifecycleHooks["+ i +"].HeartbeatTimeout"));
			lifecycleHook.setLifecycleTransition(context.stringValue("DescribeLifecycleHooksResponse.LifecycleHooks["+ i +"].LifecycleTransition"));
			lifecycleHook.setNotificationMetadata(context.stringValue("DescribeLifecycleHooksResponse.LifecycleHooks["+ i +"].NotificationMetadata"));
			lifecycleHook.setNotificationArn(context.stringValue("DescribeLifecycleHooksResponse.LifecycleHooks["+ i +"].NotificationArn"));

			lifecycleHooks.add(lifecycleHook);
		}
		describeLifecycleHooksResponse.setLifecycleHooks(lifecycleHooks);
	 
	 	return describeLifecycleHooksResponse;
	}
}