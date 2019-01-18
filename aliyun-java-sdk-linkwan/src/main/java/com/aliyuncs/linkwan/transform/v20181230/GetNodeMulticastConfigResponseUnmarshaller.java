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

package com.aliyuncs.linkwan.transform.v20181230;

import com.aliyuncs.linkwan.model.v20181230.GetNodeMulticastConfigResponse;
import com.aliyuncs.linkwan.model.v20181230.GetNodeMulticastConfigResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNodeMulticastConfigResponseUnmarshaller {

	public static GetNodeMulticastConfigResponse unmarshall(GetNodeMulticastConfigResponse getNodeMulticastConfigResponse, UnmarshallerContext context) {
		
		getNodeMulticastConfigResponse.setRequestId(context.stringValue("GetNodeMulticastConfigResponse.RequestId"));
		getNodeMulticastConfigResponse.setSuccess(context.booleanValue("GetNodeMulticastConfigResponse.Success"));

		Data data = new Data();
		data.setDevEui(context.stringValue("GetNodeMulticastConfigResponse.Data.DevEui"));
		data.setMcAddress1(context.stringValue("GetNodeMulticastConfigResponse.Data.McAddress1"));
		data.setMcAddress2(context.stringValue("GetNodeMulticastConfigResponse.Data.McAddress2"));
		data.setMcAddress3(context.stringValue("GetNodeMulticastConfigResponse.Data.McAddress3"));
		data.setMcAddress4(context.stringValue("GetNodeMulticastConfigResponse.Data.McAddress4"));
		getNodeMulticastConfigResponse.setData(data);
	 
	 	return getNodeMulticastConfigResponse;
	}
}