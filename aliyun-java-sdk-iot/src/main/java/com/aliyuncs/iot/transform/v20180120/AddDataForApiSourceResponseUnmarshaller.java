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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.AddDataForApiSourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddDataForApiSourceResponseUnmarshaller {

	public static AddDataForApiSourceResponse unmarshall(AddDataForApiSourceResponse addDataForApiSourceResponse, UnmarshallerContext _ctx) {
		
		addDataForApiSourceResponse.setRequestId(_ctx.stringValue("AddDataForApiSourceResponse.RequestId"));
		addDataForApiSourceResponse.setCode(_ctx.stringValue("AddDataForApiSourceResponse.Code"));
		addDataForApiSourceResponse.setData(_ctx.longValue("AddDataForApiSourceResponse.Data"));
		addDataForApiSourceResponse.setErrorMessage(_ctx.stringValue("AddDataForApiSourceResponse.ErrorMessage"));
		addDataForApiSourceResponse.setSuccess(_ctx.booleanValue("AddDataForApiSourceResponse.Success"));
	 
	 	return addDataForApiSourceResponse;
	}
}