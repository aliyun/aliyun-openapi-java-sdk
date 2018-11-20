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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeKeywordLibResponseUnmarshaller {

	public static DescribeKeywordLibResponse unmarshall(DescribeKeywordLibResponse describeKeywordLibResponse, UnmarshallerContext context) {
		
		describeKeywordLibResponse.setRequestId(context.stringValue("DescribeKeywordLibResponse.RequestId"));
		describeKeywordLibResponse.setTotalCount(context.integerValue("DescribeKeywordLibResponse.TotalCount"));

		List<KeywordLib> keywordLibList = new ArrayList<KeywordLib>();
		for (int i = 0; i < context.lengthValue("DescribeKeywordLibResponse.KeywordLibList.Length"); i++) {
			KeywordLib keywordLib = new KeywordLib();
			keywordLib.setId(context.integerValue("DescribeKeywordLibResponse.KeywordLibList["+ i +"].Id"));
			keywordLib.setModifiedTime(context.stringValue("DescribeKeywordLibResponse.KeywordLibList["+ i +"].ModifiedTime"));
			keywordLib.setName(context.stringValue("DescribeKeywordLibResponse.KeywordLibList["+ i +"].Name"));
			keywordLib.setCode(context.stringValue("DescribeKeywordLibResponse.KeywordLibList["+ i +"].Code"));
			keywordLib.setCount(context.integerValue("DescribeKeywordLibResponse.KeywordLibList["+ i +"].Count"));
			keywordLib.setCategory(context.stringValue("DescribeKeywordLibResponse.KeywordLibList["+ i +"].Category"));
			keywordLib.setResourceType(context.stringValue("DescribeKeywordLibResponse.KeywordLibList["+ i +"].ResourceType"));
			keywordLib.setLibType(context.stringValue("DescribeKeywordLibResponse.KeywordLibList["+ i +"].LibType"));
			keywordLib.setSource(context.stringValue("DescribeKeywordLibResponse.KeywordLibList["+ i +"].Source"));
			keywordLib.setServiceModule(context.stringValue("DescribeKeywordLibResponse.KeywordLibList["+ i +"].ServiceModule"));

			List<String> bizTypes = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeKeywordLibResponse.KeywordLibList["+ i +"].BizTypes.Length"); j++) {
				bizTypes.add(context.stringValue("DescribeKeywordLibResponse.KeywordLibList["+ i +"].BizTypes["+ j +"]"));
			}
			keywordLib.setBizTypes(bizTypes);

			keywordLibList.add(keywordLib);
		}
		describeKeywordLibResponse.setKeywordLibList(keywordLibList);
	 
	 	return describeKeywordLibResponse;
	}
}