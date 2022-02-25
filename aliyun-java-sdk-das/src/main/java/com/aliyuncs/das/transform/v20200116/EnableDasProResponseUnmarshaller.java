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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.EnableDasProResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableDasProResponseUnmarshaller {

	public static EnableDasProResponse unmarshall(EnableDasProResponse enableDasProResponse, UnmarshallerContext _ctx) {
		
		enableDasProResponse.setRequestId(_ctx.stringValue("EnableDasProResponse.RequestId"));
		enableDasProResponse.setMessage(_ctx.stringValue("EnableDasProResponse.Message"));
		enableDasProResponse.setSynchro(_ctx.stringValue("EnableDasProResponse.Synchro"));
		enableDasProResponse.setData(_ctx.stringValue("EnableDasProResponse.Data"));
		enableDasProResponse.setCode(_ctx.stringValue("EnableDasProResponse.Code"));
		enableDasProResponse.setSuccess(_ctx.stringValue("EnableDasProResponse.Success"));
	 
	 	return enableDasProResponse;
	}
}