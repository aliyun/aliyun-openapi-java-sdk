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

package com.aliyuncs.unimkt.transform.v20181212;

import com.aliyuncs.unimkt.model.v20181212.QueryChannelHistoryDataResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryChannelHistoryDataResponseUnmarshaller {

	public static QueryChannelHistoryDataResponse unmarshall(QueryChannelHistoryDataResponse queryChannelHistoryDataResponse, UnmarshallerContext _ctx) {
		
		queryChannelHistoryDataResponse.setRequestId(_ctx.stringValue("QueryChannelHistoryDataResponse.RequestId"));
		queryChannelHistoryDataResponse.setCode(_ctx.integerValue("QueryChannelHistoryDataResponse.Code"));
		queryChannelHistoryDataResponse.setData(_ctx.mapValue("QueryChannelHistoryDataResponse.Data"));
		queryChannelHistoryDataResponse.setErrorMsg(_ctx.stringValue("QueryChannelHistoryDataResponse.ErrorMsg"));
		queryChannelHistoryDataResponse.setSuccess(_ctx.booleanValue("QueryChannelHistoryDataResponse.Success"));
	 
	 	return queryChannelHistoryDataResponse;
	}
}