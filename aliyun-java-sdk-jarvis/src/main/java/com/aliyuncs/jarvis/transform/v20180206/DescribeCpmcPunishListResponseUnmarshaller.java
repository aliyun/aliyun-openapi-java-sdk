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

import com.aliyuncs.jarvis.model.v20180206.DescribeCpmcPunishListResponse;
import com.aliyuncs.jarvis.model.v20180206.DescribeCpmcPunishListResponse.Data;
import com.aliyuncs.jarvis.model.v20180206.DescribeCpmcPunishListResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCpmcPunishListResponseUnmarshaller {

	public static DescribeCpmcPunishListResponse unmarshall(DescribeCpmcPunishListResponse describeCpmcPunishListResponse, UnmarshallerContext context) {
		
		describeCpmcPunishListResponse.setRequestId(context.stringValue("DescribeCpmcPunishListResponse.RequestId"));
		describeCpmcPunishListResponse.setModule(context.stringValue("DescribeCpmcPunishListResponse.Module"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setTotal(context.integerValue("DescribeCpmcPunishListResponse.PageInfo.total"));
		pageInfo.setPageSize(context.integerValue("DescribeCpmcPunishListResponse.PageInfo.pageSize"));
		pageInfo.setCurrentPage(context.integerValue("DescribeCpmcPunishListResponse.PageInfo.currentPage"));
		describeCpmcPunishListResponse.setPageInfo(pageInfo);

		List<Data> dataList = new ArrayList<Data>();
		for (int i = 0; i < context.lengthValue("DescribeCpmcPunishListResponse.DataList.Length"); i++) {
			Data data = new Data();
			data.setGmtCreate(context.stringValue("DescribeCpmcPunishListResponse.DataList["+ i +"].GmtCreate"));
			data.setSrcPort(context.integerValue("DescribeCpmcPunishListResponse.DataList["+ i +"].SrcPort"));
			data.setFeedBack(context.integerValue("DescribeCpmcPunishListResponse.DataList["+ i +"].FeedBack"));
			data.setGmtExpire(context.stringValue("DescribeCpmcPunishListResponse.DataList["+ i +"].GmtExpire"));
			data.setPunishType(context.stringValue("DescribeCpmcPunishListResponse.DataList["+ i +"].PunishType"));
			data.setDstIP(context.stringValue("DescribeCpmcPunishListResponse.DataList["+ i +"].DstIP"));
			data.setPunishResult(context.stringValue("DescribeCpmcPunishListResponse.DataList["+ i +"].PunishResult"));
			data.setRegionId(context.stringValue("DescribeCpmcPunishListResponse.DataList["+ i +"].RegionId"));
			data.setDstPort(context.integerValue("DescribeCpmcPunishListResponse.DataList["+ i +"].DstPort"));
			data.setProtocol(context.stringValue("DescribeCpmcPunishListResponse.DataList["+ i +"].Protocol"));
			data.setSrcIP(context.stringValue("DescribeCpmcPunishListResponse.DataList["+ i +"].SrcIP"));
			data.setReason(context.stringValue("DescribeCpmcPunishListResponse.DataList["+ i +"].Reason"));

			dataList.add(data);
		}
		describeCpmcPunishListResponse.setDataList(dataList);
	 
	 	return describeCpmcPunishListResponse;
	}
}