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

package com.aliyuncs.premiumpics.transform.v20190619;

import com.aliyuncs.premiumpics.model.v20190619.GetImageProduceSummaryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetImageProduceSummaryResponseUnmarshaller {

	public static GetImageProduceSummaryResponse unmarshall(GetImageProduceSummaryResponse getImageProduceSummaryResponse, UnmarshallerContext _ctx) {
		
		getImageProduceSummaryResponse.setRequestId(_ctx.stringValue("GetImageProduceSummaryResponse.RequestId"));
		getImageProduceSummaryResponse.setSuccess(_ctx.booleanValue("GetImageProduceSummaryResponse.Success"));
		getImageProduceSummaryResponse.setErrorMsg(_ctx.stringValue("GetImageProduceSummaryResponse.ErrorMsg"));
		getImageProduceSummaryResponse.setErrorCode(_ctx.stringValue("GetImageProduceSummaryResponse.ErrorCode"));
		getImageProduceSummaryResponse.setTotalCount(_ctx.integerValue("GetImageProduceSummaryResponse.TotalCount"));
		getImageProduceSummaryResponse.setUsedCount(_ctx.integerValue("GetImageProduceSummaryResponse.UsedCount"));
	 
	 	return getImageProduceSummaryResponse;
	}
}