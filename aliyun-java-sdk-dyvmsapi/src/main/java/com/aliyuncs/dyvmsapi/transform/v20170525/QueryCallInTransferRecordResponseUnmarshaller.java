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

package com.aliyuncs.dyvmsapi.transform.v20170525;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dyvmsapi.model.v20170525.QueryCallInTransferRecordResponse;
import com.aliyuncs.dyvmsapi.model.v20170525.QueryCallInTransferRecordResponse.Data;
import com.aliyuncs.dyvmsapi.model.v20170525.QueryCallInTransferRecordResponse.Data.ValuesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCallInTransferRecordResponseUnmarshaller {

	public static QueryCallInTransferRecordResponse unmarshall(QueryCallInTransferRecordResponse queryCallInTransferRecordResponse, UnmarshallerContext _ctx) {
		
		queryCallInTransferRecordResponse.setRequestId(_ctx.stringValue("QueryCallInTransferRecordResponse.RequestId"));
		queryCallInTransferRecordResponse.setCode(_ctx.stringValue("QueryCallInTransferRecordResponse.Code"));
		queryCallInTransferRecordResponse.setMessage(_ctx.stringValue("QueryCallInTransferRecordResponse.Message"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("QueryCallInTransferRecordResponse.Data.Total"));
		data.setPageNo(_ctx.longValue("QueryCallInTransferRecordResponse.Data.PageNo"));
		data.setPageSize(_ctx.longValue("QueryCallInTransferRecordResponse.Data.PageSize"));

		List<ValuesItem> values = new ArrayList<ValuesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryCallInTransferRecordResponse.Data.Values.Length"); i++) {
			ValuesItem valuesItem = new ValuesItem();
			valuesItem.setCallInCaller(_ctx.stringValue("QueryCallInTransferRecordResponse.Data.Values["+ i +"].CallInCaller"));
			valuesItem.setCallInCalled(_ctx.stringValue("QueryCallInTransferRecordResponse.Data.Values["+ i +"].CallInCalled"));
			valuesItem.setTransferCaller(_ctx.stringValue("QueryCallInTransferRecordResponse.Data.Values["+ i +"].TransferCaller"));
			valuesItem.setTransferCalled(_ctx.stringValue("QueryCallInTransferRecordResponse.Data.Values["+ i +"].TransferCalled"));
			valuesItem.setRecordUrl(_ctx.stringValue("QueryCallInTransferRecordResponse.Data.Values["+ i +"].RecordUrl"));
			valuesItem.setGmtCreate(_ctx.longValue("QueryCallInTransferRecordResponse.Data.Values["+ i +"].GmtCreate"));

			values.add(valuesItem);
		}
		data.setValues(values);
		queryCallInTransferRecordResponse.setData(data);
	 
	 	return queryCallInTransferRecordResponse;
	}
}