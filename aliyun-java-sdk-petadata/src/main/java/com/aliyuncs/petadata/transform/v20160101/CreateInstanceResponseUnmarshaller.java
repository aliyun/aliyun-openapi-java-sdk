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

package com.aliyuncs.petadata.transform.v20160101;

import com.aliyuncs.petadata.model.v20160101.CreateInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateInstanceResponseUnmarshaller {

	public static CreateInstanceResponse unmarshall(CreateInstanceResponse createInstanceResponse, UnmarshallerContext context) {
		
		createInstanceResponse.setRequestId(context.stringValue("CreateInstanceResponse.RequestId"));
		createInstanceResponse.setInstanceId(context.stringValue("CreateInstanceResponse.InstanceId"));
		createInstanceResponse.setOrderId(context.stringValue("CreateInstanceResponse.OrderId"));
		createInstanceResponse.setConnectionString(context.stringValue("CreateInstanceResponse.ConnectionString"));
		createInstanceResponse.setPort(context.stringValue("CreateInstanceResponse.Port"));
		createInstanceResponse.setInstanceName(context.stringValue("CreateInstanceResponse.InstanceName"));
		createInstanceResponse.setEndTime(context.stringValue("CreateInstanceResponse.EndTime"));
	 
	 	return createInstanceResponse;
	}
}