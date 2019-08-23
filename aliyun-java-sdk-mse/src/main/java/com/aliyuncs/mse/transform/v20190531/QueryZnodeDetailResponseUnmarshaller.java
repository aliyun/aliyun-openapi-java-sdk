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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.QueryZnodeDetailResponse;
import com.aliyuncs.mse.model.v20190531.QueryZnodeDetailResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryZnodeDetailResponseUnmarshaller {

	public static QueryZnodeDetailResponse unmarshall(QueryZnodeDetailResponse queryZnodeDetailResponse, UnmarshallerContext _ctx) {
		
		queryZnodeDetailResponse.setRequestId(_ctx.stringValue("QueryZnodeDetailResponse.RequestId"));
		queryZnodeDetailResponse.setSuccess(_ctx.stringValue("QueryZnodeDetailResponse.Success"));
		queryZnodeDetailResponse.setMessage(_ctx.stringValue("QueryZnodeDetailResponse.Message"));
		queryZnodeDetailResponse.setErrorCode(_ctx.stringValue("QueryZnodeDetailResponse.ErrorCode"));

		Data data = new Data();
		data.setPath(_ctx.stringValue("QueryZnodeDetailResponse.Data.Path"));
		data.setName(_ctx.stringValue("QueryZnodeDetailResponse.Data.Name"));
		data.setData(_ctx.stringValue("QueryZnodeDetailResponse.Data.Data"));
		data.setDir(_ctx.booleanValue("QueryZnodeDetailResponse.Data.Dir"));
		queryZnodeDetailResponse.setData(data);
	 
	 	return queryZnodeDetailResponse;
	}
}