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

import com.aliyuncs.green.model.v20170823.ImportKeywordsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImportKeywordsResponseUnmarshaller {

	public static ImportKeywordsResponse unmarshall(ImportKeywordsResponse importKeywordsResponse, UnmarshallerContext _ctx) {
		
		importKeywordsResponse.setRequestId(_ctx.stringValue("ImportKeywordsResponse.RequestId"));
		importKeywordsResponse.setSuccessCount(_ctx.integerValue("ImportKeywordsResponse.SuccessCount"));

		List<String> invalidKeywordList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ImportKeywordsResponse.InvalidKeywordList.Length"); i++) {
			invalidKeywordList.add(_ctx.stringValue("ImportKeywordsResponse.InvalidKeywordList["+ i +"]"));
		}
		importKeywordsResponse.setInvalidKeywordList(invalidKeywordList);

		List<String> validKeywordList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ImportKeywordsResponse.validKeywordList.Length"); i++) {
			validKeywordList.add(_ctx.stringValue("ImportKeywordsResponse.validKeywordList["+ i +"]"));
		}
		importKeywordsResponse.setValidKeywordList(validKeywordList);
	 
	 	return importKeywordsResponse;
	}
}