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

import com.aliyuncs.dyplsapi.model.v20170525.CancelPickUpWaybillResponse;
import com.aliyuncs.dyplsapi.model.v20170525.CancelPickUpWaybillResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelPickUpWaybillResponseUnmarshaller {

	public static CancelPickUpWaybillResponse unmarshall(CancelPickUpWaybillResponse cancelPickUpWaybillResponse, UnmarshallerContext _ctx) {
		
		cancelPickUpWaybillResponse.setRequestId(_ctx.stringValue("CancelPickUpWaybillResponse.RequestId"));
		cancelPickUpWaybillResponse.setCode(_ctx.stringValue("CancelPickUpWaybillResponse.Code"));
		cancelPickUpWaybillResponse.setMessage(_ctx.stringValue("CancelPickUpWaybillResponse.Message"));

		Data data = new Data();
		data.setSuccess(_ctx.booleanValue("CancelPickUpWaybillResponse.Data.Success"));
		data.setErrorCode(_ctx.stringValue("CancelPickUpWaybillResponse.Data.ErrorCode"));
		data.setMessage(_ctx.stringValue("CancelPickUpWaybillResponse.Data.Message"));
		data.setErrorMsg(_ctx.stringValue("CancelPickUpWaybillResponse.Data.ErrorMsg"));
		cancelPickUpWaybillResponse.setData(data);
	 
	 	return cancelPickUpWaybillResponse;
	}
}