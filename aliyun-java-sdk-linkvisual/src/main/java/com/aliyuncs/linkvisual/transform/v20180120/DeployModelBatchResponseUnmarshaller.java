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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.DeployModelBatchResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeployModelBatchResponseUnmarshaller {

	public static DeployModelBatchResponse unmarshall(DeployModelBatchResponse deployModelBatchResponse, UnmarshallerContext _ctx) {
		
		deployModelBatchResponse.setRequestId(_ctx.stringValue("DeployModelBatchResponse.RequestId"));
		deployModelBatchResponse.setSuccess(_ctx.booleanValue("DeployModelBatchResponse.Success"));
		deployModelBatchResponse.setCode(_ctx.stringValue("DeployModelBatchResponse.Code"));
		deployModelBatchResponse.setErrorMessage(_ctx.stringValue("DeployModelBatchResponse.ErrorMessage"));

		List<Map<Object, Object>> data = _ctx.listMapValue("DeployModelBatchResponse.Data");
		deployModelBatchResponse.setData(data);
	 
	 	return deployModelBatchResponse;
	}
}