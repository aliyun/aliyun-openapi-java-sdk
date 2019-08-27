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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListSlsLogstoreInfoResponse;
import com.aliyuncs.emr.model.v20160408.ListSlsLogstoreInfoResponse.SlsLogstoreInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSlsLogstoreInfoResponseUnmarshaller {

	public static ListSlsLogstoreInfoResponse unmarshall(ListSlsLogstoreInfoResponse listSlsLogstoreInfoResponse, UnmarshallerContext _ctx) {
		
		listSlsLogstoreInfoResponse.setRequestId(_ctx.stringValue("ListSlsLogstoreInfoResponse.RequestId"));

		List<SlsLogstoreInfo> slsLogstoreInfoList = new ArrayList<SlsLogstoreInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListSlsLogstoreInfoResponse.SlsLogstoreInfoList.Length"); i++) {
			SlsLogstoreInfo slsLogstoreInfo = new SlsLogstoreInfo();
			slsLogstoreInfo.setId(_ctx.longValue("ListSlsLogstoreInfoResponse.SlsLogstoreInfoList["+ i +"].Id"));
			slsLogstoreInfo.setServiceName(_ctx.stringValue("ListSlsLogstoreInfoResponse.SlsLogstoreInfoList["+ i +"].ServiceName"));
			slsLogstoreInfo.setComponentName(_ctx.stringValue("ListSlsLogstoreInfoResponse.SlsLogstoreInfoList["+ i +"].ComponentName"));
			slsLogstoreInfo.setLogstoreName(_ctx.stringValue("ListSlsLogstoreInfoResponse.SlsLogstoreInfoList["+ i +"].LogstoreName"));
			slsLogstoreInfo.setLogType(_ctx.stringValue("ListSlsLogstoreInfoResponse.SlsLogstoreInfoList["+ i +"].LogType"));

			slsLogstoreInfoList.add(slsLogstoreInfo);
		}
		listSlsLogstoreInfoResponse.setSlsLogstoreInfoList(slsLogstoreInfoList);
	 
	 	return listSlsLogstoreInfoResponse;
	}
}