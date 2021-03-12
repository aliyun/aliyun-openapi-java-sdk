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

package com.aliyuncs.linkedmall.transform.v20180116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20180116.QueryAdvertisementSettleInfoResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryAdvertisementSettleInfoResponse.Model;
import com.aliyuncs.linkedmall.model.v20180116.QueryAdvertisementSettleInfoResponse.Model.AdvertiseSettleInfoListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAdvertisementSettleInfoResponseUnmarshaller {

	public static QueryAdvertisementSettleInfoResponse unmarshall(QueryAdvertisementSettleInfoResponse queryAdvertisementSettleInfoResponse, UnmarshallerContext _ctx) {
		
		queryAdvertisementSettleInfoResponse.setRequestId(_ctx.stringValue("QueryAdvertisementSettleInfoResponse.RequestId"));
		queryAdvertisementSettleInfoResponse.setCode(_ctx.stringValue("QueryAdvertisementSettleInfoResponse.Code"));
		queryAdvertisementSettleInfoResponse.setMessage(_ctx.stringValue("QueryAdvertisementSettleInfoResponse.Message"));
		queryAdvertisementSettleInfoResponse.setSubCode(_ctx.stringValue("QueryAdvertisementSettleInfoResponse.SubCode"));
		queryAdvertisementSettleInfoResponse.setSubMessage(_ctx.stringValue("QueryAdvertisementSettleInfoResponse.SubMessage"));
		queryAdvertisementSettleInfoResponse.setLogsId(_ctx.stringValue("QueryAdvertisementSettleInfoResponse.LogsId"));
		queryAdvertisementSettleInfoResponse.setSuccess(_ctx.booleanValue("QueryAdvertisementSettleInfoResponse.Success"));
		queryAdvertisementSettleInfoResponse.setTotalCount(_ctx.longValue("QueryAdvertisementSettleInfoResponse.TotalCount"));

		Model model = new Model();
		model.setPageSize(_ctx.integerValue("QueryAdvertisementSettleInfoResponse.Model.PageSize"));
		model.setPageNumber(_ctx.integerValue("QueryAdvertisementSettleInfoResponse.Model.PageNumber"));
		model.setTotalCount(_ctx.integerValue("QueryAdvertisementSettleInfoResponse.Model.TotalCount"));

		List<AdvertiseSettleInfoListItem> advertiseSettleInfoList = new ArrayList<AdvertiseSettleInfoListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryAdvertisementSettleInfoResponse.Model.AdvertiseSettleInfoList.Length"); i++) {
			AdvertiseSettleInfoListItem advertiseSettleInfoListItem = new AdvertiseSettleInfoListItem();
			advertiseSettleInfoListItem.setCreateDate(_ctx.stringValue("QueryAdvertisementSettleInfoResponse.Model.AdvertiseSettleInfoList["+ i +"].CreateDate"));
			advertiseSettleInfoListItem.setModifiedDate(_ctx.stringValue("QueryAdvertisementSettleInfoResponse.Model.AdvertiseSettleInfoList["+ i +"].ModifiedDate"));
			advertiseSettleInfoListItem.setAdvertiseSettleDetailId(_ctx.stringValue("QueryAdvertisementSettleInfoResponse.Model.AdvertiseSettleInfoList["+ i +"].AdvertiseSettleDetailId"));
			advertiseSettleInfoListItem.setAdvertiseName(_ctx.stringValue("QueryAdvertisementSettleInfoResponse.Model.AdvertiseSettleInfoList["+ i +"].AdvertiseName"));
			advertiseSettleInfoListItem.setSettleNo(_ctx.stringValue("QueryAdvertisementSettleInfoResponse.Model.AdvertiseSettleInfoList["+ i +"].SettleNo"));
			advertiseSettleInfoListItem.setStartTime(_ctx.stringValue("QueryAdvertisementSettleInfoResponse.Model.AdvertiseSettleInfoList["+ i +"].StartTime"));
			advertiseSettleInfoListItem.setEndTime(_ctx.stringValue("QueryAdvertisementSettleInfoResponse.Model.AdvertiseSettleInfoList["+ i +"].EndTime"));
			advertiseSettleInfoListItem.setSettleStatus(_ctx.stringValue("QueryAdvertisementSettleInfoResponse.Model.AdvertiseSettleInfoList["+ i +"].SettleStatus"));
			advertiseSettleInfoListItem.setAdvertiseSettleAmount(_ctx.stringValue("QueryAdvertisementSettleInfoResponse.Model.AdvertiseSettleInfoList["+ i +"].AdvertiseSettleAmount"));
			advertiseSettleInfoListItem.setChannelId(_ctx.stringValue("QueryAdvertisementSettleInfoResponse.Model.AdvertiseSettleInfoList["+ i +"].ChannelId"));
			advertiseSettleInfoListItem.setExtInfo(_ctx.stringValue("QueryAdvertisementSettleInfoResponse.Model.AdvertiseSettleInfoList["+ i +"].ExtInfo"));
			advertiseSettleInfoListItem.setMediaSettleDetailId(_ctx.stringValue("QueryAdvertisementSettleInfoResponse.Model.AdvertiseSettleInfoList["+ i +"].MediaSettleDetailId"));

			advertiseSettleInfoList.add(advertiseSettleInfoListItem);
		}
		model.setAdvertiseSettleInfoList(advertiseSettleInfoList);
		queryAdvertisementSettleInfoResponse.setModel(model);
	 
	 	return queryAdvertisementSettleInfoResponse;
	}
}