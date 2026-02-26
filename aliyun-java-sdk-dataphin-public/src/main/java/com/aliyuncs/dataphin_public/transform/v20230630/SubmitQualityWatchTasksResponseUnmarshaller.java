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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.SubmitQualityWatchTasksResponse;
import com.aliyuncs.dataphin_public.model.v20230630.SubmitQualityWatchTasksResponse.SubmitResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitQualityWatchTasksResponseUnmarshaller {

	public static SubmitQualityWatchTasksResponse unmarshall(SubmitQualityWatchTasksResponse submitQualityWatchTasksResponse, UnmarshallerContext _ctx) {
		
		submitQualityWatchTasksResponse.setRequestId(_ctx.stringValue("SubmitQualityWatchTasksResponse.RequestId"));
		submitQualityWatchTasksResponse.setSuccess(_ctx.booleanValue("SubmitQualityWatchTasksResponse.Success"));
		submitQualityWatchTasksResponse.setHttpStatusCode(_ctx.integerValue("SubmitQualityWatchTasksResponse.HttpStatusCode"));
		submitQualityWatchTasksResponse.setCode(_ctx.stringValue("SubmitQualityWatchTasksResponse.Code"));
		submitQualityWatchTasksResponse.setMessage(_ctx.stringValue("SubmitQualityWatchTasksResponse.Message"));

		SubmitResult submitResult = new SubmitResult();

		List<Long> watchTaskIdList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("SubmitQualityWatchTasksResponse.SubmitResult.WatchTaskIdList.Length"); i++) {
			watchTaskIdList.add(_ctx.longValue("SubmitQualityWatchTasksResponse.SubmitResult.WatchTaskIdList["+ i +"]"));
		}
		submitResult.setWatchTaskIdList(watchTaskIdList);
		submitQualityWatchTasksResponse.setSubmitResult(submitResult);
	 
	 	return submitQualityWatchTasksResponse;
	}
}