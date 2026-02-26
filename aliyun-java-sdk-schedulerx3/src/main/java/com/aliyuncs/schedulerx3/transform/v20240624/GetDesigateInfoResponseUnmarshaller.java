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

package com.aliyuncs.schedulerx3.transform.v20240624;

import com.aliyuncs.schedulerx3.model.v20240624.GetDesigateInfoResponse;
import com.aliyuncs.schedulerx3.model.v20240624.GetDesigateInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDesigateInfoResponseUnmarshaller {

	public static GetDesigateInfoResponse unmarshall(GetDesigateInfoResponse getDesigateInfoResponse, UnmarshallerContext _ctx) {
		
		getDesigateInfoResponse.setRequestId(_ctx.stringValue("GetDesigateInfoResponse.RequestId"));
		getDesigateInfoResponse.setCode(_ctx.integerValue("GetDesigateInfoResponse.Code"));
		getDesigateInfoResponse.setMessage(_ctx.stringValue("GetDesigateInfoResponse.Message"));
		getDesigateInfoResponse.setSuccess(_ctx.booleanValue("GetDesigateInfoResponse.Success"));

		Data data = new Data();
		data.setDesignateType(_ctx.integerValue("GetDesigateInfoResponse.Data.DesignateType"));
		data.setTransferable(_ctx.booleanValue("GetDesigateInfoResponse.Data.Transferable"));
		getDesigateInfoResponse.setData(data);
	 
	 	return getDesigateInfoResponse;
	}
}