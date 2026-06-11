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

package com.aliyuncs.airegistry.transform.v20260317;

import com.aliyuncs.airegistry.model.v20260317.UploadSkillViaOssResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadSkillViaOssResponseUnmarshaller {

	public static UploadSkillViaOssResponse unmarshall(UploadSkillViaOssResponse uploadSkillViaOssResponse, UnmarshallerContext _ctx) {
		
		uploadSkillViaOssResponse.setRequestId(_ctx.stringValue("UploadSkillViaOssResponse.RequestId"));
		uploadSkillViaOssResponse.setData(_ctx.stringValue("UploadSkillViaOssResponse.Data"));
	 
	 	return uploadSkillViaOssResponse;
	}
}