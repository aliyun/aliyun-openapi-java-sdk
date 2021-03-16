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

package com.aliyuncs.unimkt.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.unimkt.model.v20181212.QueryTaskRulesResponse;
import com.aliyuncs.unimkt.model.v20181212.QueryTaskRulesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTaskRulesResponseUnmarshaller {

	public static QueryTaskRulesResponse unmarshall(QueryTaskRulesResponse queryTaskRulesResponse, UnmarshallerContext _ctx) {
		
		queryTaskRulesResponse.setRequestId(_ctx.stringValue("QueryTaskRulesResponse.RequestId"));
		queryTaskRulesResponse.setCode(_ctx.integerValue("QueryTaskRulesResponse.Code"));
		queryTaskRulesResponse.setSuccess(_ctx.booleanValue("QueryTaskRulesResponse.Success"));
		queryTaskRulesResponse.setErrorMessage(_ctx.stringValue("QueryTaskRulesResponse.ErrorMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTaskRulesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.integerValue("QueryTaskRulesResponse.Data["+ i +"].Id"));
			dataItem.setTaskId(_ctx.longValue("QueryTaskRulesResponse.Data["+ i +"].TaskId"));
			dataItem.setType(_ctx.integerValue("QueryTaskRulesResponse.Data["+ i +"].Type"));
			dataItem.setContent(_ctx.stringValue("QueryTaskRulesResponse.Data["+ i +"].Content"));

			data.add(dataItem);
		}
		queryTaskRulesResponse.setData(data);
	 
	 	return queryTaskRulesResponse;
	}
}