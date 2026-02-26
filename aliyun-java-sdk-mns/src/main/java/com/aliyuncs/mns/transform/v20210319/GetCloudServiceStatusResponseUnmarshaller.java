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

package com.aliyuncs.mns.transform.v20210319;

import com.aliyuncs.mns.model.v20210319.GetCloudServiceStatusResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCloudServiceStatusResponseUnmarshaller {

	public static GetCloudServiceStatusResponse unmarshall(GetCloudServiceStatusResponse getCloudServiceStatusResponse, UnmarshallerContext _ctx) {
		
		getCloudServiceStatusResponse.setRequestId(_ctx.stringValue("GetCloudServiceStatusResponse.RequestId"));
		getCloudServiceStatusResponse.setCode(_ctx.longValue("GetCloudServiceStatusResponse.Code"));
		getCloudServiceStatusResponse.setStatus(_ctx.stringValue("GetCloudServiceStatusResponse.Status"));
		getCloudServiceStatusResponse.setMessage(_ctx.stringValue("GetCloudServiceStatusResponse.Message"));
		getCloudServiceStatusResponse.setSuccess(_ctx.booleanValue("GetCloudServiceStatusResponse.Success"));
		getCloudServiceStatusResponse.setData(_ctx.mapValue("GetCloudServiceStatusResponse.Data"));
	 
	 	return getCloudServiceStatusResponse;
	}
}