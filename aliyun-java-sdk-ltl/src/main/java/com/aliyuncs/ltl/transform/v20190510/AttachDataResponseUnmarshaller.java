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

package com.aliyuncs.ltl.transform.v20190510;

import com.aliyuncs.ltl.model.v20190510.AttachDataResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AttachDataResponseUnmarshaller {

	public static AttachDataResponse unmarshall(AttachDataResponse attachDataResponse, UnmarshallerContext _ctx) {
		
		attachDataResponse.setRequestId(_ctx.stringValue("AttachDataResponse.RequestId"));
		attachDataResponse.setData(_ctx.stringValue("AttachDataResponse.Data"));
		attachDataResponse.setCode(_ctx.integerValue("AttachDataResponse.Code"));
		attachDataResponse.setSuccess(_ctx.booleanValue("AttachDataResponse.Success"));
		attachDataResponse.setMessage(_ctx.stringValue("AttachDataResponse.Message"));
	 
	 	return attachDataResponse;
	}
}