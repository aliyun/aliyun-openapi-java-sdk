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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.GetImportFileUrlResponse;
import com.aliyuncs.mse.model.v20190531.GetImportFileUrlResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetImportFileUrlResponseUnmarshaller {

	public static GetImportFileUrlResponse unmarshall(GetImportFileUrlResponse getImportFileUrlResponse, UnmarshallerContext _ctx) {
		
		getImportFileUrlResponse.setRequestId(_ctx.stringValue("GetImportFileUrlResponse.RequestId"));
		getImportFileUrlResponse.setSuccess(_ctx.booleanValue("GetImportFileUrlResponse.Success"));
		getImportFileUrlResponse.setMessage(_ctx.stringValue("GetImportFileUrlResponse.Message"));
		getImportFileUrlResponse.setErrorCode(_ctx.stringValue("GetImportFileUrlResponse.ErrorCode"));
		getImportFileUrlResponse.setHttpStatusCode(_ctx.integerValue("GetImportFileUrlResponse.HttpStatusCode"));
		getImportFileUrlResponse.setCode(_ctx.integerValue("GetImportFileUrlResponse.Code"));
		getImportFileUrlResponse.setDynamicMessage(_ctx.stringValue("GetImportFileUrlResponse.DynamicMessage"));

		Data data = new Data();
		data.setUrl(_ctx.stringValue("GetImportFileUrlResponse.Data.Url"));
		getImportFileUrlResponse.setData(data);
	 
	 	return getImportFileUrlResponse;
	}
}