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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.ExistCASApplicationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExistCASApplicationResponseUnmarshaller {

	public static ExistCASApplicationResponse unmarshall(ExistCASApplicationResponse existCASApplicationResponse, UnmarshallerContext _ctx) {
		
		existCASApplicationResponse.setRequestId(_ctx.stringValue("ExistCASApplicationResponse.RequestId"));
		existCASApplicationResponse.setResultCode(_ctx.stringValue("ExistCASApplicationResponse.ResultCode"));
		existCASApplicationResponse.setResultMessage(_ctx.stringValue("ExistCASApplicationResponse.ResultMessage"));
		existCASApplicationResponse.setData(_ctx.booleanValue("ExistCASApplicationResponse.Data"));
	 
	 	return existCASApplicationResponse;
	}
}