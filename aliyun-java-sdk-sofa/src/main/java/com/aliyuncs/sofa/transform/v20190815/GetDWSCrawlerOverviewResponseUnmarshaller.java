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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetDWSCrawlerOverviewResponse;
import com.aliyuncs.sofa.model.v20190815.GetDWSCrawlerOverviewResponse.Data;
import com.aliyuncs.sofa.model.v20190815.GetDWSCrawlerOverviewResponse.Data.CrawlerOverviewListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDWSCrawlerOverviewResponseUnmarshaller {

	public static GetDWSCrawlerOverviewResponse unmarshall(GetDWSCrawlerOverviewResponse getDWSCrawlerOverviewResponse, UnmarshallerContext _ctx) {
		
		getDWSCrawlerOverviewResponse.setRequestId(_ctx.stringValue("GetDWSCrawlerOverviewResponse.RequestId"));
		getDWSCrawlerOverviewResponse.setResultCode(_ctx.stringValue("GetDWSCrawlerOverviewResponse.ResultCode"));
		getDWSCrawlerOverviewResponse.setResultMessage(_ctx.stringValue("GetDWSCrawlerOverviewResponse.ResultMessage"));

		Data data = new Data();
		data.setPageTotal(_ctx.longValue("GetDWSCrawlerOverviewResponse.Data.PageTotal"));

		List<String> dbTypeList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDWSCrawlerOverviewResponse.Data.DbTypeList.Length"); i++) {
			dbTypeList.add(_ctx.stringValue("GetDWSCrawlerOverviewResponse.Data.DbTypeList["+ i +"]"));
		}
		data.setDbTypeList(dbTypeList);

		List<CrawlerOverviewListItem> crawlerOverviewList = new ArrayList<CrawlerOverviewListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDWSCrawlerOverviewResponse.Data.CrawlerOverviewList.Length"); i++) {
			CrawlerOverviewListItem crawlerOverviewListItem = new CrawlerOverviewListItem();
			crawlerOverviewListItem.setBeginTimeStamp(_ctx.stringValue("GetDWSCrawlerOverviewResponse.Data.CrawlerOverviewList["+ i +"].BeginTimeStamp"));
			crawlerOverviewListItem.setConn(_ctx.longValue("GetDWSCrawlerOverviewResponse.Data.CrawlerOverviewList["+ i +"].Conn"));
			crawlerOverviewListItem.setCrawlerDelay(_ctx.longValue("GetDWSCrawlerOverviewResponse.Data.CrawlerOverviewList["+ i +"].CrawlerDelay"));
			crawlerOverviewListItem.setCrawlerName(_ctx.stringValue("GetDWSCrawlerOverviewResponse.Data.CrawlerOverviewList["+ i +"].CrawlerName"));
			crawlerOverviewListItem.setDbType(_ctx.stringValue("GetDWSCrawlerOverviewResponse.Data.CrawlerOverviewList["+ i +"].DbType"));
			crawlerOverviewListItem.setEndTimeStamp(_ctx.stringValue("GetDWSCrawlerOverviewResponse.Data.CrawlerOverviewList["+ i +"].EndTimeStamp"));
			crawlerOverviewListItem.setIos(_ctx.longValue("GetDWSCrawlerOverviewResponse.Data.CrawlerOverviewList["+ i +"].Ios"));
			crawlerOverviewListItem.setLocation(_ctx.stringValue("GetDWSCrawlerOverviewResponse.Data.CrawlerOverviewList["+ i +"].Location"));
			crawlerOverviewListItem.setMonitorTime(_ctx.stringValue("GetDWSCrawlerOverviewResponse.Data.CrawlerOverviewList["+ i +"].MonitorTime"));
			crawlerOverviewListItem.setStatus(_ctx.stringValue("GetDWSCrawlerOverviewResponse.Data.CrawlerOverviewList["+ i +"].Status"));
			crawlerOverviewListItem.setTps(_ctx.stringValue("GetDWSCrawlerOverviewResponse.Data.CrawlerOverviewList["+ i +"].Tps"));

			crawlerOverviewList.add(crawlerOverviewListItem);
		}
		data.setCrawlerOverviewList(crawlerOverviewList);
		getDWSCrawlerOverviewResponse.setData(data);
	 
	 	return getDWSCrawlerOverviewResponse;
	}
}