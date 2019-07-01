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

import com.aliyuncs.green.model.v20170823.DescribeAuditContentResponse;
import com.aliyuncs.green.model.v20170823.DescribeAuditContentResponse.AuditContent;
import com.aliyuncs.green.model.v20170823.DescribeAuditContentResponse.AuditContent.FrameResult;
import com.aliyuncs.green.model.v20170823.DescribeAuditContentResponse.AuditContent.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAuditContentResponseUnmarshaller {

	public static DescribeAuditContentResponse unmarshall(DescribeAuditContentResponse describeAuditContentResponse, UnmarshallerContext context) {
		
		describeAuditContentResponse.setRequestId(context.stringValue("DescribeAuditContentResponse.RequestId"));
		describeAuditContentResponse.setPageSize(context.integerValue("DescribeAuditContentResponse.PageSize"));
		describeAuditContentResponse.setCurrentPage(context.integerValue("DescribeAuditContentResponse.CurrentPage"));
		describeAuditContentResponse.setTotalCount(context.integerValue("DescribeAuditContentResponse.TotalCount"));

		List<AuditContent> auditContentList = new ArrayList<AuditContent>();
		for (int i = 0; i < context.lengthValue("DescribeAuditContentResponse.AuditContentList.Length"); i++) {
			AuditContent auditContent = new AuditContent();
			auditContent.setTaskId(context.stringValue("DescribeAuditContentResponse.AuditContentList["+ i +"].TaskId"));
			auditContent.setDataId(context.stringValue("DescribeAuditContentResponse.AuditContentList["+ i +"].DataId"));
			auditContent.setBizType(context.stringValue("DescribeAuditContentResponse.AuditContentList["+ i +"].BizType"));
			auditContent.setContent(context.stringValue("DescribeAuditContentResponse.AuditContentList["+ i +"].Content"));
			auditContent.setUrl(context.stringValue("DescribeAuditContentResponse.AuditContentList["+ i +"].Url"));
			auditContent.setNewUrl(context.stringValue("DescribeAuditContentResponse.AuditContentList["+ i +"].NewUrl"));
			auditContent.setThumbnail(context.stringValue("DescribeAuditContentResponse.AuditContentList["+ i +"].Thumbnail"));
			auditContent.setRequestTime(context.stringValue("DescribeAuditContentResponse.AuditContentList["+ i +"].RequestTime"));
			auditContent.setScanFinishedTime(context.stringValue("DescribeAuditContentResponse.AuditContentList["+ i +"].ScanFinishedTime"));
			auditContent.setAudit(context.integerValue("DescribeAuditContentResponse.AuditContentList["+ i +"].Audit"));
			auditContent.setAuditResult(context.stringValue("DescribeAuditContentResponse.AuditContentList["+ i +"].AuditResult"));
			auditContent.setSuggestion(context.stringValue("DescribeAuditContentResponse.AuditContentList["+ i +"].Suggestion"));
			auditContent.setId(context.longValue("DescribeAuditContentResponse.AuditContentList["+ i +"].Id"));

			List<String> auditIllegalReasons = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeAuditContentResponse.AuditContentList["+ i +"].AuditIllegalReasons.Length"); j++) {
				auditIllegalReasons.add(context.stringValue("DescribeAuditContentResponse.AuditContentList["+ i +"].AuditIllegalReasons["+ j +"]"));
			}
			auditContent.setAuditIllegalReasons(auditIllegalReasons);

			List<Result> results = new ArrayList<Result>();
			for (int j = 0; j < context.lengthValue("DescribeAuditContentResponse.AuditContentList["+ i +"].Results.Length"); j++) {
				Result result = new Result();
				result.setSuggestion(context.stringValue("DescribeAuditContentResponse.AuditContentList["+ i +"].Results["+ j +"].Suggestion"));
				result.setLabel(context.stringValue("DescribeAuditContentResponse.AuditContentList["+ i +"].Results["+ j +"].Label"));
				result.setScene(context.stringValue("DescribeAuditContentResponse.AuditContentList["+ i +"].Results["+ j +"].Scene"));

				results.add(result);
			}
			auditContent.setResults(results);

			List<FrameResult> frameResults = new ArrayList<FrameResult>();
			for (int j = 0; j < context.lengthValue("DescribeAuditContentResponse.AuditContentList["+ i +"].FrameResults.Length"); j++) {
				FrameResult frameResult = new FrameResult();
				frameResult.setUrl(context.stringValue("DescribeAuditContentResponse.AuditContentList["+ i +"].FrameResults["+ j +"].Url"));
				frameResult.setOffset(context.integerValue("DescribeAuditContentResponse.AuditContentList["+ i +"].FrameResults["+ j +"].Offset"));
				frameResult.setLabel(context.stringValue("DescribeAuditContentResponse.AuditContentList["+ i +"].FrameResults["+ j +"].Label"));

				frameResults.add(frameResult);
			}
			auditContent.setFrameResults(frameResults);

			auditContentList.add(auditContent);
		}
		describeAuditContentResponse.setAuditContentList(auditContentList);
	 
	 	return describeAuditContentResponse;
	}
}