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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.QueryLiveDomainMultiStreamListResponse;
import com.aliyuncs.live.model.v20161101.QueryLiveDomainMultiStreamListResponse.OnlineStreamsItem;
import com.aliyuncs.live.model.v20161101.QueryLiveDomainMultiStreamListResponse.OnlineStreamsItem.ChangeLogsItem;
import com.aliyuncs.live.model.v20161101.QueryLiveDomainMultiStreamListResponse.OnlineStreamsItem.UpstreamListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLiveDomainMultiStreamListResponseUnmarshaller {

	public static QueryLiveDomainMultiStreamListResponse unmarshall(QueryLiveDomainMultiStreamListResponse queryLiveDomainMultiStreamListResponse, UnmarshallerContext _ctx) {
		
		queryLiveDomainMultiStreamListResponse.setRequestId(_ctx.stringValue("QueryLiveDomainMultiStreamListResponse.RequestId"));
		queryLiveDomainMultiStreamListResponse.setPageNumber(_ctx.integerValue("QueryLiveDomainMultiStreamListResponse.PageNumber"));
		queryLiveDomainMultiStreamListResponse.setPageSize(_ctx.integerValue("QueryLiveDomainMultiStreamListResponse.PageSize"));
		queryLiveDomainMultiStreamListResponse.setTotalCount(_ctx.integerValue("QueryLiveDomainMultiStreamListResponse.TotalCount"));

		List<OnlineStreamsItem> onlineStreams = new ArrayList<OnlineStreamsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLiveDomainMultiStreamListResponse.OnlineStreams.Length"); i++) {
			OnlineStreamsItem onlineStreamsItem = new OnlineStreamsItem();
			onlineStreamsItem.setDomain(_ctx.stringValue("QueryLiveDomainMultiStreamListResponse.OnlineStreams["+ i +"].Domain"));
			onlineStreamsItem.setAppName(_ctx.stringValue("QueryLiveDomainMultiStreamListResponse.OnlineStreams["+ i +"].AppName"));
			onlineStreamsItem.setStreamName(_ctx.stringValue("QueryLiveDomainMultiStreamListResponse.OnlineStreams["+ i +"].StreamName"));
			onlineStreamsItem.setOptimalMode(_ctx.stringValue("QueryLiveDomainMultiStreamListResponse.OnlineStreams["+ i +"].OptimalMode"));

			List<UpstreamListItem> upstreamList = new ArrayList<UpstreamListItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryLiveDomainMultiStreamListResponse.OnlineStreams["+ i +"].UpstreamList.Length"); j++) {
				UpstreamListItem upstreamListItem = new UpstreamListItem();
				upstreamListItem.setUpstreamSequence(_ctx.stringValue("QueryLiveDomainMultiStreamListResponse.OnlineStreams["+ i +"].UpstreamList["+ j +"].UpstreamSequence"));
				upstreamListItem.setUpstreamIp(_ctx.stringValue("QueryLiveDomainMultiStreamListResponse.OnlineStreams["+ i +"].UpstreamList["+ j +"].UpstreamIp"));
				upstreamListItem.setUpstreamTime(_ctx.stringValue("QueryLiveDomainMultiStreamListResponse.OnlineStreams["+ i +"].UpstreamList["+ j +"].UpstreamTime"));
				upstreamListItem.setMasterFlag(_ctx.booleanValue("QueryLiveDomainMultiStreamListResponse.OnlineStreams["+ i +"].UpstreamList["+ j +"].MasterFlag"));

				upstreamList.add(upstreamListItem);
			}
			onlineStreamsItem.setUpstreamList(upstreamList);

			List<ChangeLogsItem> changeLogs = new ArrayList<ChangeLogsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryLiveDomainMultiStreamListResponse.OnlineStreams["+ i +"].ChangeLogs.Length"); j++) {
				ChangeLogsItem changeLogsItem = new ChangeLogsItem();
				changeLogsItem.setChangeTime(_ctx.stringValue("QueryLiveDomainMultiStreamListResponse.OnlineStreams["+ i +"].ChangeLogs["+ j +"].ChangeTime"));
				changeLogsItem.setChangeReason(_ctx.stringValue("QueryLiveDomainMultiStreamListResponse.OnlineStreams["+ i +"].ChangeLogs["+ j +"].ChangeReason"));
				changeLogsItem.setMasterUpstream(_ctx.stringValue("QueryLiveDomainMultiStreamListResponse.OnlineStreams["+ i +"].ChangeLogs["+ j +"].MasterUpstream"));
				changeLogsItem.setUpstreamSequence(_ctx.stringValue("QueryLiveDomainMultiStreamListResponse.OnlineStreams["+ i +"].ChangeLogs["+ j +"].UpstreamSequence"));
				changeLogsItem.setUpstreamIp(_ctx.stringValue("QueryLiveDomainMultiStreamListResponse.OnlineStreams["+ i +"].ChangeLogs["+ j +"].UpstreamIp"));

				changeLogs.add(changeLogsItem);
			}
			onlineStreamsItem.setChangeLogs(changeLogs);

			onlineStreams.add(onlineStreamsItem);
		}
		queryLiveDomainMultiStreamListResponse.setOnlineStreams(onlineStreams);
	 
	 	return queryLiveDomainMultiStreamListResponse;
	}
}