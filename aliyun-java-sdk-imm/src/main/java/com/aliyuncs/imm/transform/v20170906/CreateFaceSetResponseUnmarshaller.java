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

package com.aliyuncs.imm.transform.v20170906;

import com.aliyuncs.imm.model.v20170906.CreateFaceSetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFaceSetResponseUnmarshaller {

	public static CreateFaceSetResponse unmarshall(CreateFaceSetResponse createFaceSetResponse, UnmarshallerContext context) {
		
		createFaceSetResponse.setRequestId(context.stringValue("CreateFaceSetResponse.RequestId"));
		createFaceSetResponse.setSetId(context.stringValue("CreateFaceSetResponse.SetId"));
		createFaceSetResponse.setStatus(context.stringValue("CreateFaceSetResponse.Status"));
		createFaceSetResponse.setPhotos(context.longValue("CreateFaceSetResponse.Photos"));
		createFaceSetResponse.setCreateTime(context.stringValue("CreateFaceSetResponse.CreateTime"));
		createFaceSetResponse.setModifyTime(context.stringValue("CreateFaceSetResponse.ModifyTime"));
		createFaceSetResponse.setFaces(context.longValue("CreateFaceSetResponse.Faces"));
	 
	 	return createFaceSetResponse;
	}
}