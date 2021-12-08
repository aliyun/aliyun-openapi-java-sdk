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

package com.aliyuncs.dyplsapi.transform.v20170525;

import com.aliyuncs.dyplsapi.model.v20170525.CreatePickUpWaybillResponse;
import com.aliyuncs.dyplsapi.model.v20170525.CreatePickUpWaybillResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePickUpWaybillResponseUnmarshaller {

	public static CreatePickUpWaybillResponse unmarshall(CreatePickUpWaybillResponse createPickUpWaybillResponse, UnmarshallerContext _ctx) {
		
		createPickUpWaybillResponse.setRequestId(_ctx.stringValue("CreatePickUpWaybillResponse.RequestId"));
		createPickUpWaybillResponse.setHttpStatusCode(_ctx.integerValue("CreatePickUpWaybillResponse.HttpStatusCode"));
		createPickUpWaybillResponse.setMessage(_ctx.stringValue("CreatePickUpWaybillResponse.Message"));

		Data data = new Data();
		data.setSuccess(_ctx.stringValue("CreatePickUpWaybillResponse.Data.Success"));
		data.setCpCode(_ctx.stringValue("CreatePickUpWaybillResponse.Data.CpCode"));
		data.setMailNo(_ctx.stringValue("CreatePickUpWaybillResponse.Data.MailNo"));
		data.setErrorCode(_ctx.stringValue("CreatePickUpWaybillResponse.Data.ErrorCode"));
		data.setErrorMsg(_ctx.stringValue("CreatePickUpWaybillResponse.Data.ErrorMsg"));
		createPickUpWaybillResponse.setData(data);
	 
	 	return createPickUpWaybillResponse;
	}
}