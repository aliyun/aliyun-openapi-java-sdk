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

	public static DescribeViewContentResponse unmarshall(DescribeViewContentResponse describeViewContentResponse, UnmarshallerContext context) {
		
		describeViewContentResponse.setRequestId(context.stringValue("DescribeViewContentResponse.RequestId"));
		describeViewContentResponse.setPageSize(context.integerValue("DescribeViewContentResponse.PageSize"));
		describeViewContentResponse.setCurrentPage(context.integerValue("DescribeViewContentResponse.CurrentPage"));
		describeViewContentResponse.setTotalCount(context.integerValue("DescribeViewContentResponse.TotalCount"));

		List<ViewContent> viewContentList = new ArrayList<ViewContent>();
		for (int i = 0; i < context.lengthValue("DescribeViewContentResponse.ViewContentList.Length"); i++) {
			ViewContent viewContent = new ViewContent();
			viewContent.setTaskId(context.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].TaskId"));
			viewContent.setDataId(context.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].DataId"));
			viewContent.setBizType(context.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].BizType"));
			viewContent.setContent(context.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].Content"));
			viewContent.setUrl(context.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].Url"));
			viewContent.setNewUrl(context.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].NewUrl"));
			viewContent.setThumbnail(context.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].Thumbnail"));
			viewContent.setRequestTime(context.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].RequestTime"));
			viewContent.setScanFinishedTime(context.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].ScanFinishedTime"));
			viewContent.setSuggestion(context.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].Suggestion"));
			viewContent.setId(context.longValue("DescribeViewContentResponse.ViewContentList["+ i +"].Id"));
			viewContent.setScanResult(context.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].ScanResult"));

			List<Result> results = new ArrayList<Result>();
			for (int j = 0; j < context.lengthValue("DescribeViewContentResponse.ViewContentList["+ i +"].Results.Length"); j++) {
				Result result = new Result();
				result.setSuggestion(context.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].Results["+ j +"].Suggestion"));
				result.setLabel(context.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].Results["+ j +"].Label"));
				result.setScene(context.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].Results["+ j +"].Scene"));

				results.add(result);
			}
			viewContent.setResults(results);

			List<FrameResult> frameResults = new ArrayList<FrameResult>();
			for (int j = 0; j < context.lengthValue("DescribeViewContentResponse.ViewContentList["+ i +"].FrameResults.Length"); j++) {
				FrameResult frameResult = new FrameResult();
				frameResult.setUrl(context.stringValue("DescribeViewContentResponse.ViewContentList["+ i +"].FrameResults["+ j +"].Url"));
				frameResult.setOffset(context.integerValue("DescribeViewContentResponse.ViewContentList["+ i +"].FrameResults["+ j +"].Offset"));

				frameResults.add(frameResult);
			}
			viewContent.setFrameResults(frameResults);

			viewContentList.add(viewContent);
		}
		describeViewContentResponse.setViewContentList(viewContentList);
	 
	 	return describeViewContentResponse;
	}
}