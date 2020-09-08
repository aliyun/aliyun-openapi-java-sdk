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

package com.aliyuncs.ahas_openapi.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ahas_openapi.model.v20190901.ListActiveAppsResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.ListActiveAppsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListActiveAppsResponseUnmarshaller {

	public static ListActiveAppsResponse unmarshall(ListActiveAppsResponse listActiveAppsResponse, UnmarshallerContext _ctx) {
		
		listActiveAppsResponse.setRequestId(_ctx.stringValue("ListActiveAppsResponse.RequestId"));
		listActiveAppsResponse.setCode(_ctx.stringValue("ListActiveAppsResponse.Code"));
		listActiveAppsResponse.setMessage(_ctx.stringValue("ListActiveAppsResponse.Message"));
		listActiveAppsResponse.setSuccess(_ctx.booleanValue("ListActiveAppsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListActiveAppsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setNamespace(_ctx.stringValue("ListActiveAppsResponse.Data["+ i +"].Namespace"));
			dataItem.setAppName(_ctx.stringValue("ListActiveAppsResponse.Data["+ i +"].AppName"));
			dataItem.setAppType(_ctx.integerValue("ListActiveAppsResponse.Data["+ i +"].AppType"));
			dataItem.setLastHealthPingTime(_ctx.longValue("ListActiveAppsResponse.Data["+ i +"].LastHealthPingTime"));
			dataItem.setAhasAppName(_ctx.stringValue("ListActiveAppsResponse.Data["+ i +"].AhasAppName"));
			dataItem.setCurrentLevel(_ctx.integerValue("ListActiveAppsResponse.Data["+ i +"].CurrentLevel"));
			dataItem.setDirtyLevel(_ctx.integerValue("ListActiveAppsResponse.Data["+ i +"].DirtyLevel"));

			data.add(dataItem);
		}
		listActiveAppsResponse.setData(data);
	 
	 	return listActiveAppsResponse;
	}
}