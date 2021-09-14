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

import com.aliyuncs.emas_dmp.model.v20210402.ListTargetAudienceStatusResponse;
import com.aliyuncs.emas_dmp.model.v20210402.ListTargetAudienceStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTargetAudienceStatusResponseUnmarshaller {

	public static ListTargetAudienceStatusResponse unmarshall(ListTargetAudienceStatusResponse listTargetAudienceStatusResponse, UnmarshallerContext _ctx) {
		
		listTargetAudienceStatusResponse.setRequestId(_ctx.stringValue("ListTargetAudienceStatusResponse.RequestId"));

		Data data = new Data();

		List<String> statusList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListTargetAudienceStatusResponse.Data.StatusList.Length"); i++) {
			statusList.add(_ctx.stringValue("ListTargetAudienceStatusResponse.Data.StatusList["+ i +"]"));
		}
		data.setStatusList(statusList);
		listTargetAudienceStatusResponse.setData(data);
	 
	 	return listTargetAudienceStatusResponse;
	}
}