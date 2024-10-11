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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetInstanceDownStreamResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetInstanceDownStreamResponse.InstanceRelation;
import com.aliyuncs.dataphin_public.model.v20230630.GetInstanceDownStreamResponse.InstanceRelation.FieldInstance;
import com.aliyuncs.dataphin_public.model.v20230630.GetInstanceDownStreamResponse.InstanceRelation.InstanceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceDownStreamResponseUnmarshaller {

	public static GetInstanceDownStreamResponse unmarshall(GetInstanceDownStreamResponse getInstanceDownStreamResponse, UnmarshallerContext _ctx) {
		
		getInstanceDownStreamResponse.setRequestId(_ctx.stringValue("GetInstanceDownStreamResponse.RequestId"));
		getInstanceDownStreamResponse.setSuccess(_ctx.booleanValue("GetInstanceDownStreamResponse.Success"));
		getInstanceDownStreamResponse.setHttpStatusCode(_ctx.integerValue("GetInstanceDownStreamResponse.HttpStatusCode"));
		getInstanceDownStreamResponse.setCode(_ctx.stringValue("GetInstanceDownStreamResponse.Code"));
		getInstanceDownStreamResponse.setMessage(_ctx.stringValue("GetInstanceDownStreamResponse.Message"));

		List<InstanceRelation> instanceRelationList = new ArrayList<InstanceRelation>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceDownStreamResponse.InstanceRelationList.Length"); i++) {
			InstanceRelation instanceRelation = new InstanceRelation();
			instanceRelation.setSelectStatus(_ctx.stringValue("GetInstanceDownStreamResponse.InstanceRelationList["+ i +"].SelectStatus"));
			instanceRelation.setSelectStatusCause(_ctx.stringValue("GetInstanceDownStreamResponse.InstanceRelationList["+ i +"].SelectStatusCause"));
			instanceRelation.setRunStatus(_ctx.stringValue("GetInstanceDownStreamResponse.InstanceRelationList["+ i +"].RunStatus"));
			instanceRelation.setDownStreamDepth(_ctx.integerValue("GetInstanceDownStreamResponse.InstanceRelationList["+ i +"].DownStreamDepth"));
			instanceRelation.setExtendInfo(_ctx.stringValue("GetInstanceDownStreamResponse.InstanceRelationList["+ i +"].ExtendInfo"));

			InstanceInfo instanceInfo = new InstanceInfo();
			instanceInfo.setId(_ctx.stringValue("GetInstanceDownStreamResponse.InstanceRelationList["+ i +"].InstanceInfo.Id"));
			instanceInfo.setName(_ctx.stringValue("GetInstanceDownStreamResponse.InstanceRelationList["+ i +"].InstanceInfo.Name"));
			instanceInfo.setType(_ctx.stringValue("GetInstanceDownStreamResponse.InstanceRelationList["+ i +"].InstanceInfo.Type"));
			instanceRelation.setInstanceInfo(instanceInfo);

			List<FieldInstance> fieldInstanceList = new ArrayList<FieldInstance>();
			for (int j = 0; j < _ctx.lengthValue("GetInstanceDownStreamResponse.InstanceRelationList["+ i +"].FieldInstanceList.Length"); j++) {
				FieldInstance fieldInstance = new FieldInstance();
				fieldInstance.setSelectStatus(_ctx.stringValue("GetInstanceDownStreamResponse.InstanceRelationList["+ i +"].FieldInstanceList["+ j +"].SelectStatus"));
				fieldInstance.setFieldInstanceId(_ctx.stringValue("GetInstanceDownStreamResponse.InstanceRelationList["+ i +"].FieldInstanceList["+ j +"].FieldInstanceId"));
				fieldInstance.setRunStatus(_ctx.stringValue("GetInstanceDownStreamResponse.InstanceRelationList["+ i +"].FieldInstanceList["+ j +"].RunStatus"));

				fieldInstanceList.add(fieldInstance);
			}
			instanceRelation.setFieldInstanceList(fieldInstanceList);

			instanceRelationList.add(instanceRelation);
		}
		getInstanceDownStreamResponse.setInstanceRelationList(instanceRelationList);
	 
	 	return getInstanceDownStreamResponse;
	}
}