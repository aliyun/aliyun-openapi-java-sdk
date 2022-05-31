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

import com.aliyuncs.cloudesl.model.v20200201.DescribeAvailableEslModelsResponse;
import com.aliyuncs.cloudesl.model.v20200201.DescribeAvailableEslModelsResponse.SelectItemInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAvailableEslModelsResponseUnmarshaller {

	public static DescribeAvailableEslModelsResponse unmarshall(DescribeAvailableEslModelsResponse describeAvailableEslModelsResponse, UnmarshallerContext _ctx) {
		
		describeAvailableEslModelsResponse.setRequestId(_ctx.stringValue("DescribeAvailableEslModelsResponse.RequestId"));
		describeAvailableEslModelsResponse.setTotalCount(_ctx.integerValue("DescribeAvailableEslModelsResponse.TotalCount"));
		describeAvailableEslModelsResponse.setPageSize(_ctx.integerValue("DescribeAvailableEslModelsResponse.PageSize"));
		describeAvailableEslModelsResponse.setPageNumber(_ctx.integerValue("DescribeAvailableEslModelsResponse.PageNumber"));
		describeAvailableEslModelsResponse.setSuccess(_ctx.booleanValue("DescribeAvailableEslModelsResponse.Success"));
		describeAvailableEslModelsResponse.setMessage(_ctx.stringValue("DescribeAvailableEslModelsResponse.Message"));
		describeAvailableEslModelsResponse.setErrorCode(_ctx.stringValue("DescribeAvailableEslModelsResponse.ErrorCode"));
		describeAvailableEslModelsResponse.setErrorMessage(_ctx.stringValue("DescribeAvailableEslModelsResponse.ErrorMessage"));
		describeAvailableEslModelsResponse.setCode(_ctx.stringValue("DescribeAvailableEslModelsResponse.Code"));
		describeAvailableEslModelsResponse.setDynamicCode(_ctx.stringValue("DescribeAvailableEslModelsResponse.DynamicCode"));
		describeAvailableEslModelsResponse.setDynamicMessage(_ctx.stringValue("DescribeAvailableEslModelsResponse.DynamicMessage"));

		List<SelectItemInfo> eslModels = new ArrayList<SelectItemInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAvailableEslModelsResponse.EslModels.Length"); i++) {
			SelectItemInfo selectItemInfo = new SelectItemInfo();
			selectItemInfo.setModelId(_ctx.stringValue("DescribeAvailableEslModelsResponse.EslModels["+ i +"].ModelId"));
			selectItemInfo.setName(_ctx.stringValue("DescribeAvailableEslModelsResponse.EslModels["+ i +"].Name"));
			selectItemInfo.setDeviceType(_ctx.stringValue("DescribeAvailableEslModelsResponse.EslModels["+ i +"].DeviceType"));
			selectItemInfo.setVendor(_ctx.stringValue("DescribeAvailableEslModelsResponse.EslModels["+ i +"].Vendor"));
			selectItemInfo.setScreenWidth(_ctx.integerValue("DescribeAvailableEslModelsResponse.EslModels["+ i +"].ScreenWidth"));
			selectItemInfo.setScreenHeight(_ctx.integerValue("DescribeAvailableEslModelsResponse.EslModels["+ i +"].ScreenHeight"));
			selectItemInfo.setEslSize(_ctx.stringValue("DescribeAvailableEslModelsResponse.EslModels["+ i +"].EslSize"));

			eslModels.add(selectItemInfo);
		}
		describeAvailableEslModelsResponse.setEslModels(eslModels);
	 
	 	return describeAvailableEslModelsResponse;
	}
}