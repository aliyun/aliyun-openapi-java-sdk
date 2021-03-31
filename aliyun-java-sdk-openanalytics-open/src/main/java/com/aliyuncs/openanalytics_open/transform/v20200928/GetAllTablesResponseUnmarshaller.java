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

package com.aliyuncs.openanalytics_open.transform.v20200928;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.openanalytics_open.model.v20200928.GetAllTablesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAllTablesResponseUnmarshaller {

	public static GetAllTablesResponse unmarshall(GetAllTablesResponse getAllTablesResponse, UnmarshallerContext _ctx) {
		
		getAllTablesResponse.setRequestId(_ctx.stringValue("GetAllTablesResponse.RequestId"));
		getAllTablesResponse.setMessage(_ctx.stringValue("GetAllTablesResponse.Message"));
		getAllTablesResponse.setCode(_ctx.stringValue("GetAllTablesResponse.Code"));
		getAllTablesResponse.setSuccess(_ctx.booleanValue("GetAllTablesResponse.Success"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAllTablesResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetAllTablesResponse.Data["+ i +"]"));
		}
		getAllTablesResponse.setData(data);
	 
	 	return getAllTablesResponse;
	}
}