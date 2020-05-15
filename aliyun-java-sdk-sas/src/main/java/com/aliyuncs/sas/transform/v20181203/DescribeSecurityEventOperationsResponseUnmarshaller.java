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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeSecurityEventOperationsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeSecurityEventOperationsResponse.SecurityEventOperation;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecurityEventOperationsResponseUnmarshaller {

	public static DescribeSecurityEventOperationsResponse unmarshall(DescribeSecurityEventOperationsResponse describeSecurityEventOperationsResponse, UnmarshallerContext _ctx) {
		
		describeSecurityEventOperationsResponse.setRequestId(_ctx.stringValue("DescribeSecurityEventOperationsResponse.RequestId"));

		List<SecurityEventOperation> securityEventOperationsResponse = new ArrayList<SecurityEventOperation>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityEventOperationsResponse.SecurityEventOperationsResponse.Length"); i++) {
			SecurityEventOperation securityEventOperation = new SecurityEventOperation();
			securityEventOperation.setOperationCode(_ctx.stringValue("DescribeSecurityEventOperationsResponse.SecurityEventOperationsResponse["+ i +"].OperationCode"));
			securityEventOperation.setOperationParams(_ctx.stringValue("DescribeSecurityEventOperationsResponse.SecurityEventOperationsResponse["+ i +"].OperationParams"));
			securityEventOperation.setUserCanOperate(_ctx.booleanValue("DescribeSecurityEventOperationsResponse.SecurityEventOperationsResponse["+ i +"].UserCanOperate"));

			securityEventOperationsResponse.add(securityEventOperation);
		}
		describeSecurityEventOperationsResponse.setSecurityEventOperationsResponse(securityEventOperationsResponse);
	 
	 	return describeSecurityEventOperationsResponse;
	}
}