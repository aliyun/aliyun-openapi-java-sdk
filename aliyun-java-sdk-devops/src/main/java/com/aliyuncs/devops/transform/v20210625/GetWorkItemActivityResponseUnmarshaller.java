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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.GetWorkItemActivityResponse;
import com.aliyuncs.devops.model.v20210625.GetWorkItemActivityResponse.Activity;
import com.aliyuncs.devops.model.v20210625.GetWorkItemActivityResponse.Activity.NewValueItem;
import com.aliyuncs.devops.model.v20210625.GetWorkItemActivityResponse.Activity.OldValueItem;
import com.aliyuncs.devops.model.v20210625.GetWorkItemActivityResponse.Activity.Property;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWorkItemActivityResponseUnmarshaller {

	public static GetWorkItemActivityResponse unmarshall(GetWorkItemActivityResponse getWorkItemActivityResponse, UnmarshallerContext _ctx) {
		
		getWorkItemActivityResponse.setRequestId(_ctx.stringValue("GetWorkItemActivityResponse.requestId"));
		getWorkItemActivityResponse.setErrorMsg(_ctx.stringValue("GetWorkItemActivityResponse.errorMsg"));
		getWorkItemActivityResponse.setErrorCode(_ctx.stringValue("GetWorkItemActivityResponse.errorCode"));
		getWorkItemActivityResponse.setSuccess(_ctx.booleanValue("GetWorkItemActivityResponse.success"));

		List<Activity> activities = new ArrayList<Activity>();
		for (int i = 0; i < _ctx.lengthValue("GetWorkItemActivityResponse.activities.Length"); i++) {
			Activity activity = new Activity();
			activity.setEventType(_ctx.stringValue("GetWorkItemActivityResponse.activities["+ i +"].eventType"));
			activity.setActionType(_ctx.stringValue("GetWorkItemActivityResponse.activities["+ i +"].actionType"));
			activity.setEventTime(_ctx.longValue("GetWorkItemActivityResponse.activities["+ i +"].eventTime"));
			activity.setResourceIdentifier(_ctx.stringValue("GetWorkItemActivityResponse.activities["+ i +"].resourceIdentifier"));
			activity.setOperator(_ctx.stringValue("GetWorkItemActivityResponse.activities["+ i +"].operator"));
			activity.setEventId(_ctx.longValue("GetWorkItemActivityResponse.activities["+ i +"].eventId"));
			activity.setParentEventId(_ctx.longValue("GetWorkItemActivityResponse.activities["+ i +"].parentEventId"));

			Property property = new Property();
			property.setPropertyName(_ctx.stringValue("GetWorkItemActivityResponse.activities["+ i +"].property.propertyName"));
			property.setPropertyType(_ctx.stringValue("GetWorkItemActivityResponse.activities["+ i +"].property.propertyType"));
			property.setPropertyIdentifier(_ctx.stringValue("GetWorkItemActivityResponse.activities["+ i +"].property.propertyIdentifier"));
			property.setDisplayName(_ctx.stringValue("GetWorkItemActivityResponse.activities["+ i +"].property.displayName"));
			activity.setProperty(property);

			List<OldValueItem> oldValue = new ArrayList<OldValueItem>();
			for (int j = 0; j < _ctx.lengthValue("GetWorkItemActivityResponse.activities["+ i +"].oldValue.Length"); j++) {
				OldValueItem oldValueItem = new OldValueItem();
				oldValueItem.setResourceType(_ctx.stringValue("GetWorkItemActivityResponse.activities["+ i +"].oldValue["+ j +"].resourceType"));
				oldValueItem.setPlainValue(_ctx.stringValue("GetWorkItemActivityResponse.activities["+ i +"].oldValue["+ j +"].plainValue"));
				oldValueItem.setDisplayValue(_ctx.stringValue("GetWorkItemActivityResponse.activities["+ i +"].oldValue["+ j +"].displayValue"));

				oldValue.add(oldValueItem);
			}
			activity.setOldValue(oldValue);

			List<NewValueItem> newValue = new ArrayList<NewValueItem>();
			for (int j = 0; j < _ctx.lengthValue("GetWorkItemActivityResponse.activities["+ i +"].newValue.Length"); j++) {
				NewValueItem newValueItem = new NewValueItem();
				newValueItem.setResourceType(_ctx.stringValue("GetWorkItemActivityResponse.activities["+ i +"].newValue["+ j +"].resourceType"));
				newValueItem.setPlainValue(_ctx.stringValue("GetWorkItemActivityResponse.activities["+ i +"].newValue["+ j +"].plainValue"));
				newValueItem.setDisplayValue(_ctx.stringValue("GetWorkItemActivityResponse.activities["+ i +"].newValue["+ j +"].displayValue"));

				newValue.add(newValueItem);
			}
			activity.setNewValue(newValue);

			activities.add(activity);
		}
		getWorkItemActivityResponse.setActivities(activities);
	 
	 	return getWorkItemActivityResponse;
	}
}