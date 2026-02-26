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

import com.aliyuncs.cloudwifi_pop.model.v20191118.GetStaDetailedStatusByMacResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStaDetailedStatusByMacResponseUnmarshaller {

	public static GetStaDetailedStatusByMacResponse unmarshall(GetStaDetailedStatusByMacResponse getStaDetailedStatusByMacResponse, UnmarshallerContext _ctx) {
		
		getStaDetailedStatusByMacResponse.setRequestId(_ctx.stringValue("GetStaDetailedStatusByMacResponse.RequestId"));
		getStaDetailedStatusByMacResponse.setData(_ctx.mapValue("GetStaDetailedStatusByMacResponse.Data"));
		getStaDetailedStatusByMacResponse.setErrorMessage(_ctx.stringValue("GetStaDetailedStatusByMacResponse.ErrorMessage"));
		getStaDetailedStatusByMacResponse.setIsSuccess(_ctx.booleanValue("GetStaDetailedStatusByMacResponse.IsSuccess"));
		getStaDetailedStatusByMacResponse.setErrorCode(_ctx.integerValue("GetStaDetailedStatusByMacResponse.ErrorCode"));
	 
	 	return getStaDetailedStatusByMacResponse;
	}
}