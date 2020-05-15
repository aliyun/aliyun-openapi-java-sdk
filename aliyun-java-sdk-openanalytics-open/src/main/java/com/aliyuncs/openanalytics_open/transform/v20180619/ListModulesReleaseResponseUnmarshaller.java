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

package com.aliyuncs.openanalytics_open.transform.v20180619;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.openanalytics_open.model.v20180619.ListModulesReleaseResponse;
import com.aliyuncs.openanalytics_open.model.v20180619.ListModulesReleaseResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListModulesReleaseResponseUnmarshaller {

	public static ListModulesReleaseResponse unmarshall(ListModulesReleaseResponse listModulesReleaseResponse, UnmarshallerContext _ctx) {
		
		listModulesReleaseResponse.setRequestId(_ctx.stringValue("ListModulesReleaseResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListModulesReleaseResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setName(_ctx.stringValue("ListModulesReleaseResponse.Data["+ i +"].Name"));
			dataItem.setType(_ctx.stringValue("ListModulesReleaseResponse.Data["+ i +"].Type"));
			dataItem.setDescription(_ctx.stringValue("ListModulesReleaseResponse.Data["+ i +"].Description"));
			dataItem.setVersion(_ctx.stringValue("ListModulesReleaseResponse.Data["+ i +"].Version"));

			data.add(dataItem);
		}
		listModulesReleaseResponse.setData(data);
	 
	 	return listModulesReleaseResponse;
	}
}