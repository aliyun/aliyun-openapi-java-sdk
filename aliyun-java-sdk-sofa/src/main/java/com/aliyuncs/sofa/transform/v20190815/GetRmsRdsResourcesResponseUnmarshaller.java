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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetRmsRdsResourcesResponse;
import com.aliyuncs.sofa.model.v20190815.GetRmsRdsResourcesResponse.Response;
import com.aliyuncs.sofa.model.v20190815.GetRmsRdsResourcesResponse.Response.EntitiesItem;
import com.aliyuncs.sofa.model.v20190815.GetRmsRdsResourcesResponse.Response.EntitiesItem.Data;
import com.aliyuncs.sofa.model.v20190815.GetRmsRdsResourcesResponse.Response.MetaItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRmsRdsResourcesResponseUnmarshaller {

	public static GetRmsRdsResourcesResponse unmarshall(GetRmsRdsResourcesResponse getRmsRdsResourcesResponse, UnmarshallerContext _ctx) {
		
		getRmsRdsResourcesResponse.setRequestId(_ctx.stringValue("GetRmsRdsResourcesResponse.RequestId"));
		getRmsRdsResourcesResponse.setResultCode(_ctx.stringValue("GetRmsRdsResourcesResponse.ResultCode"));
		getRmsRdsResourcesResponse.setResultMessage(_ctx.stringValue("GetRmsRdsResourcesResponse.ResultMessage"));

		Response response = new Response();
		response.setErrCode(_ctx.stringValue("GetRmsRdsResourcesResponse.Response.ErrCode"));
		response.setErrMsg(_ctx.stringValue("GetRmsRdsResourcesResponse.Response.ErrMsg"));
		response.setErrResolution(_ctx.stringValue("GetRmsRdsResourcesResponse.Response.ErrResolution"));

		List<EntitiesItem> entities = new ArrayList<EntitiesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRmsRdsResourcesResponse.Response.Entities.Length"); i++) {
			EntitiesItem entitiesItem = new EntitiesItem();

			Data data = new Data();
			data.setAlertState(_ctx.stringValue("GetRmsRdsResourcesResponse.Response.Entities["+ i +"].Data.AlertState"));
			data.setCreated(_ctx.stringValue("GetRmsRdsResourcesResponse.Response.Entities["+ i +"].Data.Created"));
			data.setCreatedDateTime(_ctx.longValue("GetRmsRdsResourcesResponse.Response.Entities["+ i +"].Data.CreatedDateTime"));
			data.setDatabaseType(_ctx.stringValue("GetRmsRdsResourcesResponse.Response.Entities["+ i +"].Data.DatabaseType"));
			data.setDbId(_ctx.stringValue("GetRmsRdsResourcesResponse.Response.Entities["+ i +"].Data.DbId"));
			data.setInstanceType(_ctx.stringValue("GetRmsRdsResourcesResponse.Response.Entities["+ i +"].Data.InstanceType"));
			data.setResourceName(_ctx.stringValue("GetRmsRdsResourcesResponse.Response.Entities["+ i +"].Data.ResourceName"));
			data.setState(_ctx.stringValue("GetRmsRdsResourcesResponse.Response.Entities["+ i +"].Data.State"));

			List<String> itemTypeConfig = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetRmsRdsResourcesResponse.Response.Entities["+ i +"].Data.ItemTypeConfig.Length"); j++) {
				itemTypeConfig.add(_ctx.stringValue("GetRmsRdsResourcesResponse.Response.Entities["+ i +"].Data.ItemTypeConfig["+ j +"]"));
			}
			data.setItemTypeConfig(itemTypeConfig);

			List<String> itemTypeNoneConfig = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetRmsRdsResourcesResponse.Response.Entities["+ i +"].Data.ItemTypeNoneConfig.Length"); j++) {
				itemTypeNoneConfig.add(_ctx.stringValue("GetRmsRdsResourcesResponse.Response.Entities["+ i +"].Data.ItemTypeNoneConfig["+ j +"]"));
			}
			data.setItemTypeNoneConfig(itemTypeNoneConfig);
			entitiesItem.setData(data);

			entities.add(entitiesItem);
		}
		response.setEntities(entities);

		List<MetaItem> meta = new ArrayList<MetaItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRmsRdsResourcesResponse.Response.Meta.Length"); i++) {
			MetaItem metaItem = new MetaItem();
			metaItem.setKey(_ctx.stringValue("GetRmsRdsResourcesResponse.Response.Meta["+ i +"].Key"));
			metaItem.setValue(_ctx.stringValue("GetRmsRdsResourcesResponse.Response.Meta["+ i +"].Value"));

			meta.add(metaItem);
		}
		response.setMeta(meta);
		getRmsRdsResourcesResponse.setResponse(response);
	 
	 	return getRmsRdsResourcesResponse;
	}
}