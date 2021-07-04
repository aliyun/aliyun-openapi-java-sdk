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

import com.aliyuncs.retailadvqa_public.model.v20200515.LoadDataToExternalAudienceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class LoadDataToExternalAudienceResponseUnmarshaller {

	public static LoadDataToExternalAudienceResponse unmarshall(LoadDataToExternalAudienceResponse loadDataToExternalAudienceResponse, UnmarshallerContext _ctx) {
		
		loadDataToExternalAudienceResponse.setRequestId(_ctx.stringValue("LoadDataToExternalAudienceResponse.RequestId"));
		loadDataToExternalAudienceResponse.setErrorDesc(_ctx.stringValue("LoadDataToExternalAudienceResponse.ErrorDesc"));
		loadDataToExternalAudienceResponse.setTraceId(_ctx.stringValue("LoadDataToExternalAudienceResponse.TraceId"));
		loadDataToExternalAudienceResponse.setErrorCode(_ctx.stringValue("LoadDataToExternalAudienceResponse.ErrorCode"));
		loadDataToExternalAudienceResponse.setExStack(_ctx.stringValue("LoadDataToExternalAudienceResponse.ExStack"));
		loadDataToExternalAudienceResponse.setSuccess(_ctx.stringValue("LoadDataToExternalAudienceResponse.Success"));
	 
	 	return loadDataToExternalAudienceResponse;
	}
}