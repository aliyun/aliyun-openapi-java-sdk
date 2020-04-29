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

package com.aliyuncs.reid.transform.v20200422;

import com.aliyuncs.reid.model.v20200422.ImportBizDataResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImportBizDataResponseUnmarshaller {

	public static ImportBizDataResponse unmarshall(ImportBizDataResponse importBizDataResponse, UnmarshallerContext _ctx) {
		
		importBizDataResponse.setRequestId(_ctx.stringValue("ImportBizDataResponse.RequestId"));
		importBizDataResponse.setErrorCode(_ctx.stringValue("ImportBizDataResponse.ErrorCode"));
		importBizDataResponse.setErrorMessage(_ctx.stringValue("ImportBizDataResponse.ErrorMessage"));
		importBizDataResponse.setMessage(_ctx.stringValue("ImportBizDataResponse.Message"));
		importBizDataResponse.setCode(_ctx.stringValue("ImportBizDataResponse.Code"));
		importBizDataResponse.setDynamicCode(_ctx.stringValue("ImportBizDataResponse.DynamicCode"));
		importBizDataResponse.setSuccess(_ctx.booleanValue("ImportBizDataResponse.Success"));
		importBizDataResponse.setDynamicMessage(_ctx.stringValue("ImportBizDataResponse.DynamicMessage"));
	 
	 	return importBizDataResponse;
	}
}