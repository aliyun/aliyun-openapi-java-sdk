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

package com.aliyuncs.datalake.transform.v20200710;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.datalake.model.v20200710.ListFunctionNamesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFunctionNamesResponseUnmarshaller {

	public static ListFunctionNamesResponse unmarshall(ListFunctionNamesResponse listFunctionNamesResponse, UnmarshallerContext _ctx) {
		
		listFunctionNamesResponse.setRequestId(_ctx.stringValue("ListFunctionNamesResponse.RequestId"));
		listFunctionNamesResponse.setMessage(_ctx.stringValue("ListFunctionNamesResponse.Message"));
		listFunctionNamesResponse.setNextPageToken(_ctx.stringValue("ListFunctionNamesResponse.NextPageToken"));
		listFunctionNamesResponse.setCode(_ctx.stringValue("ListFunctionNamesResponse.Code"));
		listFunctionNamesResponse.setSuccess(_ctx.booleanValue("ListFunctionNamesResponse.Success"));

		List<String> functionNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListFunctionNamesResponse.FunctionNames.Length"); i++) {
			functionNames.add(_ctx.stringValue("ListFunctionNamesResponse.FunctionNames["+ i +"]"));
		}
		listFunctionNamesResponse.setFunctionNames(functionNames);
	 
	 	return listFunctionNamesResponse;
	}
}