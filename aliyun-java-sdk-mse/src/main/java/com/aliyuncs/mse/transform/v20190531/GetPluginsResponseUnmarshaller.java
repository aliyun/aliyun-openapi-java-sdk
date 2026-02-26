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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.GetPluginsResponse;
import com.aliyuncs.mse.model.v20190531.GetPluginsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPluginsResponseUnmarshaller {

	public static GetPluginsResponse unmarshall(GetPluginsResponse getPluginsResponse, UnmarshallerContext _ctx) {
		
		getPluginsResponse.setRequestId(_ctx.stringValue("GetPluginsResponse.RequestId"));
		getPluginsResponse.setSuccess(_ctx.booleanValue("GetPluginsResponse.Success"));
		getPluginsResponse.setCode(_ctx.integerValue("GetPluginsResponse.Code"));
		getPluginsResponse.setErrorCode(_ctx.stringValue("GetPluginsResponse.ErrorCode"));
		getPluginsResponse.setHttpStatusCode(_ctx.integerValue("GetPluginsResponse.HttpStatusCode"));
		getPluginsResponse.setMessage(_ctx.stringValue("GetPluginsResponse.Message"));
		getPluginsResponse.setDynamicCode(_ctx.stringValue("GetPluginsResponse.DynamicCode"));
		getPluginsResponse.setDynamicMessage(_ctx.stringValue("GetPluginsResponse.DynamicMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetPluginsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.longValue("GetPluginsResponse.Data["+ i +"].Id"));
			dataItem.setPrimaryUser(_ctx.stringValue("GetPluginsResponse.Data["+ i +"].PrimaryUser"));
			dataItem.setCategory(_ctx.integerValue("GetPluginsResponse.Data["+ i +"].Category"));
			dataItem.setName(_ctx.stringValue("GetPluginsResponse.Data["+ i +"].Name"));
			dataItem.setVersion(_ctx.stringValue("GetPluginsResponse.Data["+ i +"].Version"));
			dataItem.setSummary(_ctx.stringValue("GetPluginsResponse.Data["+ i +"].Summary"));
			dataItem.setPhase(_ctx.integerValue("GetPluginsResponse.Data["+ i +"].Phase"));
			dataItem.setPriority(_ctx.integerValue("GetPluginsResponse.Data["+ i +"].Priority"));
			dataItem.setConfigCheck(_ctx.stringValue("GetPluginsResponse.Data["+ i +"].ConfigCheck"));
			dataItem.setWasmLang(_ctx.integerValue("GetPluginsResponse.Data["+ i +"].WasmLang"));
			dataItem.setPublishState(_ctx.integerValue("GetPluginsResponse.Data["+ i +"].PublishState"));
			dataItem.setWasmFile(_ctx.stringValue("GetPluginsResponse.Data["+ i +"].WasmFile"));
			dataItem.setStatus(_ctx.stringValue("GetPluginsResponse.Data["+ i +"].Status"));
			dataItem.setMode(_ctx.integerValue("GetPluginsResponse.Data["+ i +"].Mode"));
			dataItem.setMaxVersion(_ctx.stringValue("GetPluginsResponse.Data["+ i +"].MaxVersion"));
			dataItem.setNewVersionPublishingFlag(_ctx.booleanValue("GetPluginsResponse.Data["+ i +"].NewVersionPublishingFlag"));

			data.add(dataItem);
		}
		getPluginsResponse.setData(data);
	 
	 	return getPluginsResponse;
	}
}