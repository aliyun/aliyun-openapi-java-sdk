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

import com.aliyuncs.imm.model.v20170906.GetSetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSetResponseUnmarshaller {

	public static GetSetResponse unmarshall(GetSetResponse getSetResponse, UnmarshallerContext _ctx) {
		
		getSetResponse.setRequestId(_ctx.stringValue("GetSetResponse.RequestId"));
		getSetResponse.setSetId(_ctx.stringValue("GetSetResponse.SetId"));
		getSetResponse.setSetName(_ctx.stringValue("GetSetResponse.SetName"));
		getSetResponse.setCreateTime(_ctx.stringValue("GetSetResponse.CreateTime"));
		getSetResponse.setModifyTime(_ctx.stringValue("GetSetResponse.ModifyTime"));
		getSetResponse.setFaceCount(_ctx.integerValue("GetSetResponse.FaceCount"));
		getSetResponse.setImageCount(_ctx.integerValue("GetSetResponse.ImageCount"));
		getSetResponse.setVideoCount(_ctx.integerValue("GetSetResponse.VideoCount"));
		getSetResponse.setVideoLength(_ctx.integerValue("GetSetResponse.VideoLength"));
	 
	 	return getSetResponse;
	}
}