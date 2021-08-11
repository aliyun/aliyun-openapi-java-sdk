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

import com.aliyuncs.retailadvqa_public.model.v20200515.LoadDataToLabelDataSetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class LoadDataToLabelDataSetResponseUnmarshaller {

	public static LoadDataToLabelDataSetResponse unmarshall(LoadDataToLabelDataSetResponse loadDataToLabelDataSetResponse, UnmarshallerContext _ctx) {
		
		loadDataToLabelDataSetResponse.setRequestId(_ctx.stringValue("LoadDataToLabelDataSetResponse.RequestId"));
		loadDataToLabelDataSetResponse.setErrorDesc(_ctx.stringValue("LoadDataToLabelDataSetResponse.ErrorDesc"));
		loadDataToLabelDataSetResponse.setTraceId(_ctx.stringValue("LoadDataToLabelDataSetResponse.TraceId"));
		loadDataToLabelDataSetResponse.setData(_ctx.booleanValue("LoadDataToLabelDataSetResponse.Data"));
		loadDataToLabelDataSetResponse.setErrorCode(_ctx.stringValue("LoadDataToLabelDataSetResponse.ErrorCode"));
		loadDataToLabelDataSetResponse.setExStack(_ctx.stringValue("LoadDataToLabelDataSetResponse.ExStack"));
		loadDataToLabelDataSetResponse.setSuccess(_ctx.booleanValue("LoadDataToLabelDataSetResponse.Success"));
	 
	 	return loadDataToLabelDataSetResponse;
	}
}