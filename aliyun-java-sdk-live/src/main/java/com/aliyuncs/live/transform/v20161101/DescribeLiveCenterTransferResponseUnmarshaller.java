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

import com.aliyuncs.live.model.v20161101.DescribeLiveCenterTransferResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveCenterTransferResponse.LiveCenterTransferInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveCenterTransferResponseUnmarshaller {

	public static DescribeLiveCenterTransferResponse unmarshall(DescribeLiveCenterTransferResponse describeLiveCenterTransferResponse, UnmarshallerContext _ctx) {
		
		describeLiveCenterTransferResponse.setRequestId(_ctx.stringValue("DescribeLiveCenterTransferResponse.RequestId"));

		List<LiveCenterTransferInfo> liveCenterTransferInfoList = new ArrayList<LiveCenterTransferInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveCenterTransferResponse.LiveCenterTransferInfoList.Length"); i++) {
			LiveCenterTransferInfo liveCenterTransferInfo = new LiveCenterTransferInfo();
			liveCenterTransferInfo.setAppName(_ctx.stringValue("DescribeLiveCenterTransferResponse.LiveCenterTransferInfoList["+ i +"].AppName"));
			liveCenterTransferInfo.setDomainName(_ctx.stringValue("DescribeLiveCenterTransferResponse.LiveCenterTransferInfoList["+ i +"].DomainName"));
			liveCenterTransferInfo.setDstUrl(_ctx.stringValue("DescribeLiveCenterTransferResponse.LiveCenterTransferInfoList["+ i +"].DstUrl"));
			liveCenterTransferInfo.setEndTime(_ctx.stringValue("DescribeLiveCenterTransferResponse.LiveCenterTransferInfoList["+ i +"].EndTime"));
			liveCenterTransferInfo.setStartTime(_ctx.stringValue("DescribeLiveCenterTransferResponse.LiveCenterTransferInfoList["+ i +"].StartTime"));
			liveCenterTransferInfo.setStreamName(_ctx.stringValue("DescribeLiveCenterTransferResponse.LiveCenterTransferInfoList["+ i +"].StreamName"));
			liveCenterTransferInfo.setTransferArgs(_ctx.stringValue("DescribeLiveCenterTransferResponse.LiveCenterTransferInfoList["+ i +"].TransferArgs"));

			liveCenterTransferInfoList.add(liveCenterTransferInfo);
		}
		describeLiveCenterTransferResponse.setLiveCenterTransferInfoList(liveCenterTransferInfoList);
	 
	 	return describeLiveCenterTransferResponse;
	}
}