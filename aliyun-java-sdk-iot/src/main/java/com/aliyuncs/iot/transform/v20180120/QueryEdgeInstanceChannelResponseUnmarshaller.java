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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QueryEdgeInstanceChannelResponse;
import com.aliyuncs.iot.model.v20180120.QueryEdgeInstanceChannelResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryEdgeInstanceChannelResponse.Data.Channel;
import com.aliyuncs.iot.model.v20180120.QueryEdgeInstanceChannelResponse.Data.Channel.Config;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEdgeInstanceChannelResponseUnmarshaller {

	public static QueryEdgeInstanceChannelResponse unmarshall(QueryEdgeInstanceChannelResponse queryEdgeInstanceChannelResponse, UnmarshallerContext _ctx) {
		
		queryEdgeInstanceChannelResponse.setRequestId(_ctx.stringValue("QueryEdgeInstanceChannelResponse.RequestId"));
		queryEdgeInstanceChannelResponse.setSuccess(_ctx.booleanValue("QueryEdgeInstanceChannelResponse.Success"));
		queryEdgeInstanceChannelResponse.setCode(_ctx.stringValue("QueryEdgeInstanceChannelResponse.Code"));
		queryEdgeInstanceChannelResponse.setErrorMessage(_ctx.stringValue("QueryEdgeInstanceChannelResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryEdgeInstanceChannelResponse.Data.Total"));
		data.setPageSize(_ctx.integerValue("QueryEdgeInstanceChannelResponse.Data.PageSize"));
		data.setCurrentPage(_ctx.integerValue("QueryEdgeInstanceChannelResponse.Data.CurrentPage"));

		List<Channel> channelList = new ArrayList<Channel>();
		for (int i = 0; i < _ctx.lengthValue("QueryEdgeInstanceChannelResponse.Data.ChannelList.Length"); i++) {
			Channel channel = new Channel();
			channel.setChannelId(_ctx.stringValue("QueryEdgeInstanceChannelResponse.Data.ChannelList["+ i +"].ChannelId"));
			channel.setChannelName(_ctx.stringValue("QueryEdgeInstanceChannelResponse.Data.ChannelList["+ i +"].ChannelName"));
			channel.setGmtCreate(_ctx.stringValue("QueryEdgeInstanceChannelResponse.Data.ChannelList["+ i +"].GmtCreate"));
			channel.setGmtModified(_ctx.stringValue("QueryEdgeInstanceChannelResponse.Data.ChannelList["+ i +"].GmtModified"));
			channel.setGmtCreateTimestamp(_ctx.longValue("QueryEdgeInstanceChannelResponse.Data.ChannelList["+ i +"].GmtCreateTimestamp"));
			channel.setGmtModifiedTimestamp(_ctx.longValue("QueryEdgeInstanceChannelResponse.Data.ChannelList["+ i +"].GmtModifiedTimestamp"));

			List<Config> configList = new ArrayList<Config>();
			for (int j = 0; j < _ctx.lengthValue("QueryEdgeInstanceChannelResponse.Data.ChannelList["+ i +"].ConfigList.Length"); j++) {
				Config config = new Config();
				config.setConfigId(_ctx.stringValue("QueryEdgeInstanceChannelResponse.Data.ChannelList["+ i +"].ConfigList["+ j +"].ConfigId"));
				config.setFormat(_ctx.stringValue("QueryEdgeInstanceChannelResponse.Data.ChannelList["+ i +"].ConfigList["+ j +"].Format"));
				config.setContent(_ctx.stringValue("QueryEdgeInstanceChannelResponse.Data.ChannelList["+ i +"].ConfigList["+ j +"].Content"));
				config.setKey(_ctx.stringValue("QueryEdgeInstanceChannelResponse.Data.ChannelList["+ i +"].ConfigList["+ j +"].Key"));

				configList.add(config);
			}
			channel.setConfigList(configList);

			channelList.add(channel);
		}
		data.setChannelList(channelList);
		queryEdgeInstanceChannelResponse.setData(data);
	 
	 	return queryEdgeInstanceChannelResponse;
	}
}