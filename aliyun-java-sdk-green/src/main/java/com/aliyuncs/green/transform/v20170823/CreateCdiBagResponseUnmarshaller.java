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

package com.aliyuncs.green.transform.v20170823;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20170823.CreateCdiBagResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCdiBagResponseUnmarshaller {

	public static CreateCdiBagResponse unmarshall(CreateCdiBagResponse createCdiBagResponse, UnmarshallerContext context) {
		
		createCdiBagResponse.setRequestId(context.stringValue("CreateCdiBagResponse.RequestId"));
		createCdiBagResponse.setCode(context.stringValue("CreateCdiBagResponse.Code"));
		createCdiBagResponse.setMessage(context.stringValue("CreateCdiBagResponse.Message"));
		createCdiBagResponse.setOrderId(context.stringValue("CreateCdiBagResponse.OrderId"));

		List<String> instanceIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("CreateCdiBagResponse.InstanceIds.Length"); i++) {
			instanceIds.add(context.stringValue("CreateCdiBagResponse.InstanceIds["+ i +"]"));
		}
		createCdiBagResponse.setInstanceIds(instanceIds);
	 
	 	return createCdiBagResponse;
	}
}