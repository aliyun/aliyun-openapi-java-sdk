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

package com.aliyuncs.sas_api.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas_api.model.v20170705.DescribePerDateDataResponse;
import com.aliyuncs.sas_api.model.v20170705.DescribePerDateDataResponse.DataViewItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePerDateDataResponseUnmarshaller {

	public static DescribePerDateDataResponse unmarshall(DescribePerDateDataResponse describePerDateDataResponse, UnmarshallerContext context) {
		
		describePerDateDataResponse.setRequestId(context.stringValue("DescribePerDateDataResponse.RequestId"));

		List<DataViewItem> dataView = new ArrayList<DataViewItem>();
		for (int i = 0; i < context.lengthValue("DescribePerDateDataResponse.DataView.Length"); i++) {
			DataViewItem dataViewItem = new DataViewItem();
			dataViewItem.setDataTime(context.stringValue("DescribePerDateDataResponse.DataView["+ i +"].DataTime"));
			dataViewItem.setCallTimes(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].CallTimes"));
			dataViewItem.setTotalHit(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].TotalHit"));
			dataViewItem.setHitRate(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].HitRate"));
			dataViewItem.setIsGreyPhone(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].IsGreyPhone"));
			dataViewItem.setIsBlackPhone(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].IsBlackPhone"));
			dataViewItem.setIsVirtualOperator(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].IsVirtualOperator"));
			dataViewItem.setIsOpenCommonPort1d(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].IsOpenCommonPort1d"));
			dataViewItem.setIsOpenCommonPort7d(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].IsOpenCommonPort7d"));
			dataViewItem.setIsOpenCommonPort30d(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].IsOpenCommonPort30d"));
			dataViewItem.setIsCheatFlow1d(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].IsCheatFlow1d"));
			dataViewItem.setIsCheatFlow7d(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].IsCheatFlow7d"));
			dataViewItem.setIsCheatFlow30d(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].IsCheatFlow30d"));
			dataViewItem.setIsProxy1d(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].IsProxy1d"));
			dataViewItem.setIsProxy7d(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].IsProxy7d"));
			dataViewItem.setIsProxy30d(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].IsProxy30d"));
			dataViewItem.setIsHiJack1d(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].IsHiJack1d"));
			dataViewItem.setIsHiJack7d(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].IsHiJack7d"));
			dataViewItem.setIsHiJack30d(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].IsHiJack30d"));
			dataViewItem.setIsC21d(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].IsC21d"));
			dataViewItem.setIsC27d(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].IsC27d"));
			dataViewItem.setIsC230d(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].IsC230d"));
			dataViewItem.setIsBotnet1d(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].IsBotnet1d"));
			dataViewItem.setIsBotnet7d(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].IsBotnet7d"));
			dataViewItem.setIsBotnet30d(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].IsBotnet30d"));
			dataViewItem.setIsNetAttack1d(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].IsNetAttack1d"));
			dataViewItem.setIsNetAttack7d(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].IsNetAttack7d"));
			dataViewItem.setIsNetAttack30d(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].IsNetAttack30d"));
			dataViewItem.setIsBlackCampaign1d(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].IsBlackCampaign1d"));
			dataViewItem.setIsBlackCampaign7d(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].IsBlackCampaign7d"));
			dataViewItem.setIsBlackCampaign30d(context.longValue("DescribePerDateDataResponse.DataView["+ i +"].IsBlackCampaign30d"));

			dataView.add(dataViewItem);
		}
		describePerDateDataResponse.setDataView(dataView);
	 
	 	return describePerDateDataResponse;
	}
}