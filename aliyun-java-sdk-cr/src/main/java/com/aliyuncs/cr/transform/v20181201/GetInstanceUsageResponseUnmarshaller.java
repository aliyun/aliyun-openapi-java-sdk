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

package com.aliyuncs.cr.transform.v20181201;

import com.aliyuncs.cr.model.v20181201.GetInstanceUsageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceUsageResponseUnmarshaller {

	public static GetInstanceUsageResponse unmarshall(GetInstanceUsageResponse getInstanceUsageResponse, UnmarshallerContext _ctx) {
		
		getInstanceUsageResponse.setRequestId(_ctx.stringValue("GetInstanceUsageResponse.RequestId"));
		getInstanceUsageResponse.setIsSuccess(_ctx.booleanValue("GetInstanceUsageResponse.IsSuccess"));
		getInstanceUsageResponse.setCode(_ctx.stringValue("GetInstanceUsageResponse.Code"));
		getInstanceUsageResponse.setNamespaceQuota(_ctx.stringValue("GetInstanceUsageResponse.NamespaceQuota"));
		getInstanceUsageResponse.setNamespaceUsage(_ctx.stringValue("GetInstanceUsageResponse.NamespaceUsage"));
		getInstanceUsageResponse.setRepoQuota(_ctx.stringValue("GetInstanceUsageResponse.RepoQuota"));
		getInstanceUsageResponse.setRepoUsage(_ctx.stringValue("GetInstanceUsageResponse.RepoUsage"));
	 
	 	return getInstanceUsageResponse;
	}
}