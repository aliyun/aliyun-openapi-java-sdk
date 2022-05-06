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

package com.aliyuncs.educloud.transform.v20220202;

import com.aliyuncs.educloud.model.v20220202.AddLabReservedResponse;
import com.aliyuncs.educloud.model.v20220202.AddLabReservedResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLabReservedResponseUnmarshaller {

	public static AddLabReservedResponse unmarshall(AddLabReservedResponse addLabReservedResponse, UnmarshallerContext _ctx) {
		
		addLabReservedResponse.setRequestId(_ctx.stringValue("AddLabReservedResponse.RequestId"));
		addLabReservedResponse.setSuccess(_ctx.booleanValue("AddLabReservedResponse.Success"));
		addLabReservedResponse.setCode(_ctx.longValue("AddLabReservedResponse.Code"));
		addLabReservedResponse.setMessage(_ctx.stringValue("AddLabReservedResponse.Message"));

		Data data = new Data();
		data.setReservedId(_ctx.stringValue("AddLabReservedResponse.Data.ReservedId"));
		addLabReservedResponse.setData(data);
	 
	 	return addLabReservedResponse;
	}
}