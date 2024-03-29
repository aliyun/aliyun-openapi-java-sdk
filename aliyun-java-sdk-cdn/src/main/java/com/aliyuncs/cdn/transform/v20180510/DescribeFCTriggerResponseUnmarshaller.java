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

import com.aliyuncs.cdn.model.v20180510.DescribeFCTriggerResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeFCTriggerResponse.FCTrigger;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFCTriggerResponseUnmarshaller {

	public static DescribeFCTriggerResponse unmarshall(DescribeFCTriggerResponse describeFCTriggerResponse, UnmarshallerContext _ctx) {
		
		describeFCTriggerResponse.setRequestId(_ctx.stringValue("DescribeFCTriggerResponse.RequestId"));

		FCTrigger fCTrigger = new FCTrigger();
		fCTrigger.setTriggerARN(_ctx.stringValue("DescribeFCTriggerResponse.FCTrigger.TriggerARN"));
		fCTrigger.setRoleARN(_ctx.stringValue("DescribeFCTriggerResponse.FCTrigger.RoleARN"));
		fCTrigger.setSourceArn(_ctx.stringValue("DescribeFCTriggerResponse.FCTrigger.SourceArn"));
		fCTrigger.setNotes(_ctx.stringValue("DescribeFCTriggerResponse.FCTrigger.Notes"));
		fCTrigger.setEventMetaName(_ctx.stringValue("DescribeFCTriggerResponse.FCTrigger.EventMetaName"));
		fCTrigger.setEventMetaVersion(_ctx.stringValue("DescribeFCTriggerResponse.FCTrigger.EventMetaVersion"));
		describeFCTriggerResponse.setFCTrigger(fCTrigger);
	 
	 	return describeFCTriggerResponse;
	}
}