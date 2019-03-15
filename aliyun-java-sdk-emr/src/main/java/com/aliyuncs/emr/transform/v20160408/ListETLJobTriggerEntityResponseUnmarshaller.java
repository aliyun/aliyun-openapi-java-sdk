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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListETLJobTriggerEntityResponse;
import com.aliyuncs.emr.model.v20160408.ListETLJobTriggerEntityResponse.TriggerEntity;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListETLJobTriggerEntityResponseUnmarshaller {

	public static ListETLJobTriggerEntityResponse unmarshall(ListETLJobTriggerEntityResponse listETLJobTriggerEntityResponse, UnmarshallerContext context) {
		
		listETLJobTriggerEntityResponse.setRequestId(context.stringValue("ListETLJobTriggerEntityResponse.RequestId"));

		List<TriggerEntity> triggerEntityList = new ArrayList<TriggerEntity>();
		for (int i = 0; i < context.lengthValue("ListETLJobTriggerEntityResponse.TriggerEntityList.Length"); i++) {
			TriggerEntity triggerEntity = new TriggerEntity();
			triggerEntity.setEntityType(context.stringValue("ListETLJobTriggerEntityResponse.TriggerEntityList["+ i +"].EntityType"));
			triggerEntity.setId(context.stringValue("ListETLJobTriggerEntityResponse.TriggerEntityList["+ i +"].Id"));
			triggerEntity.setName(context.stringValue("ListETLJobTriggerEntityResponse.TriggerEntityList["+ i +"].Name"));

			triggerEntityList.add(triggerEntity);
		}
		listETLJobTriggerEntityResponse.setTriggerEntityList(triggerEntityList);
	 
	 	return listETLJobTriggerEntityResponse;
	}
}