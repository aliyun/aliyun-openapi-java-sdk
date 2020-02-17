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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLifecycleHooksResponseUnmarshaller {

	public static DescribeLifecycleHooksResponse unmarshall(DescribeLifecycleHooksResponse describeLifecycleHooksResponse, UnmarshallerContext _ctx) {
		
		describeLifecycleHooksResponse.setRequestId(_ctx.stringValue("DescribeLifecycleHooksResponse.RequestId"));
		describeLifecycleHooksResponse.setTotalCount(_ctx.integerValue("DescribeLifecycleHooksResponse.TotalCount"));
		describeLifecycleHooksResponse.setPageNumber(_ctx.integerValue("DescribeLifecycleHooksResponse.PageNumber"));
		describeLifecycleHooksResponse.setPageSize(_ctx.integerValue("DescribeLifecycleHooksResponse.PageSize"));

		List<LifecycleHook> lifecycleHooks = new ArrayList<LifecycleHook>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLifecycleHooksResponse.LifecycleHooks.Length"); i++) {
			LifecycleHook lifecycleHook = new LifecycleHook();
			lifecycleHook.setScalingGroupId(_ctx.stringValue("DescribeLifecycleHooksResponse.LifecycleHooks["+ i +"].ScalingGroupId"));
			lifecycleHook.setLifecycleHookId(_ctx.stringValue("DescribeLifecycleHooksResponse.LifecycleHooks["+ i +"].LifecycleHookId"));
			lifecycleHook.setLifecycleHookName(_ctx.stringValue("DescribeLifecycleHooksResponse.LifecycleHooks["+ i +"].LifecycleHookName"));
			lifecycleHook.setDefaultResult(_ctx.stringValue("DescribeLifecycleHooksResponse.LifecycleHooks["+ i +"].DefaultResult"));
			lifecycleHook.setHeartbeatTimeout(_ctx.integerValue("DescribeLifecycleHooksResponse.LifecycleHooks["+ i +"].HeartbeatTimeout"));
			lifecycleHook.setLifecycleTransition(_ctx.stringValue("DescribeLifecycleHooksResponse.LifecycleHooks["+ i +"].LifecycleTransition"));
			lifecycleHook.setNotificationMetadata(_ctx.stringValue("DescribeLifecycleHooksResponse.LifecycleHooks["+ i +"].NotificationMetadata"));
			lifecycleHook.setNotificationArn(_ctx.stringValue("DescribeLifecycleHooksResponse.LifecycleHooks["+ i +"].NotificationArn"));

			lifecycleHooks.add(lifecycleHook);
		}
		describeLifecycleHooksResponse.setLifecycleHooks(lifecycleHooks);
	 
	 	return describeLifecycleHooksResponse;
	}
}