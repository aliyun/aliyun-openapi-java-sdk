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

package com.aliyuncs.drds.transform.v20150413;

import com.aliyuncs.drds.model.v20150413.DrdsApiValidateOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DrdsApiValidateOrderResponseUnmarshaller {

	public static DrdsApiValidateOrderResponse unmarshall(DrdsApiValidateOrderResponse drdsApiValidateOrderResponse, UnmarshallerContext _ctx) {
		
		drdsApiValidateOrderResponse.setRequestId(_ctx.stringValue("DrdsApiValidateOrderResponse.requestId"));
		drdsApiValidateOrderResponse.setCode(_ctx.stringValue("DrdsApiValidateOrderResponse.code"));
		drdsApiValidateOrderResponse.setMsg(_ctx.stringValue("DrdsApiValidateOrderResponse.msg"));
		drdsApiValidateOrderResponse.setData(_ctx.booleanValue("DrdsApiValidateOrderResponse.data"));
		drdsApiValidateOrderResponse.setSuccess(_ctx.booleanValue("DrdsApiValidateOrderResponse.success"));
	 
	 	return drdsApiValidateOrderResponse;
	}
}