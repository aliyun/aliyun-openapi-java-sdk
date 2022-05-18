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

import com.aliyuncs.retailbot.model.v20210224.UpdateSlotOwnerStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateSlotOwnerStatusResponseUnmarshaller {

	public static UpdateSlotOwnerStatusResponse unmarshall(UpdateSlotOwnerStatusResponse updateSlotOwnerStatusResponse, UnmarshallerContext _ctx) {
		
		updateSlotOwnerStatusResponse.setRequestId(_ctx.stringValue("UpdateSlotOwnerStatusResponse.RequestId"));
		updateSlotOwnerStatusResponse.setData(_ctx.integerValue("UpdateSlotOwnerStatusResponse.Data"));
		updateSlotOwnerStatusResponse.setSuccess(_ctx.booleanValue("UpdateSlotOwnerStatusResponse.Success"));
		updateSlotOwnerStatusResponse.setCode(_ctx.stringValue("UpdateSlotOwnerStatusResponse.Code"));
		updateSlotOwnerStatusResponse.setMessage(_ctx.stringValue("UpdateSlotOwnerStatusResponse.Message"));
		updateSlotOwnerStatusResponse.setHttpStatusCode(_ctx.integerValue("UpdateSlotOwnerStatusResponse.HttpStatusCode"));
	 
	 	return updateSlotOwnerStatusResponse;
	}
}