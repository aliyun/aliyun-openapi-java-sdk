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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.DsgPlatformQueryProjectsAndSchemaFromMetaResponse;
import com.aliyuncs.dataworks_public.model.v20200518.DsgPlatformQueryProjectsAndSchemaFromMetaResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class DsgPlatformQueryProjectsAndSchemaFromMetaResponseUnmarshaller {

	public static DsgPlatformQueryProjectsAndSchemaFromMetaResponse unmarshall(DsgPlatformQueryProjectsAndSchemaFromMetaResponse dsgPlatformQueryProjectsAndSchemaFromMetaResponse, UnmarshallerContext _ctx) {
		
		dsgPlatformQueryProjectsAndSchemaFromMetaResponse.setRequestId(_ctx.stringValue("DsgPlatformQueryProjectsAndSchemaFromMetaResponse.RequestId"));
		dsgPlatformQueryProjectsAndSchemaFromMetaResponse.setSuccess(_ctx.booleanValue("DsgPlatformQueryProjectsAndSchemaFromMetaResponse.Success"));
		dsgPlatformQueryProjectsAndSchemaFromMetaResponse.setErrorCode(_ctx.stringValue("DsgPlatformQueryProjectsAndSchemaFromMetaResponse.ErrorCode"));
		dsgPlatformQueryProjectsAndSchemaFromMetaResponse.setErrorMessage(_ctx.stringValue("DsgPlatformQueryProjectsAndSchemaFromMetaResponse.ErrorMessage"));
		dsgPlatformQueryProjectsAndSchemaFromMetaResponse.setHttpStatusCode(_ctx.integerValue("DsgPlatformQueryProjectsAndSchemaFromMetaResponse.HttpStatusCode"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("DsgPlatformQueryProjectsAndSchemaFromMetaResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setProject(_ctx.stringValue("DsgPlatformQueryProjectsAndSchemaFromMetaResponse.Data["+ i +"].Project"));
			datas.setClusterId(_ctx.stringValue("DsgPlatformQueryProjectsAndSchemaFromMetaResponse.Data["+ i +"].ClusterId"));

			data.add(datas);
		}
		dsgPlatformQueryProjectsAndSchemaFromMetaResponse.setData(data);
	 
	 	return dsgPlatformQueryProjectsAndSchemaFromMetaResponse;
	}
}