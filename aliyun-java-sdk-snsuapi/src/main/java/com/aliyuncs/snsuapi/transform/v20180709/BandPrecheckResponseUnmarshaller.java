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

package com.aliyuncs.snsuapi.transform.v20180709;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.snsuapi.model.v20180709.BandPrecheckResponse;
import com.aliyuncs.snsuapi.model.v20180709.BandPrecheckResponse.ResultModule;
import com.aliyuncs.snsuapi.model.v20180709.BandPrecheckResponse.ResultModule.BandOfferListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class BandPrecheckResponseUnmarshaller {

	public static BandPrecheckResponse unmarshall(BandPrecheckResponse bandPrecheckResponse, UnmarshallerContext context) {
		
		bandPrecheckResponse.setRequestId(context.stringValue("BandPrecheckResponse.RequestId"));
		bandPrecheckResponse.setResultCode(context.stringValue("BandPrecheckResponse.ResultCode"));
		bandPrecheckResponse.setResultMessage(context.stringValue("BandPrecheckResponse.ResultMessage"));

		ResultModule resultModule = new ResultModule();
		resultModule.setBandId(context.longValue("BandPrecheckResponse.ResultModule.BandId"));
		resultModule.setUploadBandwidth(context.integerValue("BandPrecheckResponse.ResultModule.UploadBandwidth"));
		resultModule.setDownloadBandwidth(context.integerValue("BandPrecheckResponse.ResultModule.DownloadBandwidth"));

		List<BandOfferListItem> bandOfferList = new ArrayList<BandOfferListItem>();
		for (int i = 0; i < context.lengthValue("BandPrecheckResponse.ResultModule.BandOfferList.Length"); i++) {
			BandOfferListItem bandOfferListItem = new BandOfferListItem();
			bandOfferListItem.setOfferId(context.longValue("BandPrecheckResponse.ResultModule.BandOfferList["+ i +"].OfferId"));
			bandOfferListItem.setBandwidth(context.integerValue("BandPrecheckResponse.ResultModule.BandOfferList["+ i +"].Bandwidth"));
			bandOfferListItem.setDuration(context.longValue("BandPrecheckResponse.ResultModule.BandOfferList["+ i +"].Duration"));
			bandOfferListItem.setDirection(context.stringValue("BandPrecheckResponse.ResultModule.BandOfferList["+ i +"].Direction"));

			bandOfferList.add(bandOfferListItem);
		}
		resultModule.setBandOfferList(bandOfferList);
		bandPrecheckResponse.setResultModule(resultModule);
	 
	 	return bandPrecheckResponse;
	}
}