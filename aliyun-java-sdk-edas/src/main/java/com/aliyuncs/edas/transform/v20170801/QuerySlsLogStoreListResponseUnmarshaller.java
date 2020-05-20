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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.QuerySlsLogStoreListResponse;
import com.aliyuncs.edas.model.v20170801.QuerySlsLogStoreListResponse.SlsLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySlsLogStoreListResponseUnmarshaller {

	public static QuerySlsLogStoreListResponse unmarshall(QuerySlsLogStoreListResponse querySlsLogStoreListResponse, UnmarshallerContext _ctx) {
		
		querySlsLogStoreListResponse.setRequestId(_ctx.stringValue("QuerySlsLogStoreListResponse.RequestId"));
		querySlsLogStoreListResponse.setTotalSize(_ctx.integerValue("QuerySlsLogStoreListResponse.TotalSize"));
		querySlsLogStoreListResponse.setCode(_ctx.integerValue("QuerySlsLogStoreListResponse.Code"));
		querySlsLogStoreListResponse.setMessage(_ctx.stringValue("QuerySlsLogStoreListResponse.Message"));

		List<SlsLog> result = new ArrayList<SlsLog>();
		for (int i = 0; i < _ctx.lengthValue("QuerySlsLogStoreListResponse.Result.Length"); i++) {
			SlsLog slsLog = new SlsLog();
			slsLog.setLogstore(_ctx.stringValue("QuerySlsLogStoreListResponse.Result["+ i +"].Logstore"));
			slsLog.setProject(_ctx.stringValue("QuerySlsLogStoreListResponse.Result["+ i +"].Project"));
			slsLog.setLink(_ctx.stringValue("QuerySlsLogStoreListResponse.Result["+ i +"].Link"));
			slsLog.setConsumerSide(_ctx.stringValue("QuerySlsLogStoreListResponse.Result["+ i +"].ConsumerSide"));
			slsLog.setCreateTime(_ctx.stringValue("QuerySlsLogStoreListResponse.Result["+ i +"].CreateTime"));
			slsLog.setSource(_ctx.stringValue("QuerySlsLogStoreListResponse.Result["+ i +"].Source"));

			result.add(slsLog);
		}
		querySlsLogStoreListResponse.setResult(result);
	 
	 	return querySlsLogStoreListResponse;
	}
}