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

package com.aliyuncs.mpaas.transform.v20201028;

import com.aliyuncs.mpaas.model.v20201028.ExportMappCenterAppConfigResponse;
import com.aliyuncs.mpaas.model.v20201028.ExportMappCenterAppConfigResponse.ExportMappCenterAppConfigResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExportMappCenterAppConfigResponseUnmarshaller {

	public static ExportMappCenterAppConfigResponse unmarshall(ExportMappCenterAppConfigResponse exportMappCenterAppConfigResponse, UnmarshallerContext _ctx) {
		
		exportMappCenterAppConfigResponse.setRequestId(_ctx.stringValue("ExportMappCenterAppConfigResponse.RequestId"));
		exportMappCenterAppConfigResponse.setResultCode(_ctx.stringValue("ExportMappCenterAppConfigResponse.ResultCode"));
		exportMappCenterAppConfigResponse.setResultMessage(_ctx.stringValue("ExportMappCenterAppConfigResponse.ResultMessage"));

		ExportMappCenterAppConfigResult exportMappCenterAppConfigResult = new ExportMappCenterAppConfigResult();
		exportMappCenterAppConfigResult.setConfigDownloadUrl(_ctx.stringValue("ExportMappCenterAppConfigResponse.ExportMappCenterAppConfigResult.ConfigDownloadUrl"));
		exportMappCenterAppConfigResult.setResultMsg(_ctx.stringValue("ExportMappCenterAppConfigResponse.ExportMappCenterAppConfigResult.ResultMsg"));
		exportMappCenterAppConfigResult.setSuccess(_ctx.booleanValue("ExportMappCenterAppConfigResponse.ExportMappCenterAppConfigResult.Success"));
		exportMappCenterAppConfigResponse.setExportMappCenterAppConfigResult(exportMappCenterAppConfigResult);
	 
	 	return exportMappCenterAppConfigResponse;
	}
}