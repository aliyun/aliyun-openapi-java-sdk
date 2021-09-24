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

import com.aliyuncs.mse.model.v20190531.ExportNacosConfigResponse;
import com.aliyuncs.mse.model.v20190531.ExportNacosConfigResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExportNacosConfigResponseUnmarshaller {

	public static ExportNacosConfigResponse unmarshall(ExportNacosConfigResponse exportNacosConfigResponse, UnmarshallerContext _ctx) {
		
		exportNacosConfigResponse.setRequestId(_ctx.stringValue("ExportNacosConfigResponse.RequestId"));
		exportNacosConfigResponse.setHttpStatusCode(_ctx.integerValue("ExportNacosConfigResponse.HttpStatusCode"));
		exportNacosConfigResponse.setSuccess(_ctx.booleanValue("ExportNacosConfigResponse.Success"));
		exportNacosConfigResponse.setErrorCode(_ctx.stringValue("ExportNacosConfigResponse.ErrorCode"));
		exportNacosConfigResponse.setCode(_ctx.integerValue("ExportNacosConfigResponse.Code"));
		exportNacosConfigResponse.setMessage(_ctx.stringValue("ExportNacosConfigResponse.Message"));
		exportNacosConfigResponse.setDynamicMessage(_ctx.stringValue("ExportNacosConfigResponse.DynamicMessage"));

		Data data = new Data();
		data.setUrl(_ctx.stringValue("ExportNacosConfigResponse.Data.Url"));
		exportNacosConfigResponse.setData(data);
	 
	 	return exportNacosConfigResponse;
	}
}