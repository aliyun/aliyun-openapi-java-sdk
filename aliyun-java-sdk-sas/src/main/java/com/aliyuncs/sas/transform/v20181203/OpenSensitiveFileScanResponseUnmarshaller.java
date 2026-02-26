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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.OpenSensitiveFileScanResponse;
import com.aliyuncs.sas.model.v20181203.OpenSensitiveFileScanResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpenSensitiveFileScanResponseUnmarshaller {

	public static OpenSensitiveFileScanResponse unmarshall(OpenSensitiveFileScanResponse openSensitiveFileScanResponse, UnmarshallerContext _ctx) {
		
		openSensitiveFileScanResponse.setRequestId(_ctx.stringValue("OpenSensitiveFileScanResponse.RequestId"));
		openSensitiveFileScanResponse.setSuccess(_ctx.booleanValue("OpenSensitiveFileScanResponse.Success"));
		openSensitiveFileScanResponse.setCode(_ctx.stringValue("OpenSensitiveFileScanResponse.Code"));
		openSensitiveFileScanResponse.setMessage(_ctx.stringValue("OpenSensitiveFileScanResponse.Message"));
		openSensitiveFileScanResponse.setHttpStatusCode(_ctx.integerValue("OpenSensitiveFileScanResponse.HttpStatusCode"));

		Data data = new Data();
		data.setSwitchOn(_ctx.stringValue("OpenSensitiveFileScanResponse.Data.SwitchOn"));
		openSensitiveFileScanResponse.setData(data);
	 
	 	return openSensitiveFileScanResponse;
	}
}