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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeScreenOperateInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScreenOperateInfoResponseUnmarshaller {

	public static DescribeScreenOperateInfoResponse unmarshall(DescribeScreenOperateInfoResponse describeScreenOperateInfoResponse, UnmarshallerContext context) {
		
		describeScreenOperateInfoResponse.setRequestId(context.stringValue("DescribeScreenOperateInfoResponse.RequestId"));
		describeScreenOperateInfoResponse.setHealthCheckDealedCount(context.integerValue("DescribeScreenOperateInfoResponse.HealthCheckDealedCount"));
		describeScreenOperateInfoResponse.setSecurityEventDealedCount(context.integerValue("DescribeScreenOperateInfoResponse.SecurityEventDealedCount"));
		describeScreenOperateInfoResponse.setVulnerabilityDealedCount(context.integerValue("DescribeScreenOperateInfoResponse.VulnerabilityDealedCount"));
		describeScreenOperateInfoResponse.setSuccess(context.booleanValue("DescribeScreenOperateInfoResponse.Success"));

		List<String> suspEventValueArray = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenOperateInfoResponse.SuspEventValueArray.Length"); i++) {
			suspEventValueArray.add(context.stringValue("DescribeScreenOperateInfoResponse.SuspEventValueArray["+ i +"]"));
		}
		describeScreenOperateInfoResponse.setSuspEventValueArray(suspEventValueArray);

		List<String> vulValueArray = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenOperateInfoResponse.VulValueArray.Length"); i++) {
			vulValueArray.add(context.stringValue("DescribeScreenOperateInfoResponse.VulValueArray["+ i +"]"));
		}
		describeScreenOperateInfoResponse.setVulValueArray(vulValueArray);

		List<String> dateArray = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenOperateInfoResponse.DateArray.Length"); i++) {
			dateArray.add(context.stringValue("DescribeScreenOperateInfoResponse.DateArray["+ i +"]"));
		}
		describeScreenOperateInfoResponse.setDateArray(dateArray);

		List<String> healthCheckValueArray = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScreenOperateInfoResponse.HealthCheckValueArray.Length"); i++) {
			healthCheckValueArray.add(context.stringValue("DescribeScreenOperateInfoResponse.HealthCheckValueArray["+ i +"]"));
		}
		describeScreenOperateInfoResponse.setHealthCheckValueArray(healthCheckValueArray);
	 
	 	return describeScreenOperateInfoResponse;
	}
}