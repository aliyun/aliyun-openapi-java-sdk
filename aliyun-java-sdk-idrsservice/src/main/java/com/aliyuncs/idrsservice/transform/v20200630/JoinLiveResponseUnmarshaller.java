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

package com.aliyuncs.idrsservice.transform.v20200630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.idrsservice.model.v20200630.JoinLiveResponse;
import com.aliyuncs.idrsservice.model.v20200630.JoinLiveResponse.Data;
import com.aliyuncs.idrsservice.model.v20200630.JoinLiveResponse.Data.TokenData;
import com.aliyuncs.idrsservice.model.v20200630.JoinLiveResponse.Data.TokenData.Turn;
import com.aliyuncs.transform.UnmarshallerContext;


public class JoinLiveResponseUnmarshaller {

	public static JoinLiveResponse unmarshall(JoinLiveResponse joinLiveResponse, UnmarshallerContext _ctx) {
		
		joinLiveResponse.setRequestId(_ctx.stringValue("JoinLiveResponse.RequestId"));
		joinLiveResponse.setCode(_ctx.stringValue("JoinLiveResponse.Code"));
		joinLiveResponse.setMessage(_ctx.stringValue("JoinLiveResponse.Message"));

		Data data = new Data();
		data.setCode(_ctx.integerValue("JoinLiveResponse.Data.Code"));

		TokenData tokenData = new TokenData();
		tokenData.setAppId(_ctx.stringValue("JoinLiveResponse.Data.TokenData.AppId"));
		tokenData.setLiveId(_ctx.stringValue("JoinLiveResponse.Data.TokenData.LiveId"));
		tokenData.setNonce(_ctx.stringValue("JoinLiveResponse.Data.TokenData.Nonce"));
		tokenData.setTimestamp(_ctx.longValue("JoinLiveResponse.Data.TokenData.Timestamp"));
		tokenData.setToken(_ctx.stringValue("JoinLiveResponse.Data.TokenData.Token"));
		tokenData.setUserId(_ctx.stringValue("JoinLiveResponse.Data.TokenData.UserId"));

		List<String> gslb = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("JoinLiveResponse.Data.TokenData.Gslb.Length"); i++) {
			gslb.add(_ctx.stringValue("JoinLiveResponse.Data.TokenData.Gslb["+ i +"]"));
		}
		tokenData.setGslb(gslb);

		Turn turn = new Turn();
		turn.setPassword(_ctx.stringValue("JoinLiveResponse.Data.TokenData.Turn.Password"));
		turn.setUsername(_ctx.stringValue("JoinLiveResponse.Data.TokenData.Turn.Username"));
		tokenData.setTurn(turn);
		data.setTokenData(tokenData);
		joinLiveResponse.setData(data);
	 
	 	return joinLiveResponse;
	}
}