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

package com.aliyuncs.swas.transform.v20170810;

import com.aliyuncs.swas.model.v20170810.GetServerVncUrlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServerVncUrlResponseUnmarshaller {

	public static GetServerVncUrlResponse unmarshall(GetServerVncUrlResponse getServerVncUrlResponse, UnmarshallerContext _ctx) {
		
		getServerVncUrlResponse.setRequestId(_ctx.stringValue("GetServerVncUrlResponse.RequestId"));
		getServerVncUrlResponse.setIsSuccess(_ctx.booleanValue("GetServerVncUrlResponse.IsSuccess"));
		getServerVncUrlResponse.setVncUrl(_ctx.stringValue("GetServerVncUrlResponse.VncUrl"));
		getServerVncUrlResponse.setCode(_ctx.stringValue("GetServerVncUrlResponse.Code"));
	 
	 	return getServerVncUrlResponse;
	}
}