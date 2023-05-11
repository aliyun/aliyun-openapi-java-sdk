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

import com.aliyuncs.iot.model.v20180120.RefreshStudioAppTokenOpenResponse;
import com.aliyuncs.iot.model.v20180120.RefreshStudioAppTokenOpenResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RefreshStudioAppTokenOpenResponseUnmarshaller {

	public static RefreshStudioAppTokenOpenResponse unmarshall(RefreshStudioAppTokenOpenResponse refreshStudioAppTokenOpenResponse, UnmarshallerContext _ctx) {
		
		refreshStudioAppTokenOpenResponse.setRequestId(_ctx.stringValue("RefreshStudioAppTokenOpenResponse.RequestId"));
		refreshStudioAppTokenOpenResponse.setSuccess(_ctx.booleanValue("RefreshStudioAppTokenOpenResponse.Success"));
		refreshStudioAppTokenOpenResponse.setCode(_ctx.stringValue("RefreshStudioAppTokenOpenResponse.Code"));
		refreshStudioAppTokenOpenResponse.setErrorMessage(_ctx.stringValue("RefreshStudioAppTokenOpenResponse.ErrorMessage"));

		Data data = new Data();
		data.setIsEnable(_ctx.stringValue("RefreshStudioAppTokenOpenResponse.Data.IsEnable"));
		data.setType(_ctx.stringValue("RefreshStudioAppTokenOpenResponse.Data.Type"));
		data.setBizType(_ctx.stringValue("RefreshStudioAppTokenOpenResponse.Data.BizType"));
		data.setToken(_ctx.stringValue("RefreshStudioAppTokenOpenResponse.Data.Token"));
		data.setBizId(_ctx.stringValue("RefreshStudioAppTokenOpenResponse.Data.BizId"));
		refreshStudioAppTokenOpenResponse.setData(data);
	 
	 	return refreshStudioAppTokenOpenResponse;
	}
}