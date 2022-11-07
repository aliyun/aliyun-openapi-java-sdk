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

package com.aliyuncs.qianzhou.transform.v20211111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qianzhou.model.v20211111.QueryNodeInfoResponse;
import com.aliyuncs.qianzhou.model.v20211111.QueryNodeInfoResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryNodeInfoResponseUnmarshaller {

	public static QueryNodeInfoResponse unmarshall(QueryNodeInfoResponse queryNodeInfoResponse, UnmarshallerContext _ctx) {
		
		queryNodeInfoResponse.setRequestId(_ctx.stringValue("QueryNodeInfoResponse.requestId"));
		queryNodeInfoResponse.setCode(_ctx.integerValue("QueryNodeInfoResponse.code"));
		queryNodeInfoResponse.setMsg(_ctx.stringValue("QueryNodeInfoResponse.msg"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryNodeInfoResponse.data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setClusterId(_ctx.stringValue("QueryNodeInfoResponse.data["+ i +"].clusterId"));
			dataItem.setCluserName(_ctx.stringValue("QueryNodeInfoResponse.data["+ i +"].cluserName"));
			dataItem.setInstanceId(_ctx.stringValue("QueryNodeInfoResponse.data["+ i +"].instanceId"));
			dataItem.setRegion(_ctx.stringValue("QueryNodeInfoResponse.data["+ i +"].region"));
			dataItem.setUid(_ctx.stringValue("QueryNodeInfoResponse.data["+ i +"].uid"));

			data.add(dataItem);
		}
		queryNodeInfoResponse.setData(data);
	 
	 	return queryNodeInfoResponse;
	}
}