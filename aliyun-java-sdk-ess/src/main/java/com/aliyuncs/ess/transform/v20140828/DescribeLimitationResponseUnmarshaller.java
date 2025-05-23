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

import com.aliyuncs.ess.model.v20140828.DescribeLimitationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLimitationResponseUnmarshaller {

	public static DescribeLimitationResponse unmarshall(DescribeLimitationResponse describeLimitationResponse, UnmarshallerContext _ctx) {
		
		describeLimitationResponse.setRequestId(_ctx.stringValue("DescribeLimitationResponse.RequestId"));
		describeLimitationResponse.setMaxNumberOfScheduledTasks(_ctx.integerValue("DescribeLimitationResponse.MaxNumberOfScheduledTasks"));
		describeLimitationResponse.setMaxNumberOfLoadBalancers(_ctx.integerValue("DescribeLimitationResponse.MaxNumberOfLoadBalancers"));
		describeLimitationResponse.setMaxNumberOfMaxSize(_ctx.integerValue("DescribeLimitationResponse.MaxNumberOfMaxSize"));
		describeLimitationResponse.setMaxNumberOfAlbServerGroup(_ctx.integerValue("DescribeLimitationResponse.MaxNumberOfAlbServerGroup"));
		describeLimitationResponse.setMaxNumberOfNlbServerGroup(_ctx.integerValue("DescribeLimitationResponse.MaxNumberOfNlbServerGroup"));
		describeLimitationResponse.setMaxNumberOfDBInstances(_ctx.integerValue("DescribeLimitationResponse.MaxNumberOfDBInstances"));
		describeLimitationResponse.setMaxNumberOfScalingConfigurations(_ctx.integerValue("DescribeLimitationResponse.MaxNumberOfScalingConfigurations"));
		describeLimitationResponse.setMaxNumberOfMinSize(_ctx.integerValue("DescribeLimitationResponse.MaxNumberOfMinSize"));
		describeLimitationResponse.setMaxNumberOfLifecycleHooks(_ctx.integerValue("DescribeLimitationResponse.MaxNumberOfLifecycleHooks"));
		describeLimitationResponse.setMaxNumberOfScalingInstances(_ctx.integerValue("DescribeLimitationResponse.MaxNumberOfScalingInstances"));
		describeLimitationResponse.setMaxNumberOfScalingGroups(_ctx.integerValue("DescribeLimitationResponse.MaxNumberOfScalingGroups"));
		describeLimitationResponse.setMaxNumberOfNotificationConfigurations(_ctx.integerValue("DescribeLimitationResponse.MaxNumberOfNotificationConfigurations"));
		describeLimitationResponse.setMaxNumberOfVServerGroups(_ctx.integerValue("DescribeLimitationResponse.MaxNumberOfVServerGroups"));
		describeLimitationResponse.setMaxNumberOfScalingRules(_ctx.integerValue("DescribeLimitationResponse.MaxNumberOfScalingRules"));
	 
	 	return describeLimitationResponse;
	}
}