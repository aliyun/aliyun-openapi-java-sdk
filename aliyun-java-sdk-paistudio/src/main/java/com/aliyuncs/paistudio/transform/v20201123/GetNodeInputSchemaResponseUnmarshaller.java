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

package com.aliyuncs.paistudio.transform.v20201123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.paistudio.model.v20201123.GetNodeInputSchemaResponse;
import com.aliyuncs.paistudio.model.v20201123.GetNodeInputSchemaResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNodeInputSchemaResponseUnmarshaller {

	public static GetNodeInputSchemaResponse unmarshall(GetNodeInputSchemaResponse getNodeInputSchemaResponse, UnmarshallerContext _ctx) {
		
		getNodeInputSchemaResponse.setRequestId(_ctx.stringValue("GetNodeInputSchemaResponse.RequestId"));
		getNodeInputSchemaResponse.setCode(_ctx.stringValue("GetNodeInputSchemaResponse.Code"));
		getNodeInputSchemaResponse.setMessage(_ctx.stringValue("GetNodeInputSchemaResponse.Message"));

		Data data = new Data();

		List<String> colNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetNodeInputSchemaResponse.Data.ColNames.Length"); i++) {
			colNames.add(_ctx.stringValue("GetNodeInputSchemaResponse.Data.ColNames["+ i +"]"));
		}
		data.setColNames(colNames);

		List<String> colTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetNodeInputSchemaResponse.Data.ColTypes.Length"); i++) {
			colTypes.add(_ctx.stringValue("GetNodeInputSchemaResponse.Data.ColTypes["+ i +"]"));
		}
		data.setColTypes(colTypes);
		getNodeInputSchemaResponse.setData(data);
	 
	 	return getNodeInputSchemaResponse;
	}
}