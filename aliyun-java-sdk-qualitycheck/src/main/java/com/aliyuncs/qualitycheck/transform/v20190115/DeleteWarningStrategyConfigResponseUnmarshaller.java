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

package com.aliyuncs.qualitycheck.transform.v20190115;

import com.aliyuncs.qualitycheck.model.v20190115.DeleteWarningStrategyConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteWarningStrategyConfigResponseUnmarshaller {

	public static DeleteWarningStrategyConfigResponse unmarshall(DeleteWarningStrategyConfigResponse deleteWarningStrategyConfigResponse, UnmarshallerContext _ctx) {
		
		deleteWarningStrategyConfigResponse.setRequestId(_ctx.stringValue("DeleteWarningStrategyConfigResponse.RequestId"));
		deleteWarningStrategyConfigResponse.setCode(_ctx.stringValue("DeleteWarningStrategyConfigResponse.Code"));
		deleteWarningStrategyConfigResponse.setMessage(_ctx.stringValue("DeleteWarningStrategyConfigResponse.Message"));
		deleteWarningStrategyConfigResponse.setData(_ctx.stringValue("DeleteWarningStrategyConfigResponse.Data"));
		deleteWarningStrategyConfigResponse.setSuccess(_ctx.booleanValue("DeleteWarningStrategyConfigResponse.Success"));
	 
	 	return deleteWarningStrategyConfigResponse;
	}
}