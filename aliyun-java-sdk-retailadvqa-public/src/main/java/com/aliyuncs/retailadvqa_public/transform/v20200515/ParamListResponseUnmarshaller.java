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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailadvqa_public.model.v20200515.ParamListResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.ParamListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ParamListResponseUnmarshaller {

	public static ParamListResponse unmarshall(ParamListResponse paramListResponse, UnmarshallerContext _ctx) {
		
		paramListResponse.setRequestId(_ctx.stringValue("ParamListResponse.RequestId"));
		paramListResponse.setErrorCode(_ctx.stringValue("ParamListResponse.ErrorCode"));
		paramListResponse.setErrorDesc(_ctx.stringValue("ParamListResponse.ErrorDesc"));
		paramListResponse.setSuccess(_ctx.booleanValue("ParamListResponse.Success"));
		paramListResponse.setTraceId(_ctx.stringValue("ParamListResponse.TraceId"));
		paramListResponse.setExStack(_ctx.stringValue("ParamListResponse.ExStack"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ParamListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setPlatformType(_ctx.longValue("ParamListResponse.Data["+ i +"].PlatformType"));
			dataItem.setPlatformId(_ctx.stringValue("ParamListResponse.Data["+ i +"].PlatformId"));
			dataItem.setPlatformName(_ctx.stringValue("ParamListResponse.Data["+ i +"].PlatformName"));

			data.add(dataItem);
		}
		paramListResponse.setData(data);
	 
	 	return paramListResponse;
	}
}