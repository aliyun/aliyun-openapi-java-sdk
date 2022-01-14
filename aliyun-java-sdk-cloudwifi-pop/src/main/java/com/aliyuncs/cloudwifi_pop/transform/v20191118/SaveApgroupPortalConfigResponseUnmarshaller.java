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

import com.aliyuncs.cloudwifi_pop.model.v20191118.SaveApgroupPortalConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveApgroupPortalConfigResponseUnmarshaller {

	public static SaveApgroupPortalConfigResponse unmarshall(SaveApgroupPortalConfigResponse saveApgroupPortalConfigResponse, UnmarshallerContext _ctx) {
		
		saveApgroupPortalConfigResponse.setRequestId(_ctx.stringValue("SaveApgroupPortalConfigResponse.RequestId"));
		saveApgroupPortalConfigResponse.setIsSuccess(_ctx.booleanValue("SaveApgroupPortalConfigResponse.IsSuccess"));
		saveApgroupPortalConfigResponse.setErrorCode(_ctx.integerValue("SaveApgroupPortalConfigResponse.ErrorCode"));
		saveApgroupPortalConfigResponse.setErrorMessage(_ctx.stringValue("SaveApgroupPortalConfigResponse.ErrorMessage"));

		List<Long> data = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("SaveApgroupPortalConfigResponse.Data.Length"); i++) {
			data.add(_ctx.longValue("SaveApgroupPortalConfigResponse.Data["+ i +"]"));
		}
		saveApgroupPortalConfigResponse.setData(data);
	 
	 	return saveApgroupPortalConfigResponse;
	}
}