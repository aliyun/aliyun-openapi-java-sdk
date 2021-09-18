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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.ListLetterSendJobResponse;
import com.aliyuncs.vod.model.v20170321.ListLetterSendJobResponse.LetterJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLetterSendJobResponseUnmarshaller {

	public static ListLetterSendJobResponse unmarshall(ListLetterSendJobResponse listLetterSendJobResponse, UnmarshallerContext _ctx) {
		
		listLetterSendJobResponse.setRequestId(_ctx.stringValue("ListLetterSendJobResponse.RequestId"));

		List<LetterJob> letterJobList = new ArrayList<LetterJob>();
		for (int i = 0; i < _ctx.lengthValue("ListLetterSendJobResponse.LetterJobList.Length"); i++) {
			LetterJob letterJob = new LetterJob();
			letterJob.setCcAddress(_ctx.stringValue("ListLetterSendJobResponse.LetterJobList["+ i +"].CcAddress"));
			letterJob.setCreateTime(_ctx.stringValue("ListLetterSendJobResponse.LetterJobList["+ i +"].CreateTime"));
			letterJob.setUserId(_ctx.longValue("ListLetterSendJobResponse.LetterJobList["+ i +"].UserId"));
			letterJob.setSendTime(_ctx.stringValue("ListLetterSendJobResponse.LetterJobList["+ i +"].SendTime"));
			letterJob.setToAddress(_ctx.stringValue("ListLetterSendJobResponse.LetterJobList["+ i +"].ToAddress"));
			letterJob.setBody(_ctx.stringValue("ListLetterSendJobResponse.LetterJobList["+ i +"].Body"));
			letterJob.setDetectionId(_ctx.stringValue("ListLetterSendJobResponse.LetterJobList["+ i +"].DetectionId"));
			letterJob.setBccAddress(_ctx.stringValue("ListLetterSendJobResponse.LetterJobList["+ i +"].BccAddress"));
			letterJob.setJobId(_ctx.stringValue("ListLetterSendJobResponse.LetterJobList["+ i +"].JobId"));
			letterJob.setTitle(_ctx.stringValue("ListLetterSendJobResponse.LetterJobList["+ i +"].Title"));
			letterJob.setTemplateId(_ctx.stringValue("ListLetterSendJobResponse.LetterJobList["+ i +"].TemplateId"));
			letterJob.setModifyTime(_ctx.stringValue("ListLetterSendJobResponse.LetterJobList["+ i +"].ModifyTime"));

			letterJobList.add(letterJob);
		}
		listLetterSendJobResponse.setLetterJobList(letterJobList);
	 
	 	return listLetterSendJobResponse;
	}
}