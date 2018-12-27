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

import com.aliyuncs.aegis.model.v20161111.DescribeOperateInfoResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOperateInfoResponseUnmarshaller {

	public static DescribeOperateInfoResponse unmarshall(DescribeOperateInfoResponse describeOperateInfoResponse, UnmarshallerContext context) {
		
		describeOperateInfoResponse.setRequestId(context.stringValue("DescribeOperateInfoResponse.RequestId"));
		describeOperateInfoResponse.setHealthCheckDealedCount(context.integerValue("DescribeOperateInfoResponse.HealthCheckDealedCount"));
		describeOperateInfoResponse.setSecurityEventDealedCount(context.integerValue("DescribeOperateInfoResponse.SecurityEventDealedCount"));
		describeOperateInfoResponse.setVulnerabilityDealedCount(context.integerValue("DescribeOperateInfoResponse.VulnerabilityDealedCount"));
		describeOperateInfoResponse.setSuccess(context.booleanValue("DescribeOperateInfoResponse.Success"));

		List<String> suspEventValueArray = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeOperateInfoResponse.SuspEventValueArray.Length"); i++) {
			suspEventValueArray.add(context.stringValue("DescribeOperateInfoResponse.SuspEventValueArray["+ i +"]"));
		}
		describeOperateInfoResponse.setSuspEventValueArray(suspEventValueArray);

		List<String> vulValueArray = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeOperateInfoResponse.VulValueArray.Length"); i++) {
			vulValueArray.add(context.stringValue("DescribeOperateInfoResponse.VulValueArray["+ i +"]"));
		}
		describeOperateInfoResponse.setVulValueArray(vulValueArray);

		List<String> dateArray = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeOperateInfoResponse.DateArray.Length"); i++) {
			dateArray.add(context.stringValue("DescribeOperateInfoResponse.DateArray["+ i +"]"));
		}
		describeOperateInfoResponse.setDateArray(dateArray);

		List<String> healthCheckValueArray = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeOperateInfoResponse.HealthCheckValueArray.Length"); i++) {
			healthCheckValueArray.add(context.stringValue("DescribeOperateInfoResponse.HealthCheckValueArray["+ i +"]"));
		}
		describeOperateInfoResponse.setHealthCheckValueArray(healthCheckValueArray);
	 
	 	return describeOperateInfoResponse;
	}
}