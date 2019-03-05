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

package com.aliyuncs.rdc.transform.v20180821;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rdc.model.v20180821.GetChangeLogResponse;
import com.aliyuncs.rdc.model.v20180821.GetChangeLogResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetChangeLogResponseUnmarshaller {

	public static GetChangeLogResponse unmarshall(GetChangeLogResponse getChangeLogResponse, UnmarshallerContext context) {
		
		getChangeLogResponse.setRequestId(context.stringValue("GetChangeLogResponse.RequestId"));
		getChangeLogResponse.setCode(context.integerValue("GetChangeLogResponse.Code"));
		getChangeLogResponse.setSuccess(context.booleanValue("GetChangeLogResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < context.lengthValue("GetChangeLogResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setNewValue(context.stringValue("GetChangeLogResponse.Data["+ i +"].NewValue"));
			dataItem.setPropertyType(context.stringValue("GetChangeLogResponse.Data["+ i +"].PropertyType"));
			dataItem.setOther(context.stringValue("GetChangeLogResponse.Data["+ i +"].Other"));
			dataItem.setPropertyKey(context.stringValue("GetChangeLogResponse.Data["+ i +"].PropertyKey"));
			dataItem.setOldValue(context.stringValue("GetChangeLogResponse.Data["+ i +"].OldValue"));
			dataItem.setTargetType(context.stringValue("GetChangeLogResponse.Data["+ i +"].TargetType"));
			dataItem.setTargetId(context.integerValue("GetChangeLogResponse.Data["+ i +"].TargetId"));

			data.add(dataItem);
		}
		getChangeLogResponse.setData(data);
	 
	 	return getChangeLogResponse;
	}
}