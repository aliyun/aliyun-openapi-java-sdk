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

package com.aliyuncs.qualitycheck.transform.v20190115;

import com.aliyuncs.qualitycheck.model.v20190115.EditThesaurusForApiResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EditThesaurusForApiResponseUnmarshaller {

	public static EditThesaurusForApiResponse unmarshall(EditThesaurusForApiResponse editThesaurusForApiResponse, UnmarshallerContext _ctx) {
		
		editThesaurusForApiResponse.setRequestId(_ctx.stringValue("EditThesaurusForApiResponse.RequestId"));
		editThesaurusForApiResponse.setSuccess(_ctx.booleanValue("EditThesaurusForApiResponse.Success"));
		editThesaurusForApiResponse.setCode(_ctx.stringValue("EditThesaurusForApiResponse.Code"));
		editThesaurusForApiResponse.setMessage(_ctx.stringValue("EditThesaurusForApiResponse.Message"));
		editThesaurusForApiResponse.setData(_ctx.longValue("EditThesaurusForApiResponse.Data"));
	 
	 	return editThesaurusForApiResponse;
	}
}