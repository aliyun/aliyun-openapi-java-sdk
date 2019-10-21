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

package com.aliyuncs.baas.transform.v20181221;

import com.aliyuncs.baas.model.v20181221.DescribeFabricPeerLogsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFabricPeerLogsResponseUnmarshaller {

	public static DescribeFabricPeerLogsResponse unmarshall(DescribeFabricPeerLogsResponse describeFabricPeerLogsResponse, UnmarshallerContext _ctx) {
		
		describeFabricPeerLogsResponse.setRequestId(_ctx.stringValue("DescribeFabricPeerLogsResponse.RequestId"));
		describeFabricPeerLogsResponse.setSuccess(_ctx.booleanValue("DescribeFabricPeerLogsResponse.Success"));
		describeFabricPeerLogsResponse.setErrorCode(_ctx.integerValue("DescribeFabricPeerLogsResponse.ErrorCode"));
		describeFabricPeerLogsResponse.setResult(_ctx.stringValue("DescribeFabricPeerLogsResponse.Result"));
	 
	 	return describeFabricPeerLogsResponse;
	}
}