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

import com.aliyuncs.green.model.v20170823.DescribeKeywordLibResponse;
import com.aliyuncs.green.model.v20170823.DescribeKeywordLibResponse.KeywordLib;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeKeywordLibResponseUnmarshaller {

	public static DescribeKeywordLibResponse unmarshall(DescribeKeywordLibResponse describeKeywordLibResponse, UnmarshallerContext _ctx) {
		
		describeKeywordLibResponse.setRequestId(_ctx.stringValue("DescribeKeywordLibResponse.RequestId"));
		describeKeywordLibResponse.setTotalCount(_ctx.integerValue("DescribeKeywordLibResponse.TotalCount"));

		List<KeywordLib> keywordLibList = new ArrayList<KeywordLib>();
		for (int i = 0; i < _ctx.lengthValue("DescribeKeywordLibResponse.KeywordLibList.Length"); i++) {
			KeywordLib keywordLib = new KeywordLib();
			keywordLib.setId(_ctx.integerValue("DescribeKeywordLibResponse.KeywordLibList["+ i +"].Id"));
			keywordLib.setModifiedTime(_ctx.stringValue("DescribeKeywordLibResponse.KeywordLibList["+ i +"].ModifiedTime"));
			keywordLib.setName(_ctx.stringValue("DescribeKeywordLibResponse.KeywordLibList["+ i +"].Name"));
			keywordLib.setCode(_ctx.stringValue("DescribeKeywordLibResponse.KeywordLibList["+ i +"].Code"));
			keywordLib.setCount(_ctx.integerValue("DescribeKeywordLibResponse.KeywordLibList["+ i +"].Count"));
			keywordLib.setCategory(_ctx.stringValue("DescribeKeywordLibResponse.KeywordLibList["+ i +"].Category"));
			keywordLib.setResourceType(_ctx.stringValue("DescribeKeywordLibResponse.KeywordLibList["+ i +"].ResourceType"));
			keywordLib.setLibType(_ctx.stringValue("DescribeKeywordLibResponse.KeywordLibList["+ i +"].LibType"));
			keywordLib.setSource(_ctx.stringValue("DescribeKeywordLibResponse.KeywordLibList["+ i +"].Source"));
			keywordLib.setServiceModule(_ctx.stringValue("DescribeKeywordLibResponse.KeywordLibList["+ i +"].ServiceModule"));
			keywordLib.setLanguage(_ctx.stringValue("DescribeKeywordLibResponse.KeywordLibList["+ i +"].Language"));
			keywordLib.setMatchMode(_ctx.stringValue("DescribeKeywordLibResponse.KeywordLibList["+ i +"].MatchMode"));
			keywordLib.setEnable(_ctx.booleanValue("DescribeKeywordLibResponse.KeywordLibList["+ i +"].Enable"));

			List<String> bizTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeKeywordLibResponse.KeywordLibList["+ i +"].BizTypes.Length"); j++) {
				bizTypes.add(_ctx.stringValue("DescribeKeywordLibResponse.KeywordLibList["+ i +"].BizTypes["+ j +"]"));
			}
			keywordLib.setBizTypes(bizTypes);

			keywordLibList.add(keywordLib);
		}
		describeKeywordLibResponse.setKeywordLibList(keywordLibList);
	 
	 	return describeKeywordLibResponse;
	}
}