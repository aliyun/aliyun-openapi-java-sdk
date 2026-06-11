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

import com.aliyuncs.airegistry.model.v20260317.GetSkillImportFileUrlResponse;
import com.aliyuncs.airegistry.model.v20260317.GetSkillImportFileUrlResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSkillImportFileUrlResponseUnmarshaller {

	public static GetSkillImportFileUrlResponse unmarshall(GetSkillImportFileUrlResponse getSkillImportFileUrlResponse, UnmarshallerContext _ctx) {
		
		getSkillImportFileUrlResponse.setRequestId(_ctx.stringValue("GetSkillImportFileUrlResponse.RequestId"));

		Data data = new Data();
		data.setUploadUrl(_ctx.stringValue("GetSkillImportFileUrlResponse.Data.UploadUrl"));
		data.setOssObjectName(_ctx.stringValue("GetSkillImportFileUrlResponse.Data.OssObjectName"));
		data.setContentType(_ctx.stringValue("GetSkillImportFileUrlResponse.Data.ContentType"));
		data.setMaxSize(_ctx.stringValue("GetSkillImportFileUrlResponse.Data.MaxSize"));
		getSkillImportFileUrlResponse.setData(data);
	 
	 	return getSkillImportFileUrlResponse;
	}
}