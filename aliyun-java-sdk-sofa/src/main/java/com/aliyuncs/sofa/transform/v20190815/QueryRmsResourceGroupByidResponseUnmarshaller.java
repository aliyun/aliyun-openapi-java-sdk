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

import com.aliyuncs.sofa.model.v20190815.QueryRmsResourceGroupByidResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsResourceGroupByidResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsResourceGroupByidResponse.Response.Data;
import com.aliyuncs.sofa.model.v20190815.QueryRmsResourceGroupByidResponse.Response.Data.EntryResItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsResourceGroupByidResponse.Response.Data.LabelsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsResourceGroupByidResponseUnmarshaller {

	public static QueryRmsResourceGroupByidResponse unmarshall(QueryRmsResourceGroupByidResponse queryRmsResourceGroupByidResponse, UnmarshallerContext _ctx) {
		
		queryRmsResourceGroupByidResponse.setRequestId(_ctx.stringValue("QueryRmsResourceGroupByidResponse.RequestId"));
		queryRmsResourceGroupByidResponse.setResultCode(_ctx.stringValue("QueryRmsResourceGroupByidResponse.ResultCode"));
		queryRmsResourceGroupByidResponse.setResultMessage(_ctx.stringValue("QueryRmsResourceGroupByidResponse.ResultMessage"));

		Response response = new Response();
		response.setLayer(_ctx.stringValue("QueryRmsResourceGroupByidResponse.Response.Layer"));

		Data data = new Data();
		data.setGroupName(_ctx.stringValue("QueryRmsResourceGroupByidResponse.Response.Data.GroupName"));
		data.setGroupType(_ctx.stringValue("QueryRmsResourceGroupByidResponse.Response.Data.GroupType"));
		data.setOriginType(_ctx.stringValue("QueryRmsResourceGroupByidResponse.Response.Data.OriginType"));
		data.setResType(_ctx.stringValue("QueryRmsResourceGroupByidResponse.Response.Data.ResType"));
		data.setTenantId(_ctx.stringValue("QueryRmsResourceGroupByidResponse.Response.Data.TenantId"));
		data.setUtcCreated(_ctx.stringValue("QueryRmsResourceGroupByidResponse.Response.Data.UtcCreated"));
		data.setUtcModified(_ctx.stringValue("QueryRmsResourceGroupByidResponse.Response.Data.UtcModified"));
		data.setWorkspaceId(_ctx.stringValue("QueryRmsResourceGroupByidResponse.Response.Data.WorkspaceId"));

		List<EntryResItem> entryRes = new ArrayList<EntryResItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsResourceGroupByidResponse.Response.Data.EntryRes.Length"); i++) {
			EntryResItem entryResItem = new EntryResItem();
			entryResItem.setResId(_ctx.stringValue("QueryRmsResourceGroupByidResponse.Response.Data.EntryRes["+ i +"].ResId"));
			entryResItem.setResName(_ctx.stringValue("QueryRmsResourceGroupByidResponse.Response.Data.EntryRes["+ i +"].ResName"));

			entryRes.add(entryResItem);
		}
		data.setEntryRes(entryRes);

		List<LabelsItem> labels = new ArrayList<LabelsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsResourceGroupByidResponse.Response.Data.Labels.Length"); i++) {
			LabelsItem labelsItem = new LabelsItem();
			labelsItem.setResId(_ctx.stringValue("QueryRmsResourceGroupByidResponse.Response.Data.Labels["+ i +"].ResId"));
			labelsItem.setResName(_ctx.stringValue("QueryRmsResourceGroupByidResponse.Response.Data.Labels["+ i +"].ResName"));

			labels.add(labelsItem);
		}
		data.setLabels(labels);
		response.setData(data);
		queryRmsResourceGroupByidResponse.setResponse(response);
	 
	 	return queryRmsResourceGroupByidResponse;
	}
}