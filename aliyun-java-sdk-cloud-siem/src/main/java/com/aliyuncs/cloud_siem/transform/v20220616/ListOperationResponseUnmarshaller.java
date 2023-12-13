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

package com.aliyuncs.cloud_siem.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloud_siem.model.v20220616.ListOperationResponse;
import com.aliyuncs.cloud_siem.model.v20220616.ListOperationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOperationResponseUnmarshaller {

	public static ListOperationResponse unmarshall(ListOperationResponse listOperationResponse, UnmarshallerContext _ctx) {
		
		listOperationResponse.setRequestId(_ctx.stringValue("ListOperationResponse.RequestId"));

		Data data = new Data();
		data.setAdminOrNot(_ctx.booleanValue("ListOperationResponse.Data.AdminOrNot"));

		List<String> operationList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListOperationResponse.Data.OperationList.Length"); i++) {
			operationList.add(_ctx.stringValue("ListOperationResponse.Data.OperationList["+ i +"]"));
		}
		data.setOperationList(operationList);
		listOperationResponse.setData(data);
	 
	 	return listOperationResponse;
	}
}