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

package com.aliyuncs.iotcc.transform.v20210513;

import com.aliyuncs.iotcc.model.v20210513.GetStsInfoAndOssPathResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStsInfoAndOssPathResponseUnmarshaller {

	public static GetStsInfoAndOssPathResponse unmarshall(GetStsInfoAndOssPathResponse getStsInfoAndOssPathResponse, UnmarshallerContext _ctx) {
		
		getStsInfoAndOssPathResponse.setRequestId(_ctx.stringValue("GetStsInfoAndOssPathResponse.RequestId"));
		getStsInfoAndOssPathResponse.setExpiration(_ctx.stringValue("GetStsInfoAndOssPathResponse.Expiration"));
		getStsInfoAndOssPathResponse.setAccessKeyId(_ctx.stringValue("GetStsInfoAndOssPathResponse.AccessKeyId"));
		getStsInfoAndOssPathResponse.setAccessKeySecret(_ctx.stringValue("GetStsInfoAndOssPathResponse.AccessKeySecret"));
		getStsInfoAndOssPathResponse.setSecurityToken(_ctx.stringValue("GetStsInfoAndOssPathResponse.SecurityToken"));
		getStsInfoAndOssPathResponse.setOssPath(_ctx.stringValue("GetStsInfoAndOssPathResponse.OssPath"));
	 
	 	return getStsInfoAndOssPathResponse;
	}
}