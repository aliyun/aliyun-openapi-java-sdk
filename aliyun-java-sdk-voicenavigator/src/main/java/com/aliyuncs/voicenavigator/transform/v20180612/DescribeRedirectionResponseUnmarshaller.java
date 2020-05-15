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

import com.aliyuncs.voicenavigator.model.v20180612.DescribeRedirectionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRedirectionResponseUnmarshaller {

	public static DescribeRedirectionResponse unmarshall(DescribeRedirectionResponse describeRedirectionResponse, UnmarshallerContext _ctx) {
		
		describeRedirectionResponse.setRequestId(_ctx.stringValue("DescribeRedirectionResponse.RequestId"));
		describeRedirectionResponse.setInstanceId(_ctx.stringValue("DescribeRedirectionResponse.InstanceId"));
		describeRedirectionResponse.setCategoryId(_ctx.stringValue("DescribeRedirectionResponse.CategoryId"));
		describeRedirectionResponse.setNavigationScriptId(_ctx.stringValue("DescribeRedirectionResponse.NavigationScriptId"));
		describeRedirectionResponse.setUserUtterance(_ctx.stringValue("DescribeRedirectionResponse.UserUtterance"));
		describeRedirectionResponse.setPrompt(_ctx.stringValue("DescribeRedirectionResponse.Prompt"));
		describeRedirectionResponse.setInterruptible(_ctx.booleanValue("DescribeRedirectionResponse.Interruptible"));
		describeRedirectionResponse.setRedirectionType(_ctx.stringValue("DescribeRedirectionResponse.RedirectionType"));
		describeRedirectionResponse.setRedirectionTarget(_ctx.stringValue("DescribeRedirectionResponse.RedirectionTarget"));

		List<String> similarUtterances = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRedirectionResponse.SimilarUtterances.Length"); i++) {
			similarUtterances.add(_ctx.stringValue("DescribeRedirectionResponse.SimilarUtterances["+ i +"]"));
		}
		describeRedirectionResponse.setSimilarUtterances(similarUtterances);
	 
	 	return describeRedirectionResponse;
	}
}