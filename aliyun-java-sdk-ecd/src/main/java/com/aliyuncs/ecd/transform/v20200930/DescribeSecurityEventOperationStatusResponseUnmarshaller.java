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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeSecurityEventOperationStatusResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeSecurityEventOperationStatusResponse.SecurityEventOperationStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecurityEventOperationStatusResponseUnmarshaller {

	public static DescribeSecurityEventOperationStatusResponse unmarshall(DescribeSecurityEventOperationStatusResponse describeSecurityEventOperationStatusResponse, UnmarshallerContext _ctx) {
		
		describeSecurityEventOperationStatusResponse.setRequestId(_ctx.stringValue("DescribeSecurityEventOperationStatusResponse.RequestId"));
		describeSecurityEventOperationStatusResponse.setTaskStatus(_ctx.stringValue("DescribeSecurityEventOperationStatusResponse.TaskStatus"));

		List<SecurityEventOperationStatus> securityEventOperationStatuses = new ArrayList<SecurityEventOperationStatus>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityEventOperationStatusResponse.SecurityEventOperationStatuses.Length"); i++) {
			SecurityEventOperationStatus securityEventOperationStatus = new SecurityEventOperationStatus();
			securityEventOperationStatus.setSecurityEventId(_ctx.longValue("DescribeSecurityEventOperationStatusResponse.SecurityEventOperationStatuses["+ i +"].SecurityEventId"));
			securityEventOperationStatus.setStatus(_ctx.stringValue("DescribeSecurityEventOperationStatusResponse.SecurityEventOperationStatuses["+ i +"].Status"));
			securityEventOperationStatus.setErrorCode(_ctx.stringValue("DescribeSecurityEventOperationStatusResponse.SecurityEventOperationStatuses["+ i +"].ErrorCode"));

			securityEventOperationStatuses.add(securityEventOperationStatus);
		}
		describeSecurityEventOperationStatusResponse.setSecurityEventOperationStatuses(securityEventOperationStatuses);
	 
	 	return describeSecurityEventOperationStatusResponse;
	}
}