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

package com.aliyuncs.scsp.transform.v20200702;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scsp.model.v20200702.GetEntityTagRelationResponse;
import com.aliyuncs.scsp.model.v20200702.GetEntityTagRelationResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEntityTagRelationResponseUnmarshaller {

	public static GetEntityTagRelationResponse unmarshall(GetEntityTagRelationResponse getEntityTagRelationResponse, UnmarshallerContext _ctx) {
		
		getEntityTagRelationResponse.setRequestId(_ctx.stringValue("GetEntityTagRelationResponse.RequestId"));
		getEntityTagRelationResponse.setCode(_ctx.stringValue("GetEntityTagRelationResponse.Code"));
		getEntityTagRelationResponse.setMessage(_ctx.stringValue("GetEntityTagRelationResponse.Message"));
		getEntityTagRelationResponse.setSuccess(_ctx.booleanValue("GetEntityTagRelationResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetEntityTagRelationResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTagGroupName(_ctx.stringValue("GetEntityTagRelationResponse.Data["+ i +"].TagGroupName"));
			dataItem.setTagGroupCode(_ctx.stringValue("GetEntityTagRelationResponse.Data["+ i +"].TagGroupCode"));
			dataItem.setTagCode(_ctx.stringValue("GetEntityTagRelationResponse.Data["+ i +"].TagCode"));
			dataItem.setTagName(_ctx.stringValue("GetEntityTagRelationResponse.Data["+ i +"].TagName"));
			dataItem.setEntityId(_ctx.stringValue("GetEntityTagRelationResponse.Data["+ i +"].EntityId"));
			dataItem.setEntityType(_ctx.stringValue("GetEntityTagRelationResponse.Data["+ i +"].EntityType"));

			data.add(dataItem);
		}
		getEntityTagRelationResponse.setData(data);
	 
	 	return getEntityTagRelationResponse;
	}
}