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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.ExportDTXAppConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExportDTXAppConfigResponseUnmarshaller {

	public static ExportDTXAppConfigResponse unmarshall(ExportDTXAppConfigResponse exportDTXAppConfigResponse, UnmarshallerContext _ctx) {
		
		exportDTXAppConfigResponse.setRequestId(_ctx.stringValue("ExportDTXAppConfigResponse.RequestId"));
		exportDTXAppConfigResponse.setResultCode(_ctx.stringValue("ExportDTXAppConfigResponse.ResultCode"));
		exportDTXAppConfigResponse.setResultMessage(_ctx.stringValue("ExportDTXAppConfigResponse.ResultMessage"));
		exportDTXAppConfigResponse.setSuccess(_ctx.booleanValue("ExportDTXAppConfigResponse.Success"));
		exportDTXAppConfigResponse.setUrl(_ctx.stringValue("ExportDTXAppConfigResponse.Url"));
	 
	 	return exportDTXAppConfigResponse;
	}
}