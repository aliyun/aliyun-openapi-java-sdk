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

package com.aliyuncs.mns.transform.v20210319;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mns.model.v20210319.ConsoleClearPretendStatusResponse;
import com.aliyuncs.mns.model.v20210319.ConsoleClearPretendStatusResponse.Data;
import com.aliyuncs.mns.model.v20210319.ConsoleClearPretendStatusResponse.Data.PageDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConsoleClearPretendStatusResponseUnmarshaller {

	public static ConsoleClearPretendStatusResponse unmarshall(ConsoleClearPretendStatusResponse consoleClearPretendStatusResponse, UnmarshallerContext _ctx) {
		
		consoleClearPretendStatusResponse.setRequestId(_ctx.stringValue("ConsoleClearPretendStatusResponse.RequestId"));
		consoleClearPretendStatusResponse.setCode(_ctx.longValue("ConsoleClearPretendStatusResponse.Code"));
		consoleClearPretendStatusResponse.setStatus(_ctx.stringValue("ConsoleClearPretendStatusResponse.Status"));
		consoleClearPretendStatusResponse.setMessage(_ctx.stringValue("ConsoleClearPretendStatusResponse.Message"));
		consoleClearPretendStatusResponse.setSuccess(_ctx.booleanValue("ConsoleClearPretendStatusResponse.Success"));

		Data data = new Data();
		data.setPageNum(_ctx.longValue("ConsoleClearPretendStatusResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("ConsoleClearPretendStatusResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("ConsoleClearPretendStatusResponse.Data.Total"));

		List<PageDataItem> pageData = new ArrayList<PageDataItem>();
		for (int i = 0; i < _ctx.lengthValue("ConsoleClearPretendStatusResponse.Data.PageData.Length"); i++) {
			PageDataItem pageDataItem = new PageDataItem();
			pageDataItem.setTopicName(_ctx.stringValue("ConsoleClearPretendStatusResponse.Data.PageData["+ i +"].TopicName"));
			pageDataItem.setMessageCount(_ctx.longValue("ConsoleClearPretendStatusResponse.Data.PageData["+ i +"].MessageCount"));
			pageDataItem.setMaxMessageSize(_ctx.longValue("ConsoleClearPretendStatusResponse.Data.PageData["+ i +"].MaxMessageSize"));
			pageDataItem.setMessageRetentionPeriod(_ctx.longValue("ConsoleClearPretendStatusResponse.Data.PageData["+ i +"].MessageRetentionPeriod"));
			pageDataItem.setCreateTime(_ctx.longValue("ConsoleClearPretendStatusResponse.Data.PageData["+ i +"].CreateTime"));
			pageDataItem.setLastModifyTime(_ctx.longValue("ConsoleClearPretendStatusResponse.Data.PageData["+ i +"].LastModifyTime"));
			pageDataItem.setTopicURL(_ctx.stringValue("ConsoleClearPretendStatusResponse.Data.PageData["+ i +"].TopicURL"));
			pageDataItem.setLoggingEnabled(_ctx.booleanValue("ConsoleClearPretendStatusResponse.Data.PageData["+ i +"].LoggingEnabled"));

			pageData.add(pageDataItem);
		}
		data.setPageData(pageData);
		consoleClearPretendStatusResponse.setData(data);
	 
	 	return consoleClearPretendStatusResponse;
	}
}