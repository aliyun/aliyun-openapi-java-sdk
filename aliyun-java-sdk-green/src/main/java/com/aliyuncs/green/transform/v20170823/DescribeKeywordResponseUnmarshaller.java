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

import com.aliyuncs.green.model.v20170823.DescribeKeywordResponse;
import com.aliyuncs.green.model.v20170823.DescribeKeywordResponse.Keyword;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeKeywordResponseUnmarshaller {

	public static DescribeKeywordResponse unmarshall(DescribeKeywordResponse describeKeywordResponse, UnmarshallerContext context) {
		
		describeKeywordResponse.setRequestId(context.stringValue("DescribeKeywordResponse.RequestId"));
		describeKeywordResponse.setTotalCount(context.integerValue("DescribeKeywordResponse.TotalCount"));
		describeKeywordResponse.setPageSize(context.integerValue("DescribeKeywordResponse.PageSize"));
		describeKeywordResponse.setCurrentPage(context.integerValue("DescribeKeywordResponse.CurrentPage"));

		List<Keyword> keywordList = new ArrayList<Keyword>();
		for (int i = 0; i < context.lengthValue("DescribeKeywordResponse.KeywordList.Length"); i++) {
			Keyword keyword = new Keyword();
			keyword.setId(context.integerValue("DescribeKeywordResponse.KeywordList["+ i +"].Id"));
			keyword.setCreateTime(context.stringValue("DescribeKeywordResponse.KeywordList["+ i +"].CreateTime"));
			keyword.setKeyword(context.stringValue("DescribeKeywordResponse.KeywordList["+ i +"].Keyword"));
			keyword.setHitCount(context.integerValue("DescribeKeywordResponse.KeywordList["+ i +"].HitCount"));

			keywordList.add(keyword);
		}
		describeKeywordResponse.setKeywordList(keywordList);
	 
	 	return describeKeywordResponse;
	}
}