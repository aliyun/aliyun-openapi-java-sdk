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

import com.aliyuncs.sas.model.v20181203.DescribeSecurityEventOperationStatusResponse;
import com.aliyuncs.sas.model.v20181203.DescribeSecurityEventOperationStatusResponse.SecurityEventOperationStatusResponse;
import com.aliyuncs.sas.model.v20181203.DescribeSecurityEventOperationStatusResponse.SecurityEventOperationStatusResponse.SecurityEventOperationStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecurityEventOperationStatusResponseUnmarshaller {

	public static DescribeSecurityEventOperationStatusResponse unmarshall(DescribeSecurityEventOperationStatusResponse describeSecurityEventOperationStatusResponse, UnmarshallerContext _ctx) {
		
		describeSecurityEventOperationStatusResponse.setRequestId(_ctx.stringValue("DescribeSecurityEventOperationStatusResponse.RequestId"));

		SecurityEventOperationStatusResponse securityEventOperationStatusResponse = new SecurityEventOperationStatusResponse();
		securityEventOperationStatusResponse.setTaskStatus(_ctx.stringValue("DescribeSecurityEventOperationStatusResponse.SecurityEventOperationStatusResponse.TaskStatus"));

		List<SecurityEventOperationStatus> securityEventOperationStatuses = new ArrayList<SecurityEventOperationStatus>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityEventOperationStatusResponse.SecurityEventOperationStatusResponse.SecurityEventOperationStatuses.Length"); i++) {
			SecurityEventOperationStatus securityEventOperationStatus = new SecurityEventOperationStatus();
			securityEventOperationStatus.setSecurityEventId(_ctx.stringValue("DescribeSecurityEventOperationStatusResponse.SecurityEventOperationStatusResponse.SecurityEventOperationStatuses["+ i +"].SecurityEventId"));
			securityEventOperationStatus.setStatus(_ctx.stringValue("DescribeSecurityEventOperationStatusResponse.SecurityEventOperationStatusResponse.SecurityEventOperationStatuses["+ i +"].Status"));
			securityEventOperationStatus.setErrorCode(_ctx.stringValue("DescribeSecurityEventOperationStatusResponse.SecurityEventOperationStatusResponse.SecurityEventOperationStatuses["+ i +"].ErrorCode"));

			securityEventOperationStatuses.add(securityEventOperationStatus);
		}
		securityEventOperationStatusResponse.setSecurityEventOperationStatuses(securityEventOperationStatuses);
		describeSecurityEventOperationStatusResponse.setSecurityEventOperationStatusResponse(securityEventOperationStatusResponse);
	 
	 	return describeSecurityEventOperationStatusResponse;
	}
}