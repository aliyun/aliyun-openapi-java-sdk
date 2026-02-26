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

package com.aliyuncs.sophonsoar.transform.v20220728;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sophonsoar.model.v20220728.DescribeSophonCommandsResponse;
import com.aliyuncs.sophonsoar.model.v20220728.DescribeSophonCommandsResponse.DataItem;
import com.aliyuncs.sophonsoar.model.v20220728.DescribeSophonCommandsResponse.DataItem.ParamConfigItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSophonCommandsResponseUnmarshaller {

	public static DescribeSophonCommandsResponse unmarshall(DescribeSophonCommandsResponse describeSophonCommandsResponse, UnmarshallerContext _ctx) {
		
		describeSophonCommandsResponse.setRequestId(_ctx.stringValue("DescribeSophonCommandsResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSophonCommandsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setName(_ctx.stringValue("DescribeSophonCommandsResponse.Data["+ i +"].Name"));
			dataItem.setDisplayName(_ctx.stringValue("DescribeSophonCommandsResponse.Data["+ i +"].DisplayName"));
			dataItem.setCommandEntity(_ctx.stringValue("DescribeSophonCommandsResponse.Data["+ i +"].CommandEntity"));
			dataItem.setCommandTag(_ctx.stringValue("DescribeSophonCommandsResponse.Data["+ i +"].CommandTag"));
			dataItem.setDescription(_ctx.stringValue("DescribeSophonCommandsResponse.Data["+ i +"].Description"));
			dataItem.setActionType(_ctx.stringValue("DescribeSophonCommandsResponse.Data["+ i +"].ActionType"));
			dataItem.setTaskConfig(_ctx.stringValue("DescribeSophonCommandsResponse.Data["+ i +"].TaskConfig"));

			List<ParamConfigItem> paramConfig = new ArrayList<ParamConfigItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSophonCommandsResponse.Data["+ i +"].ParamConfig.Length"); j++) {
				ParamConfigItem paramConfigItem = new ParamConfigItem();
				paramConfigItem.setNecessary(_ctx.booleanValue("DescribeSophonCommandsResponse.Data["+ i +"].ParamConfig["+ j +"].Necessary"));
				paramConfigItem.setField(_ctx.stringValue("DescribeSophonCommandsResponse.Data["+ i +"].ParamConfig["+ j +"].Field"));
				paramConfigItem.setValue(_ctx.stringValue("DescribeSophonCommandsResponse.Data["+ i +"].ParamConfig["+ j +"].Value"));
				paramConfigItem.setCheckField(_ctx.stringValue("DescribeSophonCommandsResponse.Data["+ i +"].ParamConfig["+ j +"].CheckField"));

				paramConfig.add(paramConfigItem);
			}
			dataItem.setParamConfig(paramConfig);

			data.add(dataItem);
		}
		describeSophonCommandsResponse.setData(data);
	 
	 	return describeSophonCommandsResponse;
	}
}