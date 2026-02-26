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

package com.aliyuncs.xrengine.transform.v20221111;

import com.aliyuncs.xrengine.model.v20221111.GetArEditStsAuthResponse;
import com.aliyuncs.xrengine.model.v20221111.GetArEditStsAuthResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetArEditStsAuthResponseUnmarshaller {

	public static GetArEditStsAuthResponse unmarshall(GetArEditStsAuthResponse getArEditStsAuthResponse, UnmarshallerContext _ctx) {
		
		getArEditStsAuthResponse.setRequestId(_ctx.stringValue("GetArEditStsAuthResponse.RequestId"));
		getArEditStsAuthResponse.setSuccess(_ctx.booleanValue("GetArEditStsAuthResponse.Success"));
		getArEditStsAuthResponse.setCode(_ctx.stringValue("GetArEditStsAuthResponse.Code"));
		getArEditStsAuthResponse.setMessage(_ctx.stringValue("GetArEditStsAuthResponse.Message"));
		getArEditStsAuthResponse.setErrorName(_ctx.stringValue("GetArEditStsAuthResponse.ErrorName"));
		getArEditStsAuthResponse.setHttpCode(_ctx.integerValue("GetArEditStsAuthResponse.HttpCode"));

		Data data = new Data();
		data.setSecurityToken(_ctx.stringValue("GetArEditStsAuthResponse.Data.SecurityToken"));
		data.setAccessKeySecret(_ctx.stringValue("GetArEditStsAuthResponse.Data.AccessKeySecret"));
		data.setAccessKeyId(_ctx.stringValue("GetArEditStsAuthResponse.Data.AccessKeyId"));
		data.setExpiration(_ctx.longValue("GetArEditStsAuthResponse.Data.Expiration"));
		data.setOssBucket(_ctx.stringValue("GetArEditStsAuthResponse.Data.OssBucket"));
		data.setOssRegion(_ctx.stringValue("GetArEditStsAuthResponse.Data.OssRegion"));
		data.setEditPath(_ctx.stringValue("GetArEditStsAuthResponse.Data.EditPath"));
		data.setPublishPath(_ctx.stringValue("GetArEditStsAuthResponse.Data.PublishPath"));
		data.setMap3DPath(_ctx.stringValue("GetArEditStsAuthResponse.Data.Map3DPath"));
		getArEditStsAuthResponse.setData(data);
	 
	 	return getArEditStsAuthResponse;
	}
}