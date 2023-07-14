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

package com.aliyuncs.pairecservice.transform.v20221213;

import com.aliyuncs.pairecservice.model.v20221213.GetLaboratoryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLaboratoryResponseUnmarshaller {

	public static GetLaboratoryResponse unmarshall(GetLaboratoryResponse getLaboratoryResponse, UnmarshallerContext _ctx) {
		
		getLaboratoryResponse.setRequestId(_ctx.stringValue("GetLaboratoryResponse.RequestId"));
		getLaboratoryResponse.setSceneId(_ctx.stringValue("GetLaboratoryResponse.SceneId"));
		getLaboratoryResponse.setName(_ctx.stringValue("GetLaboratoryResponse.Name"));
		getLaboratoryResponse.setDescription(_ctx.stringValue("GetLaboratoryResponse.Description"));
		getLaboratoryResponse.setDebugUsers(_ctx.stringValue("GetLaboratoryResponse.DebugUsers"));
		getLaboratoryResponse.setDebugCrowdId(_ctx.stringValue("GetLaboratoryResponse.DebugCrowdId"));
		getLaboratoryResponse.setBucketCount(_ctx.integerValue("GetLaboratoryResponse.BucketCount"));
		getLaboratoryResponse.setBuckets(_ctx.stringValue("GetLaboratoryResponse.Buckets"));
		getLaboratoryResponse.setBucketType(_ctx.stringValue("GetLaboratoryResponse.BucketType"));
		getLaboratoryResponse.setFilter(_ctx.stringValue("GetLaboratoryResponse.Filter"));
		getLaboratoryResponse.setEnvironment(_ctx.stringValue("GetLaboratoryResponse.Environment"));
		getLaboratoryResponse.setType(_ctx.stringValue("GetLaboratoryResponse.Type"));
		getLaboratoryResponse.setStatus(_ctx.stringValue("GetLaboratoryResponse.Status"));
		getLaboratoryResponse.setCrowdId(_ctx.stringValue("GetLaboratoryResponse.CrowdId"));
	 
	 	return getLaboratoryResponse;
	}
}