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

import com.aliyuncs.iovcc.model.v20180501.ListShadowSchemaDeviceModelsResponse;
import com.aliyuncs.iovcc.model.v20180501.ListShadowSchemaDeviceModelsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListShadowSchemaDeviceModelsResponseUnmarshaller {

	public static ListShadowSchemaDeviceModelsResponse unmarshall(ListShadowSchemaDeviceModelsResponse listShadowSchemaDeviceModelsResponse, UnmarshallerContext _ctx) {
		
		listShadowSchemaDeviceModelsResponse.setRequestId(_ctx.stringValue("ListShadowSchemaDeviceModelsResponse.RequestId"));

		List<Result> modelList = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("ListShadowSchemaDeviceModelsResponse.ModelList.Length"); i++) {
			Result result = new Result();
			result.setDeviceModelId(_ctx.longValue("ListShadowSchemaDeviceModelsResponse.ModelList["+ i +"].DeviceModelId"));
			result.setDeviceType(_ctx.stringValue("ListShadowSchemaDeviceModelsResponse.ModelList["+ i +"].DeviceType"));
			result.setHardwareType(_ctx.stringValue("ListShadowSchemaDeviceModelsResponse.ModelList["+ i +"].HardwareType"));
			result.setDeviceModel(_ctx.stringValue("ListShadowSchemaDeviceModelsResponse.ModelList["+ i +"].DeviceModel"));
			result.setDeviceBrand(_ctx.stringValue("ListShadowSchemaDeviceModelsResponse.ModelList["+ i +"].DeviceBrand"));
			result.setCanCreateDeviceId(_ctx.integerValue("ListShadowSchemaDeviceModelsResponse.ModelList["+ i +"].CanCreateDeviceId"));
			result.setInitUsageType(_ctx.integerValue("ListShadowSchemaDeviceModelsResponse.ModelList["+ i +"].InitUsageType"));
			result.setInitUsageTypeDesc(_ctx.stringValue("ListShadowSchemaDeviceModelsResponse.ModelList["+ i +"].InitUsageTypeDesc"));
			result.setDescription(_ctx.stringValue("ListShadowSchemaDeviceModelsResponse.ModelList["+ i +"].Description"));
			result.setProjectId(_ctx.stringValue("ListShadowSchemaDeviceModelsResponse.ModelList["+ i +"].ProjectId"));
			result.setSecurityChip(_ctx.integerValue("ListShadowSchemaDeviceModelsResponse.ModelList["+ i +"].SecurityChip"));
			result.setOsPlatform(_ctx.stringValue("ListShadowSchemaDeviceModelsResponse.ModelList["+ i +"].OsPlatform"));

			modelList.add(result);
		}
		listShadowSchemaDeviceModelsResponse.setModelList(modelList);
	 
	 	return listShadowSchemaDeviceModelsResponse;
	}
}