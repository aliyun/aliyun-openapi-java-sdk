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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.DsgDesensPlanDeleteResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DsgDesensPlanDeleteResponseUnmarshaller {

	public static DsgDesensPlanDeleteResponse unmarshall(DsgDesensPlanDeleteResponse dsgDesensPlanDeleteResponse, UnmarshallerContext _ctx) {
		
		dsgDesensPlanDeleteResponse.setRequestId(_ctx.stringValue("DsgDesensPlanDeleteResponse.RequestId"));
		dsgDesensPlanDeleteResponse.setSuccess(_ctx.booleanValue("DsgDesensPlanDeleteResponse.Success"));
		dsgDesensPlanDeleteResponse.setErrorCode(_ctx.stringValue("DsgDesensPlanDeleteResponse.ErrorCode"));
		dsgDesensPlanDeleteResponse.setErrorMessage(_ctx.stringValue("DsgDesensPlanDeleteResponse.ErrorMessage"));
		dsgDesensPlanDeleteResponse.setHttpStatusCode(_ctx.integerValue("DsgDesensPlanDeleteResponse.HttpStatusCode"));
		dsgDesensPlanDeleteResponse.setData(_ctx.booleanValue("DsgDesensPlanDeleteResponse.Data"));
	 
	 	return dsgDesensPlanDeleteResponse;
	}
}