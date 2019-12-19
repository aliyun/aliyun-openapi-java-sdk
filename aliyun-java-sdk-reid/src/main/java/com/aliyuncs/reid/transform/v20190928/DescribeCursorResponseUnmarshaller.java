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

package com.aliyuncs.reid.transform.v20190928;

import com.aliyuncs.reid.model.v20190928.DescribeCursorResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCursorResponseUnmarshaller {

	public static DescribeCursorResponse unmarshall(DescribeCursorResponse describeCursorResponse, UnmarshallerContext _ctx) {
		
		describeCursorResponse.setRequestId(_ctx.stringValue("DescribeCursorResponse.RequestId"));
		describeCursorResponse.setErrorCode(_ctx.stringValue("DescribeCursorResponse.ErrorCode"));
		describeCursorResponse.setErrorMessage(_ctx.stringValue("DescribeCursorResponse.ErrorMessage"));
		describeCursorResponse.setCursor(_ctx.stringValue("DescribeCursorResponse.Cursor"));
		describeCursorResponse.setSuccess(_ctx.booleanValue("DescribeCursorResponse.Success"));
	 
	 	return describeCursorResponse;
	}
}