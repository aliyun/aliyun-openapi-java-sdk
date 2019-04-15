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

package com.aliyuncs.aegis.transform.v20161111;

import com.aliyuncs.aegis.model.v20161111.DescribeCheckWarningDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCheckWarningDetailResponseUnmarshaller {

	public static DescribeCheckWarningDetailResponse unmarshall(DescribeCheckWarningDetailResponse describeCheckWarningDetailResponse, UnmarshallerContext context) {
		
		describeCheckWarningDetailResponse.setRequestId(context.stringValue("DescribeCheckWarningDetailResponse.RequestId"));
		describeCheckWarningDetailResponse.setCheckId(context.longValue("DescribeCheckWarningDetailResponse.CheckId"));
		describeCheckWarningDetailResponse.setLevel(context.stringValue("DescribeCheckWarningDetailResponse.Level"));
		describeCheckWarningDetailResponse.setItem(context.stringValue("DescribeCheckWarningDetailResponse.Item"));
		describeCheckWarningDetailResponse.setPrompt(context.stringValue("DescribeCheckWarningDetailResponse.Prompt"));
		describeCheckWarningDetailResponse.setType(context.stringValue("DescribeCheckWarningDetailResponse.Type"));
		describeCheckWarningDetailResponse.setAdvice(context.stringValue("DescribeCheckWarningDetailResponse.Advice"));
		describeCheckWarningDetailResponse.setDescription(context.stringValue("DescribeCheckWarningDetailResponse.Description"));
	 
	 	return describeCheckWarningDetailResponse;
	}
}