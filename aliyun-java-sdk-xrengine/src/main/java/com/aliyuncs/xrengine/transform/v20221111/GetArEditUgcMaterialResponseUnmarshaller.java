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

import com.aliyuncs.xrengine.model.v20221111.GetArEditUgcMaterialResponse;
import com.aliyuncs.xrengine.model.v20221111.GetArEditUgcMaterialResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetArEditUgcMaterialResponseUnmarshaller {

	public static GetArEditUgcMaterialResponse unmarshall(GetArEditUgcMaterialResponse getArEditUgcMaterialResponse, UnmarshallerContext _ctx) {
		
		getArEditUgcMaterialResponse.setRequestId(_ctx.stringValue("GetArEditUgcMaterialResponse.RequestId"));
		getArEditUgcMaterialResponse.setSuccess(_ctx.booleanValue("GetArEditUgcMaterialResponse.Success"));
		getArEditUgcMaterialResponse.setCode(_ctx.stringValue("GetArEditUgcMaterialResponse.Code"));
		getArEditUgcMaterialResponse.setMessage(_ctx.stringValue("GetArEditUgcMaterialResponse.Message"));
		getArEditUgcMaterialResponse.setErrorName(_ctx.stringValue("GetArEditUgcMaterialResponse.ErrorName"));
		getArEditUgcMaterialResponse.setHttpCode(_ctx.integerValue("GetArEditUgcMaterialResponse.HttpCode"));

		Data data = new Data();
		data.setSecurityToken(_ctx.stringValue("GetArEditUgcMaterialResponse.Data.SecurityToken"));
		data.setAccessKeySecret(_ctx.stringValue("GetArEditUgcMaterialResponse.Data.AccessKeySecret"));
		data.setAccessKeyId(_ctx.stringValue("GetArEditUgcMaterialResponse.Data.AccessKeyId"));
		data.setExpiration(_ctx.longValue("GetArEditUgcMaterialResponse.Data.Expiration"));
		data.setOssBucket(_ctx.stringValue("GetArEditUgcMaterialResponse.Data.OssBucket"));
		data.setOssRegion(_ctx.stringValue("GetArEditUgcMaterialResponse.Data.OssRegion"));
		data.setOssPath(_ctx.stringValue("GetArEditUgcMaterialResponse.Data.OssPath"));
		getArEditUgcMaterialResponse.setData(data);
	 
	 	return getArEditUgcMaterialResponse;
	}
}