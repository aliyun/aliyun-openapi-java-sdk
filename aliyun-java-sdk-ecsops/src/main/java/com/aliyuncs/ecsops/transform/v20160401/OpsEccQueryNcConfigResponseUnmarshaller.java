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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsEccQueryNcConfigResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsEccQueryNcConfigResponse.Data;
import com.aliyuncs.ecsops.model.v20160401.OpsEccQueryNcConfigResponse.Data.ItemModelsItem;
import com.aliyuncs.ecsops.model.v20160401.OpsEccQueryNcConfigResponse.Data.NcModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsEccQueryNcConfigResponseUnmarshaller {

	public static OpsEccQueryNcConfigResponse unmarshall(OpsEccQueryNcConfigResponse opsEccQueryNcConfigResponse, UnmarshallerContext _ctx) {
		
		opsEccQueryNcConfigResponse.setRequestId(_ctx.stringValue("OpsEccQueryNcConfigResponse.RequestId"));

		Data data = new Data();

		NcModel ncModel = new NcModel();
		ncModel.setNcIp(_ctx.stringValue("OpsEccQueryNcConfigResponse.Data.NcModel.NcIp"));
		ncModel.setSN(_ctx.stringValue("OpsEccQueryNcConfigResponse.Data.NcModel.SN"));
		data.setNcModel(ncModel);

		List<ItemModelsItem> itemModels = new ArrayList<ItemModelsItem>();
		for (int i = 0; i < _ctx.lengthValue("OpsEccQueryNcConfigResponse.Data.ItemModels.Length"); i++) {
			ItemModelsItem itemModelsItem = new ItemModelsItem();
			itemModelsItem.setCategory(_ctx.stringValue("OpsEccQueryNcConfigResponse.Data.ItemModels["+ i +"].Category"));
			itemModelsItem.setName(_ctx.stringValue("OpsEccQueryNcConfigResponse.Data.ItemModels["+ i +"].Name"));
			itemModelsItem.setValue(_ctx.stringValue("OpsEccQueryNcConfigResponse.Data.ItemModels["+ i +"].Value"));

			itemModels.add(itemModelsItem);
		}
		data.setItemModels(itemModels);
		opsEccQueryNcConfigResponse.setData(data);
	 
	 	return opsEccQueryNcConfigResponse;
	}
}