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

import com.aliyuncs.ccc.model.v20200701.GetLoginDetailsResponse;
import com.aliyuncs.ccc.model.v20200701.GetLoginDetailsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLoginDetailsResponseUnmarshaller {

	public static GetLoginDetailsResponse unmarshall(GetLoginDetailsResponse getLoginDetailsResponse, UnmarshallerContext _ctx) {
		
		getLoginDetailsResponse.setRequestId(_ctx.stringValue("GetLoginDetailsResponse.RequestId"));
		getLoginDetailsResponse.setCode(_ctx.stringValue("GetLoginDetailsResponse.Code"));
		getLoginDetailsResponse.setHttpStatusCode(_ctx.integerValue("GetLoginDetailsResponse.HttpStatusCode"));
		getLoginDetailsResponse.setMessage(_ctx.stringValue("GetLoginDetailsResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLoginDetailsResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("GetLoginDetailsResponse.Params["+ i +"]"));
		}
		getLoginDetailsResponse.setParams(params);

		Data data = new Data();
		data.setDeviceId(_ctx.stringValue("GetLoginDetailsResponse.Data.DeviceId"));
		data.setDisplayName(_ctx.stringValue("GetLoginDetailsResponse.Data.DisplayName"));
		data.setExtension(_ctx.stringValue("GetLoginDetailsResponse.Data.Extension"));
		data.setSignature(_ctx.stringValue("GetLoginDetailsResponse.Data.Signature"));
		data.setSipServerUrl(_ctx.stringValue("GetLoginDetailsResponse.Data.SipServerUrl"));
		data.setUserId(_ctx.stringValue("GetLoginDetailsResponse.Data.UserId"));
		data.setUserKey(_ctx.stringValue("GetLoginDetailsResponse.Data.UserKey"));
		getLoginDetailsResponse.setData(data);
	 
	 	return getLoginDetailsResponse;
	}
}