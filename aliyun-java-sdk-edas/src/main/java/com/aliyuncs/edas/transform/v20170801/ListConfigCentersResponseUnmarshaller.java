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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ListConfigCentersResponse;
import com.aliyuncs.edas.model.v20170801.ListConfigCentersResponse.ListConfigCenters;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConfigCentersResponseUnmarshaller {

	public static ListConfigCentersResponse unmarshall(ListConfigCentersResponse listConfigCentersResponse, UnmarshallerContext _ctx) {
		
		listConfigCentersResponse.setRequestId(_ctx.stringValue("ListConfigCentersResponse.RequestId"));
		listConfigCentersResponse.setCode(_ctx.integerValue("ListConfigCentersResponse.Code"));
		listConfigCentersResponse.setMessage(_ctx.stringValue("ListConfigCentersResponse.Message"));

		List<ListConfigCenters> configCentersList = new ArrayList<ListConfigCenters>();
		for (int i = 0; i < _ctx.lengthValue("ListConfigCentersResponse.ConfigCentersList.Length"); i++) {
			ListConfigCenters listConfigCenters = new ListConfigCenters();
			listConfigCenters.setAppName(_ctx.stringValue("ListConfigCentersResponse.ConfigCentersList["+ i +"].AppName"));
			listConfigCenters.setDataId(_ctx.stringValue("ListConfigCentersResponse.ConfigCentersList["+ i +"].DataId"));
			listConfigCenters.setGroup(_ctx.stringValue("ListConfigCentersResponse.ConfigCentersList["+ i +"].Group"));
			listConfigCenters.setId(_ctx.stringValue("ListConfigCentersResponse.ConfigCentersList["+ i +"].Id"));

			configCentersList.add(listConfigCenters);
		}
		listConfigCentersResponse.setConfigCentersList(configCentersList);
	 
	 	return listConfigCentersResponse;
	}
}