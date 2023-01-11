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

import com.aliyuncs.umeng_finplus.model.v20220913.BuildStsAK2Response;
import com.aliyuncs.umeng_finplus.model.v20220913.BuildStsAK2Response.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class BuildStsAK2ResponseUnmarshaller {

	public static BuildStsAK2Response unmarshall(BuildStsAK2Response buildStsAK2Response, UnmarshallerContext _ctx) {
		
		buildStsAK2Response.setRequestId(_ctx.stringValue("BuildStsAK2Response.RequestId"));
		buildStsAK2Response.setMsg(_ctx.stringValue("BuildStsAK2Response.Msg"));
		buildStsAK2Response.setCode(_ctx.stringValue("BuildStsAK2Response.Code"));
		buildStsAK2Response.setSuccess(_ctx.booleanValue("BuildStsAK2Response.Success"));

		Data data = new Data();
		data.setId(_ctx.stringValue("BuildStsAK2Response.Data.id"));
		data.setEndpoint(_ctx.stringValue("BuildStsAK2Response.Data.endpoint"));
		data.setSecret(_ctx.stringValue("BuildStsAK2Response.Data.secret"));
		data.setToken(_ctx.stringValue("BuildStsAK2Response.Data.token"));
		data.setBucket(_ctx.stringValue("BuildStsAK2Response.Data.bucket"));
		data.setPath(_ctx.stringValue("BuildStsAK2Response.Data.path"));
		buildStsAK2Response.setData(data);
	 
	 	return buildStsAK2Response;
	}
}