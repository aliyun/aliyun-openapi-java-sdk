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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeDeleteprojectbranchbybranchnameResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodeDeleteprojectbranchbybranchnameResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodeDeleteprojectbranchbybranchnameResponse unmarshall(QueryLinkeantcodeAntcodeDeleteprojectbranchbybranchnameResponse queryLinkeantcodeAntcodeDeleteprojectbranchbybranchnameResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodeDeleteprojectbranchbybranchnameResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodeDeleteprojectbranchbybranchnameResponse.RequestId"));
		queryLinkeantcodeAntcodeDeleteprojectbranchbybranchnameResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodeDeleteprojectbranchbybranchnameResponse.ResultCode"));
		queryLinkeantcodeAntcodeDeleteprojectbranchbybranchnameResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeDeleteprojectbranchbybranchnameResponse.ResultMessage"));
		queryLinkeantcodeAntcodeDeleteprojectbranchbybranchnameResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodeDeleteprojectbranchbybranchnameResponse.ResponseStatusCode"));
		queryLinkeantcodeAntcodeDeleteprojectbranchbybranchnameResponse.setTagName(_ctx.stringValue("QueryLinkeantcodeAntcodeDeleteprojectbranchbybranchnameResponse.TagName"));
	 
	 	return queryLinkeantcodeAntcodeDeleteprojectbranchbybranchnameResponse;
	}
}