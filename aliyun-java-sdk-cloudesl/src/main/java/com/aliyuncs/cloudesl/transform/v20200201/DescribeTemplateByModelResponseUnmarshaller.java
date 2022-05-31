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

import com.aliyuncs.cloudesl.model.v20200201.DescribeTemplateByModelResponse;
import com.aliyuncs.cloudesl.model.v20200201.DescribeTemplateByModelResponse.SelectItemInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTemplateByModelResponseUnmarshaller {

	public static DescribeTemplateByModelResponse unmarshall(DescribeTemplateByModelResponse describeTemplateByModelResponse, UnmarshallerContext _ctx) {
		
		describeTemplateByModelResponse.setRequestId(_ctx.stringValue("DescribeTemplateByModelResponse.RequestId"));
		describeTemplateByModelResponse.setErrorMessage(_ctx.stringValue("DescribeTemplateByModelResponse.ErrorMessage"));
		describeTemplateByModelResponse.setSuccess(_ctx.booleanValue("DescribeTemplateByModelResponse.Success"));
		describeTemplateByModelResponse.setErrorCode(_ctx.stringValue("DescribeTemplateByModelResponse.ErrorCode"));
		describeTemplateByModelResponse.setCode(_ctx.stringValue("DescribeTemplateByModelResponse.Code"));
		describeTemplateByModelResponse.setMessage(_ctx.stringValue("DescribeTemplateByModelResponse.Message"));
		describeTemplateByModelResponse.setDynamicMessage(_ctx.stringValue("DescribeTemplateByModelResponse.DynamicMessage"));
		describeTemplateByModelResponse.setDynamicCode(_ctx.stringValue("DescribeTemplateByModelResponse.DynamicCode"));
		describeTemplateByModelResponse.setTotalCount(_ctx.integerValue("DescribeTemplateByModelResponse.TotalCount"));
		describeTemplateByModelResponse.setPageSize(_ctx.integerValue("DescribeTemplateByModelResponse.PageSize"));
		describeTemplateByModelResponse.setPageNumber(_ctx.integerValue("DescribeTemplateByModelResponse.PageNumber"));

		List<SelectItemInfo> items = new ArrayList<SelectItemInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTemplateByModelResponse.Items.Length"); i++) {
			SelectItemInfo selectItemInfo = new SelectItemInfo();
			selectItemInfo.setBasePicture(_ctx.stringValue("DescribeTemplateByModelResponse.Items["+ i +"].BasePicture"));
			selectItemInfo.setTemplateId(_ctx.stringValue("DescribeTemplateByModelResponse.Items["+ i +"].TemplateId"));
			selectItemInfo.setTemplateName(_ctx.stringValue("DescribeTemplateByModelResponse.Items["+ i +"].TemplateName"));
			selectItemInfo.setEslSize(_ctx.stringValue("DescribeTemplateByModelResponse.Items["+ i +"].EslSize"));
			selectItemInfo.setEslType(_ctx.stringValue("DescribeTemplateByModelResponse.Items["+ i +"].EslType"));
			selectItemInfo.setWidth(_ctx.longValue("DescribeTemplateByModelResponse.Items["+ i +"].Width"));
			selectItemInfo.setHeight(_ctx.longValue("DescribeTemplateByModelResponse.Items["+ i +"].Height"));
			selectItemInfo.setTemplateVersion(_ctx.stringValue("DescribeTemplateByModelResponse.Items["+ i +"].TemplateVersion"));
			selectItemInfo.setLayout(_ctx.stringValue("DescribeTemplateByModelResponse.Items["+ i +"].Layout"));
			selectItemInfo.setScene(_ctx.stringValue("DescribeTemplateByModelResponse.Items["+ i +"].Scene"));
			selectItemInfo.setBrand(_ctx.stringValue("DescribeTemplateByModelResponse.Items["+ i +"].Brand"));

			items.add(selectItemInfo);
		}
		describeTemplateByModelResponse.setItems(items);
	 
	 	return describeTemplateByModelResponse;
	}
}