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

import com.aliyuncs.iot.model.v20180120.GetStudioAppTokenOpenResponse;
import com.aliyuncs.iot.model.v20180120.GetStudioAppTokenOpenResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStudioAppTokenOpenResponseUnmarshaller {

	public static GetStudioAppTokenOpenResponse unmarshall(GetStudioAppTokenOpenResponse getStudioAppTokenOpenResponse, UnmarshallerContext _ctx) {
		
		getStudioAppTokenOpenResponse.setRequestId(_ctx.stringValue("GetStudioAppTokenOpenResponse.RequestId"));
		getStudioAppTokenOpenResponse.setSuccess(_ctx.booleanValue("GetStudioAppTokenOpenResponse.Success"));
		getStudioAppTokenOpenResponse.setCode(_ctx.stringValue("GetStudioAppTokenOpenResponse.Code"));
		getStudioAppTokenOpenResponse.setErrorMessage(_ctx.stringValue("GetStudioAppTokenOpenResponse.ErrorMessage"));

		Data data = new Data();
		data.setIsEnable(_ctx.stringValue("GetStudioAppTokenOpenResponse.Data.IsEnable"));
		data.setType(_ctx.stringValue("GetStudioAppTokenOpenResponse.Data.Type"));
		data.setBizType(_ctx.stringValue("GetStudioAppTokenOpenResponse.Data.BizType"));
		data.setToken(_ctx.stringValue("GetStudioAppTokenOpenResponse.Data.Token"));
		data.setBizId(_ctx.stringValue("GetStudioAppTokenOpenResponse.Data.BizId"));
		getStudioAppTokenOpenResponse.setData(data);
	 
	 	return getStudioAppTokenOpenResponse;
	}
}