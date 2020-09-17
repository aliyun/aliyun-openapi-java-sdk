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

import com.aliyuncs.emap.model.v20200608.ExportStoreEmapResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExportStoreEmapResponseUnmarshaller {

	public static ExportStoreEmapResponse unmarshall(ExportStoreEmapResponse exportStoreEmapResponse, UnmarshallerContext _ctx) {
		
		exportStoreEmapResponse.setRequestId(_ctx.stringValue("ExportStoreEmapResponse.RequestId"));
		exportStoreEmapResponse.setMessage(_ctx.stringValue("ExportStoreEmapResponse.Message"));
		exportStoreEmapResponse.setErrorCode(_ctx.stringValue("ExportStoreEmapResponse.ErrorCode"));
		exportStoreEmapResponse.setErrorMessage(_ctx.stringValue("ExportStoreEmapResponse.ErrorMessage"));
		exportStoreEmapResponse.setUrl(_ctx.stringValue("ExportStoreEmapResponse.Url"));
		exportStoreEmapResponse.setDynamicMessage(_ctx.stringValue("ExportStoreEmapResponse.DynamicMessage"));
		exportStoreEmapResponse.setSuccess(_ctx.booleanValue("ExportStoreEmapResponse.Success"));
		exportStoreEmapResponse.setDynamicCode(_ctx.stringValue("ExportStoreEmapResponse.DynamicCode"));
		exportStoreEmapResponse.setCode(_ctx.stringValue("ExportStoreEmapResponse.Code"));
	 
	 	return exportStoreEmapResponse;
	}
}