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

package com.aliyuncs.tdsr.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.tdsr.model.v20200101.ListScenesResponse;
import com.aliyuncs.tdsr.model.v20200101.ListScenesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListScenesResponseUnmarshaller {

	public static ListScenesResponse unmarshall(ListScenesResponse listScenesResponse, UnmarshallerContext _ctx) {
		
		listScenesResponse.setRequestId(_ctx.stringValue("ListScenesResponse.RequestId"));
		listScenesResponse.setSuccess(_ctx.booleanValue("ListScenesResponse.Success"));
		listScenesResponse.setErrMessage(_ctx.stringValue("ListScenesResponse.ErrMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListScenesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSceneId(_ctx.stringValue("ListScenesResponse.Data["+ i +"].SceneId"));

			data.add(dataItem);
		}
		listScenesResponse.setData(data);
	 
	 	return listScenesResponse;
	}
}