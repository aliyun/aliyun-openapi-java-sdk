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

package com.aliyuncs.avatar.transform.v20220130;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.avatar.model.v20220130.QueryAvatarListResponse;
import com.aliyuncs.avatar.model.v20220130.QueryAvatarListResponse.Data;
import com.aliyuncs.avatar.model.v20220130.QueryAvatarListResponse.Data.ListItem;
import com.aliyuncs.avatar.model.v20220130.QueryAvatarListResponse.Data.ListItem.SupportedResolutions;
import com.aliyuncs.avatar.model.v20220130.QueryAvatarListResponse.Data.ListItem.SupportedResolutions.OfflineItem;
import com.aliyuncs.avatar.model.v20220130.QueryAvatarListResponse.Data.ListItem.SupportedResolutions.OnlineItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAvatarListResponseUnmarshaller {

	public static QueryAvatarListResponse unmarshall(QueryAvatarListResponse queryAvatarListResponse, UnmarshallerContext _ctx) {
		
		queryAvatarListResponse.setRequestId(_ctx.stringValue("QueryAvatarListResponse.RequestId"));
		queryAvatarListResponse.setCode(_ctx.stringValue("QueryAvatarListResponse.Code"));
		queryAvatarListResponse.setMessage(_ctx.stringValue("QueryAvatarListResponse.Message"));
		queryAvatarListResponse.setSuccess(_ctx.booleanValue("QueryAvatarListResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("QueryAvatarListResponse.Data.TotalCount"));
		data.setPageNo(_ctx.integerValue("QueryAvatarListResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("QueryAvatarListResponse.Data.PageSize"));
		data.setTotalPage(_ctx.integerValue("QueryAvatarListResponse.Data.TotalPage"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryAvatarListResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setCode(_ctx.stringValue("QueryAvatarListResponse.Data.List["+ i +"].Code"));
			listItem.setName(_ctx.stringValue("QueryAvatarListResponse.Data.List["+ i +"].Name"));
			listItem.setImage(_ctx.stringValue("QueryAvatarListResponse.Data.List["+ i +"].Image"));
			listItem.setPortrait(_ctx.stringValue("QueryAvatarListResponse.Data.List["+ i +"].Portrait"));
			listItem.setDescription(_ctx.stringValue("QueryAvatarListResponse.Data.List["+ i +"].Description"));
			listItem.setAvatarType(_ctx.stringValue("QueryAvatarListResponse.Data.List["+ i +"].AvatarType"));
			listItem.setModelType(_ctx.stringValue("QueryAvatarListResponse.Data.List["+ i +"].ModelType"));
			listItem.setMakeStatus(_ctx.stringValue("QueryAvatarListResponse.Data.List["+ i +"].MakeStatus"));
			listItem.setMakeFailReason(_ctx.stringValue("QueryAvatarListResponse.Data.List["+ i +"].MakeFailReason"));
			listItem.setMakeStage(_ctx.stringValue("QueryAvatarListResponse.Data.List["+ i +"].MakeStage"));

			SupportedResolutions supportedResolutions = new SupportedResolutions();

			List<OfflineItem> offline = new ArrayList<OfflineItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryAvatarListResponse.Data.List["+ i +"].SupportedResolutions.Offline.Length"); j++) {
				OfflineItem offlineItem = new OfflineItem();
				offlineItem.setWidth(_ctx.integerValue("QueryAvatarListResponse.Data.List["+ i +"].SupportedResolutions.Offline["+ j +"].Width"));
				offlineItem.setHeight(_ctx.integerValue("QueryAvatarListResponse.Data.List["+ i +"].SupportedResolutions.Offline["+ j +"].Height"));
				offlineItem.setDesc(_ctx.stringValue("QueryAvatarListResponse.Data.List["+ i +"].SupportedResolutions.Offline["+ j +"].Desc"));

				offline.add(offlineItem);
			}
			supportedResolutions.setOffline(offline);

			List<OnlineItem> online = new ArrayList<OnlineItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryAvatarListResponse.Data.List["+ i +"].SupportedResolutions.Online.Length"); j++) {
				OnlineItem onlineItem = new OnlineItem();
				onlineItem.setWidth(_ctx.integerValue("QueryAvatarListResponse.Data.List["+ i +"].SupportedResolutions.Online["+ j +"].Width"));
				onlineItem.setHeight(_ctx.integerValue("QueryAvatarListResponse.Data.List["+ i +"].SupportedResolutions.Online["+ j +"].Height"));
				onlineItem.setDesc(_ctx.stringValue("QueryAvatarListResponse.Data.List["+ i +"].SupportedResolutions.Online["+ j +"].Desc"));

				online.add(onlineItem);
			}
			supportedResolutions.setOnline(online);
			listItem.setSupportedResolutions(supportedResolutions);

			list.add(listItem);
		}
		data.setList(list);
		queryAvatarListResponse.setData(data);
	 
	 	return queryAvatarListResponse;
	}
}