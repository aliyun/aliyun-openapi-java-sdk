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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.ListThingTemplatesResponse;
import com.aliyuncs.iot.model.v20180120.ListThingTemplatesResponse.CategoryInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListThingTemplatesResponseUnmarshaller {

	public static ListThingTemplatesResponse unmarshall(ListThingTemplatesResponse listThingTemplatesResponse, UnmarshallerContext _ctx) {
		
		listThingTemplatesResponse.setRequestId(_ctx.stringValue("ListThingTemplatesResponse.RequestId"));
		listThingTemplatesResponse.setSuccess(_ctx.booleanValue("ListThingTemplatesResponse.Success"));
		listThingTemplatesResponse.setCode(_ctx.stringValue("ListThingTemplatesResponse.Code"));
		listThingTemplatesResponse.setErrorMessage(_ctx.stringValue("ListThingTemplatesResponse.ErrorMessage"));

		List<CategoryInfo> data = new ArrayList<CategoryInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListThingTemplatesResponse.Data.Length"); i++) {
			CategoryInfo categoryInfo = new CategoryInfo();
			categoryInfo.setCategoryKey(_ctx.stringValue("ListThingTemplatesResponse.Data["+ i +"].CategoryKey"));
			categoryInfo.setCategoryName(_ctx.stringValue("ListThingTemplatesResponse.Data["+ i +"].CategoryName"));

			data.add(categoryInfo);
		}
		listThingTemplatesResponse.setData(data);
	 
	 	return listThingTemplatesResponse;
	}
}