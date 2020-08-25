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

import com.aliyuncs.sofa.model.v20190815.GetCASSlsLogstoreResponse;
import com.aliyuncs.sofa.model.v20190815.GetCASSlsLogstoreResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCASSlsLogstoreResponseUnmarshaller {

	public static GetCASSlsLogstoreResponse unmarshall(GetCASSlsLogstoreResponse getCASSlsLogstoreResponse, UnmarshallerContext _ctx) {
		
		getCASSlsLogstoreResponse.setRequestId(_ctx.stringValue("GetCASSlsLogstoreResponse.RequestId"));
		getCASSlsLogstoreResponse.setResultCode(_ctx.stringValue("GetCASSlsLogstoreResponse.ResultCode"));
		getCASSlsLogstoreResponse.setResultMessage(_ctx.stringValue("GetCASSlsLogstoreResponse.ResultMessage"));

		Data data = new Data();
		data.setName(_ctx.stringValue("GetCASSlsLogstoreResponse.Data.Name"));
		data.setShardCount(_ctx.longValue("GetCASSlsLogstoreResponse.Data.ShardCount"));
		data.setTtl(_ctx.longValue("GetCASSlsLogstoreResponse.Data.Ttl"));
		getCASSlsLogstoreResponse.setData(data);
	 
	 	return getCASSlsLogstoreResponse;
	}
}