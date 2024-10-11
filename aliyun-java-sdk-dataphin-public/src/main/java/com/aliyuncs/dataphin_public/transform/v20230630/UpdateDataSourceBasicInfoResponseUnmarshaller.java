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

import com.aliyuncs.dataphin_public.model.v20230630.UpdateDataSourceBasicInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateDataSourceBasicInfoResponseUnmarshaller {

	public static UpdateDataSourceBasicInfoResponse unmarshall(UpdateDataSourceBasicInfoResponse updateDataSourceBasicInfoResponse, UnmarshallerContext _ctx) {
		
		updateDataSourceBasicInfoResponse.setRequestId(_ctx.stringValue("UpdateDataSourceBasicInfoResponse.RequestId"));
		updateDataSourceBasicInfoResponse.setSuccess(_ctx.booleanValue("UpdateDataSourceBasicInfoResponse.Success"));
		updateDataSourceBasicInfoResponse.setHttpStatusCode(_ctx.integerValue("UpdateDataSourceBasicInfoResponse.HttpStatusCode"));
		updateDataSourceBasicInfoResponse.setCode(_ctx.stringValue("UpdateDataSourceBasicInfoResponse.Code"));
		updateDataSourceBasicInfoResponse.setMessage(_ctx.stringValue("UpdateDataSourceBasicInfoResponse.Message"));
		updateDataSourceBasicInfoResponse.setData(_ctx.booleanValue("UpdateDataSourceBasicInfoResponse.Data"));
	 
	 	return updateDataSourceBasicInfoResponse;
	}
}