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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.CreateGrayEnvironmentResponse;
import com.aliyuncs.edas.model.v20170801.CreateGrayEnvironmentResponse.Data;
import com.aliyuncs.edas.model.v20170801.CreateGrayEnvironmentResponse.Data.Metadata;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateGrayEnvironmentResponseUnmarshaller {

	public static CreateGrayEnvironmentResponse unmarshall(CreateGrayEnvironmentResponse createGrayEnvironmentResponse, UnmarshallerContext _ctx) {
		
		createGrayEnvironmentResponse.setRequestId(_ctx.stringValue("CreateGrayEnvironmentResponse.RequestId"));
		createGrayEnvironmentResponse.setCode(_ctx.integerValue("CreateGrayEnvironmentResponse.Code"));
		createGrayEnvironmentResponse.setMessage(_ctx.stringValue("CreateGrayEnvironmentResponse.Message"));

		Data data = new Data();
		data.setAccountId(_ctx.stringValue("CreateGrayEnvironmentResponse.Data.AccountId"));
		data.setPointcutId(_ctx.longValue("CreateGrayEnvironmentResponse.Data.PointcutId"));
		data.setRegionId(_ctx.stringValue("CreateGrayEnvironmentResponse.Data.RegionId"));
		data.setTenantId(_ctx.stringValue("CreateGrayEnvironmentResponse.Data.TenantId"));

		Metadata metadata = new Metadata();
		metadata.setLabels(_ctx.mapValue("CreateGrayEnvironmentResponse.Data.Metadata.Labels"));
		metadata.setName(_ctx.stringValue("CreateGrayEnvironmentResponse.Data.Metadata.Name"));
		metadata.setNamespace(_ctx.stringValue("CreateGrayEnvironmentResponse.Data.Metadata.Namespace"));
		metadata.setAnnotations(_ctx.mapValue("CreateGrayEnvironmentResponse.Data.Metadata.Annotations"));
		data.setMetadata(metadata);
		createGrayEnvironmentResponse.setData(data);
	 
	 	return createGrayEnvironmentResponse;
	}
}