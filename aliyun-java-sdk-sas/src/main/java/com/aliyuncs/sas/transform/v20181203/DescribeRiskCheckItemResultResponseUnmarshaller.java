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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.DescribeRiskCheckItemResultResponse;
import com.aliyuncs.sas.model.v20181203.DescribeRiskCheckItemResultResponse.PageContentResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRiskCheckItemResultResponseUnmarshaller {

	public static DescribeRiskCheckItemResultResponse unmarshall(DescribeRiskCheckItemResultResponse describeRiskCheckItemResultResponse, UnmarshallerContext _ctx) {
		
		describeRiskCheckItemResultResponse.setRequestId(_ctx.stringValue("DescribeRiskCheckItemResultResponse.RequestId"));

		PageContentResource pageContentResource = new PageContentResource();
		pageContentResource.setContentResource(_ctx.stringValue("DescribeRiskCheckItemResultResponse.PageContentResource.ContentResource"));
		pageContentResource.setCurrentPage(_ctx.integerValue("DescribeRiskCheckItemResultResponse.PageContentResource.CurrentPage"));
		pageContentResource.setPageSize(_ctx.integerValue("DescribeRiskCheckItemResultResponse.PageContentResource.PageSize"));
		pageContentResource.setTotalCount(_ctx.integerValue("DescribeRiskCheckItemResultResponse.PageContentResource.TotalCount"));
		pageContentResource.setCount(_ctx.integerValue("DescribeRiskCheckItemResultResponse.PageContentResource.Count"));
		pageContentResource.setPageCount(_ctx.integerValue("DescribeRiskCheckItemResultResponse.PageContentResource.PageCount"));
		describeRiskCheckItemResultResponse.setPageContentResource(pageContentResource);
	 
	 	return describeRiskCheckItemResultResponse;
	}
}