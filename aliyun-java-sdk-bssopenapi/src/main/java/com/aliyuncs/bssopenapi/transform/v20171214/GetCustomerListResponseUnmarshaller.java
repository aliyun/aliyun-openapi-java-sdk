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

package com.aliyuncs.bssopenapi.transform.v20171214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bssopenapi.model.v20171214.GetCustomerListResponse;
import com.aliyuncs.bssopenapi.model.v20171214.GetCustomerListResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCustomerListResponseUnmarshaller {

	public static GetCustomerListResponse unmarshall(GetCustomerListResponse getCustomerListResponse, UnmarshallerContext context) {
		
		getCustomerListResponse.setRequestId(context.stringValue("GetCustomerListResponse.RequestId"));
		getCustomerListResponse.setSuccess(context.booleanValue("GetCustomerListResponse.Success"));
		getCustomerListResponse.setCode(context.stringValue("GetCustomerListResponse.Code"));
		getCustomerListResponse.setMessage(context.stringValue("GetCustomerListResponse.Message"));

		Data data = new Data();

		List<String> uidList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetCustomerListResponse.Data.UidList.Length"); i++) {
			uidList.add(context.stringValue("GetCustomerListResponse.Data.UidList["+ i +"]"));
		}
		data.setUidList(uidList);
		getCustomerListResponse.setData(data);
	 
	 	return getCustomerListResponse;
	}
}