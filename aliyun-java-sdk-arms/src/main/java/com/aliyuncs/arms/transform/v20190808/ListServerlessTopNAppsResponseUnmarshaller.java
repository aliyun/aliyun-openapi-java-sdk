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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.ListServerlessTopNAppsResponse;
import com.aliyuncs.arms.model.v20190808.ListServerlessTopNAppsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServerlessTopNAppsResponseUnmarshaller {

	public static ListServerlessTopNAppsResponse unmarshall(ListServerlessTopNAppsResponse listServerlessTopNAppsResponse, UnmarshallerContext _ctx) {
		
		listServerlessTopNAppsResponse.setRequestId(_ctx.stringValue("ListServerlessTopNAppsResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListServerlessTopNAppsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setPid(_ctx.stringValue("ListServerlessTopNAppsResponse.Data["+ i +"].Pid"));
			dataItem.setName(_ctx.stringValue("ListServerlessTopNAppsResponse.Data["+ i +"].Name"));
			dataItem.setRegion(_ctx.stringValue("ListServerlessTopNAppsResponse.Data["+ i +"].Region"));
			dataItem.setRt(_ctx.floatValue("ListServerlessTopNAppsResponse.Data["+ i +"].Rt"));
			dataItem.setCount(_ctx.integerValue("ListServerlessTopNAppsResponse.Data["+ i +"].Count"));
			dataItem.setError(_ctx.integerValue("ListServerlessTopNAppsResponse.Data["+ i +"].Error"));

			data.add(dataItem);
		}
		listServerlessTopNAppsResponse.setData(data);
	 
	 	return listServerlessTopNAppsResponse;
	}
}