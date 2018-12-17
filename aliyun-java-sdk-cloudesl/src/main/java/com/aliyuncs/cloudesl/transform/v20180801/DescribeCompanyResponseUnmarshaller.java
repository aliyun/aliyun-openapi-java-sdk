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

package com.aliyuncs.cloudesl.transform.v20180801;

import com.aliyuncs.cloudesl.model.v20180801.DescribeCompanyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCompanyResponseUnmarshaller {

	public static DescribeCompanyResponse unmarshall(DescribeCompanyResponse describeCompanyResponse, UnmarshallerContext context) {
		
		describeCompanyResponse.setRequestId(context.stringValue("DescribeCompanyResponse.RequestId"));
		describeCompanyResponse.setSuccess(context.booleanValue("DescribeCompanyResponse.Success"));
		describeCompanyResponse.setMessage(context.stringValue("DescribeCompanyResponse.Message"));
		describeCompanyResponse.setErrorCode(context.stringValue("DescribeCompanyResponse.ErrorCode"));
		describeCompanyResponse.setCompanyId(context.stringValue("DescribeCompanyResponse.CompanyId"));
		describeCompanyResponse.setPlatform(context.stringValue("DescribeCompanyResponse.Platform"));
		describeCompanyResponse.setStatus(context.stringValue("DescribeCompanyResponse.Status"));
	 
	 	return describeCompanyResponse;
	}
}