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

import com.aliyuncs.live.model.v20161101.DescribeLiveMessageGroupBandResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveMessageGroupBandResponseUnmarshaller {

	public static DescribeLiveMessageGroupBandResponse unmarshall(DescribeLiveMessageGroupBandResponse describeLiveMessageGroupBandResponse, UnmarshallerContext _ctx) {
		
		describeLiveMessageGroupBandResponse.setRequestId(_ctx.stringValue("DescribeLiveMessageGroupBandResponse.RequestId"));
		describeLiveMessageGroupBandResponse.setGroupId(_ctx.stringValue("DescribeLiveMessageGroupBandResponse.GroupId"));
		describeLiveMessageGroupBandResponse.setIsbannedAll(_ctx.booleanValue("DescribeLiveMessageGroupBandResponse.IsbannedAll"));

		List<String> bannedUserList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveMessageGroupBandResponse.BannedUserList.Length"); i++) {
			bannedUserList.add(_ctx.stringValue("DescribeLiveMessageGroupBandResponse.BannedUserList["+ i +"]"));
		}
		describeLiveMessageGroupBandResponse.setBannedUserList(bannedUserList);

		List<String> unbannedUserList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveMessageGroupBandResponse.UnbannedUserList.Length"); i++) {
			unbannedUserList.add(_ctx.stringValue("DescribeLiveMessageGroupBandResponse.UnbannedUserList["+ i +"]"));
		}
		describeLiveMessageGroupBandResponse.setUnbannedUserList(unbannedUserList);
	 
	 	return describeLiveMessageGroupBandResponse;
	}
}