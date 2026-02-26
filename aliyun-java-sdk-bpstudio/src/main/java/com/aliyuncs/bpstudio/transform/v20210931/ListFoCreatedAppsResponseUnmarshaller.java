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

package com.aliyuncs.bpstudio.transform.v20210931;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bpstudio.model.v20210931.ListFoCreatedAppsResponse;
import com.aliyuncs.bpstudio.model.v20210931.ListFoCreatedAppsResponse.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFoCreatedAppsResponseUnmarshaller {

	public static ListFoCreatedAppsResponse unmarshall(ListFoCreatedAppsResponse listFoCreatedAppsResponse, UnmarshallerContext _ctx) {
		
		listFoCreatedAppsResponse.setRequestId(_ctx.stringValue("ListFoCreatedAppsResponse.RequestId"));
		listFoCreatedAppsResponse.setMessage(_ctx.stringValue("ListFoCreatedAppsResponse.Message"));
		listFoCreatedAppsResponse.setCode(_ctx.stringValue("ListFoCreatedAppsResponse.Code"));

		List<Items> data = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("ListFoCreatedAppsResponse.Data.Length"); i++) {
			Items items = new Items();
			items.setApplicationId(_ctx.stringValue("ListFoCreatedAppsResponse.Data["+ i +"].ApplicationId"));
			items.setTitle(_ctx.stringValue("ListFoCreatedAppsResponse.Data["+ i +"].Title"));
			items.setReportUrl(_ctx.stringValue("ListFoCreatedAppsResponse.Data["+ i +"].ReportUrl"));
			items.setStatus(_ctx.stringValue("ListFoCreatedAppsResponse.Data["+ i +"].Status"));

			data.add(items);
		}
		listFoCreatedAppsResponse.setData(data);
	 
	 	return listFoCreatedAppsResponse;
	}
}