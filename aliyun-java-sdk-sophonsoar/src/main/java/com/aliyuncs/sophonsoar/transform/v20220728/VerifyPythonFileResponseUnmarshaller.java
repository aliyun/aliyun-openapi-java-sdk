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

package com.aliyuncs.sophonsoar.transform.v20220728;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sophonsoar.model.v20220728.VerifyPythonFileResponse;
import com.aliyuncs.sophonsoar.model.v20220728.VerifyPythonFileResponse.SyntaxItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class VerifyPythonFileResponseUnmarshaller {

	public static VerifyPythonFileResponse unmarshall(VerifyPythonFileResponse verifyPythonFileResponse, UnmarshallerContext _ctx) {
		
		verifyPythonFileResponse.setRequestId(_ctx.stringValue("VerifyPythonFileResponse.RequestId"));

		List<SyntaxItem> syntax = new ArrayList<SyntaxItem>();
		for (int i = 0; i < _ctx.lengthValue("VerifyPythonFileResponse.Syntax.Length"); i++) {
			SyntaxItem syntaxItem = new SyntaxItem();
			syntaxItem.setStartLineNumber(_ctx.integerValue("VerifyPythonFileResponse.Syntax["+ i +"].StartLineNumber"));
			syntaxItem.setStartColumn(_ctx.integerValue("VerifyPythonFileResponse.Syntax["+ i +"].StartColumn"));
			syntaxItem.setEndLineNumber(_ctx.integerValue("VerifyPythonFileResponse.Syntax["+ i +"].EndLineNumber"));
			syntaxItem.setEndColumn(_ctx.integerValue("VerifyPythonFileResponse.Syntax["+ i +"].EndColumn"));
			syntaxItem.setMessage(_ctx.stringValue("VerifyPythonFileResponse.Syntax["+ i +"].Message"));
			syntaxItem.setSeverity(_ctx.integerValue("VerifyPythonFileResponse.Syntax["+ i +"].Severity"));

			syntax.add(syntaxItem);
		}
		verifyPythonFileResponse.setSyntax(syntax);
	 
	 	return verifyPythonFileResponse;
	}
}