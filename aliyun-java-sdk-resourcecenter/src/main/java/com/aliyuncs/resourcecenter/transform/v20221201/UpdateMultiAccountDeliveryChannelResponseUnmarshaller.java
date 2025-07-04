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

package com.aliyuncs.resourcecenter.transform.v20221201;

import com.aliyuncs.resourcecenter.model.v20221201.UpdateMultiAccountDeliveryChannelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMultiAccountDeliveryChannelResponseUnmarshaller {

	public static UpdateMultiAccountDeliveryChannelResponse unmarshall(UpdateMultiAccountDeliveryChannelResponse updateMultiAccountDeliveryChannelResponse, UnmarshallerContext _ctx) {
		
		updateMultiAccountDeliveryChannelResponse.setRequestId(_ctx.stringValue("UpdateMultiAccountDeliveryChannelResponse.RequestId"));
	 
	 	return updateMultiAccountDeliveryChannelResponse;
	}
}