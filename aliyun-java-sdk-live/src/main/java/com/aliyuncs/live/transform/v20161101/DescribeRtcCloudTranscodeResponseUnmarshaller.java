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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeRtcCloudTranscodeResponse;
import com.aliyuncs.live.model.v20161101.DescribeRtcCloudTranscodeResponse.TaskInfo;
import com.aliyuncs.live.model.v20161101.DescribeRtcCloudTranscodeResponse.TaskInfo.InputParam;
import com.aliyuncs.live.model.v20161101.DescribeRtcCloudTranscodeResponse.TaskInfo.InputParam.SingleSubUserParam;
import com.aliyuncs.live.model.v20161101.DescribeRtcCloudTranscodeResponse.TaskInfo.OutputParam;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRtcCloudTranscodeResponseUnmarshaller {

	public static DescribeRtcCloudTranscodeResponse unmarshall(DescribeRtcCloudTranscodeResponse describeRtcCloudTranscodeResponse, UnmarshallerContext _ctx) {
		
		describeRtcCloudTranscodeResponse.setRequestId(_ctx.stringValue("DescribeRtcCloudTranscodeResponse.RequestId"));

		TaskInfo taskInfo = new TaskInfo();
		taskInfo.setAppId(_ctx.stringValue("DescribeRtcCloudTranscodeResponse.TaskInfo.AppId"));
		taskInfo.setChannelId(_ctx.stringValue("DescribeRtcCloudTranscodeResponse.TaskInfo.ChannelId"));
		taskInfo.setTaskId(_ctx.stringValue("DescribeRtcCloudTranscodeResponse.TaskInfo.TaskId"));
		taskInfo.setStatus(_ctx.stringValue("DescribeRtcCloudTranscodeResponse.TaskInfo.Status"));
		taskInfo.setMaxIdleTime(_ctx.longValue("DescribeRtcCloudTranscodeResponse.TaskInfo.MaxIdleTime"));

		InputParam inputParam = new InputParam();

		SingleSubUserParam singleSubUserParam = new SingleSubUserParam();
		singleSubUserParam.setUserId(_ctx.stringValue("DescribeRtcCloudTranscodeResponse.TaskInfo.InputParam.SingleSubUserParam.UserId"));
		singleSubUserParam.setStreamType(_ctx.longValue("DescribeRtcCloudTranscodeResponse.TaskInfo.InputParam.SingleSubUserParam.StreamType"));
		singleSubUserParam.setSourceType(_ctx.longValue("DescribeRtcCloudTranscodeResponse.TaskInfo.InputParam.SingleSubUserParam.SourceType"));
		inputParam.setSingleSubUserParam(singleSubUserParam);
		taskInfo.setInputParam(inputParam);

		List<OutputParam> outputParams = new ArrayList<OutputParam>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRtcCloudTranscodeResponse.TaskInfo.OutputParams.Length"); i++) {
			OutputParam outputParam = new OutputParam();
			outputParam.setChannelId(_ctx.stringValue("DescribeRtcCloudTranscodeResponse.TaskInfo.OutputParams["+ i +"].ChannelId"));
			outputParam.setUserId(_ctx.stringValue("DescribeRtcCloudTranscodeResponse.TaskInfo.OutputParams["+ i +"].UserId"));
			outputParam.setUserToken(_ctx.stringValue("DescribeRtcCloudTranscodeResponse.TaskInfo.OutputParams["+ i +"].UserToken"));
			outputParam.setTranscodeTemplate(_ctx.stringValue("DescribeRtcCloudTranscodeResponse.TaskInfo.OutputParams["+ i +"].TranscodeTemplate"));

			outputParams.add(outputParam);
		}
		taskInfo.setOutputParams(outputParams);
		describeRtcCloudTranscodeResponse.setTaskInfo(taskInfo);
	 
	 	return describeRtcCloudTranscodeResponse;
	}
}