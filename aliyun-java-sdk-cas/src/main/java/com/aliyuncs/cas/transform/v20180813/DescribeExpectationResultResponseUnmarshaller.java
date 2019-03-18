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

package com.aliyuncs.cas.transform.v20180813;

import com.aliyuncs.cas.model.v20180813.DescribeExpectationResultResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExpectationResultResponseUnmarshaller {

	public static DescribeExpectationResultResponse unmarshall(DescribeExpectationResultResponse describeExpectationResultResponse, UnmarshallerContext context) {
		
		describeExpectationResultResponse.setRequestId(context.stringValue("DescribeExpectationResultResponse.RequestId"));
		describeExpectationResultResponse.setExpectationType(context.stringValue("DescribeExpectationResultResponse.ExpectationType"));
		describeExpectationResultResponse.setErrorMessage(context.stringValue("DescribeExpectationResultResponse.ErrorMessage"));
		describeExpectationResultResponse.setProcessStatus(context.stringValue("DescribeExpectationResultResponse.ProcessStatus"));
		describeExpectationResultResponse.setCheckName(context.stringValue("DescribeExpectationResultResponse.CheckName"));
		describeExpectationResultResponse.setCheckValue(context.stringValue("DescribeExpectationResultResponse.CheckValue"));
		describeExpectationResultResponse.setModifiedTime(context.stringValue("DescribeExpectationResultResponse.ModifiedTime"));
		describeExpectationResultResponse.setCheckType(context.stringValue("DescribeExpectationResultResponse.CheckType"));
		describeExpectationResultResponse.setCheckName1(context.stringValue("DescribeExpectationResultResponse.CheckName1"));
		describeExpectationResultResponse.setCheckName2(context.stringValue("DescribeExpectationResultResponse.CheckName2"));
	 
	 	return describeExpectationResultResponse;
	}
}