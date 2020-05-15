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

package com.aliyuncs.address_purification.transform.v20191118;

import com.aliyuncs.address_purification.model.v20191118.GetAlgorithmResultResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAlgorithmResultResponseUnmarshaller {

	public static GetAlgorithmResultResponse unmarshall(GetAlgorithmResultResponse getAlgorithmResultResponse, UnmarshallerContext _ctx) {
		
		getAlgorithmResultResponse.setRequestId(_ctx.stringValue("GetAlgorithmResultResponse.RequestId"));
		getAlgorithmResultResponse.setSuccess(_ctx.booleanValue("GetAlgorithmResultResponse.Success"));
		getAlgorithmResultResponse.setCode(_ctx.stringValue("GetAlgorithmResultResponse.Code"));
		getAlgorithmResultResponse.setErrMessage(_ctx.stringValue("GetAlgorithmResultResponse.ErrMessage"));
		getAlgorithmResultResponse.setData(_ctx.stringValue("GetAlgorithmResultResponse.Data"));
	 
	 	return getAlgorithmResultResponse;
	}
}