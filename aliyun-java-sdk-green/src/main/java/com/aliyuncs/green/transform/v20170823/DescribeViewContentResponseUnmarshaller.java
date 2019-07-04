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

import com.aliyuncs.green.model.v20170823.DescribeViewContentResponse;
import com.aliyuncs.green.model.v20170823.DescribeViewContentResponse.ViewContent;
import com.aliyuncs.green.model.v20170823.DescribeViewContentResponse.ViewContent.FrameResult;
import com.aliyuncs.green.model.v20170823.DescribeViewContentResponse.ViewContent.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeViewContentResponseUnmarshaller {

	public static DescribeViewContentResponse unmarshall(DescribeViewContentResponse describeViewContentResponse, UnmarshallerContext _ctx) {
		
		describeViewContentResponse.setRequestId(_ctx.stringValue("DescribeViewContentResponse.RequestId"));
		describeViewContentResponse.setPageSize(_ctx.integerValue("DescribeViewContentResponse.PageSize"));
		describeViewContentResponse.setCurrentPage(_ctx.integerValue("DescribeViewContentResponse.CurrentPage"));
		describeViewContentResponse.setTotalCount(_ctx.integerValue("DescribeViewContentResponse.TotalCount"));

		List<ViewContent> viewContentList = new ArrayList<ViewContent>();
		for (int i = 0; i < _ctx.lengthValue("DescribeViewContentResponse.ViewContentList.Length"); i++) {
			ViewContent viewContent = new ViewContent();
			viewContent.setTaskId(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].TaskId"));
			viewContent.setDataId(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].DataId"));
			viewContent.setBizType(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].BizType"));
			viewContent.setContent(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].Content"));
			viewContent.setUrl(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].Url"));
			viewContent.setNewUrl(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].NewUrl"));
			viewContent.setThumbnail(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].Thumbnail"));
			viewContent.setRequestTime(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].RequestTime"));
			viewContent.setScanFinishedTime(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].ScanFinishedTime"));
			viewContent.setSuggestion(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].Suggestion"));
			viewContent.setId(_ctx.longValue("DescribeViewContentResponse.ViewContentList["+ i +"].Id"));
			viewContent.setScanResult(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].ScanResult"));

			List<Result> results = new ArrayList<Result>();
			for (int j = 0; j < _ctx.lengthValue("DescribeViewContentResponse.ViewContentList["+ i +"].Results.Length"); j++) {
				Result result = new Result();
				result.setSuggestion(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].Results["+ j +"].Suggestion"));
				result.setLabel(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].Results["+ j +"].Label"));
				result.setScene(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].Results["+ j +"].Scene"));

				results.add(result);
			}
			viewContent.setResults(results);

			List<FrameResult> frameResults = new ArrayList<FrameResult>();
			for (int j = 0; j < _ctx.lengthValue("DescribeViewContentResponse.ViewContentList["+ i +"].FrameResults.Length"); j++) {
				FrameResult frameResult = new FrameResult();
				frameResult.setUrl(_ctx.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].FrameResults["+ j +"].Url"));
				frameResult.setOffset(_ctx.integerValue("DescribeViewContentResponse.ViewContentList["+ i +"].FrameResults["+ j +"].Offset"));

				frameResults.add(frameResult);
			}
			viewContent.setFrameResults(frameResults);

			viewContentList.add(viewContent);
		}
		describeViewContentResponse.setViewContentList(viewContentList);
	 
	 	return describeViewContentResponse;
	}
}