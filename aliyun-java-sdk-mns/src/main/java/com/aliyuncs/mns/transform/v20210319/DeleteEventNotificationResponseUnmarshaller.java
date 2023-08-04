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

package com.aliyuncs.mns.transform.v20210319;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mns.model.v20210319.DeleteEventNotificationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteEventNotificationResponseUnmarshaller {

	public static DeleteEventNotificationResponse unmarshall(DeleteEventNotificationResponse deleteEventNotificationResponse, UnmarshallerContext _ctx) {
		
		deleteEventNotificationResponse.setRequestId(_ctx.stringValue("DeleteEventNotificationResponse.RequestId"));
		deleteEventNotificationResponse.setCode(_ctx.longValue("DeleteEventNotificationResponse.Code"));
		deleteEventNotificationResponse.setStatus(_ctx.stringValue("DeleteEventNotificationResponse.Status"));
		deleteEventNotificationResponse.setMessage(_ctx.stringValue("DeleteEventNotificationResponse.Message"));
		deleteEventNotificationResponse.setSuccess(_ctx.booleanValue("DeleteEventNotificationResponse.Success"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteEventNotificationResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("DeleteEventNotificationResponse.Data["+ i +"]"));
		}
		deleteEventNotificationResponse.setData(data);
	 
	 	return deleteEventNotificationResponse;
	}
}