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

import com.aliyuncs.imm.model.v20170906.UpdateImageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateImageResponseUnmarshaller {

	public static UpdateImageResponse unmarshall(UpdateImageResponse updateImageResponse, UnmarshallerContext _ctx) {
		
		updateImageResponse.setRequestId(_ctx.stringValue("UpdateImageResponse.RequestId"));
		updateImageResponse.setSetId(_ctx.stringValue("UpdateImageResponse.SetId"));
		updateImageResponse.setImageUri(_ctx.stringValue("UpdateImageResponse.ImageUri"));
		updateImageResponse.setRemarksA(_ctx.stringValue("UpdateImageResponse.RemarksA"));
		updateImageResponse.setRemarksB(_ctx.stringValue("UpdateImageResponse.RemarksB"));
		updateImageResponse.setCreateTime(_ctx.stringValue("UpdateImageResponse.CreateTime"));
		updateImageResponse.setModifyTime(_ctx.stringValue("UpdateImageResponse.ModifyTime"));
		updateImageResponse.setRemarksC(_ctx.stringValue("UpdateImageResponse.RemarksC"));
		updateImageResponse.setRemarksD(_ctx.stringValue("UpdateImageResponse.RemarksD"));
		updateImageResponse.setExternalId(_ctx.stringValue("UpdateImageResponse.ExternalId"));
	 
	 	return updateImageResponse;
	}
}