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

package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.ListProjectAPIsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectAPIsResponseUnmarshaller {

	public static ListProjectAPIsResponse unmarshall(ListProjectAPIsResponse listProjectAPIsResponse, UnmarshallerContext _ctx) {
		
		listProjectAPIsResponse.setRequestId(_ctx.stringValue("ListProjectAPIsResponse.RequestId"));
		listProjectAPIsResponse.setProject(_ctx.stringValue("ListProjectAPIsResponse.Project"));

		List<String> aPIs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectAPIsResponse.APIs.Length"); i++) {
			aPIs.add(_ctx.stringValue("ListProjectAPIsResponse.APIs["+ i +"]"));
		}
		listProjectAPIsResponse.setAPIs(aPIs);
	 
	 	return listProjectAPIsResponse;
	}
}