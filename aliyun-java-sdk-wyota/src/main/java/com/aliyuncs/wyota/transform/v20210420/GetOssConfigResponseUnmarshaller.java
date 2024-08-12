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

package com.aliyuncs.wyota.transform.v20210420;

import com.aliyuncs.wyota.model.v20210420.GetOssConfigResponse;
import com.aliyuncs.wyota.model.v20210420.GetOssConfigResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOssConfigResponseUnmarshaller {

	public static GetOssConfigResponse unmarshall(GetOssConfigResponse getOssConfigResponse, UnmarshallerContext _ctx) {
		
		getOssConfigResponse.setRequestId(_ctx.stringValue("GetOssConfigResponse.RequestId"));
		getOssConfigResponse.setMessage(_ctx.stringValue("GetOssConfigResponse.Message"));
		getOssConfigResponse.setCode(_ctx.stringValue("GetOssConfigResponse.Code"));

		Data data = new Data();
		data.setEndPoint(_ctx.stringValue("GetOssConfigResponse.Data.EndPoint"));
		data.setOssPolicy(_ctx.stringValue("GetOssConfigResponse.Data.OssPolicy"));
		data.setOssSignature(_ctx.stringValue("GetOssConfigResponse.Data.OssSignature"));
		data.setAccessKeyId(_ctx.stringValue("GetOssConfigResponse.Data.AccessKeyId"));
		data.setSecurityToken(_ctx.stringValue("GetOssConfigResponse.Data.SecurityToken"));
		getOssConfigResponse.setData(data);
	 
	 	return getOssConfigResponse;
	}
}