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

import com.aliyuncs.sofa.model.v20190815.QueryMsRcSyncDataResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMsRcSyncDataResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsRcSyncDataResponseUnmarshaller {

	public static QueryMsRcSyncDataResponse unmarshall(QueryMsRcSyncDataResponse queryMsRcSyncDataResponse, UnmarshallerContext _ctx) {
		
		queryMsRcSyncDataResponse.setRequestId(_ctx.stringValue("QueryMsRcSyncDataResponse.RequestId"));
		queryMsRcSyncDataResponse.setResultCode(_ctx.stringValue("QueryMsRcSyncDataResponse.ResultCode"));
		queryMsRcSyncDataResponse.setResultMessage(_ctx.stringValue("QueryMsRcSyncDataResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsRcSyncDataResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSourceData(_ctx.stringValue("QueryMsRcSyncDataResponse.Data["+ i +"].SourceData"));
			dataItem.setTargetData(_ctx.stringValue("QueryMsRcSyncDataResponse.Data["+ i +"].TargetData"));

			data.add(dataItem);
		}
		queryMsRcSyncDataResponse.setData(data);
	 
	 	return queryMsRcSyncDataResponse;
	}
}