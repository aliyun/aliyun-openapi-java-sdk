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

import com.aliyuncs.sofa.model.v20190815.SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse;
import com.aliyuncs.sofa.model.v20190815.SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponseUnmarshaller {

	public static SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse unmarshall(SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse syncLinkefabricFabricMsgcloudconfigthroughdevstageResponse, UnmarshallerContext _ctx) {
		
		syncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.setRequestId(_ctx.stringValue("SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.RequestId"));
		syncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.setResultCode(_ctx.stringValue("SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.ResultCode"));
		syncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.setResultMessage(_ctx.stringValue("SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.ResultMessage"));
		syncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.setMessage(_ctx.stringValue("SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.Message"));
		syncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.setResponseStatusCode(_ctx.longValue("SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.ResponseStatusCode"));
		syncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.setSuccess(_ctx.booleanValue("SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAction(_ctx.stringValue("SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.Data["+ i +"].Action"));
			dataItem.setDescription(_ctx.stringValue("SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.Data["+ i +"].Description"));
			dataItem.setDevStage(_ctx.stringValue("SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.Data["+ i +"].DevStage"));
			dataItem.setEnv(_ctx.stringValue("SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.Data["+ i +"].Env"));
			dataItem.setExtraInfo(_ctx.stringValue("SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.Data["+ i +"].ExtraInfo"));
			dataItem.setId(_ctx.longValue("SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.Data["+ i +"].Id"));
			dataItem.setKey(_ctx.stringValue("SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.Data["+ i +"].Key"));
			dataItem.setStatus(_ctx.stringValue("SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.Data["+ i +"].Status"));
			dataItem.setSubType(_ctx.stringValue("SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.Data["+ i +"].SubType"));
			dataItem.setTagType(_ctx.stringValue("SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.Data["+ i +"].TagType"));
			dataItem.setType(_ctx.stringValue("SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.Data["+ i +"].Type"));
			dataItem.setValue(_ctx.stringValue("SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.Data["+ i +"].Value"));
			dataItem.setVersionId(_ctx.longValue("SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.Data["+ i +"].VersionId"));

			data.add(dataItem);
		}
		syncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.setData(data);
	 
	 	return syncLinkefabricFabricMsgcloudconfigthroughdevstageResponse;
	}
}