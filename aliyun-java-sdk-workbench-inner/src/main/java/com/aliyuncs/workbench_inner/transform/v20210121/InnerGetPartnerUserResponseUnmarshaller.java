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

import com.aliyuncs.workbench_inner.model.v20210121.InnerGetPartnerUserResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerGetPartnerUserResponseUnmarshaller {

	public static InnerGetPartnerUserResponse unmarshall(InnerGetPartnerUserResponse innerGetPartnerUserResponse, UnmarshallerContext _ctx) {
		
		innerGetPartnerUserResponse.setRequestId(_ctx.stringValue("InnerGetPartnerUserResponse.RequestId"));
		innerGetPartnerUserResponse.setCode(_ctx.stringValue("InnerGetPartnerUserResponse.Code"));
		innerGetPartnerUserResponse.setData(_ctx.mapValue("InnerGetPartnerUserResponse.Data"));
		innerGetPartnerUserResponse.setMessage(_ctx.stringValue("InnerGetPartnerUserResponse.Message"));
	 
	 	return innerGetPartnerUserResponse;
	}
}