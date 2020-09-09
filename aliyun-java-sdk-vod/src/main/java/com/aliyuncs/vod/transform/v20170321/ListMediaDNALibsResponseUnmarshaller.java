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

import com.aliyuncs.vod.model.v20170321.ListMediaDNALibsResponse;
import com.aliyuncs.vod.model.v20170321.ListMediaDNALibsResponse.AIDNALibInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMediaDNALibsResponseUnmarshaller {

	public static ListMediaDNALibsResponse unmarshall(ListMediaDNALibsResponse listMediaDNALibsResponse, UnmarshallerContext _ctx) {
		
		listMediaDNALibsResponse.setRequestId(_ctx.stringValue("ListMediaDNALibsResponse.RequestId"));

		List<AIDNALibInfo> aIDNALibInfoList = new ArrayList<AIDNALibInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListMediaDNALibsResponse.AIDNALibInfoList.Length"); i++) {
			AIDNALibInfo aIDNALibInfo = new AIDNALibInfo();
			aIDNALibInfo.setFpDBId(_ctx.stringValue("ListMediaDNALibsResponse.AIDNALibInfoList["+ i +"].FpDBId"));
			aIDNALibInfo.setModelType(_ctx.stringValue("ListMediaDNALibsResponse.AIDNALibInfoList["+ i +"].ModelType"));
			aIDNALibInfo.setState(_ctx.stringValue("ListMediaDNALibsResponse.AIDNALibInfoList["+ i +"].State"));

			aIDNALibInfoList.add(aIDNALibInfo);
		}
		listMediaDNALibsResponse.setAIDNALibInfoList(aIDNALibInfoList);
	 
	 	return listMediaDNALibsResponse;
	}
}