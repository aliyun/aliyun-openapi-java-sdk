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

package com.aliyuncs.bssopenapi.transform.v20171214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bssopenapi.model.v20171214.QueryAccountBookListResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryAccountBookListResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAccountBookListResponseUnmarshaller {

	public static QueryAccountBookListResponse unmarshall(QueryAccountBookListResponse queryAccountBookListResponse, UnmarshallerContext context) {
		
		queryAccountBookListResponse.setRequestId(context.stringValue("QueryAccountBookListResponse.RequestId"));
		queryAccountBookListResponse.setCode(context.stringValue("QueryAccountBookListResponse.Code"));
		queryAccountBookListResponse.setMessage(context.stringValue("QueryAccountBookListResponse.Message"));
		queryAccountBookListResponse.setSuccess(context.booleanValue("QueryAccountBookListResponse.Success"));
		queryAccountBookListResponse.setCount(context.integerValue("QueryAccountBookListResponse.Count"));

		List<Data> datas = new ArrayList<Data>();
		for (int i = 0; i < context.lengthValue("QueryAccountBookListResponse.Datas.Length"); i++) {
			Data data = new Data();
			data.setUserId(context.longValue("QueryAccountBookListResponse.Datas["+ i +"].UserId"));
			data.setBid(context.stringValue("QueryAccountBookListResponse.Datas["+ i +"].Bid"));
			data.setItemCode(context.stringValue("QueryAccountBookListResponse.Datas["+ i +"].ItemCode"));
			data.setAmount(context.stringValue("QueryAccountBookListResponse.Datas["+ i +"].Amount"));
			data.setEffectTimeStamp(context.longValue("QueryAccountBookListResponse.Datas["+ i +"].EffectTimeStamp"));
			data.setInvalidTimeStamp(context.longValue("QueryAccountBookListResponse.Datas["+ i +"].InvalidTimeStamp"));
			data.setCurrency(context.stringValue("QueryAccountBookListResponse.Datas["+ i +"].Currency"));

			datas.add(data);
		}
		queryAccountBookListResponse.setDatas(datas);
	 
	 	return queryAccountBookListResponse;
	}
}