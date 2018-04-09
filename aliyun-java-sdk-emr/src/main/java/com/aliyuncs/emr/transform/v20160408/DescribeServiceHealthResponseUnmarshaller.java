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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.DescribeServiceHealthResponse;
import com.aliyuncs.emr.model.v20160408.DescribeServiceHealthResponse.ComponentHealthResult;
import com.aliyuncs.emr.model.v20160408.DescribeServiceHealthResponse.HealthResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeServiceHealthResponseUnmarshaller {

	public static DescribeServiceHealthResponse unmarshall(DescribeServiceHealthResponse describeServiceHealthResponse, UnmarshallerContext context) {
		
		describeServiceHealthResponse.setRequestId(context.stringValue("DescribeServiceHealthResponse.RequestId"));
		describeServiceHealthResponse.setName(context.stringValue("DescribeServiceHealthResponse.Name"));

		HealthResult healthResult = new HealthResult();
		healthResult.setKey(context.stringValue("DescribeServiceHealthResponse.HealthResult.Key"));
		healthResult.setPassNumber(context.integerValue("DescribeServiceHealthResponse.HealthResult.PassNumber"));
		healthResult.setErrorNumber(context.integerValue("DescribeServiceHealthResponse.HealthResult.ErrorNumber"));
		healthResult.setWarningNumber(context.integerValue("DescribeServiceHealthResponse.HealthResult.WarningNumber"));
		healthResult.setUnKnownNumber(context.integerValue("DescribeServiceHealthResponse.HealthResult.UnKnownNumber"));
		describeServiceHealthResponse.setHealthResult(healthResult);

		List<ComponentHealthResult> componentHealthResultList = new ArrayList<ComponentHealthResult>();
		for (int i = 0; i < context.lengthValue("DescribeServiceHealthResponse.ComponentHealthResultList.Length"); i++) {
			ComponentHealthResult componentHealthResult = new ComponentHealthResult();
			componentHealthResult.setKey(context.stringValue("DescribeServiceHealthResponse.ComponentHealthResultList["+ i +"].Key"));
			componentHealthResult.setPassNumber(context.integerValue("DescribeServiceHealthResponse.ComponentHealthResultList["+ i +"].PassNumber"));
			componentHealthResult.setErrorNumber(context.integerValue("DescribeServiceHealthResponse.ComponentHealthResultList["+ i +"].ErrorNumber"));
			componentHealthResult.setWarningNumber(context.integerValue("DescribeServiceHealthResponse.ComponentHealthResultList["+ i +"].WarningNumber"));
			componentHealthResult.setUnKnownNumber(context.integerValue("DescribeServiceHealthResponse.ComponentHealthResultList["+ i +"].UnKnownNumber"));

			componentHealthResultList.add(componentHealthResult);
		}
		describeServiceHealthResponse.setComponentHealthResultList(componentHealthResultList);
	 
	 	return describeServiceHealthResponse;
	}
}