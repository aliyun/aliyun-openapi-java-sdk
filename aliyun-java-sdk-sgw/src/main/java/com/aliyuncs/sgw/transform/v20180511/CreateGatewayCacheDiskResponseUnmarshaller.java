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

import com.aliyuncs.sgw.model.v20180511.CreateGatewayCacheDiskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateGatewayCacheDiskResponseUnmarshaller {

	public static CreateGatewayCacheDiskResponse unmarshall(CreateGatewayCacheDiskResponse createGatewayCacheDiskResponse, UnmarshallerContext _ctx) {
		
		createGatewayCacheDiskResponse.setRequestId(_ctx.stringValue("CreateGatewayCacheDiskResponse.RequestId"));
		createGatewayCacheDiskResponse.setSuccess(_ctx.booleanValue("CreateGatewayCacheDiskResponse.Success"));
		createGatewayCacheDiskResponse.setCode(_ctx.stringValue("CreateGatewayCacheDiskResponse.Code"));
		createGatewayCacheDiskResponse.setMessage(_ctx.stringValue("CreateGatewayCacheDiskResponse.Message"));
		createGatewayCacheDiskResponse.setTaskId(_ctx.stringValue("CreateGatewayCacheDiskResponse.TaskId"));
		createGatewayCacheDiskResponse.setBuyURL(_ctx.stringValue("CreateGatewayCacheDiskResponse.BuyURL"));
	 
	 	return createGatewayCacheDiskResponse;
	}
}