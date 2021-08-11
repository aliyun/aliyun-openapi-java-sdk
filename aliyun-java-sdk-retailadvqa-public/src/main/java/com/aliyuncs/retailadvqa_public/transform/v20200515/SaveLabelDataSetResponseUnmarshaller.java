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

import com.aliyuncs.retailadvqa_public.model.v20200515.SaveLabelDataSetResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.SaveLabelDataSetResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveLabelDataSetResponseUnmarshaller {

	public static SaveLabelDataSetResponse unmarshall(SaveLabelDataSetResponse saveLabelDataSetResponse, UnmarshallerContext _ctx) {
		
		saveLabelDataSetResponse.setRequestId(_ctx.stringValue("SaveLabelDataSetResponse.RequestId"));
		saveLabelDataSetResponse.setErrorDesc(_ctx.stringValue("SaveLabelDataSetResponse.ErrorDesc"));
		saveLabelDataSetResponse.setTraceId(_ctx.stringValue("SaveLabelDataSetResponse.TraceId"));
		saveLabelDataSetResponse.setErrorCode(_ctx.stringValue("SaveLabelDataSetResponse.ErrorCode"));
		saveLabelDataSetResponse.setSuccess(_ctx.stringValue("SaveLabelDataSetResponse.Success"));

		Data data = new Data();
		data.setCubeId(_ctx.stringValue("SaveLabelDataSetResponse.Data.CubeId"));
		saveLabelDataSetResponse.setData(data);
	 
	 	return saveLabelDataSetResponse;
	}
}