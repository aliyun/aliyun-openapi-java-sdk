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

import com.aliyuncs.xingzhen.model.v20191121.UpdateAlertSubscriberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAlertSubscriberResponseUnmarshaller {

	public static UpdateAlertSubscriberResponse unmarshall(UpdateAlertSubscriberResponse updateAlertSubscriberResponse, UnmarshallerContext _ctx) {
		
		updateAlertSubscriberResponse.setRequestId(_ctx.stringValue("UpdateAlertSubscriberResponse.RequestId"));
		updateAlertSubscriberResponse.setSuccess(_ctx.booleanValue("UpdateAlertSubscriberResponse.Success"));
		updateAlertSubscriberResponse.setCode(_ctx.stringValue("UpdateAlertSubscriberResponse.Code"));
		updateAlertSubscriberResponse.setMessage(_ctx.stringValue("UpdateAlertSubscriberResponse.Message"));
		updateAlertSubscriberResponse.setData(_ctx.booleanValue("UpdateAlertSubscriberResponse.Data"));
	 
	 	return updateAlertSubscriberResponse;
	}
}