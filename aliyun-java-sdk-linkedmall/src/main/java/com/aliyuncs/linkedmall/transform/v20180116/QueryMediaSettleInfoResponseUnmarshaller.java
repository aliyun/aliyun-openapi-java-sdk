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

import com.aliyuncs.linkedmall.model.v20180116.QueryMediaSettleInfoResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryMediaSettleInfoResponse.Model;
import com.aliyuncs.linkedmall.model.v20180116.QueryMediaSettleInfoResponse.Model.MediaSettleInfoListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMediaSettleInfoResponseUnmarshaller {

	public static QueryMediaSettleInfoResponse unmarshall(QueryMediaSettleInfoResponse queryMediaSettleInfoResponse, UnmarshallerContext _ctx) {
		
		queryMediaSettleInfoResponse.setRequestId(_ctx.stringValue("QueryMediaSettleInfoResponse.RequestId"));
		queryMediaSettleInfoResponse.setCode(_ctx.stringValue("QueryMediaSettleInfoResponse.Code"));
		queryMediaSettleInfoResponse.setMessage(_ctx.stringValue("QueryMediaSettleInfoResponse.Message"));
		queryMediaSettleInfoResponse.setSubCode(_ctx.stringValue("QueryMediaSettleInfoResponse.SubCode"));
		queryMediaSettleInfoResponse.setSubMessage(_ctx.stringValue("QueryMediaSettleInfoResponse.SubMessage"));
		queryMediaSettleInfoResponse.setLogsId(_ctx.stringValue("QueryMediaSettleInfoResponse.LogsId"));
		queryMediaSettleInfoResponse.setSuccess(_ctx.booleanValue("QueryMediaSettleInfoResponse.Success"));
		queryMediaSettleInfoResponse.setTotalCount(_ctx.longValue("QueryMediaSettleInfoResponse.TotalCount"));

		Model model = new Model();
		model.setPageSize(_ctx.integerValue("QueryMediaSettleInfoResponse.Model.PageSize"));
		model.setPageNumber(_ctx.integerValue("QueryMediaSettleInfoResponse.Model.PageNumber"));
		model.setTotalCount(_ctx.integerValue("QueryMediaSettleInfoResponse.Model.TotalCount"));

		List<MediaSettleInfoListItem> mediaSettleInfoList = new ArrayList<MediaSettleInfoListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMediaSettleInfoResponse.Model.MediaSettleInfoList.Length"); i++) {
			MediaSettleInfoListItem mediaSettleInfoListItem = new MediaSettleInfoListItem();
			mediaSettleInfoListItem.setCreateDate(_ctx.stringValue("QueryMediaSettleInfoResponse.Model.MediaSettleInfoList["+ i +"].CreateDate"));
			mediaSettleInfoListItem.setModifiedDate(_ctx.stringValue("QueryMediaSettleInfoResponse.Model.MediaSettleInfoList["+ i +"].ModifiedDate"));
			mediaSettleInfoListItem.setMediaSettleDetailId(_ctx.stringValue("QueryMediaSettleInfoResponse.Model.MediaSettleInfoList["+ i +"].MediaSettleDetailId"));
			mediaSettleInfoListItem.setMediaName(_ctx.stringValue("QueryMediaSettleInfoResponse.Model.MediaSettleInfoList["+ i +"].MediaName"));
			mediaSettleInfoListItem.setSettleNo(_ctx.stringValue("QueryMediaSettleInfoResponse.Model.MediaSettleInfoList["+ i +"].SettleNo"));
			mediaSettleInfoListItem.setStartTime(_ctx.stringValue("QueryMediaSettleInfoResponse.Model.MediaSettleInfoList["+ i +"].StartTime"));
			mediaSettleInfoListItem.setEndTime(_ctx.stringValue("QueryMediaSettleInfoResponse.Model.MediaSettleInfoList["+ i +"].EndTime"));
			mediaSettleInfoListItem.setSettleStatus(_ctx.stringValue("QueryMediaSettleInfoResponse.Model.MediaSettleInfoList["+ i +"].SettleStatus"));
			mediaSettleInfoListItem.setMediaSettleAmount(_ctx.stringValue("QueryMediaSettleInfoResponse.Model.MediaSettleInfoList["+ i +"].MediaSettleAmount"));
			mediaSettleInfoListItem.setChannelId(_ctx.stringValue("QueryMediaSettleInfoResponse.Model.MediaSettleInfoList["+ i +"].ChannelId"));
			mediaSettleInfoListItem.setExtInfo(_ctx.stringValue("QueryMediaSettleInfoResponse.Model.MediaSettleInfoList["+ i +"].ExtInfo"));

			mediaSettleInfoList.add(mediaSettleInfoListItem);
		}
		model.setMediaSettleInfoList(mediaSettleInfoList);
		queryMediaSettleInfoResponse.setModel(model);
	 
	 	return queryMediaSettleInfoResponse;
	}
}