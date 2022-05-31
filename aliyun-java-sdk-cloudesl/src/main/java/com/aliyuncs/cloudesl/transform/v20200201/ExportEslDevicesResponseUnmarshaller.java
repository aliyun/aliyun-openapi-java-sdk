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

package com.aliyuncs.cloudesl.transform.v20200201;

import com.aliyuncs.cloudesl.model.v20200201.ExportEslDevicesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExportEslDevicesResponseUnmarshaller {

	public static ExportEslDevicesResponse unmarshall(ExportEslDevicesResponse exportEslDevicesResponse, UnmarshallerContext _ctx) {
		
		exportEslDevicesResponse.setRequestId(_ctx.stringValue("ExportEslDevicesResponse.RequestId"));
		exportEslDevicesResponse.setErrorMessage(_ctx.stringValue("ExportEslDevicesResponse.ErrorMessage"));
		exportEslDevicesResponse.setSuccess(_ctx.booleanValue("ExportEslDevicesResponse.Success"));
		exportEslDevicesResponse.setErrorCode(_ctx.stringValue("ExportEslDevicesResponse.ErrorCode"));
		exportEslDevicesResponse.setCode(_ctx.stringValue("ExportEslDevicesResponse.Code"));
		exportEslDevicesResponse.setMessage(_ctx.stringValue("ExportEslDevicesResponse.Message"));
		exportEslDevicesResponse.setDynamicMessage(_ctx.stringValue("ExportEslDevicesResponse.DynamicMessage"));
		exportEslDevicesResponse.setDynamicCode(_ctx.stringValue("ExportEslDevicesResponse.DynamicCode"));
		exportEslDevicesResponse.setDownloadAddress(_ctx.stringValue("ExportEslDevicesResponse.DownloadAddress"));
	 
	 	return exportEslDevicesResponse;
	}
}