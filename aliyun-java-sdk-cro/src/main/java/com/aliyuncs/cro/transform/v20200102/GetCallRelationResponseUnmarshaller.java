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

package com.aliyuncs.cro.transform.v20200102;

import com.aliyuncs.cro.model.v20200102.GetCallRelationResponse;
import com.aliyuncs.cro.model.v20200102.GetCallRelationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCallRelationResponseUnmarshaller {

	public static GetCallRelationResponse unmarshall(GetCallRelationResponse getCallRelationResponse, UnmarshallerContext _ctx) {
		
		getCallRelationResponse.setRequestId(_ctx.stringValue("GetCallRelationResponse.RequestId"));
		getCallRelationResponse.setCode(_ctx.integerValue("GetCallRelationResponse.Code"));
		getCallRelationResponse.setSuccess(_ctx.booleanValue("GetCallRelationResponse.Success"));
		getCallRelationResponse.setMessage(_ctx.stringValue("GetCallRelationResponse.Message"));

		Data data = new Data();
		data.setAppName(_ctx.stringValue("GetCallRelationResponse.Data.AppName"));
		data.setCallAppList(_ctx.stringValue("GetCallRelationResponse.Data.CallAppList"));
		data.setCalledAppList(_ctx.stringValue("GetCallRelationResponse.Data.CalledAppList"));
		getCallRelationResponse.setData(data);
	 
	 	return getCallRelationResponse;
	}
}