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

import com.aliyuncs.sofa.model.v20190815.QueryRmsResourceGroupByNameResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsResourceGroupByNameResponse.Resopnse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsResourceGroupByNameResponse.Resopnse.Data;
import com.aliyuncs.sofa.model.v20190815.QueryRmsResourceGroupByNameResponse.Resopnse.Data.EntryResItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsResourceGroupByNameResponse.Resopnse.Data.LabelsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsResourceGroupByNameResponseUnmarshaller {

	public static QueryRmsResourceGroupByNameResponse unmarshall(QueryRmsResourceGroupByNameResponse queryRmsResourceGroupByNameResponse, UnmarshallerContext _ctx) {
		
		queryRmsResourceGroupByNameResponse.setRequestId(_ctx.stringValue("QueryRmsResourceGroupByNameResponse.RequestId"));
		queryRmsResourceGroupByNameResponse.setResultCode(_ctx.stringValue("QueryRmsResourceGroupByNameResponse.ResultCode"));
		queryRmsResourceGroupByNameResponse.setResultMessage(_ctx.stringValue("QueryRmsResourceGroupByNameResponse.ResultMessage"));

		Resopnse resopnse = new Resopnse();
		resopnse.setLayer(_ctx.stringValue("QueryRmsResourceGroupByNameResponse.Resopnse.Layer"));

		Data data = new Data();
		data.setGroupName(_ctx.stringValue("QueryRmsResourceGroupByNameResponse.Resopnse.Data.GroupName"));
		data.setGroupType(_ctx.stringValue("QueryRmsResourceGroupByNameResponse.Resopnse.Data.GroupType"));
		data.setOriginType(_ctx.stringValue("QueryRmsResourceGroupByNameResponse.Resopnse.Data.OriginType"));
		data.setResType(_ctx.stringValue("QueryRmsResourceGroupByNameResponse.Resopnse.Data.ResType"));
		data.setTenantId(_ctx.stringValue("QueryRmsResourceGroupByNameResponse.Resopnse.Data.TenantId"));
		data.setUtcCreated(_ctx.stringValue("QueryRmsResourceGroupByNameResponse.Resopnse.Data.UtcCreated"));
		data.setUtcModified(_ctx.stringValue("QueryRmsResourceGroupByNameResponse.Resopnse.Data.UtcModified"));
		data.setWorkspaceId(_ctx.stringValue("QueryRmsResourceGroupByNameResponse.Resopnse.Data.WorkspaceId"));

		List<EntryResItem> entryRes = new ArrayList<EntryResItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsResourceGroupByNameResponse.Resopnse.Data.EntryRes.Length"); i++) {
			EntryResItem entryResItem = new EntryResItem();
			entryResItem.setResId(_ctx.stringValue("QueryRmsResourceGroupByNameResponse.Resopnse.Data.EntryRes["+ i +"].ResId"));
			entryResItem.setResName(_ctx.stringValue("QueryRmsResourceGroupByNameResponse.Resopnse.Data.EntryRes["+ i +"].ResName"));

			entryRes.add(entryResItem);
		}
		data.setEntryRes(entryRes);

		List<LabelsItem> labels = new ArrayList<LabelsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsResourceGroupByNameResponse.Resopnse.Data.Labels.Length"); i++) {
			LabelsItem labelsItem = new LabelsItem();
			labelsItem.setResId(_ctx.stringValue("QueryRmsResourceGroupByNameResponse.Resopnse.Data.Labels["+ i +"].ResId"));
			labelsItem.setResName(_ctx.stringValue("QueryRmsResourceGroupByNameResponse.Resopnse.Data.Labels["+ i +"].ResName"));

			labels.add(labelsItem);
		}
		data.setLabels(labels);
		resopnse.setData(data);
		queryRmsResourceGroupByNameResponse.setResopnse(resopnse);
	 
	 	return queryRmsResourceGroupByNameResponse;
	}
}