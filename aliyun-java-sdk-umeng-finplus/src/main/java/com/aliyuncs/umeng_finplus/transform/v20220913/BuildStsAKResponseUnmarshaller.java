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

package com.aliyuncs.umeng_finplus.transform.v20220913;

import com.aliyuncs.umeng_finplus.model.v20220913.BuildStsAKResponse;
import com.aliyuncs.umeng_finplus.model.v20220913.BuildStsAKResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class BuildStsAKResponseUnmarshaller {

	public static BuildStsAKResponse unmarshall(BuildStsAKResponse buildStsAKResponse, UnmarshallerContext _ctx) {
		
		buildStsAKResponse.setRequestId(_ctx.stringValue("BuildStsAKResponse.RequestId"));
		buildStsAKResponse.setMsg(_ctx.stringValue("BuildStsAKResponse.Msg"));
		buildStsAKResponse.setCode(_ctx.stringValue("BuildStsAKResponse.Code"));
		buildStsAKResponse.setSuccess(_ctx.booleanValue("BuildStsAKResponse.Success"));

		Data data = new Data();
		data.setId(_ctx.stringValue("BuildStsAKResponse.Data.id"));
		data.setEndpoint(_ctx.stringValue("BuildStsAKResponse.Data.endpoint"));
		data.setSecret(_ctx.stringValue("BuildStsAKResponse.Data.secret"));
		data.setToken(_ctx.stringValue("BuildStsAKResponse.Data.token"));
		data.setBucket(_ctx.stringValue("BuildStsAKResponse.Data.bucket"));
		data.setPath(_ctx.stringValue("BuildStsAKResponse.Data.path"));
		buildStsAKResponse.setData(data);
	 
	 	return buildStsAKResponse;
	}
}