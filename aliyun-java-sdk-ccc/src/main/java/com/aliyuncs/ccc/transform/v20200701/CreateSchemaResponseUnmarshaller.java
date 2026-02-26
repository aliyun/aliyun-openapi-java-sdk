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

import com.aliyuncs.ccc.model.v20200701.CreateSchemaResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSchemaResponseUnmarshaller {

	public static CreateSchemaResponse unmarshall(CreateSchemaResponse createSchemaResponse, UnmarshallerContext _ctx) {
		
		createSchemaResponse.setRequestId(_ctx.stringValue("CreateSchemaResponse.RequestId"));
		createSchemaResponse.setData(_ctx.stringValue("CreateSchemaResponse.Data"));
		createSchemaResponse.setHttpStatusCode(_ctx.integerValue("CreateSchemaResponse.HttpStatusCode"));
		createSchemaResponse.setCode(_ctx.stringValue("CreateSchemaResponse.Code"));
		createSchemaResponse.setMessage(_ctx.stringValue("CreateSchemaResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateSchemaResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("CreateSchemaResponse.Params["+ i +"]"));
		}
		createSchemaResponse.setParams(params);
	 
	 	return createSchemaResponse;
	}
}