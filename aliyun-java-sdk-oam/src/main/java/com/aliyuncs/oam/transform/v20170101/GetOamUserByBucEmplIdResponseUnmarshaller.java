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

package com.aliyuncs.oam.transform.v20170101;

import com.aliyuncs.oam.model.v20170101.GetOamUserByBucEmplIdResponse;
import com.aliyuncs.oam.model.v20170101.GetOamUserByBucEmplIdResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOamUserByBucEmplIdResponseUnmarshaller {

	public static GetOamUserByBucEmplIdResponse unmarshall(GetOamUserByBucEmplIdResponse getOamUserByBucEmplIdResponse, UnmarshallerContext _ctx) {
		
		getOamUserByBucEmplIdResponse.setCode(_ctx.stringValue("GetOamUserByBucEmplIdResponse.Code"));
		getOamUserByBucEmplIdResponse.setMessage(_ctx.stringValue("GetOamUserByBucEmplIdResponse.Message"));

		Data data = new Data();
		data.setUid(_ctx.longValue("GetOamUserByBucEmplIdResponse.Data.Uid"));
		data.setLoginId(_ctx.stringValue("GetOamUserByBucEmplIdResponse.Data.LoginId"));
		data.setCustomUserId(_ctx.stringValue("GetOamUserByBucEmplIdResponse.Data.CustomUserId"));
		data.setGmtCreated(_ctx.stringValue("GetOamUserByBucEmplIdResponse.Data.GmtCreated"));
		data.setDescription(_ctx.stringValue("GetOamUserByBucEmplIdResponse.Data.Description"));
		getOamUserByBucEmplIdResponse.setData(data);
	 
	 	return getOamUserByBucEmplIdResponse;
	}
}