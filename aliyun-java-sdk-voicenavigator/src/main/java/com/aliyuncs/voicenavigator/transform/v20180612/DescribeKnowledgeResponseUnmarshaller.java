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

package com.aliyuncs.voicenavigator.transform.v20180612;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.voicenavigator.model.v20180612.DescribeKnowledgeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeKnowledgeResponseUnmarshaller {

	public static DescribeKnowledgeResponse unmarshall(DescribeKnowledgeResponse describeKnowledgeResponse, UnmarshallerContext _ctx) {
		
		describeKnowledgeResponse.setRequestId(_ctx.stringValue("DescribeKnowledgeResponse.RequestId"));
		describeKnowledgeResponse.setNavigationScriptId(_ctx.stringValue("DescribeKnowledgeResponse.NavigationScriptId"));
		describeKnowledgeResponse.setInstanceId(_ctx.stringValue("DescribeKnowledgeResponse.InstanceId"));
		describeKnowledgeResponse.setCategoryId(_ctx.stringValue("DescribeKnowledgeResponse.CategoryId"));
		describeKnowledgeResponse.setUserUtterance(_ctx.stringValue("DescribeKnowledgeResponse.UserUtterance"));
		describeKnowledgeResponse.setAnswer(_ctx.stringValue("DescribeKnowledgeResponse.Answer"));
		describeKnowledgeResponse.setInterruptible(_ctx.booleanValue("DescribeKnowledgeResponse.Interruptible"));

		List<String> similarUtterances = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeKnowledgeResponse.SimilarUtterances.Length"); i++) {
			similarUtterances.add(_ctx.stringValue("DescribeKnowledgeResponse.SimilarUtterances["+ i +"]"));
		}
		describeKnowledgeResponse.setSimilarUtterances(similarUtterances);
	 
	 	return describeKnowledgeResponse;
	}
}