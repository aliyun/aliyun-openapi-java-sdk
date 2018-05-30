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

package com.aliyuncs.cms.transform.v20180308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20180308.GetContactsResponse;
import com.aliyuncs.cms.model.v20180308.GetContactsResponse.Datapoints;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetContactsResponseUnmarshaller {

	public static GetContactsResponse unmarshall(GetContactsResponse getContactsResponse, UnmarshallerContext context) {
		
		getContactsResponse.setRequestId(context.stringValue("GetContactsResponse.RequestId"));
		getContactsResponse.setSuccess(context.booleanValue("GetContactsResponse.Success"));
		getContactsResponse.setCode(context.integerValue("GetContactsResponse.Code"));
		getContactsResponse.setMessage(context.stringValue("GetContactsResponse.Message"));
		getContactsResponse.setHttpStatusCode(context.integerValue("GetContactsResponse.HttpStatusCode"));

		Datapoints datapoints = new Datapoints();
		datapoints.setName(context.stringValue("GetContactsResponse.Datapoints.Name"));

		List<String> contacts = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetContactsResponse.Datapoints.Contacts.Length"); i++) {
			contacts.add(context.stringValue("GetContactsResponse.Datapoints.Contacts["+ i +"]"));
		}
		datapoints.setContacts(contacts);
		getContactsResponse.setDatapoints(datapoints);
	 
	 	return getContactsResponse;
	}
}