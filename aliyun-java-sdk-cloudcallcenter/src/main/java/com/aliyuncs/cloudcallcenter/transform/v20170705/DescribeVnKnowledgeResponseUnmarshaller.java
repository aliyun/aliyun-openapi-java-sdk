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

import com.aliyuncs.cloudcallcenter.model.v20170705.DescribeVnKnowledgeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVnKnowledgeResponseUnmarshaller {

	public static DescribeVnKnowledgeResponse unmarshall(DescribeVnKnowledgeResponse describeVnKnowledgeResponse, UnmarshallerContext context) {
		
		describeVnKnowledgeResponse.setRequestId(context.stringValue("DescribeVnKnowledgeResponse.RequestId"));
		describeVnKnowledgeResponse.setNavigationScriptId(context.stringValue("DescribeVnKnowledgeResponse.NavigationScriptId"));
		describeVnKnowledgeResponse.setInstanceId(context.stringValue("DescribeVnKnowledgeResponse.InstanceId"));
		describeVnKnowledgeResponse.setCategoryId(context.stringValue("DescribeVnKnowledgeResponse.CategoryId"));
		describeVnKnowledgeResponse.setUserUtterance(context.stringValue("DescribeVnKnowledgeResponse.UserUtterance"));
		describeVnKnowledgeResponse.setAnswer(context.stringValue("DescribeVnKnowledgeResponse.Answer"));
		describeVnKnowledgeResponse.setInterruptible(context.booleanValue("DescribeVnKnowledgeResponse.Interruptible"));

		List<String> similarUtterances = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeVnKnowledgeResponse.SimilarUtterances.Length"); i++) {
			similarUtterances.add(context.stringValue("DescribeVnKnowledgeResponse.SimilarUtterances["+ i +"]"));
		}
		describeVnKnowledgeResponse.setSimilarUtterances(similarUtterances);
	 
	 	return describeVnKnowledgeResponse;
	}
}