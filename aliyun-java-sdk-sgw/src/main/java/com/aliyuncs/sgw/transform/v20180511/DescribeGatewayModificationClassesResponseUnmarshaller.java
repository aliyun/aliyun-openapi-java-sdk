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

package com.aliyuncs.sgw.transform.v20180511;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sgw.model.v20180511.DescribeGatewayModificationClassesResponse;
import com.aliyuncs.sgw.model.v20180511.DescribeGatewayModificationClassesResponse.TargetGatewayClass;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewayModificationClassesResponseUnmarshaller {

	public static DescribeGatewayModificationClassesResponse unmarshall(DescribeGatewayModificationClassesResponse describeGatewayModificationClassesResponse, UnmarshallerContext _ctx) {
		
		describeGatewayModificationClassesResponse.setRequestId(_ctx.stringValue("DescribeGatewayModificationClassesResponse.RequestId"));
		describeGatewayModificationClassesResponse.setSuccess(_ctx.booleanValue("DescribeGatewayModificationClassesResponse.Success"));
		describeGatewayModificationClassesResponse.setCode(_ctx.stringValue("DescribeGatewayModificationClassesResponse.Code"));
		describeGatewayModificationClassesResponse.setMessage(_ctx.stringValue("DescribeGatewayModificationClassesResponse.Message"));

		List<TargetGatewayClass> targetGatewayClasses = new ArrayList<TargetGatewayClass>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGatewayModificationClassesResponse.TargetGatewayClasses.Length"); i++) {
			TargetGatewayClass targetGatewayClass = new TargetGatewayClass();
			targetGatewayClass.setGatewayClass(_ctx.stringValue("DescribeGatewayModificationClassesResponse.TargetGatewayClasses["+ i +"].GatewayClass"));
			targetGatewayClass.setIsAvailable(_ctx.booleanValue("DescribeGatewayModificationClassesResponse.TargetGatewayClasses["+ i +"].IsAvailable"));

			targetGatewayClasses.add(targetGatewayClass);
		}
		describeGatewayModificationClassesResponse.setTargetGatewayClasses(targetGatewayClasses);
	 
	 	return describeGatewayModificationClassesResponse;
	}
}