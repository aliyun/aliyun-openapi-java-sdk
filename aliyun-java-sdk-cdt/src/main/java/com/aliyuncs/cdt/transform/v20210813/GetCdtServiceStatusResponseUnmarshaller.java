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

package com.aliyuncs.cdt.transform.v20210813;

import com.aliyuncs.cdt.model.v20210813.GetCdtServiceStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCdtServiceStatusResponseUnmarshaller {

	public static GetCdtServiceStatusResponse unmarshall(GetCdtServiceStatusResponse getCdtServiceStatusResponse, UnmarshallerContext _ctx) {
		
		getCdtServiceStatusResponse.setRequestId(_ctx.stringValue("GetCdtServiceStatusResponse.RequestId"));
		getCdtServiceStatusResponse.setEnabled(_ctx.booleanValue("GetCdtServiceStatusResponse.Enabled"));
	 
	 	return getCdtServiceStatusResponse;
	}
}