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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.ListDeviceModelResponse;
import com.aliyuncs.iovcc.model.v20180501.ListDeviceModelResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeviceModelResponseUnmarshaller {

	public static ListDeviceModelResponse unmarshall(ListDeviceModelResponse listDeviceModelResponse, UnmarshallerContext _ctx) {
		
		listDeviceModelResponse.setRequestId(_ctx.stringValue("ListDeviceModelResponse.RequestId"));

		List<Result> modelList = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("ListDeviceModelResponse.ModelList.Length"); i++) {
			Result result = new Result();
			result.setDeviceModelId(_ctx.longValue("ListDeviceModelResponse.ModelList["+ i +"].DeviceModelId"));
			result.setDeviceType(_ctx.stringValue("ListDeviceModelResponse.ModelList["+ i +"].DeviceType"));
			result.setHardwareType(_ctx.stringValue("ListDeviceModelResponse.ModelList["+ i +"].HardwareType"));
			result.setDeviceModel(_ctx.stringValue("ListDeviceModelResponse.ModelList["+ i +"].DeviceModel"));
			result.setDeviceBrand(_ctx.stringValue("ListDeviceModelResponse.ModelList["+ i +"].DeviceBrand"));
			result.setCanCreateDeviceId(_ctx.integerValue("ListDeviceModelResponse.ModelList["+ i +"].CanCreateDeviceId"));
			result.setInitUsageType(_ctx.integerValue("ListDeviceModelResponse.ModelList["+ i +"].InitUsageType"));
			result.setInitUsageTypeDesc(_ctx.stringValue("ListDeviceModelResponse.ModelList["+ i +"].InitUsageTypeDesc"));
			result.setDescription(_ctx.stringValue("ListDeviceModelResponse.ModelList["+ i +"].Description"));
			result.setProjectId(_ctx.stringValue("ListDeviceModelResponse.ModelList["+ i +"].ProjectId"));
			result.setSecurityChip(_ctx.stringValue("ListDeviceModelResponse.ModelList["+ i +"].SecurityChip"));
			result.setOsPlatform(_ctx.stringValue("ListDeviceModelResponse.ModelList["+ i +"].OsPlatform"));

			modelList.add(result);
		}
		listDeviceModelResponse.setModelList(modelList);
	 
	 	return listDeviceModelResponse;
	}
}