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

package com.aliyuncs.jarvis.transform.v20180206;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.jarvis.model.v20180206.DescribePunishListResponse;
import com.aliyuncs.jarvis.model.v20180206.DescribePunishListResponse.Data;
import com.aliyuncs.jarvis.model.v20180206.DescribePunishListResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePunishListResponseUnmarshaller {

	public static DescribePunishListResponse unmarshall(DescribePunishListResponse describePunishListResponse, UnmarshallerContext context) {
		
		describePunishListResponse.setRequestId(context.stringValue("DescribePunishListResponse.RequestId"));
		describePunishListResponse.setModule(context.stringValue("DescribePunishListResponse.Module"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setTotal(context.integerValue("DescribePunishListResponse.PageInfo.total"));
		pageInfo.setPageSize(context.integerValue("DescribePunishListResponse.PageInfo.pageSize"));
		pageInfo.setCurrentPage(context.integerValue("DescribePunishListResponse.PageInfo.currentPage"));
		describePunishListResponse.setPageInfo(pageInfo);

		List<Data> dataList = new ArrayList<Data>();
		for (int i = 0; i < context.lengthValue("DescribePunishListResponse.DataList.Length"); i++) {
			Data data = new Data();
			data.setGmtCreate(context.stringValue("DescribePunishListResponse.DataList["+ i +"].GmtCreate"));
			data.setSrcPort(context.integerValue("DescribePunishListResponse.DataList["+ i +"].SrcPort"));
			data.setFeedBack(context.integerValue("DescribePunishListResponse.DataList["+ i +"].FeedBack"));
			data.setGmtExpire(context.stringValue("DescribePunishListResponse.DataList["+ i +"].GmtExpire"));
			data.setPunishType(context.stringValue("DescribePunishListResponse.DataList["+ i +"].PunishType"));
			data.setDstIP(context.stringValue("DescribePunishListResponse.DataList["+ i +"].DstIP"));
			data.setPunishResult(context.stringValue("DescribePunishListResponse.DataList["+ i +"].PunishResult"));
			data.setRegionId(context.stringValue("DescribePunishListResponse.DataList["+ i +"].RegionId"));
			data.setDstPort(context.integerValue("DescribePunishListResponse.DataList["+ i +"].DstPort"));
			data.setProtocol(context.stringValue("DescribePunishListResponse.DataList["+ i +"].Protocol"));
			data.setSrcIP(context.stringValue("DescribePunishListResponse.DataList["+ i +"].SrcIP"));
			data.setReason(context.stringValue("DescribePunishListResponse.DataList["+ i +"].Reason"));

			dataList.add(data);
		}
		describePunishListResponse.setDataList(dataList);
	 
	 	return describePunishListResponse;
	}
}