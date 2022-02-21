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

import com.aliyuncs.cloudwifi_pop.model.v20191118.GetApgroupSsidConfigResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApgroupSsidConfigResponseUnmarshaller {

	public static GetApgroupSsidConfigResponse unmarshall(GetApgroupSsidConfigResponse getApgroupSsidConfigResponse, UnmarshallerContext _ctx) {
		
		getApgroupSsidConfigResponse.setIsSuccess(_ctx.booleanValue("GetApgroupSsidConfigResponse.IsSuccess"));
		getApgroupSsidConfigResponse.setErrorMessage(_ctx.stringValue("GetApgroupSsidConfigResponse.ErrorMessage"));
		getApgroupSsidConfigResponse.setErrorCode(_ctx.integerValue("GetApgroupSsidConfigResponse.ErrorCode"));

		List<Map<Object, Object>> data = _ctx.listMapValue("GetApgroupSsidConfigResponse.Data");
		getApgroupSsidConfigResponse.setData(data);
	 
	 	return getApgroupSsidConfigResponse;
	}
}