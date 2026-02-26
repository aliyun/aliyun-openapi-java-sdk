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

package com.aliyuncs.bpstudio.transform.v20210931;

import com.aliyuncs.bpstudio.model.v20210931.GetTokenResponse;
import com.aliyuncs.bpstudio.model.v20210931.GetTokenResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTokenResponseUnmarshaller {

	public static GetTokenResponse unmarshall(GetTokenResponse getTokenResponse, UnmarshallerContext _ctx) {
		
		getTokenResponse.setRequestId(_ctx.stringValue("GetTokenResponse.RequestId"));
		getTokenResponse.setMessage(_ctx.stringValue("GetTokenResponse.Message"));
		getTokenResponse.setCode(_ctx.integerValue("GetTokenResponse.Code"));

		Data data = new Data();
		data.setSecurityToken(_ctx.stringValue("GetTokenResponse.Data.SecurityToken"));
		data.setEndpoint(_ctx.stringValue("GetTokenResponse.Data.Endpoint"));
		data.setAccessKeySecret(_ctx.stringValue("GetTokenResponse.Data.AccessKeySecret"));
		data.setAccessKeyId(_ctx.stringValue("GetTokenResponse.Data.AccessKeyId"));
		data.setBucket(_ctx.stringValue("GetTokenResponse.Data.Bucket"));
		data.setSnapshotBucket(_ctx.stringValue("GetTokenResponse.Data.SnapshotBucket"));
		getTokenResponse.setData(data);
	 
	 	return getTokenResponse;
	}
}