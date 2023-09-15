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

package com.aliyuncs.cams.transform.v20200606;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cams.model.v20200606.QueryPhoneBusinessProfileResponse;
import com.aliyuncs.cams.model.v20200606.QueryPhoneBusinessProfileResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPhoneBusinessProfileResponseUnmarshaller {

	public static QueryPhoneBusinessProfileResponse unmarshall(QueryPhoneBusinessProfileResponse queryPhoneBusinessProfileResponse, UnmarshallerContext _ctx) {
		
		queryPhoneBusinessProfileResponse.setRequestId(_ctx.stringValue("QueryPhoneBusinessProfileResponse.RequestId"));
		queryPhoneBusinessProfileResponse.setCode(_ctx.stringValue("QueryPhoneBusinessProfileResponse.Code"));
		queryPhoneBusinessProfileResponse.setMessage(_ctx.stringValue("QueryPhoneBusinessProfileResponse.Message"));
		queryPhoneBusinessProfileResponse.setAccessDeniedDetail(_ctx.stringValue("QueryPhoneBusinessProfileResponse.AccessDeniedDetail"));

		Data data = new Data();
		data.setAddress(_ctx.stringValue("QueryPhoneBusinessProfileResponse.Data.Address"));
		data.setDescription(_ctx.stringValue("QueryPhoneBusinessProfileResponse.Data.Description"));
		data.setVertical(_ctx.stringValue("QueryPhoneBusinessProfileResponse.Data.Vertical"));
		data.setEmail(_ctx.stringValue("QueryPhoneBusinessProfileResponse.Data.Email"));
		data.setProfilePictureUrl(_ctx.stringValue("QueryPhoneBusinessProfileResponse.Data.ProfilePictureUrl"));

		List<String> websites = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryPhoneBusinessProfileResponse.Data.Websites.Length"); i++) {
			websites.add(_ctx.stringValue("QueryPhoneBusinessProfileResponse.Data.Websites["+ i +"]"));
		}
		data.setWebsites(websites);
		queryPhoneBusinessProfileResponse.setData(data);
	 
	 	return queryPhoneBusinessProfileResponse;
	}
}