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

package com.aliyuncs.emap.transform.v20200608;

import com.aliyuncs.emap.model.v20200608.ImportEmapResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImportEmapResponseUnmarshaller {

	public static ImportEmapResponse unmarshall(ImportEmapResponse importEmapResponse, UnmarshallerContext _ctx) {
		
		importEmapResponse.setRequestId(_ctx.stringValue("ImportEmapResponse.RequestId"));
		importEmapResponse.setMessage(_ctx.stringValue("ImportEmapResponse.Message"));
		importEmapResponse.setErrorCode(_ctx.stringValue("ImportEmapResponse.ErrorCode"));
		importEmapResponse.setErrorMessage(_ctx.stringValue("ImportEmapResponse.ErrorMessage"));
		importEmapResponse.setDynamicMessage(_ctx.stringValue("ImportEmapResponse.DynamicMessage"));
		importEmapResponse.setSuccess(_ctx.booleanValue("ImportEmapResponse.Success"));
		importEmapResponse.setDynamicCode(_ctx.stringValue("ImportEmapResponse.DynamicCode"));
		importEmapResponse.setCode(_ctx.stringValue("ImportEmapResponse.Code"));
	 
	 	return importEmapResponse;
	}
}