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

import com.aliyuncs.bssopenapi.model.v20171214.QueryEnduserStatusResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryEnduserStatusResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEnduserStatusResponseUnmarshaller {

	public static QueryEnduserStatusResponse unmarshall(QueryEnduserStatusResponse queryEnduserStatusResponse, UnmarshallerContext context) {
		
		queryEnduserStatusResponse.setRequestId(context.stringValue("QueryEnduserStatusResponse.RequestId"));
		queryEnduserStatusResponse.setCode(context.stringValue("QueryEnduserStatusResponse.Code"));
		queryEnduserStatusResponse.setMessage(context.stringValue("QueryEnduserStatusResponse.Message"));
		queryEnduserStatusResponse.setSuccess(context.booleanValue("QueryEnduserStatusResponse.Success"));
		queryEnduserStatusResponse.setCount(context.integerValue("QueryEnduserStatusResponse.Count"));

		List<Data> datas = new ArrayList<Data>();
		for (int i = 0; i < context.lengthValue("QueryEnduserStatusResponse.Datas.Length"); i++) {
			Data data = new Data();
			data.setUid(context.longValue("QueryEnduserStatusResponse.Datas["+ i +"].Uid"));
			data.setPrimaryAccount(context.stringValue("QueryEnduserStatusResponse.Datas["+ i +"].PrimaryAccount"));
			data.setBusinessType(context.stringValue("QueryEnduserStatusResponse.Datas["+ i +"].BusinessType"));
			data.setStatus(context.stringValue("QueryEnduserStatusResponse.Datas["+ i +"].Status"));

			datas.add(data);
		}
		queryEnduserStatusResponse.setDatas(datas);
	 
	 	return queryEnduserStatusResponse;
	}
}