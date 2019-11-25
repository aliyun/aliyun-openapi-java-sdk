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

import com.aliyuncs.cloudwifi_pop.model.v20191118.SaveApgroupSsidConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveApgroupSsidConfigResponseUnmarshaller {

	public static SaveApgroupSsidConfigResponse unmarshall(SaveApgroupSsidConfigResponse saveApgroupSsidConfigResponse, UnmarshallerContext _ctx) {
		
		saveApgroupSsidConfigResponse.setIsSuccess(_ctx.booleanValue("SaveApgroupSsidConfigResponse.IsSuccess"));
		saveApgroupSsidConfigResponse.setErrorCode(_ctx.integerValue("SaveApgroupSsidConfigResponse.ErrorCode"));
		saveApgroupSsidConfigResponse.setErrorMessage(_ctx.stringValue("SaveApgroupSsidConfigResponse.ErrorMessage"));

		List<Long> data = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("SaveApgroupSsidConfigResponse.Data.Length"); i++) {
			data.add(_ctx.longValue("SaveApgroupSsidConfigResponse.Data["+ i +"]"));
		}
		saveApgroupSsidConfigResponse.setData(data);
	 
	 	return saveApgroupSsidConfigResponse;
	}
}