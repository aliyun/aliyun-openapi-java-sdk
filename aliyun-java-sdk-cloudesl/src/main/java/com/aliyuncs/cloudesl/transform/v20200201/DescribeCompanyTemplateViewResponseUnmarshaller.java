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

import com.aliyuncs.cloudesl.model.v20200201.DescribeCompanyTemplateViewResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCompanyTemplateViewResponseUnmarshaller {

	public static DescribeCompanyTemplateViewResponse unmarshall(DescribeCompanyTemplateViewResponse describeCompanyTemplateViewResponse, UnmarshallerContext _ctx) {
		
		describeCompanyTemplateViewResponse.setRequestId(_ctx.stringValue("DescribeCompanyTemplateViewResponse.RequestId"));
		describeCompanyTemplateViewResponse.setData(_ctx.stringValue("DescribeCompanyTemplateViewResponse.Data"));
		describeCompanyTemplateViewResponse.setErrorMessage(_ctx.stringValue("DescribeCompanyTemplateViewResponse.ErrorMessage"));
		describeCompanyTemplateViewResponse.setSuccess(_ctx.booleanValue("DescribeCompanyTemplateViewResponse.Success"));
		describeCompanyTemplateViewResponse.setErrorCode(_ctx.stringValue("DescribeCompanyTemplateViewResponse.ErrorCode"));
		describeCompanyTemplateViewResponse.setCode(_ctx.stringValue("DescribeCompanyTemplateViewResponse.Code"));
		describeCompanyTemplateViewResponse.setMessage(_ctx.stringValue("DescribeCompanyTemplateViewResponse.Message"));
		describeCompanyTemplateViewResponse.setDynamicMessage(_ctx.stringValue("DescribeCompanyTemplateViewResponse.DynamicMessage"));
		describeCompanyTemplateViewResponse.setDynamicCode(_ctx.stringValue("DescribeCompanyTemplateViewResponse.DynamicCode"));
	 
	 	return describeCompanyTemplateViewResponse;
	}
}