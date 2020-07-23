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

package com.aliyuncs.kms.transform.v20160120;

import com.aliyuncs.kms.model.v20160120.ExportDataKeyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExportDataKeyResponseUnmarshaller {

	public static ExportDataKeyResponse unmarshall(ExportDataKeyResponse exportDataKeyResponse, UnmarshallerContext _ctx) {
		
		exportDataKeyResponse.setRequestId(_ctx.stringValue("ExportDataKeyResponse.RequestId"));
		exportDataKeyResponse.setExportedDataKey(_ctx.stringValue("ExportDataKeyResponse.ExportedDataKey"));
		exportDataKeyResponse.setKeyId(_ctx.stringValue("ExportDataKeyResponse.KeyId"));
		exportDataKeyResponse.setKeyVersionId(_ctx.stringValue("ExportDataKeyResponse.KeyVersionId"));
	 
	 	return exportDataKeyResponse;
	}
}