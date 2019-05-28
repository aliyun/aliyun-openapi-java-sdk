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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.EncryptResponse;
import com.aliyuncs.ccc.model.v20170705.EncryptResponse.CypherContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class EncryptResponseUnmarshaller {

	public static EncryptResponse unmarshall(EncryptResponse encryptResponse, UnmarshallerContext context) {
		
		encryptResponse.setRequestId(context.stringValue("EncryptResponse.RequestId"));
		encryptResponse.setSuccess(context.booleanValue("EncryptResponse.Success"));
		encryptResponse.setCode(context.stringValue("EncryptResponse.Code"));
		encryptResponse.setMessage(context.stringValue("EncryptResponse.Message"));
		encryptResponse.setHttpStatusCode(context.integerValue("EncryptResponse.HttpStatusCode"));
		encryptResponse.setPublicKey(context.stringValue("EncryptResponse.PublicKey"));

		List<CypherContent> cypherContents = new ArrayList<CypherContent>();
		for (int i = 0; i < context.lengthValue("EncryptResponse.CypherContents.Length"); i++) {
			CypherContent cypherContent = new CypherContent();
			cypherContent.setPlainText(context.stringValue("EncryptResponse.CypherContents["+ i +"].PlainText"));
			cypherContent.setCypherText(context.stringValue("EncryptResponse.CypherContents["+ i +"].CypherText"));

			cypherContents.add(cypherContent);
		}
		encryptResponse.setCypherContents(cypherContents);
	 
	 	return encryptResponse;
	}
}