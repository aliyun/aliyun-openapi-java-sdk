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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryFunctionsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryFunctionsResponse.Function;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryFunctionsResponse.Function.FunctionDoc;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryFunctionsResponse.FunctionGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryFunctionsResponseUnmarshaller {

	public static OpsQueryFunctionsResponse unmarshall(OpsQueryFunctionsResponse opsQueryFunctionsResponse, UnmarshallerContext _ctx) {
		
		opsQueryFunctionsResponse.setRequestId(_ctx.stringValue("OpsQueryFunctionsResponse.RequestId"));

		List<FunctionGroup> functionGroupList = new ArrayList<FunctionGroup>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryFunctionsResponse.FunctionGroupList.Length"); i++) {
			FunctionGroup functionGroup = new FunctionGroup();
			functionGroup.setId(_ctx.longValue("OpsQueryFunctionsResponse.FunctionGroupList["+ i +"].Id"));
			functionGroup.setGroupId(_ctx.stringValue("OpsQueryFunctionsResponse.FunctionGroupList["+ i +"].GroupId"));
			functionGroup.setGroupName(_ctx.stringValue("OpsQueryFunctionsResponse.FunctionGroupList["+ i +"].GroupName"));
			functionGroup.setGroupCategory(_ctx.stringValue("OpsQueryFunctionsResponse.FunctionGroupList["+ i +"].GroupCategory"));
			functionGroup.setPriority(_ctx.integerValue("OpsQueryFunctionsResponse.FunctionGroupList["+ i +"].Priority"));
			functionGroup.setParentGroupId(_ctx.stringValue("OpsQueryFunctionsResponse.FunctionGroupList["+ i +"].ParentGroupId"));

			functionGroupList.add(functionGroup);
		}
		opsQueryFunctionsResponse.setFunctionGroupList(functionGroupList);

		List<Function> functionList = new ArrayList<Function>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryFunctionsResponse.FunctionList.Length"); i++) {
			Function function = new Function();
			function.setId(_ctx.longValue("OpsQueryFunctionsResponse.FunctionList["+ i +"].Id"));
			function.setFunctionId(_ctx.stringValue("OpsQueryFunctionsResponse.FunctionList["+ i +"].FunctionId"));
			function.setFunctionName(_ctx.stringValue("OpsQueryFunctionsResponse.FunctionList["+ i +"].FunctionName"));
			function.setFunctionDescription(_ctx.stringValue("OpsQueryFunctionsResponse.FunctionList["+ i +"].FunctionDescription"));
			function.setProductCode(_ctx.stringValue("OpsQueryFunctionsResponse.FunctionList["+ i +"].ProductCode"));
			function.setPriority(_ctx.integerValue("OpsQueryFunctionsResponse.FunctionList["+ i +"].Priority"));
			function.setFunctionViperFeature(_ctx.stringValue("OpsQueryFunctionsResponse.FunctionList["+ i +"].FunctionViperFeature"));
			function.setGmtCreate(_ctx.stringValue("OpsQueryFunctionsResponse.FunctionList["+ i +"].GmtCreate"));

			List<String> functionGroupIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryFunctionsResponse.FunctionList["+ i +"].FunctionGroupIdList.Length"); j++) {
				functionGroupIdList.add(_ctx.stringValue("OpsQueryFunctionsResponse.FunctionList["+ i +"].FunctionGroupIdList["+ j +"]"));
			}
			function.setFunctionGroupIdList(functionGroupIdList);

			List<FunctionDoc> functionDocList = new ArrayList<FunctionDoc>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryFunctionsResponse.FunctionList["+ i +"].FunctionDocList.Length"); j++) {
				FunctionDoc functionDoc = new FunctionDoc();
				functionDoc.setId(_ctx.longValue("OpsQueryFunctionsResponse.FunctionList["+ i +"].FunctionDocList["+ j +"].Id"));
				functionDoc.setDocId(_ctx.stringValue("OpsQueryFunctionsResponse.FunctionList["+ i +"].FunctionDocList["+ j +"].DocId"));
				functionDoc.setDocTitle(_ctx.stringValue("OpsQueryFunctionsResponse.FunctionList["+ i +"].FunctionDocList["+ j +"].DocTitle"));
				functionDoc.setDocType(_ctx.stringValue("OpsQueryFunctionsResponse.FunctionList["+ i +"].FunctionDocList["+ j +"].DocType"));

				functionDocList.add(functionDoc);
			}
			function.setFunctionDocList(functionDocList);

			functionList.add(function);
		}
		opsQueryFunctionsResponse.setFunctionList(functionList);
	 
	 	return opsQueryFunctionsResponse;
	}
}