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

import com.aliyuncs.sofa.model.v20190815.QueryDWSTaskResponse;
import com.aliyuncs.sofa.model.v20190815.QueryDWSTaskResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDWSTaskResponseUnmarshaller {

	public static QueryDWSTaskResponse unmarshall(QueryDWSTaskResponse queryDWSTaskResponse, UnmarshallerContext _ctx) {
		
		queryDWSTaskResponse.setRequestId(_ctx.stringValue("QueryDWSTaskResponse.RequestId"));
		queryDWSTaskResponse.setResultCode(_ctx.stringValue("QueryDWSTaskResponse.ResultCode"));
		queryDWSTaskResponse.setResultMessage(_ctx.stringValue("QueryDWSTaskResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDWSTaskResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDetail(_ctx.stringValue("QueryDWSTaskResponse.Data["+ i +"].Detail"));
			dataItem.setName(_ctx.stringValue("QueryDWSTaskResponse.Data["+ i +"].Name"));

			data.add(dataItem);
		}
		queryDWSTaskResponse.setData(data);
	 
	 	return queryDWSTaskResponse;
	}
}