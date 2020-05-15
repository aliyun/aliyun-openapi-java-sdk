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

package com.aliyuncs.green.transform.v20170823;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20170823.CreateKeywordResponse;
import com.aliyuncs.green.model.v20170823.CreateKeywordResponse.ValidKeyword;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateKeywordResponseUnmarshaller {

	public static CreateKeywordResponse unmarshall(CreateKeywordResponse createKeywordResponse, UnmarshallerContext _ctx) {
		
		createKeywordResponse.setRequestId(_ctx.stringValue("CreateKeywordResponse.RequestId"));
		createKeywordResponse.setSuccessCount(_ctx.integerValue("CreateKeywordResponse.SuccessCount"));

		List<String> invalidKeywordList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateKeywordResponse.InvalidKeywordList.Length"); i++) {
			invalidKeywordList.add(_ctx.stringValue("CreateKeywordResponse.InvalidKeywordList["+ i +"]"));
		}
		createKeywordResponse.setInvalidKeywordList(invalidKeywordList);

		List<ValidKeyword> validKeywordList = new ArrayList<ValidKeyword>();
		for (int i = 0; i < _ctx.lengthValue("CreateKeywordResponse.validKeywordList.Length"); i++) {
			ValidKeyword validKeyword = new ValidKeyword();
			validKeyword.setId(_ctx.integerValue("CreateKeywordResponse.validKeywordList["+ i +"].id"));
			validKeyword.setKeyword(_ctx.stringValue("CreateKeywordResponse.validKeywordList["+ i +"].keyword"));

			validKeywordList.add(validKeyword);
		}
		createKeywordResponse.setValidKeywordList(validKeywordList);
	 
	 	return createKeywordResponse;
	}
}