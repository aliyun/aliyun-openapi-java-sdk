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

import com.aliyuncs.sofa.model.v20190815.QueryCasDatabaseQuotaResponse;
import com.aliyuncs.sofa.model.v20190815.QueryCasDatabaseQuotaResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCasDatabaseQuotaResponseUnmarshaller {

	public static QueryCasDatabaseQuotaResponse unmarshall(QueryCasDatabaseQuotaResponse queryCasDatabaseQuotaResponse, UnmarshallerContext _ctx) {
		
		queryCasDatabaseQuotaResponse.setRequestId(_ctx.stringValue("QueryCasDatabaseQuotaResponse.RequestId"));
		queryCasDatabaseQuotaResponse.setResultCode(_ctx.stringValue("QueryCasDatabaseQuotaResponse.ResultCode"));
		queryCasDatabaseQuotaResponse.setResultMessage(_ctx.stringValue("QueryCasDatabaseQuotaResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryCasDatabaseQuotaResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setQuota(_ctx.longValue("QueryCasDatabaseQuotaResponse.Data["+ i +"].Quota"));
			dataItem.setType(_ctx.stringValue("QueryCasDatabaseQuotaResponse.Data["+ i +"].Type"));

			data.add(dataItem);
		}
		queryCasDatabaseQuotaResponse.setData(data);
	 
	 	return queryCasDatabaseQuotaResponse;
	}
}