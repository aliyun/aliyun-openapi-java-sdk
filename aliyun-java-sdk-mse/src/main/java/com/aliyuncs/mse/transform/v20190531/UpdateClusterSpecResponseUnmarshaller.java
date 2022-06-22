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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.UpdateClusterSpecResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateClusterSpecResponseUnmarshaller {

	public static UpdateClusterSpecResponse unmarshall(UpdateClusterSpecResponse updateClusterSpecResponse, UnmarshallerContext _ctx) {
		
		updateClusterSpecResponse.setRequestId(_ctx.stringValue("UpdateClusterSpecResponse.RequestId"));
		updateClusterSpecResponse.setHttpStatusCode(_ctx.integerValue("UpdateClusterSpecResponse.HttpStatusCode"));
		updateClusterSpecResponse.setMessage(_ctx.stringValue("UpdateClusterSpecResponse.Message"));
		updateClusterSpecResponse.setCode(_ctx.integerValue("UpdateClusterSpecResponse.Code"));
		updateClusterSpecResponse.setSuccess(_ctx.booleanValue("UpdateClusterSpecResponse.Success"));
		updateClusterSpecResponse.setData(_ctx.stringValue("UpdateClusterSpecResponse.Data"));
	 
	 	return updateClusterSpecResponse;
	}
}