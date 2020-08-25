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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetLinkeLinklogLogsresultResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeLinklogLogsresultResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeLinklogLogsresultResponseUnmarshaller {

	public static GetLinkeLinklogLogsresultResponse unmarshall(GetLinkeLinklogLogsresultResponse getLinkeLinklogLogsresultResponse, UnmarshallerContext _ctx) {
		
		getLinkeLinklogLogsresultResponse.setRequestId(_ctx.stringValue("GetLinkeLinklogLogsresultResponse.RequestId"));
		getLinkeLinklogLogsresultResponse.setResultCode(_ctx.stringValue("GetLinkeLinklogLogsresultResponse.ResultCode"));
		getLinkeLinklogLogsresultResponse.setResultMessage(_ctx.stringValue("GetLinkeLinklogLogsresultResponse.ResultMessage"));
		getLinkeLinklogLogsresultResponse.setErrorMsg(_ctx.stringValue("GetLinkeLinklogLogsresultResponse.ErrorMsg"));
		getLinkeLinklogLogsresultResponse.setResponseContentRange(_ctx.stringValue("GetLinkeLinklogLogsresultResponse.ResponseContentRange"));
		getLinkeLinklogLogsresultResponse.setResponseContentType(_ctx.stringValue("GetLinkeLinklogLogsresultResponse.ResponseContentType"));
		getLinkeLinklogLogsresultResponse.setResponseStatusCode(_ctx.longValue("GetLinkeLinklogLogsresultResponse.ResponseStatusCode"));
		getLinkeLinklogLogsresultResponse.setSuccess(_ctx.booleanValue("GetLinkeLinklogLogsresultResponse.Success"));

		Result result = new Result();
		result.setBizInfo(_ctx.stringValue("GetLinkeLinklogLogsresultResponse.Result.BizInfo"));
		result.setFullLogUrl(_ctx.stringValue("GetLinkeLinklogLogsresultResponse.Result.FullLogUrl"));
		result.setLineCount(_ctx.longValue("GetLinkeLinklogLogsresultResponse.Result.LineCount"));
		result.setLogId(_ctx.longValue("GetLinkeLinklogLogsresultResponse.Result.LogId"));
		result.setRawLogDownloadUrl(_ctx.stringValue("GetLinkeLinklogLogsresultResponse.Result.RawLogDownloadUrl"));
		result.setSourceId(_ctx.stringValue("GetLinkeLinklogLogsresultResponse.Result.SourceId"));
		result.setSourcePath(_ctx.stringValue("GetLinkeLinklogLogsresultResponse.Result.SourcePath"));
		result.setSourceType(_ctx.stringValue("GetLinkeLinklogLogsresultResponse.Result.SourceType"));
		result.setStatus(_ctx.stringValue("GetLinkeLinklogLogsresultResponse.Result.Status"));
		result.setStoreId(_ctx.longValue("GetLinkeLinklogLogsresultResponse.Result.StoreId"));
		result.setStoreName(_ctx.stringValue("GetLinkeLinklogLogsresultResponse.Result.StoreName"));
		result.setTaskId(_ctx.stringValue("GetLinkeLinklogLogsresultResponse.Result.TaskId"));
		result.setTaskStatus(_ctx.stringValue("GetLinkeLinklogLogsresultResponse.Result.TaskStatus"));
		result.setTaskUrl(_ctx.stringValue("GetLinkeLinklogLogsresultResponse.Result.TaskUrl"));

		List<String> blockContent = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinklogLogsresultResponse.Result.BlockContent.Length"); i++) {
			blockContent.add(_ctx.stringValue("GetLinkeLinklogLogsresultResponse.Result.BlockContent["+ i +"]"));
		}
		result.setBlockContent(blockContent);

		List<String> causeResults = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinklogLogsresultResponse.Result.CauseResults.Length"); i++) {
			causeResults.add(_ctx.stringValue("GetLinkeLinklogLogsresultResponse.Result.CauseResults["+ i +"]"));
		}
		result.setCauseResults(causeResults);

		List<String> envs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinklogLogsresultResponse.Result.Envs.Length"); i++) {
			envs.add(_ctx.stringValue("GetLinkeLinklogLogsresultResponse.Result.Envs["+ i +"]"));
		}
		result.setEnvs(envs);

		List<String> feedbackOptions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinklogLogsresultResponse.Result.FeedbackOptions.Length"); i++) {
			feedbackOptions.add(_ctx.stringValue("GetLinkeLinklogLogsresultResponse.Result.FeedbackOptions["+ i +"]"));
		}
		result.setFeedbackOptions(feedbackOptions);

		List<String> feedbackResult = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinklogLogsresultResponse.Result.FeedbackResult.Length"); i++) {
			feedbackResult.add(_ctx.stringValue("GetLinkeLinklogLogsresultResponse.Result.FeedbackResult["+ i +"]"));
		}
		result.setFeedbackResult(feedbackResult);

		List<String> patternResult = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinklogLogsresultResponse.Result.PatternResult.Length"); i++) {
			patternResult.add(_ctx.stringValue("GetLinkeLinklogLogsresultResponse.Result.PatternResult["+ i +"]"));
		}
		result.setPatternResult(patternResult);

		List<String> steps = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinklogLogsresultResponse.Result.Steps.Length"); i++) {
			steps.add(_ctx.stringValue("GetLinkeLinklogLogsresultResponse.Result.Steps["+ i +"]"));
		}
		result.setSteps(steps);
		getLinkeLinklogLogsresultResponse.setResult(result);
	 
	 	return getLinkeLinklogLogsresultResponse;
	}
}