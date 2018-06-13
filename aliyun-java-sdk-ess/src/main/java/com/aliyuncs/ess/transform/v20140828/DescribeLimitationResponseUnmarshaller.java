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

	public static DescribeLimitationResponse unmarshall(DescribeLimitationResponse describeLimitationResponse, UnmarshallerContext context) {
		
		describeLimitationResponse.setMaxNumberOfScalingGroups(context.integerValue("DescribeLimitationResponse.MaxNumberOfScalingGroups"));
		describeLimitationResponse.setMaxNumberOfScalingConfigurations(context.integerValue("DescribeLimitationResponse.MaxNumberOfScalingConfigurations"));
		describeLimitationResponse.setMaxNumberOfScalingRules(context.integerValue("DescribeLimitationResponse.MaxNumberOfScalingRules"));
		describeLimitationResponse.setMaxNumberOfScheduledTasks(context.integerValue("DescribeLimitationResponse.MaxNumberOfScheduledTasks"));
		describeLimitationResponse.setMaxNumberOfScalingInstances(context.integerValue("DescribeLimitationResponse.MaxNumberOfScalingInstances"));
		describeLimitationResponse.setMaxNumberOfDBInstances(context.integerValue("DescribeLimitationResponse.MaxNumberOfDBInstances"));
		describeLimitationResponse.setMaxNumberOfLoadBalancers(context.integerValue("DescribeLimitationResponse.MaxNumberOfLoadBalancers"));
		describeLimitationResponse.setMaxNumberOfMinSize(context.integerValue("DescribeLimitationResponse.MaxNumberOfMinSize"));
		describeLimitationResponse.setMaxNumberOfMaxSize(context.integerValue("DescribeLimitationResponse.MaxNumberOfMaxSize"));
	 
	 	return describeLimitationResponse;
	}
}