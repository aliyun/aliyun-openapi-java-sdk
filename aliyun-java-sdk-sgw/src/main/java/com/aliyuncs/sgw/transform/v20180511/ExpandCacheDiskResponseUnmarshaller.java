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

package com.aliyuncs.sgw.transform.v20180511;

import com.aliyuncs.sgw.model.v20180511.ExpandCacheDiskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExpandCacheDiskResponseUnmarshaller {

	public static ExpandCacheDiskResponse unmarshall(ExpandCacheDiskResponse expandCacheDiskResponse, UnmarshallerContext _ctx) {
		
		expandCacheDiskResponse.setRequestId(_ctx.stringValue("ExpandCacheDiskResponse.RequestId"));
		expandCacheDiskResponse.setSuccess(_ctx.booleanValue("ExpandCacheDiskResponse.Success"));
		expandCacheDiskResponse.setCode(_ctx.stringValue("ExpandCacheDiskResponse.Code"));
		expandCacheDiskResponse.setMessage(_ctx.stringValue("ExpandCacheDiskResponse.Message"));
		expandCacheDiskResponse.setTaskId(_ctx.stringValue("ExpandCacheDiskResponse.TaskId"));
		expandCacheDiskResponse.setBuyURL(_ctx.stringValue("ExpandCacheDiskResponse.BuyURL"));
	 
	 	return expandCacheDiskResponse;
	}
}