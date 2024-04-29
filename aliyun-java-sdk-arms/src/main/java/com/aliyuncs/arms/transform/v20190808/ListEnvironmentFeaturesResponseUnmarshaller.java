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

import com.aliyuncs.arms.model.v20190808.ListEnvironmentFeaturesResponse;
import com.aliyuncs.arms.model.v20190808.ListEnvironmentFeaturesResponse.DataItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEnvironmentFeaturesResponseUnmarshaller {

	public static ListEnvironmentFeaturesResponse unmarshall(ListEnvironmentFeaturesResponse listEnvironmentFeaturesResponse, UnmarshallerContext _ctx) {
		
		listEnvironmentFeaturesResponse.setRequestId(_ctx.stringValue("ListEnvironmentFeaturesResponse.RequestId"));
		listEnvironmentFeaturesResponse.setCode(_ctx.integerValue("ListEnvironmentFeaturesResponse.Code"));
		listEnvironmentFeaturesResponse.setMessage(_ctx.stringValue("ListEnvironmentFeaturesResponse.Message"));
		listEnvironmentFeaturesResponse.setSuccess(_ctx.booleanValue("ListEnvironmentFeaturesResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEnvironmentFeaturesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setConfig(_ctx.mapValue("ListEnvironmentFeaturesResponse.Data["+ i +"].Config"));
			dataItem.setDescription(_ctx.stringValue("ListEnvironmentFeaturesResponse.Data["+ i +"].Description"));
			dataItem.setEnvironmentId(_ctx.stringValue("ListEnvironmentFeaturesResponse.Data["+ i +"].EnvironmentId"));
			dataItem.setLanguage(_ctx.stringValue("ListEnvironmentFeaturesResponse.Data["+ i +"].Language"));
			dataItem.setLatestVersion(_ctx.stringValue("ListEnvironmentFeaturesResponse.Data["+ i +"].LatestVersion"));
			dataItem.setName(_ctx.stringValue("ListEnvironmentFeaturesResponse.Data["+ i +"].Name"));
			dataItem.setStatus(_ctx.stringValue("ListEnvironmentFeaturesResponse.Data["+ i +"].Status"));
			dataItem.setVersion(_ctx.stringValue("ListEnvironmentFeaturesResponse.Data["+ i +"].Version"));
			dataItem.setAlias(_ctx.stringValue("ListEnvironmentFeaturesResponse.Data["+ i +"].Alias"));
			dataItem.setIcon(_ctx.stringValue("ListEnvironmentFeaturesResponse.Data["+ i +"].Icon"));
			dataItem.setManaged(_ctx.booleanValue("ListEnvironmentFeaturesResponse.Data["+ i +"].Managed"));

			data.add(dataItem);
		}
		listEnvironmentFeaturesResponse.setData(data);
	 
	 	return listEnvironmentFeaturesResponse;
	}
}