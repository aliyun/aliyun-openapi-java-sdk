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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.GetNumberDistrictInfoTemplateDownloadUrlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNumberDistrictInfoTemplateDownloadUrlResponseUnmarshaller {

	public static GetNumberDistrictInfoTemplateDownloadUrlResponse unmarshall(GetNumberDistrictInfoTemplateDownloadUrlResponse getNumberDistrictInfoTemplateDownloadUrlResponse, UnmarshallerContext _ctx) {
		
		getNumberDistrictInfoTemplateDownloadUrlResponse.setRequestId(_ctx.stringValue("GetNumberDistrictInfoTemplateDownloadUrlResponse.RequestId"));
		getNumberDistrictInfoTemplateDownloadUrlResponse.setHttpStatusCode(_ctx.integerValue("GetNumberDistrictInfoTemplateDownloadUrlResponse.HttpStatusCode"));
		getNumberDistrictInfoTemplateDownloadUrlResponse.setCode(_ctx.stringValue("GetNumberDistrictInfoTemplateDownloadUrlResponse.Code"));
		getNumberDistrictInfoTemplateDownloadUrlResponse.setMessage(_ctx.stringValue("GetNumberDistrictInfoTemplateDownloadUrlResponse.Message"));
		getNumberDistrictInfoTemplateDownloadUrlResponse.setSuccess(_ctx.booleanValue("GetNumberDistrictInfoTemplateDownloadUrlResponse.Success"));
		getNumberDistrictInfoTemplateDownloadUrlResponse.setFileHttpUrl(_ctx.stringValue("GetNumberDistrictInfoTemplateDownloadUrlResponse.FileHttpUrl"));
	 
	 	return getNumberDistrictInfoTemplateDownloadUrlResponse;
	}
}