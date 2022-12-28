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

package com.aliyuncs.es_serverless.transform.v20220822;

import com.aliyuncs.es_serverless.model.v20220822.GetAppResponse;
import com.aliyuncs.es_serverless.model.v20220822.GetAppResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppResponseUnmarshaller {

	public static GetAppResponse unmarshall(GetAppResponse getAppResponse, UnmarshallerContext _ctx) {
		
		getAppResponse.setRequestId(_ctx.stringValue("GetAppResponse.requestId"));

		Result result = new Result();
		result.setAppName(_ctx.stringValue("GetAppResponse.result.appName"));
		result.setStorageQuota(_ctx.stringValue("GetAppResponse.result.storageQuota"));
		result.setOwnerId(_ctx.stringValue("GetAppResponse.result.ownerId"));
		result.setRegionId(_ctx.stringValue("GetAppResponse.result.regionId"));
		result.setStatus(_ctx.stringValue("GetAppResponse.result.status"));
		result.setCreateTime(_ctx.stringValue("GetAppResponse.result.createTime"));
		result.setFlowQuota(_ctx.stringValue("GetAppResponse.result.flowQuota"));
		result.setDescription(_ctx.stringValue("GetAppResponse.result.description"));
		getAppResponse.setResult(result);
	 
	 	return getAppResponse;
	}
}