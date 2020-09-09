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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import com.aliyuncs.retailadvqa_public.model.v20200515.SaveExternalAudienceResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.SaveExternalAudienceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveExternalAudienceResponseUnmarshaller {

	public static SaveExternalAudienceResponse unmarshall(SaveExternalAudienceResponse saveExternalAudienceResponse, UnmarshallerContext _ctx) {
		
		saveExternalAudienceResponse.setRequestId(_ctx.stringValue("SaveExternalAudienceResponse.RequestId"));
		saveExternalAudienceResponse.setErrorCode(_ctx.stringValue("SaveExternalAudienceResponse.ErrorCode"));
		saveExternalAudienceResponse.setErrorDesc(_ctx.stringValue("SaveExternalAudienceResponse.ErrorDesc"));
		saveExternalAudienceResponse.setSuccess(_ctx.stringValue("SaveExternalAudienceResponse.Success"));
		saveExternalAudienceResponse.setTraceId(_ctx.stringValue("SaveExternalAudienceResponse.TraceId"));

		Data data = new Data();
		data.setAudienceId(_ctx.stringValue("SaveExternalAudienceResponse.Data.AudienceId"));
		saveExternalAudienceResponse.setData(data);
	 
	 	return saveExternalAudienceResponse;
	}
}