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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.DescribeResourceModificationCapacityResponse;
import com.aliyuncs.ecsinc.model.v20160314.DescribeResourceModificationCapacityResponse.FailedInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourceModificationCapacityResponseUnmarshaller {

	public static DescribeResourceModificationCapacityResponse unmarshall(DescribeResourceModificationCapacityResponse describeResourceModificationCapacityResponse, UnmarshallerContext context) {
		
		describeResourceModificationCapacityResponse.setRequestId(context.stringValue("DescribeResourceModificationCapacityResponse.RequestId"));
		describeResourceModificationCapacityResponse.setAvailableCount(context.longValue("DescribeResourceModificationCapacityResponse.AvailableCount"));

		List<String> passedInstanceIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeResourceModificationCapacityResponse.PassedInstanceIds.Length"); i++) {
			passedInstanceIds.add(context.stringValue("DescribeResourceModificationCapacityResponse.PassedInstanceIds["+ i +"]"));
		}
		describeResourceModificationCapacityResponse.setPassedInstanceIds(passedInstanceIds);

		List<FailedInstanceResponse> failedInstanceResults = new ArrayList<FailedInstanceResponse>();
		for (int i = 0; i < context.lengthValue("DescribeResourceModificationCapacityResponse.FailedInstanceResults.Length"); i++) {
			FailedInstanceResponse failedInstanceResponse = new FailedInstanceResponse();
			failedInstanceResponse.setFailedInstanceId(context.stringValue("DescribeResourceModificationCapacityResponse.FailedInstanceResults["+ i +"].FailedInstanceId"));
			failedInstanceResponse.setCode(context.stringValue("DescribeResourceModificationCapacityResponse.FailedInstanceResults["+ i +"].Code"));
			failedInstanceResponse.setMessage(context.stringValue("DescribeResourceModificationCapacityResponse.FailedInstanceResults["+ i +"].Message"));

			failedInstanceResults.add(failedInstanceResponse);
		}
		describeResourceModificationCapacityResponse.setFailedInstanceResults(failedInstanceResults);
	 
	 	return describeResourceModificationCapacityResponse;
	}
}