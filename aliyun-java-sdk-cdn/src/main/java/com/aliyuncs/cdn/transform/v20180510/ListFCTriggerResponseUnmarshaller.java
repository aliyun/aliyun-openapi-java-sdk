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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.ListFCTriggerResponse;
import com.aliyuncs.cdn.model.v20180510.ListFCTriggerResponse.FCTrigger;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFCTriggerResponseUnmarshaller {

	public static ListFCTriggerResponse unmarshall(ListFCTriggerResponse listFCTriggerResponse, UnmarshallerContext context) {
		
		listFCTriggerResponse.setRequestId(context.stringValue("ListFCTriggerResponse.RequestId"));

		List<FCTrigger> fCTriggers = new ArrayList<FCTrigger>();
		for (int i = 0; i < context.lengthValue("ListFCTriggerResponse.FCTriggers.Length"); i++) {
			FCTrigger fCTrigger = new FCTrigger();
			fCTrigger.setEventMetaName(context.stringValue("ListFCTriggerResponse.FCTriggers["+ i +"].EventMetaName"));
			fCTrigger.setEventMetaVersion(context.stringValue("ListFCTriggerResponse.FCTriggers["+ i +"].EventMetaVersion"));
			fCTrigger.setTriggerARN(context.stringValue("ListFCTriggerResponse.FCTriggers["+ i +"].TriggerARN"));
			fCTrigger.setRoleARN(context.stringValue("ListFCTriggerResponse.FCTriggers["+ i +"].RoleARN"));
			fCTrigger.setSourceArn(context.stringValue("ListFCTriggerResponse.FCTriggers["+ i +"].SourceArn"));
			fCTrigger.setNotes(context.stringValue("ListFCTriggerResponse.FCTriggers["+ i +"].Notes"));

			fCTriggers.add(fCTrigger);
		}
		listFCTriggerResponse.setFCTriggers(fCTriggers);
	 
	 	return listFCTriggerResponse;
	}
}