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

import com.aliyuncs.mns.model.v20210319.ConsoleSavePretendStatusResponse;
import com.aliyuncs.mns.model.v20210319.ConsoleSavePretendStatusResponse.Data;
import com.aliyuncs.mns.model.v20210319.ConsoleSavePretendStatusResponse.Data.PageDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConsoleSavePretendStatusResponseUnmarshaller {

	public static ConsoleSavePretendStatusResponse unmarshall(ConsoleSavePretendStatusResponse consoleSavePretendStatusResponse, UnmarshallerContext _ctx) {
		
		consoleSavePretendStatusResponse.setRequestId(_ctx.stringValue("ConsoleSavePretendStatusResponse.RequestId"));
		consoleSavePretendStatusResponse.setCode(_ctx.longValue("ConsoleSavePretendStatusResponse.Code"));
		consoleSavePretendStatusResponse.setStatus(_ctx.stringValue("ConsoleSavePretendStatusResponse.Status"));
		consoleSavePretendStatusResponse.setMessage(_ctx.stringValue("ConsoleSavePretendStatusResponse.Message"));
		consoleSavePretendStatusResponse.setSuccess(_ctx.booleanValue("ConsoleSavePretendStatusResponse.Success"));

		Data data = new Data();
		data.setPageNum(_ctx.longValue("ConsoleSavePretendStatusResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("ConsoleSavePretendStatusResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("ConsoleSavePretendStatusResponse.Data.Total"));

		List<PageDataItem> pageData = new ArrayList<PageDataItem>();
		for (int i = 0; i < _ctx.lengthValue("ConsoleSavePretendStatusResponse.Data.PageData.Length"); i++) {
			PageDataItem pageDataItem = new PageDataItem();
			pageDataItem.setTopicName(_ctx.stringValue("ConsoleSavePretendStatusResponse.Data.PageData["+ i +"].TopicName"));
			pageDataItem.setMessageCount(_ctx.longValue("ConsoleSavePretendStatusResponse.Data.PageData["+ i +"].MessageCount"));
			pageDataItem.setMaxMessageSize(_ctx.longValue("ConsoleSavePretendStatusResponse.Data.PageData["+ i +"].MaxMessageSize"));
			pageDataItem.setMessageRetentionPeriod(_ctx.longValue("ConsoleSavePretendStatusResponse.Data.PageData["+ i +"].MessageRetentionPeriod"));
			pageDataItem.setCreateTime(_ctx.longValue("ConsoleSavePretendStatusResponse.Data.PageData["+ i +"].CreateTime"));
			pageDataItem.setLastModifyTime(_ctx.longValue("ConsoleSavePretendStatusResponse.Data.PageData["+ i +"].LastModifyTime"));
			pageDataItem.setTopicURL(_ctx.stringValue("ConsoleSavePretendStatusResponse.Data.PageData["+ i +"].TopicURL"));
			pageDataItem.setLoggingEnabled(_ctx.booleanValue("ConsoleSavePretendStatusResponse.Data.PageData["+ i +"].LoggingEnabled"));

			pageData.add(pageDataItem);
		}
		data.setPageData(pageData);
		consoleSavePretendStatusResponse.setData(data);
	 
	 	return consoleSavePretendStatusResponse;
	}
}