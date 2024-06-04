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

import com.aliyuncs.dataworks_public.model.v20200518.DsgDesensPlanAddOrUpdateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DsgDesensPlanAddOrUpdateResponseUnmarshaller {

	public static DsgDesensPlanAddOrUpdateResponse unmarshall(DsgDesensPlanAddOrUpdateResponse dsgDesensPlanAddOrUpdateResponse, UnmarshallerContext _ctx) {
		
		dsgDesensPlanAddOrUpdateResponse.setRequestId(_ctx.stringValue("DsgDesensPlanAddOrUpdateResponse.RequestId"));
		dsgDesensPlanAddOrUpdateResponse.setSuccess(_ctx.booleanValue("DsgDesensPlanAddOrUpdateResponse.Success"));
		dsgDesensPlanAddOrUpdateResponse.setErrorCode(_ctx.stringValue("DsgDesensPlanAddOrUpdateResponse.ErrorCode"));
		dsgDesensPlanAddOrUpdateResponse.setErrorMessage(_ctx.stringValue("DsgDesensPlanAddOrUpdateResponse.ErrorMessage"));
		dsgDesensPlanAddOrUpdateResponse.setHttpStatusCode(_ctx.integerValue("DsgDesensPlanAddOrUpdateResponse.HttpStatusCode"));
		dsgDesensPlanAddOrUpdateResponse.setData(_ctx.booleanValue("DsgDesensPlanAddOrUpdateResponse.Data"));
	 
	 	return dsgDesensPlanAddOrUpdateResponse;
	}
}