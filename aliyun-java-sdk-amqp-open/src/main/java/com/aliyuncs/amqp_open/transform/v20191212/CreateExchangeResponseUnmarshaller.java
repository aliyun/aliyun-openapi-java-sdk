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

package com.aliyuncs.amqp_open.transform.v20191212;

import com.aliyuncs.amqp_open.model.v20191212.CreateExchangeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateExchangeResponseUnmarshaller {

	public static CreateExchangeResponse unmarshall(CreateExchangeResponse createExchangeResponse, UnmarshallerContext _ctx) {
		
		createExchangeResponse.setRequestId(_ctx.stringValue("CreateExchangeResponse.RequestId"));
	 
	 	return createExchangeResponse;
	}
}