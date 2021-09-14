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

package com.aliyuncs.emas_dmp.transform.v20210402;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emas_dmp.model.v20210402.ListAppResponse;
import com.aliyuncs.emas_dmp.model.v20210402.ListAppResponse.Data;
import com.aliyuncs.emas_dmp.model.v20210402.ListAppResponse.Data.Apps;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppResponseUnmarshaller {

	public static ListAppResponse unmarshall(ListAppResponse listAppResponse, UnmarshallerContext _ctx) {
		
		listAppResponse.setRequestId(_ctx.stringValue("ListAppResponse.RequestId"));

		Data data = new Data();
		data.setPageNum(_ctx.integerValue("ListAppResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("ListAppResponse.Data.PageSize"));
		data.setTotalPages(_ctx.integerValue("ListAppResponse.Data.TotalPages"));
		data.setTotalElements(_ctx.integerValue("ListAppResponse.Data.TotalElements"));

		List<Apps> appList = new ArrayList<Apps>();
		for (int i = 0; i < _ctx.lengthValue("ListAppResponse.Data.AppList.Length"); i++) {
			Apps apps = new Apps();
			apps.setName(_ctx.stringValue("ListAppResponse.Data.AppList["+ i +"].Name"));
			apps.setUsageRange(_ctx.stringValue("ListAppResponse.Data.AppList["+ i +"].UsageRange"));
			apps.set_Package(_ctx.stringValue("ListAppResponse.Data.AppList["+ i +"].Package"));
			apps.setParentType(_ctx.stringValue("ListAppResponse.Data.AppList["+ i +"].ParentType"));
			apps.setSource(_ctx.stringValue("ListAppResponse.Data.AppList["+ i +"].Source"));

			List<String> subType = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListAppResponse.Data.AppList["+ i +"].SubType.Length"); j++) {
				subType.add(_ctx.stringValue("ListAppResponse.Data.AppList["+ i +"].SubType["+ j +"]"));
			}
			apps.setSubType(subType);

			appList.add(apps);
		}
		data.setAppList(appList);
		listAppResponse.setData(data);
	 
	 	return listAppResponse;
	}
}