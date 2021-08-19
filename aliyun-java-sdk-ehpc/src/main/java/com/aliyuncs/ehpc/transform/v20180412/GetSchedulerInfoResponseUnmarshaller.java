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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.GetSchedulerInfoResponse;
import com.aliyuncs.ehpc.model.v20180412.GetSchedulerInfoResponse.SchedInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSchedulerInfoResponseUnmarshaller {

	public static GetSchedulerInfoResponse unmarshall(GetSchedulerInfoResponse getSchedulerInfoResponse, UnmarshallerContext _ctx) {
		
		getSchedulerInfoResponse.setRequestId(_ctx.stringValue("GetSchedulerInfoResponse.RequestId"));

		List<SchedInfoItem> schedInfo = new ArrayList<SchedInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSchedulerInfoResponse.SchedInfo.Length"); i++) {
			SchedInfoItem schedInfoItem = new SchedInfoItem();
			schedInfoItem.setSchedName(_ctx.stringValue("GetSchedulerInfoResponse.SchedInfo["+ i +"].SchedName"));
			schedInfoItem.setConfiguration(_ctx.stringValue("GetSchedulerInfoResponse.SchedInfo["+ i +"].Configuration"));

			schedInfo.add(schedInfoItem);
		}
		getSchedulerInfoResponse.setSchedInfo(schedInfo);
	 
	 	return getSchedulerInfoResponse;
	}
}