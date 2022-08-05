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

package com.aliyuncs.viapi_regen.transform.v20211119;

import com.aliyuncs.viapi_regen.model.v20211119.GetLabelDetailResponse;
import com.aliyuncs.viapi_regen.model.v20211119.GetLabelDetailResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLabelDetailResponseUnmarshaller {

	public static GetLabelDetailResponse unmarshall(GetLabelDetailResponse getLabelDetailResponse, UnmarshallerContext _ctx) {
		
		getLabelDetailResponse.setRequestId(_ctx.stringValue("GetLabelDetailResponse.RequestId"));
		getLabelDetailResponse.setMessage(_ctx.stringValue("GetLabelDetailResponse.Message"));
		getLabelDetailResponse.setCode(_ctx.stringValue("GetLabelDetailResponse.Code"));

		Data data = new Data();
		data.setLabelInfo(_ctx.stringValue("GetLabelDetailResponse.Data.LabelInfo"));
		getLabelDetailResponse.setData(data);
	 
	 	return getLabelDetailResponse;
	}
}