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

import com.aliyuncs.sofa.model.v20190815.QueryMsRcSyncClusterResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMsRcSyncClusterResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.QueryMsRcSyncClusterResponse.DataItem.ExtraParamsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsRcSyncClusterResponseUnmarshaller {

	public static QueryMsRcSyncClusterResponse unmarshall(QueryMsRcSyncClusterResponse queryMsRcSyncClusterResponse, UnmarshallerContext _ctx) {
		
		queryMsRcSyncClusterResponse.setRequestId(_ctx.stringValue("QueryMsRcSyncClusterResponse.RequestId"));
		queryMsRcSyncClusterResponse.setResultCode(_ctx.stringValue("QueryMsRcSyncClusterResponse.ResultCode"));
		queryMsRcSyncClusterResponse.setResultMessage(_ctx.stringValue("QueryMsRcSyncClusterResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsRcSyncClusterResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.stringValue("QueryMsRcSyncClusterResponse.Data["+ i +"].Id"));
			dataItem.setName(_ctx.stringValue("QueryMsRcSyncClusterResponse.Data["+ i +"].Name"));
			dataItem.setType(_ctx.stringValue("QueryMsRcSyncClusterResponse.Data["+ i +"].Type"));
			dataItem.setVip(_ctx.stringValue("QueryMsRcSyncClusterResponse.Data["+ i +"].Vip"));

			List<ExtraParamsItem> extraParams = new ArrayList<ExtraParamsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryMsRcSyncClusterResponse.Data["+ i +"].ExtraParams.Length"); j++) {
				ExtraParamsItem extraParamsItem = new ExtraParamsItem();
				extraParamsItem.setKey(_ctx.stringValue("QueryMsRcSyncClusterResponse.Data["+ i +"].ExtraParams["+ j +"].Key"));
				extraParamsItem.setValue(_ctx.stringValue("QueryMsRcSyncClusterResponse.Data["+ i +"].ExtraParams["+ j +"].Value"));

				extraParams.add(extraParamsItem);
			}
			dataItem.setExtraParams(extraParams);

			data.add(dataItem);
		}
		queryMsRcSyncClusterResponse.setData(data);
	 
	 	return queryMsRcSyncClusterResponse;
	}
}