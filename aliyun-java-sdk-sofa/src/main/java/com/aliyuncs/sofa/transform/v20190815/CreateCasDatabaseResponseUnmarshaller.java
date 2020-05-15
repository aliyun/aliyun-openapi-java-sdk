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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.CreateCasDatabaseResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCasDatabaseResponseUnmarshaller {

	public static CreateCasDatabaseResponse unmarshall(CreateCasDatabaseResponse createCasDatabaseResponse, UnmarshallerContext _ctx) {
		
		createCasDatabaseResponse.setRequestId(_ctx.stringValue("CreateCasDatabaseResponse.RequestId"));
		createCasDatabaseResponse.setResultCode(_ctx.stringValue("CreateCasDatabaseResponse.ResultCode"));
		createCasDatabaseResponse.setResultMessage(_ctx.stringValue("CreateCasDatabaseResponse.ResultMessage"));

		List<String> databaseSequences = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateCasDatabaseResponse.DatabaseSequences.Length"); i++) {
			databaseSequences.add(_ctx.stringValue("CreateCasDatabaseResponse.DatabaseSequences["+ i +"]"));
		}
		createCasDatabaseResponse.setDatabaseSequences(databaseSequences);
	 
	 	return createCasDatabaseResponse;
	}
}