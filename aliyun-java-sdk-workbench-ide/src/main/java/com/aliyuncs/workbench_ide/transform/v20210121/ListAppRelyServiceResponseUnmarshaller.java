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

package com.aliyuncs.workbench_ide.transform.v20210121;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.workbench_ide.model.v20210121.ListAppRelyServiceResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppRelyServiceResponseUnmarshaller {

	public static ListAppRelyServiceResponse unmarshall(ListAppRelyServiceResponse listAppRelyServiceResponse, UnmarshallerContext _ctx) {
		
		listAppRelyServiceResponse.setRequestId(_ctx.stringValue("ListAppRelyServiceResponse.RequestId"));
		listAppRelyServiceResponse.setCode(_ctx.stringValue("ListAppRelyServiceResponse.Code"));
		listAppRelyServiceResponse.setMessage(_ctx.stringValue("ListAppRelyServiceResponse.Message"));

		List<Map<Object, Object>> data = _ctx.listMapValue("ListAppRelyServiceResponse.Data");
		listAppRelyServiceResponse.setData(data);
	 
	 	return listAppRelyServiceResponse;
	}
}