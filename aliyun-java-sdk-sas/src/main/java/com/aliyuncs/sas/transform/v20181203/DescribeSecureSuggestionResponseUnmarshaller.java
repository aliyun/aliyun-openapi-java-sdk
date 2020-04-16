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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeSecureSuggestionResponse;
import com.aliyuncs.sas.model.v20181203.DescribeSecureSuggestionResponse.Suggestion;
import com.aliyuncs.sas.model.v20181203.DescribeSecureSuggestionResponse.Suggestion.DetailItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecureSuggestionResponseUnmarshaller {

	public static DescribeSecureSuggestionResponse unmarshall(DescribeSecureSuggestionResponse describeSecureSuggestionResponse, UnmarshallerContext _ctx) {
		
		describeSecureSuggestionResponse.setRequestId(_ctx.stringValue("DescribeSecureSuggestionResponse.RequestId"));
		describeSecureSuggestionResponse.setTotalCount(_ctx.integerValue("DescribeSecureSuggestionResponse.TotalCount"));

		List<Suggestion> suggestions = new ArrayList<Suggestion>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecureSuggestionResponse.Suggestions.Length"); i++) {
			Suggestion suggestion = new Suggestion();
			suggestion.setSuggestType(_ctx.stringValue("DescribeSecureSuggestionResponse.Suggestions["+ i +"].SuggestType"));
			suggestion.setPoints(_ctx.integerValue("DescribeSecureSuggestionResponse.Suggestions["+ i +"].Points"));

			List<DetailItem> detail = new ArrayList<DetailItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSecureSuggestionResponse.Suggestions["+ i +"].Detail.Length"); j++) {
				DetailItem detailItem = new DetailItem();
				detailItem.setDescription(_ctx.stringValue("DescribeSecureSuggestionResponse.Suggestions["+ i +"].Detail["+ j +"].Description"));
				detailItem.setSubType(_ctx.stringValue("DescribeSecureSuggestionResponse.Suggestions["+ i +"].Detail["+ j +"].SubType"));
				detailItem.setTitle(_ctx.stringValue("DescribeSecureSuggestionResponse.Suggestions["+ i +"].Detail["+ j +"].Title"));

				detail.add(detailItem);
			}
			suggestion.setDetail(detail);

			suggestions.add(suggestion);
		}
		describeSecureSuggestionResponse.setSuggestions(suggestions);
	 
	 	return describeSecureSuggestionResponse;
	}
}