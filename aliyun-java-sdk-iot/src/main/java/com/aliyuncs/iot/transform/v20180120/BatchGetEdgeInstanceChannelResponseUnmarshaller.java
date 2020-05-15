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

import com.aliyuncs.iot.model.v20180120.BatchGetEdgeInstanceChannelResponse;
import com.aliyuncs.iot.model.v20180120.BatchGetEdgeInstanceChannelResponse.Channel;
import com.aliyuncs.iot.model.v20180120.BatchGetEdgeInstanceChannelResponse.Channel.Config;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchGetEdgeInstanceChannelResponseUnmarshaller {

	public static BatchGetEdgeInstanceChannelResponse unmarshall(BatchGetEdgeInstanceChannelResponse batchGetEdgeInstanceChannelResponse, UnmarshallerContext _ctx) {
		
		batchGetEdgeInstanceChannelResponse.setRequestId(_ctx.stringValue("BatchGetEdgeInstanceChannelResponse.RequestId"));
		batchGetEdgeInstanceChannelResponse.setSuccess(_ctx.booleanValue("BatchGetEdgeInstanceChannelResponse.Success"));
		batchGetEdgeInstanceChannelResponse.setCode(_ctx.stringValue("BatchGetEdgeInstanceChannelResponse.Code"));
		batchGetEdgeInstanceChannelResponse.setErrorMessage(_ctx.stringValue("BatchGetEdgeInstanceChannelResponse.ErrorMessage"));

		List<Channel> data = new ArrayList<Channel>();
		for (int i = 0; i < _ctx.lengthValue("BatchGetEdgeInstanceChannelResponse.Data.Length"); i++) {
			Channel channel = new Channel();
			channel.setChannelId(_ctx.stringValue("BatchGetEdgeInstanceChannelResponse.Data["+ i +"].ChannelId"));
			channel.setChannelName(_ctx.stringValue("BatchGetEdgeInstanceChannelResponse.Data["+ i +"].ChannelName"));

			List<Config> configList = new ArrayList<Config>();
			for (int j = 0; j < _ctx.lengthValue("BatchGetEdgeInstanceChannelResponse.Data["+ i +"].ConfigList.Length"); j++) {
				Config config = new Config();
				config.setConfigId(_ctx.stringValue("BatchGetEdgeInstanceChannelResponse.Data["+ i +"].ConfigList["+ j +"].ConfigId"));
				config.setFormat(_ctx.stringValue("BatchGetEdgeInstanceChannelResponse.Data["+ i +"].ConfigList["+ j +"].Format"));
				config.setContent(_ctx.stringValue("BatchGetEdgeInstanceChannelResponse.Data["+ i +"].ConfigList["+ j +"].Content"));
				config.setKey(_ctx.stringValue("BatchGetEdgeInstanceChannelResponse.Data["+ i +"].ConfigList["+ j +"].Key"));

				configList.add(config);
			}
			channel.setConfigList(configList);

			data.add(channel);
		}
		batchGetEdgeInstanceChannelResponse.setData(data);
	 
	 	return batchGetEdgeInstanceChannelResponse;
	}
}