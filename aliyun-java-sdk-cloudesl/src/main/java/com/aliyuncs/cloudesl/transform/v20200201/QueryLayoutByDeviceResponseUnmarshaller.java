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

package com.aliyuncs.cloudesl.transform.v20200201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20200201.QueryLayoutByDeviceResponse;
import com.aliyuncs.cloudesl.model.v20200201.QueryLayoutByDeviceResponse.Layout;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLayoutByDeviceResponseUnmarshaller {

	public static QueryLayoutByDeviceResponse unmarshall(QueryLayoutByDeviceResponse queryLayoutByDeviceResponse, UnmarshallerContext _ctx) {
		
		queryLayoutByDeviceResponse.setRequestId(_ctx.stringValue("QueryLayoutByDeviceResponse.RequestId"));
		queryLayoutByDeviceResponse.setSuccess(_ctx.booleanValue("QueryLayoutByDeviceResponse.Success"));
		queryLayoutByDeviceResponse.setMessage(_ctx.stringValue("QueryLayoutByDeviceResponse.Message"));
		queryLayoutByDeviceResponse.setErrorCode(_ctx.stringValue("QueryLayoutByDeviceResponse.ErrorCode"));
		queryLayoutByDeviceResponse.setErrorMessage(_ctx.stringValue("QueryLayoutByDeviceResponse.ErrorMessage"));
		queryLayoutByDeviceResponse.setCode(_ctx.stringValue("QueryLayoutByDeviceResponse.Code"));
		queryLayoutByDeviceResponse.setDynamicCode(_ctx.stringValue("QueryLayoutByDeviceResponse.DynamicCode"));
		queryLayoutByDeviceResponse.setDynamicMessage(_ctx.stringValue("QueryLayoutByDeviceResponse.DynamicMessage"));
		queryLayoutByDeviceResponse.setPageNumber(_ctx.integerValue("QueryLayoutByDeviceResponse.PageNumber"));
		queryLayoutByDeviceResponse.setPageSize(_ctx.integerValue("QueryLayoutByDeviceResponse.PageSize"));
		queryLayoutByDeviceResponse.setTotalCount(_ctx.integerValue("QueryLayoutByDeviceResponse.TotalCount"));

		List<Layout> layoutList = new ArrayList<Layout>();
		for (int i = 0; i < _ctx.lengthValue("QueryLayoutByDeviceResponse.LayoutList.Length"); i++) {
			Layout layout = new Layout();
			layout.setLayoutId(_ctx.stringValue("QueryLayoutByDeviceResponse.LayoutList["+ i +"].LayoutId"));
			layout.setLayoutName(_ctx.stringValue("QueryLayoutByDeviceResponse.LayoutList["+ i +"].LayoutName"));
			layout.setDescription(_ctx.stringValue("QueryLayoutByDeviceResponse.LayoutList["+ i +"].Description"));
			layout.setLayoutTemplateId(_ctx.stringValue("QueryLayoutByDeviceResponse.LayoutList["+ i +"].LayoutTemplateId"));
			layout.setIsBind(_ctx.booleanValue("QueryLayoutByDeviceResponse.LayoutList["+ i +"].IsBind"));
			layout.setBrand(_ctx.stringValue("QueryLayoutByDeviceResponse.LayoutList["+ i +"].Brand"));
			layout.setBasePic(_ctx.stringValue("QueryLayoutByDeviceResponse.LayoutList["+ i +"].BasePic"));

			layoutList.add(layout);
		}
		queryLayoutByDeviceResponse.setLayoutList(layoutList);
	 
	 	return queryLayoutByDeviceResponse;
	}
}