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

package com.aliyuncs.dypnsapi.transform.v20170525;

import com.aliyuncs.dypnsapi.model.v20170525.JyQueryAppInfoBySceneCodeResponse;
import com.aliyuncs.dypnsapi.model.v20170525.JyQueryAppInfoBySceneCodeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class JyQueryAppInfoBySceneCodeResponseUnmarshaller {

	public static JyQueryAppInfoBySceneCodeResponse unmarshall(JyQueryAppInfoBySceneCodeResponse jyQueryAppInfoBySceneCodeResponse, UnmarshallerContext _ctx) {
		
		jyQueryAppInfoBySceneCodeResponse.setRequestId(_ctx.stringValue("JyQueryAppInfoBySceneCodeResponse.RequestId"));
		jyQueryAppInfoBySceneCodeResponse.setCode(_ctx.stringValue("JyQueryAppInfoBySceneCodeResponse.Code"));
		jyQueryAppInfoBySceneCodeResponse.setMessage(_ctx.stringValue("JyQueryAppInfoBySceneCodeResponse.Message"));

		Data data = new Data();
		data.setCmAppId(_ctx.stringValue("JyQueryAppInfoBySceneCodeResponse.Data.CmAppId"));
		data.setCmAppKey(_ctx.stringValue("JyQueryAppInfoBySceneCodeResponse.Data.CmAppKey"));
		data.setCtAppId(_ctx.stringValue("JyQueryAppInfoBySceneCodeResponse.Data.CtAppId"));
		data.setCtAppKey(_ctx.stringValue("JyQueryAppInfoBySceneCodeResponse.Data.CtAppKey"));
		jyQueryAppInfoBySceneCodeResponse.setData(data);
	 
	 	return jyQueryAppInfoBySceneCodeResponse;
	}
}