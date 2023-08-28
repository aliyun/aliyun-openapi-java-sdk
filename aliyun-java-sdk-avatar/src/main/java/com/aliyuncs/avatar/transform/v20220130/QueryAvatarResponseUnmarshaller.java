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

import com.aliyuncs.avatar.model.v20220130.QueryAvatarResponse;
import com.aliyuncs.avatar.model.v20220130.QueryAvatarResponse.Data;
import com.aliyuncs.avatar.model.v20220130.QueryAvatarResponse.Data.SupportedResolutions;
import com.aliyuncs.avatar.model.v20220130.QueryAvatarResponse.Data.SupportedResolutions.OfflineItem;
import com.aliyuncs.avatar.model.v20220130.QueryAvatarResponse.Data.SupportedResolutions.OnlineItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAvatarResponseUnmarshaller {

	public static QueryAvatarResponse unmarshall(QueryAvatarResponse queryAvatarResponse, UnmarshallerContext _ctx) {
		
		queryAvatarResponse.setRequestId(_ctx.stringValue("QueryAvatarResponse.RequestId"));
		queryAvatarResponse.setCode(_ctx.stringValue("QueryAvatarResponse.Code"));
		queryAvatarResponse.setMessage(_ctx.stringValue("QueryAvatarResponse.Message"));
		queryAvatarResponse.setSuccess(_ctx.booleanValue("QueryAvatarResponse.Success"));

		Data data = new Data();
		data.setName(_ctx.stringValue("QueryAvatarResponse.Data.Name"));
		data.setDescription(_ctx.stringValue("QueryAvatarResponse.Data.Description"));
		data.setPortrait(_ctx.stringValue("QueryAvatarResponse.Data.Portrait"));
		data.setImage(_ctx.stringValue("QueryAvatarResponse.Data.Image"));
		data.setAllLocateImages(_ctx.mapValue("QueryAvatarResponse.Data.AllLocateImages"));
		data.setModelType(_ctx.stringValue("QueryAvatarResponse.Data.ModelType"));
		data.setAvatarType(_ctx.stringValue("QueryAvatarResponse.Data.AvatarType"));
		data.setMakeStatus(_ctx.stringValue("QueryAvatarResponse.Data.MakeStatus"));
		data.setMakeFailReason(_ctx.stringValue("QueryAvatarResponse.Data.MakeFailReason"));
		data.setMakeStage(_ctx.stringValue("QueryAvatarResponse.Data.MakeStage"));

		SupportedResolutions supportedResolutions = new SupportedResolutions();

		List<OfflineItem> offline = new ArrayList<OfflineItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryAvatarResponse.Data.SupportedResolutions.Offline.Length"); i++) {
			OfflineItem offlineItem = new OfflineItem();
			offlineItem.setWidth(_ctx.integerValue("QueryAvatarResponse.Data.SupportedResolutions.Offline["+ i +"].Width"));
			offlineItem.setHeight(_ctx.integerValue("QueryAvatarResponse.Data.SupportedResolutions.Offline["+ i +"].Height"));
			offlineItem.setDesc(_ctx.stringValue("QueryAvatarResponse.Data.SupportedResolutions.Offline["+ i +"].Desc"));

			offline.add(offlineItem);
		}
		supportedResolutions.setOffline(offline);

		List<OnlineItem> online = new ArrayList<OnlineItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryAvatarResponse.Data.SupportedResolutions.Online.Length"); i++) {
			OnlineItem onlineItem = new OnlineItem();
			onlineItem.setWidth(_ctx.integerValue("QueryAvatarResponse.Data.SupportedResolutions.Online["+ i +"].Width"));
			onlineItem.setHeight(_ctx.integerValue("QueryAvatarResponse.Data.SupportedResolutions.Online["+ i +"].Height"));
			onlineItem.setDesc(_ctx.stringValue("QueryAvatarResponse.Data.SupportedResolutions.Online["+ i +"].Desc"));

			online.add(onlineItem);
		}
		supportedResolutions.setOnline(online);
		data.setSupportedResolutions(supportedResolutions);
		queryAvatarResponse.setData(data);
	 
	 	return queryAvatarResponse;
	}
}