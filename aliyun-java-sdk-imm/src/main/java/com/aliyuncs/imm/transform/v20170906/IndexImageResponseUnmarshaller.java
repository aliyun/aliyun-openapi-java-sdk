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

import com.aliyuncs.imm.model.v20170906.IndexImageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class IndexImageResponseUnmarshaller {

	public static IndexImageResponse unmarshall(IndexImageResponse indexImageResponse, UnmarshallerContext _ctx) {
		
		indexImageResponse.setRequestId(_ctx.stringValue("IndexImageResponse.RequestId"));
		indexImageResponse.setSetId(_ctx.stringValue("IndexImageResponse.SetId"));
		indexImageResponse.setImageUri(_ctx.stringValue("IndexImageResponse.ImageUri"));
		indexImageResponse.setRemarksA(_ctx.stringValue("IndexImageResponse.RemarksA"));
		indexImageResponse.setRemarksB(_ctx.stringValue("IndexImageResponse.RemarksB"));
		indexImageResponse.setCreateTime(_ctx.stringValue("IndexImageResponse.CreateTime"));
		indexImageResponse.setModifyTime(_ctx.stringValue("IndexImageResponse.ModifyTime"));
		indexImageResponse.setRemarksC(_ctx.stringValue("IndexImageResponse.RemarksC"));
		indexImageResponse.setRemarksD(_ctx.stringValue("IndexImageResponse.RemarksD"));
		indexImageResponse.setExternalId(_ctx.stringValue("IndexImageResponse.ExternalId"));
		indexImageResponse.setRemarksArrayA(_ctx.stringValue("IndexImageResponse.RemarksArrayA"));
		indexImageResponse.setRemarksArrayB(_ctx.stringValue("IndexImageResponse.RemarksArrayB"));
	 
	 	return indexImageResponse;
	}
}