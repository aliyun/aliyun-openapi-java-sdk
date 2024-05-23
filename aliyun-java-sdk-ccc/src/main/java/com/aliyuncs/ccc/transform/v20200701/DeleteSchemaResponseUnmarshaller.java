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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.DeleteSchemaResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteSchemaResponseUnmarshaller {

	public static DeleteSchemaResponse unmarshall(DeleteSchemaResponse deleteSchemaResponse, UnmarshallerContext _ctx) {
		
		deleteSchemaResponse.setRequestId(_ctx.stringValue("DeleteSchemaResponse.RequestId"));
		deleteSchemaResponse.setHttpStatusCode(_ctx.integerValue("DeleteSchemaResponse.HttpStatusCode"));
		deleteSchemaResponse.setCode(_ctx.stringValue("DeleteSchemaResponse.Code"));
		deleteSchemaResponse.setMessage(_ctx.stringValue("DeleteSchemaResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteSchemaResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("DeleteSchemaResponse.Params["+ i +"]"));
		}
		deleteSchemaResponse.setParams(params);
	 
	 	return deleteSchemaResponse;
	}
}