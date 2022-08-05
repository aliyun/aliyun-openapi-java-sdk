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

import com.aliyuncs.avatar.model.v20220130.QueryRunningInstanceResponse;
import com.aliyuncs.avatar.model.v20220130.QueryRunningInstanceResponse.DataItem;
import com.aliyuncs.avatar.model.v20220130.QueryRunningInstanceResponse.DataItem.Channel;
import com.aliyuncs.avatar.model.v20220130.QueryRunningInstanceResponse.DataItem.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRunningInstanceResponseUnmarshaller {

	public static QueryRunningInstanceResponse unmarshall(QueryRunningInstanceResponse queryRunningInstanceResponse, UnmarshallerContext _ctx) {
		
		queryRunningInstanceResponse.setRequestId(_ctx.stringValue("QueryRunningInstanceResponse.RequestId"));
		queryRunningInstanceResponse.setCode(_ctx.stringValue("QueryRunningInstanceResponse.Code"));
		queryRunningInstanceResponse.setMessage(_ctx.stringValue("QueryRunningInstanceResponse.Message"));
		queryRunningInstanceResponse.setSuccess(_ctx.booleanValue("QueryRunningInstanceResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRunningInstanceResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSessionId(_ctx.stringValue("QueryRunningInstanceResponse.Data["+ i +"].SessionId"));

			Channel channel = new Channel();
			channel.setChannelId(_ctx.stringValue("QueryRunningInstanceResponse.Data["+ i +"].Channel.ChannelId"));
			channel.setToken(_ctx.stringValue("QueryRunningInstanceResponse.Data["+ i +"].Channel.Token"));
			channel.setType(_ctx.stringValue("QueryRunningInstanceResponse.Data["+ i +"].Channel.Type"));
			channel.setExpiredTime(_ctx.stringValue("QueryRunningInstanceResponse.Data["+ i +"].Channel.ExpiredTime"));
			channel.setNonce(_ctx.stringValue("QueryRunningInstanceResponse.Data["+ i +"].Channel.Nonce"));
			channel.setUserId(_ctx.stringValue("QueryRunningInstanceResponse.Data["+ i +"].Channel.UserId"));
			channel.setAppId(_ctx.stringValue("QueryRunningInstanceResponse.Data["+ i +"].Channel.AppId"));
			channel.setUserInfoInChannel(_ctx.stringValue("QueryRunningInstanceResponse.Data["+ i +"].Channel.UserInfoInChannel"));

			List<String> gslb = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryRunningInstanceResponse.Data["+ i +"].Channel.Gslb.Length"); j++) {
				gslb.add(_ctx.stringValue("QueryRunningInstanceResponse.Data["+ i +"].Channel.Gslb["+ j +"]"));
			}
			channel.setGslb(gslb);
			dataItem.setChannel(channel);

			User user = new User();
			user.setUserId(_ctx.stringValue("QueryRunningInstanceResponse.Data["+ i +"].User.UserId"));
			user.setUserName(_ctx.stringValue("QueryRunningInstanceResponse.Data["+ i +"].User.UserName"));
			dataItem.setUser(user);

			data.add(dataItem);
		}
		queryRunningInstanceResponse.setData(data);
	 
	 	return queryRunningInstanceResponse;
	}
}