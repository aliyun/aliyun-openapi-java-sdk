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

package com.aliyuncs.cusanalytic_sc_online.transform.v20190524;

import com.aliyuncs.cusanalytic_sc_online.model.v20190524.GetActionCursorResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetActionCursorResponseUnmarshaller {

	public static GetActionCursorResponse unmarshall(GetActionCursorResponse getActionCursorResponse, UnmarshallerContext _ctx) {
		
		getActionCursorResponse.setErrorMsg(_ctx.stringValue("GetActionCursorResponse.ErrorMsg"));
		getActionCursorResponse.setTimestamp(_ctx.longValue("GetActionCursorResponse.Timestamp"));
		getActionCursorResponse.setSuccess(_ctx.booleanValue("GetActionCursorResponse.Success"));
	 
	 	return getActionCursorResponse;
	}
}