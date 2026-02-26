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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.UpdateAdHocFileResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAdHocFileResponseUnmarshaller {

	public static UpdateAdHocFileResponse unmarshall(UpdateAdHocFileResponse updateAdHocFileResponse, UnmarshallerContext _ctx) {
		
		updateAdHocFileResponse.setRequestId(_ctx.stringValue("UpdateAdHocFileResponse.RequestId"));
		updateAdHocFileResponse.setSuccess(_ctx.booleanValue("UpdateAdHocFileResponse.Success"));
		updateAdHocFileResponse.setHttpStatusCode(_ctx.integerValue("UpdateAdHocFileResponse.HttpStatusCode"));
		updateAdHocFileResponse.setCode(_ctx.stringValue("UpdateAdHocFileResponse.Code"));
		updateAdHocFileResponse.setMessage(_ctx.stringValue("UpdateAdHocFileResponse.Message"));
	 
	 	return updateAdHocFileResponse;
	}
}