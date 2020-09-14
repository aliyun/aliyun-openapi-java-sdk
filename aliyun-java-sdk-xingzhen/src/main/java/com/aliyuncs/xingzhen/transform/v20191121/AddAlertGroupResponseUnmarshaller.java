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

package com.aliyuncs.xingzhen.transform.v20191121;

import com.aliyuncs.xingzhen.model.v20191121.AddAlertGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddAlertGroupResponseUnmarshaller {

	public static AddAlertGroupResponse unmarshall(AddAlertGroupResponse addAlertGroupResponse, UnmarshallerContext _ctx) {
		
		addAlertGroupResponse.setRequestId(_ctx.stringValue("AddAlertGroupResponse.RequestId"));
		addAlertGroupResponse.setSuccess(_ctx.booleanValue("AddAlertGroupResponse.Success"));
		addAlertGroupResponse.setCode(_ctx.stringValue("AddAlertGroupResponse.Code"));
		addAlertGroupResponse.setMessage(_ctx.stringValue("AddAlertGroupResponse.Message"));
		addAlertGroupResponse.setData(_ctx.booleanValue("AddAlertGroupResponse.Data"));
	 
	 	return addAlertGroupResponse;
	}
}