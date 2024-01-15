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

package com.aliyuncs.trademark.transform.v20190902;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20190902.ListClassificationConditionsResponse;
import com.aliyuncs.trademark.model.v20190902.ListClassificationConditionsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClassificationConditionsResponseUnmarshaller {

	public static ListClassificationConditionsResponse unmarshall(ListClassificationConditionsResponse listClassificationConditionsResponse, UnmarshallerContext _ctx) {
		
		listClassificationConditionsResponse.setRequestId(_ctx.stringValue("ListClassificationConditionsResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClassificationConditionsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setConditionContent(_ctx.stringValue("ListClassificationConditionsResponse.Data["+ i +"].ConditionContent"));
			dataItem.setCreateTime(_ctx.longValue("ListClassificationConditionsResponse.Data["+ i +"].CreateTime"));
			dataItem.setId(_ctx.longValue("ListClassificationConditionsResponse.Data["+ i +"].Id"));
			dataItem.setSessionId(_ctx.stringValue("ListClassificationConditionsResponse.Data["+ i +"].SessionId"));
			dataItem.setTagName(_ctx.stringValue("ListClassificationConditionsResponse.Data["+ i +"].TagName"));
			dataItem.setType(_ctx.longValue("ListClassificationConditionsResponse.Data["+ i +"].Type"));
			dataItem.setUmid(_ctx.stringValue("ListClassificationConditionsResponse.Data["+ i +"].Umid"));
			dataItem.setUpdateTime(_ctx.longValue("ListClassificationConditionsResponse.Data["+ i +"].UpdateTime"));
			dataItem.setUserId(_ctx.longValue("ListClassificationConditionsResponse.Data["+ i +"].UserId"));

			data.add(dataItem);
		}
		listClassificationConditionsResponse.setData(data);
	 
	 	return listClassificationConditionsResponse;
	}
}