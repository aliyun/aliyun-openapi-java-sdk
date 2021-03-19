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

package com.aliyuncs.mindlive.transform.v20210301;

import com.aliyuncs.mindlive.model.v20210301.RequestOssStsResponse;
import com.aliyuncs.mindlive.model.v20210301.RequestOssStsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestOssStsResponseUnmarshaller {

	public static RequestOssStsResponse unmarshall(RequestOssStsResponse requestOssStsResponse, UnmarshallerContext _ctx) {
		
		requestOssStsResponse.setRequestId(_ctx.stringValue("RequestOssStsResponse.RequestId"));
		requestOssStsResponse.setSuccess(_ctx.booleanValue("RequestOssStsResponse.Success"));
		requestOssStsResponse.setErrorCode(_ctx.stringValue("RequestOssStsResponse.ErrorCode"));
		requestOssStsResponse.setErrorMessage(_ctx.stringValue("RequestOssStsResponse.ErrorMessage"));

		Data data = new Data();
		data.setEndPoint(_ctx.stringValue("RequestOssStsResponse.Data.EndPoint"));
		data.setBucket(_ctx.stringValue("RequestOssStsResponse.Data.Bucket"));
		data.setObjectKeyPrefix(_ctx.stringValue("RequestOssStsResponse.Data.ObjectKeyPrefix"));
		data.setAccessKeyId(_ctx.stringValue("RequestOssStsResponse.Data.AccessKeyId"));
		data.setAccessKeySecret(_ctx.stringValue("RequestOssStsResponse.Data.AccessKeySecret"));
		data.setSecurityToken(_ctx.stringValue("RequestOssStsResponse.Data.SecurityToken"));
		data.setExpire(_ctx.stringValue("RequestOssStsResponse.Data.Expire"));
		requestOssStsResponse.setData(data);
	 
	 	return requestOssStsResponse;
	}
}