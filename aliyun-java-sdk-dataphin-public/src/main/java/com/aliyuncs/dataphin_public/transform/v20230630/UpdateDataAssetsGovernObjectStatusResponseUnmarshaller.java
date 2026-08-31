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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.UpdateDataAssetsGovernObjectStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateDataAssetsGovernObjectStatusResponseUnmarshaller {

	public static UpdateDataAssetsGovernObjectStatusResponse unmarshall(UpdateDataAssetsGovernObjectStatusResponse updateDataAssetsGovernObjectStatusResponse, UnmarshallerContext _ctx) {
		
		updateDataAssetsGovernObjectStatusResponse.setRequestId(_ctx.stringValue("UpdateDataAssetsGovernObjectStatusResponse.RequestId"));
		updateDataAssetsGovernObjectStatusResponse.setMessage(_ctx.stringValue("UpdateDataAssetsGovernObjectStatusResponse.Message"));
		updateDataAssetsGovernObjectStatusResponse.setHttpStatusCode(_ctx.integerValue("UpdateDataAssetsGovernObjectStatusResponse.HttpStatusCode"));
		updateDataAssetsGovernObjectStatusResponse.setData(_ctx.integerValue("UpdateDataAssetsGovernObjectStatusResponse.Data"));
		updateDataAssetsGovernObjectStatusResponse.setCode(_ctx.stringValue("UpdateDataAssetsGovernObjectStatusResponse.Code"));
		updateDataAssetsGovernObjectStatusResponse.setSuccess(_ctx.booleanValue("UpdateDataAssetsGovernObjectStatusResponse.Success"));
	 
	 	return updateDataAssetsGovernObjectStatusResponse;
	}
}