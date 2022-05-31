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

import com.aliyuncs.cloudesl.model.v20200201.DescribeEslModelByTemplateVersionResponse;
import com.aliyuncs.cloudesl.model.v20200201.DescribeEslModelByTemplateVersionResponse.SelectItemInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEslModelByTemplateVersionResponseUnmarshaller {

	public static DescribeEslModelByTemplateVersionResponse unmarshall(DescribeEslModelByTemplateVersionResponse describeEslModelByTemplateVersionResponse, UnmarshallerContext _ctx) {
		
		describeEslModelByTemplateVersionResponse.setRequestId(_ctx.stringValue("DescribeEslModelByTemplateVersionResponse.RequestId"));
		describeEslModelByTemplateVersionResponse.setTotalCount(_ctx.integerValue("DescribeEslModelByTemplateVersionResponse.TotalCount"));
		describeEslModelByTemplateVersionResponse.setErrorMessage(_ctx.stringValue("DescribeEslModelByTemplateVersionResponse.ErrorMessage"));
		describeEslModelByTemplateVersionResponse.setSuccess(_ctx.booleanValue("DescribeEslModelByTemplateVersionResponse.Success"));
		describeEslModelByTemplateVersionResponse.setErrorCode(_ctx.stringValue("DescribeEslModelByTemplateVersionResponse.ErrorCode"));
		describeEslModelByTemplateVersionResponse.setCode(_ctx.stringValue("DescribeEslModelByTemplateVersionResponse.Code"));
		describeEslModelByTemplateVersionResponse.setMessage(_ctx.stringValue("DescribeEslModelByTemplateVersionResponse.Message"));
		describeEslModelByTemplateVersionResponse.setDynamicMessage(_ctx.stringValue("DescribeEslModelByTemplateVersionResponse.DynamicMessage"));
		describeEslModelByTemplateVersionResponse.setDynamicCode(_ctx.stringValue("DescribeEslModelByTemplateVersionResponse.DynamicCode"));
		describeEslModelByTemplateVersionResponse.setPageNumber(_ctx.integerValue("DescribeEslModelByTemplateVersionResponse.PageNumber"));
		describeEslModelByTemplateVersionResponse.setPageSize(_ctx.integerValue("DescribeEslModelByTemplateVersionResponse.PageSize"));

		List<SelectItemInfo> eslModels = new ArrayList<SelectItemInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEslModelByTemplateVersionResponse.EslModels.Length"); i++) {
			SelectItemInfo selectItemInfo = new SelectItemInfo();
			selectItemInfo.setModelId(_ctx.stringValue("DescribeEslModelByTemplateVersionResponse.EslModels["+ i +"].ModelId"));
			selectItemInfo.setName(_ctx.stringValue("DescribeEslModelByTemplateVersionResponse.EslModels["+ i +"].Name"));
			selectItemInfo.setImage(_ctx.stringValue("DescribeEslModelByTemplateVersionResponse.EslModels["+ i +"].Image"));
			selectItemInfo.setDeviceType(_ctx.stringValue("DescribeEslModelByTemplateVersionResponse.EslModels["+ i +"].DeviceType"));
			selectItemInfo.setVendor(_ctx.stringValue("DescribeEslModelByTemplateVersionResponse.EslModels["+ i +"].Vendor"));
			selectItemInfo.setScreenWidth(_ctx.integerValue("DescribeEslModelByTemplateVersionResponse.EslModels["+ i +"].ScreenWidth"));
			selectItemInfo.setScreenHeight(_ctx.integerValue("DescribeEslModelByTemplateVersionResponse.EslModels["+ i +"].ScreenHeight"));
			selectItemInfo.setEslSize(_ctx.stringValue("DescribeEslModelByTemplateVersionResponse.EslModels["+ i +"].EslSize"));
			selectItemInfo.setEslPhysicalSize(_ctx.stringValue("DescribeEslModelByTemplateVersionResponse.EslModels["+ i +"].EslPhysicalSize"));

			eslModels.add(selectItemInfo);
		}
		describeEslModelByTemplateVersionResponse.setEslModels(eslModels);
	 
	 	return describeEslModelByTemplateVersionResponse;
	}
}