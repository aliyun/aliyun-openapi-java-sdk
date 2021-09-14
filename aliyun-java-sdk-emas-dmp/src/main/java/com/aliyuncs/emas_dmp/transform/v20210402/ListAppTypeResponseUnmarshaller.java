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

import com.aliyuncs.emas_dmp.model.v20210402.ListAppTypeResponse;
import com.aliyuncs.emas_dmp.model.v20210402.ListAppTypeResponse.Data;
import com.aliyuncs.emas_dmp.model.v20210402.ListAppTypeResponse.Data.AppTypes;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppTypeResponseUnmarshaller {

	public static ListAppTypeResponse unmarshall(ListAppTypeResponse listAppTypeResponse, UnmarshallerContext _ctx) {
		
		listAppTypeResponse.setRequestId(_ctx.stringValue("ListAppTypeResponse.RequestId"));

		Data data = new Data();

		List<AppTypes> appTypeList = new ArrayList<AppTypes>();
		for (int i = 0; i < _ctx.lengthValue("ListAppTypeResponse.Data.AppTypeList.Length"); i++) {
			AppTypes appTypes = new AppTypes();
			appTypes.setName(_ctx.stringValue("ListAppTypeResponse.Data.AppTypeList["+ i +"].Name"));

			List<String> subTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListAppTypeResponse.Data.AppTypeList["+ i +"].SubTypes.Length"); j++) {
				subTypes.add(_ctx.stringValue("ListAppTypeResponse.Data.AppTypeList["+ i +"].SubTypes["+ j +"]"));
			}
			appTypes.setSubTypes(subTypes);

			appTypeList.add(appTypes);
		}
		data.setAppTypeList(appTypeList);
		listAppTypeResponse.setData(data);
	 
	 	return listAppTypeResponse;
	}
}