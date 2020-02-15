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

import com.aliyuncs.baas.model.v20181221.BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponseUnmarshaller {

	public static BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse unmarshall(BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse batchAddAntChainMiniAppQRCodeAuthorizedUsersResponse, UnmarshallerContext _ctx) {
		
		batchAddAntChainMiniAppQRCodeAuthorizedUsersResponse.setRequestId(_ctx.stringValue("BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse.RequestId"));
		batchAddAntChainMiniAppQRCodeAuthorizedUsersResponse.setResult(_ctx.stringValue("BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse.Result"));
	 
	 	return batchAddAntChainMiniAppQRCodeAuthorizedUsersResponse;
	}
}