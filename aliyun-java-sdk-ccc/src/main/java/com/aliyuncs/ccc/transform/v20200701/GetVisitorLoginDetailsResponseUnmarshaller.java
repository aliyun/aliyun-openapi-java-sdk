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

import com.aliyuncs.ccc.model.v20200701.GetVisitorLoginDetailsResponse;
import com.aliyuncs.ccc.model.v20200701.GetVisitorLoginDetailsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVisitorLoginDetailsResponseUnmarshaller {

	public static GetVisitorLoginDetailsResponse unmarshall(GetVisitorLoginDetailsResponse getVisitorLoginDetailsResponse, UnmarshallerContext _ctx) {
		
		getVisitorLoginDetailsResponse.setRequestId(_ctx.stringValue("GetVisitorLoginDetailsResponse.RequestId"));
		getVisitorLoginDetailsResponse.setCode(_ctx.stringValue("GetVisitorLoginDetailsResponse.Code"));
		getVisitorLoginDetailsResponse.setHttpStatusCode(_ctx.integerValue("GetVisitorLoginDetailsResponse.HttpStatusCode"));
		getVisitorLoginDetailsResponse.setMessage(_ctx.stringValue("GetVisitorLoginDetailsResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetVisitorLoginDetailsResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("GetVisitorLoginDetailsResponse.Params["+ i +"]"));
		}
		getVisitorLoginDetailsResponse.setParams(params);

		Data data = new Data();
		data.setChatLoginToken(_ctx.stringValue("GetVisitorLoginDetailsResponse.Data.ChatLoginToken"));
		data.setChatUserId(_ctx.stringValue("GetVisitorLoginDetailsResponse.Data.ChatUserId"));
		data.setChatDeviceId(_ctx.stringValue("GetVisitorLoginDetailsResponse.Data.ChatDeviceId"));
		data.setChatServerUrl(_ctx.stringValue("GetVisitorLoginDetailsResponse.Data.ChatServerUrl"));
		data.setChatAppKey(_ctx.stringValue("GetVisitorLoginDetailsResponse.Data.ChatAppKey"));
		data.setChatAppId(_ctx.stringValue("GetVisitorLoginDetailsResponse.Data.ChatAppId"));
		getVisitorLoginDetailsResponse.setData(data);
	 
	 	return getVisitorLoginDetailsResponse;
	}
}