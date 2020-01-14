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

import com.aliyuncs.cloudwifi_pop.model.v20191118.GetApRunHistoryTimeSerResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApRunHistoryTimeSerResponseUnmarshaller {

	public static GetApRunHistoryTimeSerResponse unmarshall(GetApRunHistoryTimeSerResponse getApRunHistoryTimeSerResponse, UnmarshallerContext _ctx) {
		
		getApRunHistoryTimeSerResponse.setRequestId(_ctx.stringValue("GetApRunHistoryTimeSerResponse.RequestId"));
		getApRunHistoryTimeSerResponse.setData(_ctx.mapValue("GetApRunHistoryTimeSerResponse.Data"));
		getApRunHistoryTimeSerResponse.setIsSuccess(_ctx.booleanValue("GetApRunHistoryTimeSerResponse.IsSuccess"));
		getApRunHistoryTimeSerResponse.setErrorCode(_ctx.integerValue("GetApRunHistoryTimeSerResponse.ErrorCode"));
		getApRunHistoryTimeSerResponse.setErrorMessage(_ctx.stringValue("GetApRunHistoryTimeSerResponse.ErrorMessage"));
	 
	 	return getApRunHistoryTimeSerResponse;
	}
}