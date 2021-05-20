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

import com.aliyuncs.scsp.model.v20200702.GetTagListResponse;
import com.aliyuncs.scsp.model.v20200702.GetTagListResponse.DataItem;
import com.aliyuncs.scsp.model.v20200702.GetTagListResponse.DataItem.TagValuesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTagListResponseUnmarshaller {

	public static GetTagListResponse unmarshall(GetTagListResponse getTagListResponse, UnmarshallerContext _ctx) {
		
		getTagListResponse.setRequestId(_ctx.stringValue("GetTagListResponse.RequestId"));
		getTagListResponse.setMessage(_ctx.stringValue("GetTagListResponse.Message"));
		getTagListResponse.setCode(_ctx.stringValue("GetTagListResponse.Code"));
		getTagListResponse.setSuccess(_ctx.booleanValue("GetTagListResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTagListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setScenarioCode(_ctx.stringValue("GetTagListResponse.Data["+ i +"].ScenarioCode"));
			dataItem.setTagGroupCode(_ctx.stringValue("GetTagListResponse.Data["+ i +"].TagGroupCode"));
			dataItem.setTagGroupName(_ctx.stringValue("GetTagListResponse.Data["+ i +"].TagGroupName"));

			List<TagValuesItem> tagValues = new ArrayList<TagValuesItem>();
			for (int j = 0; j < _ctx.lengthValue("GetTagListResponse.Data["+ i +"].TagValues.Length"); j++) {
				TagValuesItem tagValuesItem = new TagValuesItem();
				tagValuesItem.setStatus(_ctx.stringValue("GetTagListResponse.Data["+ i +"].TagValues["+ j +"].Status"));
				tagValuesItem.setDescription(_ctx.stringValue("GetTagListResponse.Data["+ i +"].TagValues["+ j +"].Description"));
				tagValuesItem.setTagName(_ctx.stringValue("GetTagListResponse.Data["+ i +"].TagValues["+ j +"].TagName"));
				tagValuesItem.setTagGroupCode(_ctx.stringValue("GetTagListResponse.Data["+ i +"].TagValues["+ j +"].TagGroupCode"));
				tagValuesItem.setTagCode(_ctx.stringValue("GetTagListResponse.Data["+ i +"].TagValues["+ j +"].TagCode"));
				tagValuesItem.setTagGroupName(_ctx.stringValue("GetTagListResponse.Data["+ i +"].TagValues["+ j +"].TagGroupName"));
				tagValuesItem.setEntityRelationNumber(_ctx.stringValue("GetTagListResponse.Data["+ i +"].TagValues["+ j +"].EntityRelationNumber"));

				tagValues.add(tagValuesItem);
			}
			dataItem.setTagValues(tagValues);

			data.add(dataItem);
		}
		getTagListResponse.setData(data);
	 
	 	return getTagListResponse;
	}
}