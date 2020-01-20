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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.ListThingModelVersionResponse;
import com.aliyuncs.iot.model.v20180120.ListThingModelVersionResponse.Data;
import com.aliyuncs.iot.model.v20180120.ListThingModelVersionResponse.Data.ModelVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListThingModelVersionResponseUnmarshaller {

	public static ListThingModelVersionResponse unmarshall(ListThingModelVersionResponse listThingModelVersionResponse, UnmarshallerContext _ctx) {
		
		listThingModelVersionResponse.setRequestId(_ctx.stringValue("ListThingModelVersionResponse.RequestId"));
		listThingModelVersionResponse.setSuccess(_ctx.booleanValue("ListThingModelVersionResponse.Success"));
		listThingModelVersionResponse.setCode(_ctx.stringValue("ListThingModelVersionResponse.Code"));
		listThingModelVersionResponse.setErrorMessage(_ctx.stringValue("ListThingModelVersionResponse.ErrorMessage"));

		Data data = new Data();

		List<ModelVersion> modelVersions = new ArrayList<ModelVersion>();
		for (int i = 0; i < _ctx.lengthValue("ListThingModelVersionResponse.Data.ModelVersions.Length"); i++) {
			ModelVersion modelVersion = new ModelVersion();
			modelVersion.setModelVersion(_ctx.stringValue("ListThingModelVersionResponse.Data.ModelVersions["+ i +"].ModelVersion"));
			modelVersion.setDescription(_ctx.stringValue("ListThingModelVersionResponse.Data.ModelVersions["+ i +"].Description"));
			modelVersion.setGmtCreate(_ctx.longValue("ListThingModelVersionResponse.Data.ModelVersions["+ i +"].GmtCreate"));

			modelVersions.add(modelVersion);
		}
		data.setModelVersions(modelVersions);
		listThingModelVersionResponse.setData(data);
	 
	 	return listThingModelVersionResponse;
	}
}