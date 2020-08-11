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

import com.aliyuncs.oam.model.v20170101.GetOamUserByAliyunIdResponse;
import com.aliyuncs.oam.model.v20170101.GetOamUserByAliyunIdResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOamUserByAliyunIdResponseUnmarshaller {

	public static GetOamUserByAliyunIdResponse unmarshall(GetOamUserByAliyunIdResponse getOamUserByAliyunIdResponse, UnmarshallerContext _ctx) {
		
		getOamUserByAliyunIdResponse.setCode(_ctx.stringValue("GetOamUserByAliyunIdResponse.Code"));
		getOamUserByAliyunIdResponse.setMessage(_ctx.stringValue("GetOamUserByAliyunIdResponse.Message"));

		Data data = new Data();
		data.setUid(_ctx.longValue("GetOamUserByAliyunIdResponse.Data.Uid"));
		data.setLoginId(_ctx.stringValue("GetOamUserByAliyunIdResponse.Data.LoginId"));
		data.setCustomUserId(_ctx.stringValue("GetOamUserByAliyunIdResponse.Data.CustomUserId"));
		data.setGmtCreated(_ctx.stringValue("GetOamUserByAliyunIdResponse.Data.GmtCreated"));
		data.setDescription(_ctx.stringValue("GetOamUserByAliyunIdResponse.Data.Description"));
		getOamUserByAliyunIdResponse.setData(data);
	 
	 	return getOamUserByAliyunIdResponse;
	}
}