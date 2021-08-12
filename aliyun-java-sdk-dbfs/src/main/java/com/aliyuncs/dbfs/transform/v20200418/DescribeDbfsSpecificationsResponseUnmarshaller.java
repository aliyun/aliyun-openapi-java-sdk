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

package com.aliyuncs.dbfs.transform.v20200418;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dbfs.model.v20200418.DescribeDbfsSpecificationsResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDbfsSpecificationsResponseUnmarshaller {

	public static DescribeDbfsSpecificationsResponse unmarshall(DescribeDbfsSpecificationsResponse describeDbfsSpecificationsResponse, UnmarshallerContext _ctx) {
		
		describeDbfsSpecificationsResponse.setRequestId(_ctx.stringValue("DescribeDbfsSpecificationsResponse.RequestId"));
		describeDbfsSpecificationsResponse.setMaxDbfsNumberPerEcs(_ctx.mapValue("DescribeDbfsSpecificationsResponse.MaxDbfsNumberPerEcs"));

		List<String> supportedEcsInstanceTypeFamily = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDbfsSpecificationsResponse.SupportedEcsInstanceTypeFamily.Length"); i++) {
			supportedEcsInstanceTypeFamily.add(_ctx.stringValue("DescribeDbfsSpecificationsResponse.SupportedEcsInstanceTypeFamily["+ i +"]"));
		}
		describeDbfsSpecificationsResponse.setSupportedEcsInstanceTypeFamily(supportedEcsInstanceTypeFamily);
	 
	 	return describeDbfsSpecificationsResponse;
	}
}