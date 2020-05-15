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

import com.aliyuncs.sofa.model.v20190815.GetDWSJdbcwriterOverviewResponse;
import com.aliyuncs.sofa.model.v20190815.GetDWSJdbcwriterOverviewResponse.Data;
import com.aliyuncs.sofa.model.v20190815.GetDWSJdbcwriterOverviewResponse.Data.JdbcwriterOverviewListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDWSJdbcwriterOverviewResponseUnmarshaller {

	public static GetDWSJdbcwriterOverviewResponse unmarshall(GetDWSJdbcwriterOverviewResponse getDWSJdbcwriterOverviewResponse, UnmarshallerContext _ctx) {
		
		getDWSJdbcwriterOverviewResponse.setRequestId(_ctx.stringValue("GetDWSJdbcwriterOverviewResponse.RequestId"));
		getDWSJdbcwriterOverviewResponse.setResultCode(_ctx.stringValue("GetDWSJdbcwriterOverviewResponse.ResultCode"));
		getDWSJdbcwriterOverviewResponse.setResultMessage(_ctx.stringValue("GetDWSJdbcwriterOverviewResponse.ResultMessage"));

		Data data = new Data();
		data.setPageTotal(_ctx.longValue("GetDWSJdbcwriterOverviewResponse.Data.PageTotal"));

		List<String> destDbTypeList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDWSJdbcwriterOverviewResponse.Data.DestDbTypeList.Length"); i++) {
			destDbTypeList.add(_ctx.stringValue("GetDWSJdbcwriterOverviewResponse.Data.DestDbTypeList["+ i +"]"));
		}
		data.setDestDbTypeList(destDbTypeList);

		List<JdbcwriterOverviewListItem> jdbcwriterOverviewList = new ArrayList<JdbcwriterOverviewListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDWSJdbcwriterOverviewResponse.Data.JdbcwriterOverviewList.Length"); i++) {
			JdbcwriterOverviewListItem jdbcwriterOverviewListItem = new JdbcwriterOverviewListItem();
			jdbcwriterOverviewListItem.setCrawlerDelay(_ctx.longValue("GetDWSJdbcwriterOverviewResponse.Data.JdbcwriterOverviewList["+ i +"].CrawlerDelay"));
			jdbcwriterOverviewListItem.setCrawlerName(_ctx.stringValue("GetDWSJdbcwriterOverviewResponse.Data.JdbcwriterOverviewList["+ i +"].CrawlerName"));
			jdbcwriterOverviewListItem.setDestDbtype(_ctx.stringValue("GetDWSJdbcwriterOverviewResponse.Data.JdbcwriterOverviewList["+ i +"].DestDbtype"));
			jdbcwriterOverviewListItem.setIops(_ctx.longValue("GetDWSJdbcwriterOverviewResponse.Data.JdbcwriterOverviewList["+ i +"].Iops"));
			jdbcwriterOverviewListItem.setJdbcwriterDelay(_ctx.longValue("GetDWSJdbcwriterOverviewResponse.Data.JdbcwriterOverviewList["+ i +"].JdbcwriterDelay"));
			jdbcwriterOverviewListItem.setJdbcwriterName(_ctx.stringValue("GetDWSJdbcwriterOverviewResponse.Data.JdbcwriterOverviewList["+ i +"].JdbcwriterName"));
			jdbcwriterOverviewListItem.setLocation(_ctx.stringValue("GetDWSJdbcwriterOverviewResponse.Data.JdbcwriterOverviewList["+ i +"].Location"));
			jdbcwriterOverviewListItem.setMonitorTime(_ctx.stringValue("GetDWSJdbcwriterOverviewResponse.Data.JdbcwriterOverviewList["+ i +"].MonitorTime"));
			jdbcwriterOverviewListItem.setRps(_ctx.longValue("GetDWSJdbcwriterOverviewResponse.Data.JdbcwriterOverviewList["+ i +"].Rps"));
			jdbcwriterOverviewListItem.setSourceDbtype(_ctx.stringValue("GetDWSJdbcwriterOverviewResponse.Data.JdbcwriterOverviewList["+ i +"].SourceDbtype"));
			jdbcwriterOverviewListItem.setStatus(_ctx.longValue("GetDWSJdbcwriterOverviewResponse.Data.JdbcwriterOverviewList["+ i +"].Status"));

			jdbcwriterOverviewList.add(jdbcwriterOverviewListItem);
		}
		data.setJdbcwriterOverviewList(jdbcwriterOverviewList);
		getDWSJdbcwriterOverviewResponse.setData(data);
	 
	 	return getDWSJdbcwriterOverviewResponse;
	}
}