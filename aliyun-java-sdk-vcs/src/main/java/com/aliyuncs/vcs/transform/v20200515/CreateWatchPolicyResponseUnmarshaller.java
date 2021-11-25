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

package com.aliyuncs.vcs.transform.v20200515;

import com.aliyuncs.vcs.model.v20200515.CreateWatchPolicyResponse;
import com.aliyuncs.vcs.model.v20200515.CreateWatchPolicyResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateWatchPolicyResponseUnmarshaller {

	public static CreateWatchPolicyResponse unmarshall(CreateWatchPolicyResponse createWatchPolicyResponse, UnmarshallerContext _ctx) {
		
		createWatchPolicyResponse.setRequestId(_ctx.stringValue("CreateWatchPolicyResponse.RequestId"));
		createWatchPolicyResponse.setSuccess(_ctx.booleanValue("CreateWatchPolicyResponse.Success"));
		createWatchPolicyResponse.setCode(_ctx.stringValue("CreateWatchPolicyResponse.Code"));
		createWatchPolicyResponse.setMessage(_ctx.stringValue("CreateWatchPolicyResponse.Message"));

		Data data = new Data();
		data.setWatchPolicyId(_ctx.stringValue("CreateWatchPolicyResponse.Data.WatchPolicyId"));
		createWatchPolicyResponse.setData(data);
	 
	 	return createWatchPolicyResponse;
	}
}