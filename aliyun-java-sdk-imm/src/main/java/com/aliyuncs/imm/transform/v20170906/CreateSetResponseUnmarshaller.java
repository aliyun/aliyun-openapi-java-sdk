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

import com.aliyuncs.imm.model.v20170906.CreateSetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSetResponseUnmarshaller {

	public static CreateSetResponse unmarshall(CreateSetResponse createSetResponse, UnmarshallerContext _ctx) {
		
		createSetResponse.setRequestId(_ctx.stringValue("CreateSetResponse.RequestId"));
		createSetResponse.setSetId(_ctx.stringValue("CreateSetResponse.SetId"));
		createSetResponse.setSetName(_ctx.stringValue("CreateSetResponse.SetName"));
		createSetResponse.setCreateTime(_ctx.stringValue("CreateSetResponse.CreateTime"));
		createSetResponse.setModifyTime(_ctx.stringValue("CreateSetResponse.ModifyTime"));
		createSetResponse.setFaceCount(_ctx.integerValue("CreateSetResponse.FaceCount"));
		createSetResponse.setImageCount(_ctx.integerValue("CreateSetResponse.ImageCount"));
		createSetResponse.setVideoCount(_ctx.integerValue("CreateSetResponse.VideoCount"));
		createSetResponse.setVideoLength(_ctx.integerValue("CreateSetResponse.VideoLength"));
	 
	 	return createSetResponse;
	}
}