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

import com.aliyuncs.wyota.model.v20210420.GetFbOssConfigResponse;
import com.aliyuncs.wyota.model.v20210420.GetFbOssConfigResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFbOssConfigResponseUnmarshaller {

	public static GetFbOssConfigResponse unmarshall(GetFbOssConfigResponse getFbOssConfigResponse, UnmarshallerContext _ctx) {
		
		getFbOssConfigResponse.setRequestId(_ctx.stringValue("GetFbOssConfigResponse.RequestId"));
		getFbOssConfigResponse.setCode(_ctx.stringValue("GetFbOssConfigResponse.Code"));
		getFbOssConfigResponse.setMessage(_ctx.stringValue("GetFbOssConfigResponse.Message"));

		Data data = new Data();
		data.setEndPoint(_ctx.stringValue("GetFbOssConfigResponse.Data.EndPoint"));
		data.setOssPolicy(_ctx.stringValue("GetFbOssConfigResponse.Data.OssPolicy"));
		data.setOssSignature(_ctx.stringValue("GetFbOssConfigResponse.Data.OssSignature"));
		data.setAccessKeyId(_ctx.stringValue("GetFbOssConfigResponse.Data.AccessKeyId"));
		data.setSessionId(_ctx.stringValue("GetFbOssConfigResponse.Data.SessionId"));
		getFbOssConfigResponse.setData(data);
	 
	 	return getFbOssConfigResponse;
	}
}