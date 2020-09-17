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

import com.aliyuncs.sofa.model.v20190815.QueryOneconsolePlatformurlResponse;
import com.aliyuncs.sofa.model.v20190815.QueryOneconsolePlatformurlResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOneconsolePlatformurlResponseUnmarshaller {

	public static QueryOneconsolePlatformurlResponse unmarshall(QueryOneconsolePlatformurlResponse queryOneconsolePlatformurlResponse, UnmarshallerContext _ctx) {
		
		queryOneconsolePlatformurlResponse.setRequestId(_ctx.stringValue("QueryOneconsolePlatformurlResponse.RequestId"));
		queryOneconsolePlatformurlResponse.setResultCode(_ctx.stringValue("QueryOneconsolePlatformurlResponse.ResultCode"));
		queryOneconsolePlatformurlResponse.setResultMessage(_ctx.stringValue("QueryOneconsolePlatformurlResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryOneconsolePlatformurlResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDomain(_ctx.stringValue("QueryOneconsolePlatformurlResponse.Data["+ i +"].Domain"));
			dataItem.setIp(_ctx.stringValue("QueryOneconsolePlatformurlResponse.Data["+ i +"].Ip"));
			dataItem.setName(_ctx.stringValue("QueryOneconsolePlatformurlResponse.Data["+ i +"].Name"));

			data.add(dataItem);
		}
		queryOneconsolePlatformurlResponse.setData(data);
	 
	 	return queryOneconsolePlatformurlResponse;
	}
}