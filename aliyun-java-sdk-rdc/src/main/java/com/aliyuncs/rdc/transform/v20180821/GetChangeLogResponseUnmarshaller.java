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

	public static GetChangeLogResponse unmarshall(GetChangeLogResponse getChangeLogResponse, UnmarshallerContext _ctx) {
		
		getChangeLogResponse.setRequestId(_ctx.stringValue("GetChangeLogResponse.RequestId"));
		getChangeLogResponse.setCode(_ctx.integerValue("GetChangeLogResponse.Code"));
		getChangeLogResponse.setSuccess(_ctx.booleanValue("GetChangeLogResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetChangeLogResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setNewValue(_ctx.stringValue("GetChangeLogResponse.Data["+ i +"].NewValue"));
			dataItem.setPropertyType(_ctx.stringValue("GetChangeLogResponse.Data["+ i +"].PropertyType"));
			dataItem.setOther(_ctx.stringValue("GetChangeLogResponse.Data["+ i +"].Other"));
			dataItem.setPropertyKey(_ctx.stringValue("GetChangeLogResponse.Data["+ i +"].PropertyKey"));
			dataItem.setOldValue(_ctx.stringValue("GetChangeLogResponse.Data["+ i +"].OldValue"));
			dataItem.setTargetType(_ctx.stringValue("GetChangeLogResponse.Data["+ i +"].TargetType"));
			dataItem.setTargetId(_ctx.integerValue("GetChangeLogResponse.Data["+ i +"].TargetId"));

			data.add(dataItem);
		}
		getChangeLogResponse.setData(data);
	 
	 	return getChangeLogResponse;
	}
}