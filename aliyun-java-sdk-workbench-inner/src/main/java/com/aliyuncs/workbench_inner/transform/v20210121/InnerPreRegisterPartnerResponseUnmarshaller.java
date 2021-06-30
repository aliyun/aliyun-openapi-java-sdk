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

package com.aliyuncs.workbench_inner.transform.v20210121;

import com.aliyuncs.workbench_inner.model.v20210121.InnerPreRegisterPartnerResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerPreRegisterPartnerResponseUnmarshaller {

	public static InnerPreRegisterPartnerResponse unmarshall(InnerPreRegisterPartnerResponse innerPreRegisterPartnerResponse, UnmarshallerContext _ctx) {
		
		innerPreRegisterPartnerResponse.setRequestId(_ctx.stringValue("InnerPreRegisterPartnerResponse.RequestId"));
		innerPreRegisterPartnerResponse.setCode(_ctx.stringValue("InnerPreRegisterPartnerResponse.Code"));
		innerPreRegisterPartnerResponse.setData(_ctx.mapValue("InnerPreRegisterPartnerResponse.Data"));
		innerPreRegisterPartnerResponse.setMessage(_ctx.stringValue("InnerPreRegisterPartnerResponse.Message"));
	 
	 	return innerPreRegisterPartnerResponse;
	}
}