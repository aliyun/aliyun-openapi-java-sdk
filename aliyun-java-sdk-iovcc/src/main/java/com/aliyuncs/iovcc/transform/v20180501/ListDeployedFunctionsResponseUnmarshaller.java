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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.ListDeployedFunctionsResponse;
import com.aliyuncs.iovcc.model.v20180501.ListDeployedFunctionsResponse.Function;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeployedFunctionsResponseUnmarshaller {

	public static ListDeployedFunctionsResponse unmarshall(ListDeployedFunctionsResponse listDeployedFunctionsResponse, UnmarshallerContext _ctx) {
		
		listDeployedFunctionsResponse.setRequestId(_ctx.stringValue("ListDeployedFunctionsResponse.RequestId"));

		List<Function> functions = new ArrayList<Function>();
		for (int i = 0; i < _ctx.lengthValue("ListDeployedFunctionsResponse.Functions.Length"); i++) {
			Function function = new Function();
			function.setId(_ctx.longValue("ListDeployedFunctionsResponse.Functions["+ i +"].Id"));
			function.setProjectId(_ctx.stringValue("ListDeployedFunctionsResponse.Functions["+ i +"].ProjectId"));
			function.setName(_ctx.stringValue("ListDeployedFunctionsResponse.Functions["+ i +"].Name"));
			function.setFileId(_ctx.longValue("ListDeployedFunctionsResponse.Functions["+ i +"].FileId"));
			function.setGmtCreate(_ctx.longValue("ListDeployedFunctionsResponse.Functions["+ i +"].GmtCreate"));
			function.setGmtModified(_ctx.longValue("ListDeployedFunctionsResponse.Functions["+ i +"].GmtModified"));

			functions.add(function);
		}
		listDeployedFunctionsResponse.setFunctions(functions);
	 
	 	return listDeployedFunctionsResponse;
	}
}