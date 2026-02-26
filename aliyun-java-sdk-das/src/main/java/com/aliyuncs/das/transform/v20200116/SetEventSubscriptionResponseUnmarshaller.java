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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.SetEventSubscriptionResponse;
import com.aliyuncs.das.model.v20200116.SetEventSubscriptionResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetEventSubscriptionResponseUnmarshaller {

	public static SetEventSubscriptionResponse unmarshall(SetEventSubscriptionResponse setEventSubscriptionResponse, UnmarshallerContext _ctx) {
		
		setEventSubscriptionResponse.setRequestId(_ctx.stringValue("SetEventSubscriptionResponse.RequestId"));
		setEventSubscriptionResponse.setMessage(_ctx.stringValue("SetEventSubscriptionResponse.Message"));
		setEventSubscriptionResponse.setCode(_ctx.stringValue("SetEventSubscriptionResponse.Code"));
		setEventSubscriptionResponse.setSuccess(_ctx.stringValue("SetEventSubscriptionResponse.Success"));

		Data data = new Data();
		data.setUserId(_ctx.stringValue("SetEventSubscriptionResponse.Data.userId"));
		data.setInstanceId(_ctx.stringValue("SetEventSubscriptionResponse.Data.instanceId"));
		data.setEventContext(_ctx.stringValue("SetEventSubscriptionResponse.Data.eventContext"));
		data.setLang(_ctx.stringValue("SetEventSubscriptionResponse.Data.lang"));
		data.setActive(_ctx.integerValue("SetEventSubscriptionResponse.Data.active"));
		data.setMinInterval(_ctx.integerValue("SetEventSubscriptionResponse.Data.minInterval"));
		data.setContactName(_ctx.stringValue("SetEventSubscriptionResponse.Data.contactName"));
		data.setContactGroupName(_ctx.stringValue("SetEventSubscriptionResponse.Data.contactGroupName"));
		data.setChannelType(_ctx.stringValue("SetEventSubscriptionResponse.Data.channelType"));
		data.setLevel(_ctx.stringValue("SetEventSubscriptionResponse.Data.level"));
		setEventSubscriptionResponse.setData(data);
	 
	 	return setEventSubscriptionResponse;
	}
}