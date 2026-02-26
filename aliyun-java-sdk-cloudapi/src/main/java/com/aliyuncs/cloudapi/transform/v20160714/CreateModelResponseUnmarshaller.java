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

package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.CreateModelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateModelResponseUnmarshaller {

	public static CreateModelResponse unmarshall(CreateModelResponse createModelResponse, UnmarshallerContext _ctx) {
		
		createModelResponse.setRequestId(_ctx.stringValue("CreateModelResponse.RequestId"));
		createModelResponse.setModifiedTime(_ctx.stringValue("CreateModelResponse.ModifiedTime"));
		createModelResponse.setDescription(_ctx.stringValue("CreateModelResponse.Description"));
		createModelResponse.setGroupId(_ctx.stringValue("CreateModelResponse.GroupId"));
		createModelResponse.setSchema(_ctx.stringValue("CreateModelResponse.Schema"));
		createModelResponse.setModelName(_ctx.stringValue("CreateModelResponse.ModelName"));
		createModelResponse.setCreatedTime(_ctx.stringValue("CreateModelResponse.CreatedTime"));
		createModelResponse.setModelId(_ctx.stringValue("CreateModelResponse.ModelId"));
		createModelResponse.setRegionId(_ctx.stringValue("CreateModelResponse.RegionId"));
		createModelResponse.setModelRef(_ctx.stringValue("CreateModelResponse.ModelRef"));
	 
	 	return createModelResponse;
	}
}