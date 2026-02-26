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

import com.aliyuncs.xrengine.model.v20221111.GetArEditCommonMaterialResponse;
import com.aliyuncs.xrengine.model.v20221111.GetArEditCommonMaterialResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetArEditCommonMaterialResponseUnmarshaller {

	public static GetArEditCommonMaterialResponse unmarshall(GetArEditCommonMaterialResponse getArEditCommonMaterialResponse, UnmarshallerContext _ctx) {
		
		getArEditCommonMaterialResponse.setRequestId(_ctx.stringValue("GetArEditCommonMaterialResponse.RequestId"));
		getArEditCommonMaterialResponse.setSuccess(_ctx.booleanValue("GetArEditCommonMaterialResponse.Success"));
		getArEditCommonMaterialResponse.setCode(_ctx.stringValue("GetArEditCommonMaterialResponse.Code"));
		getArEditCommonMaterialResponse.setMessage(_ctx.stringValue("GetArEditCommonMaterialResponse.Message"));
		getArEditCommonMaterialResponse.setErrorName(_ctx.stringValue("GetArEditCommonMaterialResponse.ErrorName"));
		getArEditCommonMaterialResponse.setHttpCode(_ctx.integerValue("GetArEditCommonMaterialResponse.HttpCode"));

		Data data = new Data();
		data.setSecurityToken(_ctx.stringValue("GetArEditCommonMaterialResponse.Data.SecurityToken"));
		data.setAccessKeySecret(_ctx.stringValue("GetArEditCommonMaterialResponse.Data.AccessKeySecret"));
		data.setAccessKeyId(_ctx.stringValue("GetArEditCommonMaterialResponse.Data.AccessKeyId"));
		data.setExpiration(_ctx.longValue("GetArEditCommonMaterialResponse.Data.Expiration"));
		data.setOssBucket(_ctx.stringValue("GetArEditCommonMaterialResponse.Data.OssBucket"));
		data.setOssRegion(_ctx.stringValue("GetArEditCommonMaterialResponse.Data.OssRegion"));
		data.setOssPath(_ctx.stringValue("GetArEditCommonMaterialResponse.Data.OssPath"));
		getArEditCommonMaterialResponse.setData(data);
	 
	 	return getArEditCommonMaterialResponse;
	}
}