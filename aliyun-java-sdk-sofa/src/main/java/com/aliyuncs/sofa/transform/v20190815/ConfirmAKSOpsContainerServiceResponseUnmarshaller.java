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

import com.aliyuncs.sofa.model.v20190815.ConfirmAKSOpsContainerServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConfirmAKSOpsContainerServiceResponseUnmarshaller {

	public static ConfirmAKSOpsContainerServiceResponse unmarshall(ConfirmAKSOpsContainerServiceResponse confirmAKSOpsContainerServiceResponse, UnmarshallerContext _ctx) {
		
		confirmAKSOpsContainerServiceResponse.setRequestId(_ctx.stringValue("ConfirmAKSOpsContainerServiceResponse.RequestId"));
		confirmAKSOpsContainerServiceResponse.setResultCode(_ctx.stringValue("ConfirmAKSOpsContainerServiceResponse.ResultCode"));
		confirmAKSOpsContainerServiceResponse.setResultMessage(_ctx.stringValue("ConfirmAKSOpsContainerServiceResponse.ResultMessage"));
		confirmAKSOpsContainerServiceResponse.setData(_ctx.stringValue("ConfirmAKSOpsContainerServiceResponse.Data"));
	 
	 	return confirmAKSOpsContainerServiceResponse;
	}
}