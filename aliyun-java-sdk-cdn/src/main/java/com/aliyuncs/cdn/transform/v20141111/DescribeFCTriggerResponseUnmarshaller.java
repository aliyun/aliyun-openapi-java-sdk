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

package com.aliyuncs.cdn.transform.v20141111;

import com.aliyuncs.cdn.model.v20141111.DescribeFCTriggerResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeFCTriggerResponse.FCTrigger;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFCTriggerResponseUnmarshaller {

	public static DescribeFCTriggerResponse unmarshall(DescribeFCTriggerResponse describeFCTriggerResponse, UnmarshallerContext context) {
		
		describeFCTriggerResponse.setRequestId(context.stringValue("DescribeFCTriggerResponse.RequestId"));

		FCTrigger fCTrigger = new FCTrigger();
		fCTrigger.setEventMetaName(context.stringValue("DescribeFCTriggerResponse.FCTrigger.EventMetaName"));
		fCTrigger.setEventMetaVersion(context.stringValue("DescribeFCTriggerResponse.FCTrigger.EventMetaVersion"));
		fCTrigger.setTriggerARN(context.stringValue("DescribeFCTriggerResponse.FCTrigger.TriggerARN"));
		fCTrigger.setRoleARN(context.stringValue("DescribeFCTriggerResponse.FCTrigger.RoleARN"));
		fCTrigger.setSourceArn(context.stringValue("DescribeFCTriggerResponse.FCTrigger.SourceArn"));
		fCTrigger.setNotes(context.stringValue("DescribeFCTriggerResponse.FCTrigger.Notes"));
		describeFCTriggerResponse.setFCTrigger(fCTrigger);
	 
	 	return describeFCTriggerResponse;
	}
}