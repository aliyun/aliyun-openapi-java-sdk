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

import com.aliyuncs.dataphin_public.model.v20230630.ResetDataServiceAppSecretResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ResetDataServiceAppSecretResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResetDataServiceAppSecretResponseUnmarshaller {

	public static ResetDataServiceAppSecretResponse unmarshall(ResetDataServiceAppSecretResponse resetDataServiceAppSecretResponse, UnmarshallerContext _ctx) {
		
		resetDataServiceAppSecretResponse.setRequestId(_ctx.stringValue("ResetDataServiceAppSecretResponse.RequestId"));
		resetDataServiceAppSecretResponse.setMessage(_ctx.stringValue("ResetDataServiceAppSecretResponse.Message"));
		resetDataServiceAppSecretResponse.setHttpStatusCode(_ctx.integerValue("ResetDataServiceAppSecretResponse.HttpStatusCode"));
		resetDataServiceAppSecretResponse.setCode(_ctx.stringValue("ResetDataServiceAppSecretResponse.Code"));
		resetDataServiceAppSecretResponse.setSuccess(_ctx.booleanValue("ResetDataServiceAppSecretResponse.Success"));

		Data data = new Data();
		data.setAppKey(_ctx.stringValue("ResetDataServiceAppSecretResponse.Data.AppKey"));
		data.setAppSecret(_ctx.stringValue("ResetDataServiceAppSecretResponse.Data.AppSecret"));
		resetDataServiceAppSecretResponse.setData(data);
	 
	 	return resetDataServiceAppSecretResponse;
	}
}