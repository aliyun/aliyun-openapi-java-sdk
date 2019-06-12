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

	public static UpdateImageResponse unmarshall(UpdateImageResponse updateImageResponse, UnmarshallerContext context) {
		
		updateImageResponse.setRequestId(context.stringValue("UpdateImageResponse.RequestId"));
		updateImageResponse.setSetId(context.stringValue("UpdateImageResponse.SetId"));
		updateImageResponse.setImageUri(context.stringValue("UpdateImageResponse.ImageUri"));
		updateImageResponse.setRemarksA(context.stringValue("UpdateImageResponse.RemarksA"));
		updateImageResponse.setRemarksB(context.stringValue("UpdateImageResponse.RemarksB"));
		updateImageResponse.setCreateTime(context.stringValue("UpdateImageResponse.CreateTime"));
		updateImageResponse.setModifyTime(context.stringValue("UpdateImageResponse.ModifyTime"));
		updateImageResponse.setRemarksC(context.stringValue("UpdateImageResponse.RemarksC"));
		updateImageResponse.setRemarksD(context.stringValue("UpdateImageResponse.RemarksD"));
		updateImageResponse.setExternalId(context.stringValue("UpdateImageResponse.ExternalId"));
	 
	 	return updateImageResponse;
	}
}