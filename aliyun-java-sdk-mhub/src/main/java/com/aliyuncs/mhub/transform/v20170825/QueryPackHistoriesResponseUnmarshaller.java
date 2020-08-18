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

package com.aliyuncs.mhub.transform.v20170825;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mhub.model.v20170825.QueryPackHistoriesResponse;
import com.aliyuncs.mhub.model.v20170825.QueryPackHistoriesResponse.PackInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPackHistoriesResponseUnmarshaller {

	public static QueryPackHistoriesResponse unmarshall(QueryPackHistoriesResponse queryPackHistoriesResponse, UnmarshallerContext _ctx) {
		
		queryPackHistoriesResponse.setRequestId(_ctx.stringValue("QueryPackHistoriesResponse.RequestId"));

		List<PackInfo> packInfos = new ArrayList<PackInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryPackHistoriesResponse.PackInfos.Length"); i++) {
			PackInfo packInfo = new PackInfo();
			packInfo.setOS(_ctx.stringValue("QueryPackHistoriesResponse.PackInfos["+ i +"].OS"));
			packInfo.setStatus(_ctx.integerValue("QueryPackHistoriesResponse.PackInfos["+ i +"].Status"));
			packInfo.setTaskId(_ctx.stringValue("QueryPackHistoriesResponse.PackInfos["+ i +"].TaskId"));
			packInfo.setCreateTime(_ctx.stringValue("QueryPackHistoriesResponse.PackInfos["+ i +"].CreateTime"));
			packInfo.setInfo(_ctx.stringValue("QueryPackHistoriesResponse.PackInfos["+ i +"].Info"));

			packInfos.add(packInfo);
		}
		queryPackHistoriesResponse.setPackInfos(packInfos);
	 
	 	return queryPackHistoriesResponse;
	}
}