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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.RescaleApplicationResponse;
import com.aliyuncs.sae.model.v20190506.RescaleApplicationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RescaleApplicationResponseUnmarshaller {

	public static RescaleApplicationResponse unmarshall(RescaleApplicationResponse rescaleApplicationResponse, UnmarshallerContext _ctx) {
		
		rescaleApplicationResponse.setRequestId(_ctx.stringValue("RescaleApplicationResponse.RequestId"));
		rescaleApplicationResponse.setCode(_ctx.stringValue("RescaleApplicationResponse.Code"));
		rescaleApplicationResponse.setMessage(_ctx.stringValue("RescaleApplicationResponse.Message"));
		rescaleApplicationResponse.setSuccess(_ctx.booleanValue("RescaleApplicationResponse.Success"));
		rescaleApplicationResponse.setErrorCode(_ctx.stringValue("RescaleApplicationResponse.ErrorCode"));

		Data data = new Data();
		data.setChangeOrderId(_ctx.stringValue("RescaleApplicationResponse.Data.ChangeOrderId"));
		rescaleApplicationResponse.setData(data);
	 
	 	return rescaleApplicationResponse;
	}
}