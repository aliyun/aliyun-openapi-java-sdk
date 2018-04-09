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

package com.aliyuncs.cms.transform.v20180308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20180308.ListNotifyPolicyResponse;
import com.aliyuncs.cms.model.v20180308.ListNotifyPolicyResponse.NotifyPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNotifyPolicyResponseUnmarshaller {

	public static ListNotifyPolicyResponse unmarshall(ListNotifyPolicyResponse listNotifyPolicyResponse, UnmarshallerContext context) {
		
		listNotifyPolicyResponse.setCode(context.stringValue("ListNotifyPolicyResponse.code"));
		listNotifyPolicyResponse.setMessage(context.stringValue("ListNotifyPolicyResponse.message"));
		listNotifyPolicyResponse.setSuccess(context.stringValue("ListNotifyPolicyResponse.success"));
		listNotifyPolicyResponse.setTraceId(context.stringValue("ListNotifyPolicyResponse.traceId"));
		listNotifyPolicyResponse.setTotal(context.integerValue("ListNotifyPolicyResponse.total"));

		List<NotifyPolicy> notifyPolicyList = new ArrayList<NotifyPolicy>();
		for (int i = 0; i < context.lengthValue("ListNotifyPolicyResponse.NotifyPolicyList.Length"); i++) {
			NotifyPolicy notifyPolicy = new NotifyPolicy();
			notifyPolicy.setAlertName(context.stringValue("ListNotifyPolicyResponse.NotifyPolicyList["+ i +"].AlertName"));
			notifyPolicy.setDimensions(context.stringValue("ListNotifyPolicyResponse.NotifyPolicyList["+ i +"].Dimensions"));
			notifyPolicy.setType(context.stringValue("ListNotifyPolicyResponse.NotifyPolicyList["+ i +"].Type"));
			notifyPolicy.setId(context.stringValue("ListNotifyPolicyResponse.NotifyPolicyList["+ i +"].Id"));
			notifyPolicy.setStartTime(context.longValue("ListNotifyPolicyResponse.NotifyPolicyList["+ i +"].StartTime"));
			notifyPolicy.setEndTime(context.longValue("ListNotifyPolicyResponse.NotifyPolicyList["+ i +"].EndTime"));

			notifyPolicyList.add(notifyPolicy);
		}
		listNotifyPolicyResponse.setNotifyPolicyList(notifyPolicyList);
	 
	 	return listNotifyPolicyResponse;
	}
}