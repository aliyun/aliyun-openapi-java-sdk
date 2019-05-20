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

import com.aliyuncs.cloudcallcenter.model.v20170705.DecryptResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.DecryptResponse.CypherContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class DecryptResponseUnmarshaller {

	public static DecryptResponse unmarshall(DecryptResponse decryptResponse, UnmarshallerContext context) {
		
		decryptResponse.setRequestId(context.stringValue("DecryptResponse.RequestId"));
		decryptResponse.setSuccess(context.booleanValue("DecryptResponse.Success"));
		decryptResponse.setCode(context.stringValue("DecryptResponse.Code"));
		decryptResponse.setMessage(context.stringValue("DecryptResponse.Message"));
		decryptResponse.setHttpStatusCode(context.integerValue("DecryptResponse.HttpStatusCode"));

		List<CypherContent> cypherContents = new ArrayList<CypherContent>();
		for (int i = 0; i < context.lengthValue("DecryptResponse.CypherContents.Length"); i++) {
			CypherContent cypherContent = new CypherContent();
			cypherContent.setPlainText(context.stringValue("DecryptResponse.CypherContents["+ i +"].PlainText"));
			cypherContent.setCypherText(context.stringValue("DecryptResponse.CypherContents["+ i +"].CypherText"));

			cypherContents.add(cypherContent);
		}
		decryptResponse.setCypherContents(cypherContents);
	 
	 	return decryptResponse;
	}
}