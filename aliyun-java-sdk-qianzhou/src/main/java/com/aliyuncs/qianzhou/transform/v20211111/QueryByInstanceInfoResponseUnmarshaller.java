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

import com.aliyuncs.qianzhou.model.v20211111.QueryByInstanceInfoResponse;
import com.aliyuncs.qianzhou.model.v20211111.QueryByInstanceInfoResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryByInstanceInfoResponseUnmarshaller {

	public static QueryByInstanceInfoResponse unmarshall(QueryByInstanceInfoResponse queryByInstanceInfoResponse, UnmarshallerContext _ctx) {
		
		queryByInstanceInfoResponse.setRequestId(_ctx.stringValue("QueryByInstanceInfoResponse.requestId"));
		queryByInstanceInfoResponse.setCode(_ctx.integerValue("QueryByInstanceInfoResponse.code"));
		queryByInstanceInfoResponse.setMsg(_ctx.stringValue("QueryByInstanceInfoResponse.msg"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryByInstanceInfoResponse.data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setClusterId(_ctx.stringValue("QueryByInstanceInfoResponse.data["+ i +"].clusterId"));
			dataItem.setClusterName(_ctx.stringValue("QueryByInstanceInfoResponse.data["+ i +"].clusterName"));
			dataItem.setInstanceId(_ctx.stringValue("QueryByInstanceInfoResponse.data["+ i +"].instanceId"));
			dataItem.setRegionId(_ctx.stringValue("QueryByInstanceInfoResponse.data["+ i +"].regionId"));
			dataItem.setUid(_ctx.stringValue("QueryByInstanceInfoResponse.data["+ i +"].uid"));

			data.add(dataItem);
		}
		queryByInstanceInfoResponse.setData(data);
	 
	 	return queryByInstanceInfoResponse;
	}
}