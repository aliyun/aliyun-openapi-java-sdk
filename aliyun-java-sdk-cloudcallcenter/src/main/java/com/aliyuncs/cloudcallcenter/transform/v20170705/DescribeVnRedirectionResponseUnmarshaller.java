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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.DescribeVnRedirectionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVnRedirectionResponseUnmarshaller {

	public static DescribeVnRedirectionResponse unmarshall(DescribeVnRedirectionResponse describeVnRedirectionResponse, UnmarshallerContext context) {
		
		describeVnRedirectionResponse.setRequestId(context.stringValue("DescribeVnRedirectionResponse.RequestId"));
		describeVnRedirectionResponse.setInstanceId(context.stringValue("DescribeVnRedirectionResponse.InstanceId"));
		describeVnRedirectionResponse.setCategoryId(context.stringValue("DescribeVnRedirectionResponse.CategoryId"));
		describeVnRedirectionResponse.setNavigationScriptId(context.stringValue("DescribeVnRedirectionResponse.NavigationScriptId"));
		describeVnRedirectionResponse.setUserUtterance(context.stringValue("DescribeVnRedirectionResponse.UserUtterance"));
		describeVnRedirectionResponse.setPrompt(context.stringValue("DescribeVnRedirectionResponse.Prompt"));
		describeVnRedirectionResponse.setInterruptible(context.booleanValue("DescribeVnRedirectionResponse.Interruptible"));
		describeVnRedirectionResponse.setRedirectionType(context.stringValue("DescribeVnRedirectionResponse.RedirectionType"));
		describeVnRedirectionResponse.setRedirectionTarget(context.stringValue("DescribeVnRedirectionResponse.RedirectionTarget"));

		List<String> similarUtterances = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeVnRedirectionResponse.SimilarUtterances.Length"); i++) {
			similarUtterances.add(context.stringValue("DescribeVnRedirectionResponse.SimilarUtterances["+ i +"]"));
		}
		describeVnRedirectionResponse.setSimilarUtterances(similarUtterances);
	 
	 	return describeVnRedirectionResponse;
	}
}