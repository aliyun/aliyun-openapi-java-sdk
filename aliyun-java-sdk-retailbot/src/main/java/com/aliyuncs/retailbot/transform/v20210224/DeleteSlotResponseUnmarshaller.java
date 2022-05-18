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

package com.aliyuncs.retailbot.transform.v20210224;

import com.aliyuncs.retailbot.model.v20210224.DeleteSlotResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteSlotResponseUnmarshaller {

	public static DeleteSlotResponse unmarshall(DeleteSlotResponse deleteSlotResponse, UnmarshallerContext _ctx) {
		
		deleteSlotResponse.setRequestId(_ctx.stringValue("DeleteSlotResponse.RequestId"));
		deleteSlotResponse.setData(_ctx.integerValue("DeleteSlotResponse.Data"));
		deleteSlotResponse.setSuccess(_ctx.booleanValue("DeleteSlotResponse.Success"));
		deleteSlotResponse.setCode(_ctx.stringValue("DeleteSlotResponse.Code"));
		deleteSlotResponse.setMessage(_ctx.stringValue("DeleteSlotResponse.Message"));
		deleteSlotResponse.setHttpStatusCode(_ctx.integerValue("DeleteSlotResponse.HttpStatusCode"));
	 
	 	return deleteSlotResponse;
	}
}