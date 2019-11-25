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

package com.aliyuncs.cloudwifi_pop.transform.v20191118;

import com.aliyuncs.cloudwifi_pop.model.v20191118.GetApDetailedConfigResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApDetailedConfigResponseUnmarshaller {

	public static GetApDetailedConfigResponse unmarshall(GetApDetailedConfigResponse getApDetailedConfigResponse, UnmarshallerContext _ctx) {
		
		getApDetailedConfigResponse.setData(_ctx.mapValue("GetApDetailedConfigResponse.Data"));
		getApDetailedConfigResponse.setIsSuccess(_ctx.booleanValue("GetApDetailedConfigResponse.IsSuccess"));
		getApDetailedConfigResponse.setErrorCode(_ctx.integerValue("GetApDetailedConfigResponse.ErrorCode"));
		getApDetailedConfigResponse.setErrorMessage(_ctx.stringValue("GetApDetailedConfigResponse.ErrorMessage"));
	 
	 	return getApDetailedConfigResponse;
	}
}