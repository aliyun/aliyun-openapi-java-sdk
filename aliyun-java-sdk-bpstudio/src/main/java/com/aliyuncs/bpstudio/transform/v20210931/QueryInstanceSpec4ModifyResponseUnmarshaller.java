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

package com.aliyuncs.bpstudio.transform.v20210931;

import com.aliyuncs.bpstudio.model.v20210931.QueryInstanceSpec4ModifyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryInstanceSpec4ModifyResponseUnmarshaller {

	public static QueryInstanceSpec4ModifyResponse unmarshall(QueryInstanceSpec4ModifyResponse queryInstanceSpec4ModifyResponse, UnmarshallerContext _ctx) {
		
		queryInstanceSpec4ModifyResponse.setRequestId(_ctx.stringValue("QueryInstanceSpec4ModifyResponse.RequestId"));
		queryInstanceSpec4ModifyResponse.setSuccess(_ctx.booleanValue("QueryInstanceSpec4ModifyResponse.Success"));
		queryInstanceSpec4ModifyResponse.setCode(_ctx.stringValue("QueryInstanceSpec4ModifyResponse.Code"));
		queryInstanceSpec4ModifyResponse.setMessage(_ctx.stringValue("QueryInstanceSpec4ModifyResponse.Message"));
		queryInstanceSpec4ModifyResponse.setData(_ctx.stringValue("QueryInstanceSpec4ModifyResponse.Data"));
		queryInstanceSpec4ModifyResponse.setAccessDeniedDetail(_ctx.stringValue("QueryInstanceSpec4ModifyResponse.AccessDeniedDetail"));
	 
	 	return queryInstanceSpec4ModifyResponse;
	}
}