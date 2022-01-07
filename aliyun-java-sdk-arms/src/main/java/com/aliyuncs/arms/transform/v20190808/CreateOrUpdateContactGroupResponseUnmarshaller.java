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

package com.aliyuncs.arms.transform.v20190808;

import com.aliyuncs.arms.model.v20190808.CreateOrUpdateContactGroupResponse;
import com.aliyuncs.arms.model.v20190808.CreateOrUpdateContactGroupResponse.AlertContactGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOrUpdateContactGroupResponseUnmarshaller {

	public static CreateOrUpdateContactGroupResponse unmarshall(CreateOrUpdateContactGroupResponse createOrUpdateContactGroupResponse, UnmarshallerContext _ctx) {
		
		createOrUpdateContactGroupResponse.setRequestId(_ctx.stringValue("CreateOrUpdateContactGroupResponse.RequestId"));

		AlertContactGroup alertContactGroup = new AlertContactGroup();
		alertContactGroup.setContactGroupId(_ctx.floatValue("CreateOrUpdateContactGroupResponse.AlertContactGroup.ContactGroupId"));
		alertContactGroup.setContactGroupName(_ctx.stringValue("CreateOrUpdateContactGroupResponse.AlertContactGroup.ContactGroupName"));
		alertContactGroup.setContactIds(_ctx.stringValue("CreateOrUpdateContactGroupResponse.AlertContactGroup.ContactIds"));
		createOrUpdateContactGroupResponse.setAlertContactGroup(alertContactGroup);
	 
	 	return createOrUpdateContactGroupResponse;
	}
}