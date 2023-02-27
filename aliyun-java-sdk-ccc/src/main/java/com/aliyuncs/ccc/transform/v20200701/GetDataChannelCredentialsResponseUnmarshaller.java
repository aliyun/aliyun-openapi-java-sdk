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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.GetDataChannelCredentialsResponse;
import com.aliyuncs.ccc.model.v20200701.GetDataChannelCredentialsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataChannelCredentialsResponseUnmarshaller {

	public static GetDataChannelCredentialsResponse unmarshall(GetDataChannelCredentialsResponse getDataChannelCredentialsResponse, UnmarshallerContext _ctx) {
		
		getDataChannelCredentialsResponse.setRequestId(_ctx.stringValue("GetDataChannelCredentialsResponse.RequestId"));
		getDataChannelCredentialsResponse.setCode(_ctx.stringValue("GetDataChannelCredentialsResponse.Code"));
		getDataChannelCredentialsResponse.setHttpStatusCode(_ctx.integerValue("GetDataChannelCredentialsResponse.HttpStatusCode"));
		getDataChannelCredentialsResponse.setMessage(_ctx.stringValue("GetDataChannelCredentialsResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDataChannelCredentialsResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("GetDataChannelCredentialsResponse.Params["+ i +"]"));
		}
		getDataChannelCredentialsResponse.setParams(params);

		Data data = new Data();
		data.setDeviceId(_ctx.stringValue("GetDataChannelCredentialsResponse.Data.DeviceId"));
		data.setTopic(_ctx.stringValue("GetDataChannelCredentialsResponse.Data.Topic"));
		data.setClientId(_ctx.stringValue("GetDataChannelCredentialsResponse.Data.ClientId"));
		data.setEndpoint(_ctx.stringValue("GetDataChannelCredentialsResponse.Data.Endpoint"));
		data.setUserName(_ctx.stringValue("GetDataChannelCredentialsResponse.Data.UserName"));
		data.setPassword(_ctx.stringValue("GetDataChannelCredentialsResponse.Data.Password"));
		data.setExpiredTime(_ctx.longValue("GetDataChannelCredentialsResponse.Data.ExpiredTime"));
		getDataChannelCredentialsResponse.setData(data);
	 
	 	return getDataChannelCredentialsResponse;
	}
}