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

package com.aliyuncs.rds_data.transform.v20220330;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds_data.model.v20220330.SelectResponse;
import com.aliyuncs.rds_data.model.v20220330.SelectResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class SelectResponseUnmarshaller {

	public static SelectResponse unmarshall(SelectResponse selectResponse, UnmarshallerContext _ctx) {
		
		selectResponse.setRequestId(_ctx.stringValue("SelectResponse.RequestId"));
		selectResponse.setSuccess(_ctx.booleanValue("SelectResponse.Success"));
		selectResponse.setCode(_ctx.stringValue("SelectResponse.Code"));
		selectResponse.setMessage(_ctx.stringValue("SelectResponse.Message"));

		Data data = new Data();

		List<Map<Object, Object>> records = _ctx.listMapValue("SelectResponse.Data.Records");
		data.setRecords(records);
		selectResponse.setData(data);
	 
	 	return selectResponse;
	}
}