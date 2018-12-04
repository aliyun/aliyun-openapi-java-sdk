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

package com.aliyuncs.baas.transform.v20180731;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20180731.DescribeConsortiumAdminStatusResponse;
import com.aliyuncs.baas.model.v20180731.DescribeConsortiumAdminStatusResponse.ConsortimeAdminStatus;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConsortiumAdminStatusResponseUnmarshaller {

	public static DescribeConsortiumAdminStatusResponse unmarshall(DescribeConsortiumAdminStatusResponse describeConsortiumAdminStatusResponse, UnmarshallerContext context) {
		
		describeConsortiumAdminStatusResponse.setRequestId(context.stringValue("DescribeConsortiumAdminStatusResponse.RequestId"));
		describeConsortiumAdminStatusResponse.setSuccess(context.booleanValue("DescribeConsortiumAdminStatusResponse.Success"));
		describeConsortiumAdminStatusResponse.setErrorCode(context.integerValue("DescribeConsortiumAdminStatusResponse.ErrorCode"));

		List<ConsortimeAdminStatus> result = new ArrayList<ConsortimeAdminStatus>();
		for (int i = 0; i < context.lengthValue("DescribeConsortiumAdminStatusResponse.Result.Length"); i++) {
			ConsortimeAdminStatus consortimeAdminStatus = new ConsortimeAdminStatus();
			consortimeAdminStatus.setConsortiumId(context.stringValue("DescribeConsortiumAdminStatusResponse.Result["+ i +"].ConsortiumId"));
			consortimeAdminStatus.setConsortiumAdministrator(context.booleanValue("DescribeConsortiumAdminStatusResponse.Result["+ i +"].ConsortiumAdministrator"));

			result.add(consortimeAdminStatus);
		}
		describeConsortiumAdminStatusResponse.setResult(result);
	 
	 	return describeConsortiumAdminStatusResponse;
	}
}