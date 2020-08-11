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

package com.aliyuncs.ahas_openapi.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ahas_openapi.model.v20190901.GetExperimentMetaResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetExperimentMetaResponseUnmarshaller {

	public static GetExperimentMetaResponse unmarshall(GetExperimentMetaResponse getExperimentMetaResponse, UnmarshallerContext _ctx) {
		
		getExperimentMetaResponse.setRequestId(_ctx.stringValue("GetExperimentMetaResponse.RequestId"));
		getExperimentMetaResponse.setCode(_ctx.stringValue("GetExperimentMetaResponse.Code"));
		getExperimentMetaResponse.setMessage(_ctx.stringValue("GetExperimentMetaResponse.Message"));
		getExperimentMetaResponse.setSuccess(_ctx.booleanValue("GetExperimentMetaResponse.Success"));
		getExperimentMetaResponse.setExperimentId(_ctx.stringValue("GetExperimentMetaResponse.ExperimentId"));
		getExperimentMetaResponse.setName(_ctx.stringValue("GetExperimentMetaResponse.Name"));
		getExperimentMetaResponse.setCreateTime(_ctx.stringValue("GetExperimentMetaResponse.CreateTime"));
		getExperimentMetaResponse.setState(_ctx.stringValue("GetExperimentMetaResponse.State"));

		List<String> tags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetExperimentMetaResponse.Tags.Length"); i++) {
			tags.add(_ctx.stringValue("GetExperimentMetaResponse.Tags["+ i +"]"));
		}
		getExperimentMetaResponse.setTags(tags);
	 
	 	return getExperimentMetaResponse;
	}
}