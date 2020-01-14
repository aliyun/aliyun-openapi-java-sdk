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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudwifi_pop.model.v20191118.GetRadioRunHistoryTimeSerResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRadioRunHistoryTimeSerResponseUnmarshaller {

	public static GetRadioRunHistoryTimeSerResponse unmarshall(GetRadioRunHistoryTimeSerResponse getRadioRunHistoryTimeSerResponse, UnmarshallerContext _ctx) {
		
		getRadioRunHistoryTimeSerResponse.setRequestId(_ctx.stringValue("GetRadioRunHistoryTimeSerResponse.RequestId"));
		getRadioRunHistoryTimeSerResponse.setIsSuccess(_ctx.booleanValue("GetRadioRunHistoryTimeSerResponse.IsSuccess"));
		getRadioRunHistoryTimeSerResponse.setErrorCode(_ctx.integerValue("GetRadioRunHistoryTimeSerResponse.ErrorCode"));
		getRadioRunHistoryTimeSerResponse.setErrorMessage(_ctx.stringValue("GetRadioRunHistoryTimeSerResponse.ErrorMessage"));

		List<Map<Object, Object>> data = _ctx.listMapValue("GetRadioRunHistoryTimeSerResponse.Data");
		getRadioRunHistoryTimeSerResponse.setData(data);
	 
	 	return getRadioRunHistoryTimeSerResponse;
	}
}