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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponse.Contents;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponse.Range;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponse unmarshall(QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponse queryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponse.RequestId"));
		queryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponse.ResultCode"));
		queryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponse.ResultMessage"));
		queryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponse.ResponseStatusCode"));

		Contents contents = new Contents();
		contents.setKind(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponse.Contents.Kind"));
		contents.setValue(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponse.Contents.Value"));
		queryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponse.setContents(contents);

		Range range = new Range();
		range.setEnd(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponse.Range.End"));
		range.setStart(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponse.Range.Start"));
		queryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponse.setRange(range);
	 
	 	return queryLinkeantcodeAntcodeProjectsidrepositorylsifhoverResponse;
	}
}