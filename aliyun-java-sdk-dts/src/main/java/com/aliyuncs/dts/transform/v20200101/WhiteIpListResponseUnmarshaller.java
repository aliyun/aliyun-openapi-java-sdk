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

package com.aliyuncs.dts.transform.v20200101;

import com.aliyuncs.dts.model.v20200101.WhiteIpListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class WhiteIpListResponseUnmarshaller {

	public static WhiteIpListResponse unmarshall(WhiteIpListResponse whiteIpListResponse, UnmarshallerContext _ctx) {
		
		whiteIpListResponse.setRequestId(_ctx.stringValue("WhiteIpListResponse.RequestId"));
		whiteIpListResponse.setDynamicCode(_ctx.stringValue("WhiteIpListResponse.DynamicCode"));
		whiteIpListResponse.setDynamicMessage(_ctx.stringValue("WhiteIpListResponse.DynamicMessage"));
		whiteIpListResponse.setErrCode(_ctx.stringValue("WhiteIpListResponse.ErrCode"));
		whiteIpListResponse.setErrMessage(_ctx.stringValue("WhiteIpListResponse.ErrMessage"));
		whiteIpListResponse.setHttpStatusCode(_ctx.integerValue("WhiteIpListResponse.HttpStatusCode"));
		whiteIpListResponse.setSuccess(_ctx.booleanValue("WhiteIpListResponse.Success"));
		whiteIpListResponse.setIpList(_ctx.stringValue("WhiteIpListResponse.IpList"));
	 
	 	return whiteIpListResponse;
	}
}