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

package com.aliyuncs.emas_dmp.transform.v20210402;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emas_dmp.model.v20210402.PushTargetAudienceResponse;
import com.aliyuncs.emas_dmp.model.v20210402.PushTargetAudienceResponse.Data;
import com.aliyuncs.emas_dmp.model.v20210402.PushTargetAudienceResponse.Data.FailedList;
import com.aliyuncs.transform.UnmarshallerContext;


public class PushTargetAudienceResponseUnmarshaller {

	public static PushTargetAudienceResponse unmarshall(PushTargetAudienceResponse pushTargetAudienceResponse, UnmarshallerContext _ctx) {
		
		pushTargetAudienceResponse.setRequestId(_ctx.stringValue("PushTargetAudienceResponse.RequestId"));

		Data data = new Data();
		data.setSuccess(_ctx.booleanValue("PushTargetAudienceResponse.Data.Success"));

		List<FailedList> failedInfos = new ArrayList<FailedList>();
		for (int i = 0; i < _ctx.lengthValue("PushTargetAudienceResponse.Data.FailedInfos.Length"); i++) {
			FailedList failedList = new FailedList();
			failedList.setErrorCode(_ctx.stringValue("PushTargetAudienceResponse.Data.FailedInfos["+ i +"].ErrorCode"));
			failedList.setErrorMessage(_ctx.stringValue("PushTargetAudienceResponse.Data.FailedInfos["+ i +"].ErrorMessage"));
			failedList.setId(_ctx.stringValue("PushTargetAudienceResponse.Data.FailedInfos["+ i +"].Id"));

			failedInfos.add(failedList);
		}
		data.setFailedInfos(failedInfos);
		pushTargetAudienceResponse.setData(data);
	 
	 	return pushTargetAudienceResponse;
	}
}