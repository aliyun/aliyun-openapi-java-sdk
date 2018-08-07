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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.NotifyAddThingTopoResponse;
import com.aliyuncs.iot.model.v20180120.NotifyAddThingTopoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class NotifyAddThingTopoResponseUnmarshaller {

	public static NotifyAddThingTopoResponse unmarshall(NotifyAddThingTopoResponse notifyAddThingTopoResponse, UnmarshallerContext context) {
		
		notifyAddThingTopoResponse.setRequestId(context.stringValue("NotifyAddThingTopoResponse.RequestId"));
		notifyAddThingTopoResponse.setSuccess(context.booleanValue("NotifyAddThingTopoResponse.Success"));
		notifyAddThingTopoResponse.setErrorMessage(context.stringValue("NotifyAddThingTopoResponse.ErrorMessage"));
		notifyAddThingTopoResponse.setCode(context.stringValue("NotifyAddThingTopoResponse.Code"));

		Data data = new Data();
		data.setMessageId(context.stringValue("NotifyAddThingTopoResponse.Data.MessageId"));
		notifyAddThingTopoResponse.setData(data);
	 
	 	return notifyAddThingTopoResponse;
	}
}