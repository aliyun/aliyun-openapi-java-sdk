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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeLsifhoverResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeLsifhoverResponse.Contents;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeLsifhoverResponse.Range;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeLsifhoverResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeLsifhoverResponse unmarshall(CreateLinkeantcodeAntcodeLsifhoverResponse createLinkeantcodeAntcodeLsifhoverResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeLsifhoverResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeLsifhoverResponse.RequestId"));
		createLinkeantcodeAntcodeLsifhoverResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeLsifhoverResponse.ResultCode"));
		createLinkeantcodeAntcodeLsifhoverResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeLsifhoverResponse.ResultMessage"));
		createLinkeantcodeAntcodeLsifhoverResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeLsifhoverResponse.ResponseStatusCode"));

		Contents contents = new Contents();
		contents.setKind(_ctx.stringValue("CreateLinkeantcodeAntcodeLsifhoverResponse.Contents.Kind"));
		contents.setValue(_ctx.stringValue("CreateLinkeantcodeAntcodeLsifhoverResponse.Contents.Value"));
		createLinkeantcodeAntcodeLsifhoverResponse.setContents(contents);

		Range range = new Range();
		range.setEnd(_ctx.stringValue("CreateLinkeantcodeAntcodeLsifhoverResponse.Range.End"));
		range.setStart(_ctx.stringValue("CreateLinkeantcodeAntcodeLsifhoverResponse.Range.Start"));
		createLinkeantcodeAntcodeLsifhoverResponse.setRange(range);
	 
	 	return createLinkeantcodeAntcodeLsifhoverResponse;
	}
}