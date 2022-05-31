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

import com.aliyuncs.cloudesl.model.v20200201.DescribeCompanyTemplateVersionsResponse;
import com.aliyuncs.cloudesl.model.v20200201.DescribeCompanyTemplateVersionsResponse.SelectItemInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCompanyTemplateVersionsResponseUnmarshaller {

	public static DescribeCompanyTemplateVersionsResponse unmarshall(DescribeCompanyTemplateVersionsResponse describeCompanyTemplateVersionsResponse, UnmarshallerContext _ctx) {
		
		describeCompanyTemplateVersionsResponse.setRequestId(_ctx.stringValue("DescribeCompanyTemplateVersionsResponse.RequestId"));
		describeCompanyTemplateVersionsResponse.setTotalCount(_ctx.integerValue("DescribeCompanyTemplateVersionsResponse.TotalCount"));
		describeCompanyTemplateVersionsResponse.setErrorMessage(_ctx.stringValue("DescribeCompanyTemplateVersionsResponse.ErrorMessage"));
		describeCompanyTemplateVersionsResponse.setSuccess(_ctx.booleanValue("DescribeCompanyTemplateVersionsResponse.Success"));
		describeCompanyTemplateVersionsResponse.setErrorCode(_ctx.stringValue("DescribeCompanyTemplateVersionsResponse.ErrorCode"));
		describeCompanyTemplateVersionsResponse.setCode(_ctx.stringValue("DescribeCompanyTemplateVersionsResponse.Code"));
		describeCompanyTemplateVersionsResponse.setMessage(_ctx.stringValue("DescribeCompanyTemplateVersionsResponse.Message"));
		describeCompanyTemplateVersionsResponse.setDynamicMessage(_ctx.stringValue("DescribeCompanyTemplateVersionsResponse.DynamicMessage"));
		describeCompanyTemplateVersionsResponse.setDynamicCode(_ctx.stringValue("DescribeCompanyTemplateVersionsResponse.DynamicCode"));
		describeCompanyTemplateVersionsResponse.setPageSize(_ctx.integerValue("DescribeCompanyTemplateVersionsResponse.PageSize"));
		describeCompanyTemplateVersionsResponse.setPageNumber(_ctx.integerValue("DescribeCompanyTemplateVersionsResponse.PageNumber"));

		List<SelectItemInfo> versions = new ArrayList<SelectItemInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCompanyTemplateVersionsResponse.Versions.Length"); i++) {
			SelectItemInfo selectItemInfo = new SelectItemInfo();
			selectItemInfo.setVersion(_ctx.stringValue("DescribeCompanyTemplateVersionsResponse.Versions["+ i +"].Version"));

			versions.add(selectItemInfo);
		}
		describeCompanyTemplateVersionsResponse.setVersions(versions);
	 
	 	return describeCompanyTemplateVersionsResponse;
	}
}