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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetClriskSubscriberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClriskSubscriberResponseUnmarshaller {

	public static GetClriskSubscriberResponse unmarshall(GetClriskSubscriberResponse getClriskSubscriberResponse, UnmarshallerContext _ctx) {
		
		getClriskSubscriberResponse.setRequestId(_ctx.stringValue("GetClriskSubscriberResponse.RequestId"));
		getClriskSubscriberResponse.setResultCode(_ctx.stringValue("GetClriskSubscriberResponse.ResultCode"));
		getClriskSubscriberResponse.setResultMessage(_ctx.stringValue("GetClriskSubscriberResponse.ResultMessage"));
		getClriskSubscriberResponse.setCurrentUserName(_ctx.stringValue("GetClriskSubscriberResponse.CurrentUserName"));
		getClriskSubscriberResponse.setSubscribe(_ctx.booleanValue("GetClriskSubscriberResponse.Subscribe"));

		List<String> subscriberUsers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetClriskSubscriberResponse.SubscriberUsers.Length"); i++) {
			subscriberUsers.add(_ctx.stringValue("GetClriskSubscriberResponse.SubscriberUsers["+ i +"]"));
		}
		getClriskSubscriberResponse.setSubscriberUsers(subscriberUsers);
	 
	 	return getClriskSubscriberResponse;
	}
}